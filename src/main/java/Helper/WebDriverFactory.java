package Helper;

/**
 * Created by tretyak on 22.03.2016.
 */

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.openqa.selenium.remote.CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR;
//import com.opera.core.systems.OperaDriver;

public class WebDriverFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverFactory.class);

    // Factory settings

    private static String defaultHub = null;
    private static int restartFrequency = Integer.MAX_VALUE;
    public static EventFiringWebDriver eventDriver;

    public static FirefoxProfile profile = new ProfilesIni().getProfile("Webdriver");

    private static RemoteWebDriver remoteWebDriver;

    public static void setDefaultHub(String newDefaultHub) {
        defaultHub = newDefaultHub;
    }

    public static void setRestartFrequency(int newRestartFrequency) {
        restartFrequency = newRestartFrequency;
    }

    // Factory

    private static String key = null;
    private static int count = 0;
    private static WebDriver driver;

    private static ConcurrentHashMap driverMap = new ConcurrentHashMap(new HashMap());

    private static WebDriver getDriver2(String hub, DesiredCapabilities capabilities, String testKey) throws IOException {
//        String newKey = String.format("%s:%s:%s", capabilities.toString(), hub, testKey);
        /*if (driverMap.containsKey(testKey)) {
            WebDriver driver = driverMap.get(testKey);
            try {
                driver.getCurrentUrl();
                return driver;
            } catch (WebDriverException e) {
                LOGGER.error("driver for " + testKey, e);
            }
        }*/
        WebDriver webDriver = newWebDriver(hub, capabilities);
        //driverMap.put(testKey, webDriver);
        return webDriver;
    }

    public static WebDriver getDriver(String hub, DesiredCapabilities capabilities) throws IOException {
        count++;
        // 1. WebDriver instance is not created yet

        if (driver == null) {

            profile = new ProfilesIni().getProfile("Webdriver");
            return newWebDriver(hub, capabilities);
        }
        // 2. Different flavour of WebDriver is required
        String newKey = capabilities.toString() + ":" + hub;
        //new Report_log(newKey);
        //new Report_log(key);

        if (!newKey.equals(key)) {
            LOGGER.debug("Different flavour of WebDriver is required");
            dismissDriver();
            key = newKey;
            return newWebDriver(hub, capabilities);
        }
        // 3. Browser is dead
        try {
            driver.getCurrentUrl();

        } catch (Throwable t) {
            t.printStackTrace();
            return newWebDriver(hub, capabilities);
        }
        // 4. It's time to restart
        if (count >= restartFrequency) {


            dismissDriver();
            return newWebDriver(hub, capabilities);
        }
        // 5. Just use existing WebDriver instance
        return driver;
    }

    public static WebDriver getDriver(DesiredCapabilities capabilities) throws IOException {
        if (capabilities.getBrowserName().equals("firefox")) {
            //FirefoxProfile profile = new ProfilesIni().getProfile("Webdriver");

           /*profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf, application/octet-stream, application/xml");*/
            profile.setPreference(UNEXPECTED_ALERT_BEHAVIOUR, String.valueOf(UnexpectedAlertBehaviour.ACCEPT));
            profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
            profile.setAssumeUntrustedCertificateIssuer(false);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);

        }

        if (capabilities.getBrowserName().equals("internet explorer")) {
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        }
        return getDriver(defaultHub, capabilities);
    }

    public static WebDriver getDriverForTH(DesiredCapabilities capabilities) throws IOException {
        String th = Thread.currentThread().getName();
        /*if (driverMap.containsKey(th)) {
            WebDriver driver = driverMap.get(th);
            try {
                driver.getCurrentUrl();
                LOGGER.debug("Driver already exists [{}] for th [{}]", driver, th);
                return driver;
            } catch (WebDriverException e) {
                LOGGER.error("Error get driver for " + th, e);
            }
        }*/
        WebDriver webDriver = createNewDriver(capabilities);
        /*LOGGER.debug("Create new driver [{}] for th [{}]", driver, th);
        driverMap.put(th, webDriver);*/
        return webDriver;
    }

    public static void closeDriverTH() {
       /* String th = Thread.currentThread().getName();
        LOGGER.debug("Close driver for th [{}]", th);
        if (driverMap.containsKey(th)) {
            WebDriver driver = driverMap.get(th);
            try {
                driver.quit();

                driverMap.remove(th);
            } catch (WebDriverException e) {
                LOGGER.error("Error close driver for " + th, e);
            }
        }*/
    }

    public static WebDriver createNewDriver(DesiredCapabilities capabilities) throws IOException {
        return createNewDriver(defaultHub, capabilities);
    }

    public static WebDriver createNewDriver(String hub, DesiredCapabilities capabilities) throws IOException {
            driver = (hub == null)
                    ? createLocalDriver(capabilities)
                    : createRemoteDriver(hub, capabilities);
            return driver;
    }

    public static WebDriver getDriver(DesiredCapabilities capabilities, String testKey) throws IOException {
        if (capabilities.getBrowserName().equals("firefox")) {
            profile = new ProfilesIni().getProfile("Webdriver");
            profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
            profile.setPreference(UNEXPECTED_ALERT_BEHAVIOUR, String.valueOf(UnexpectedAlertBehaviour.IGNORE));
            profile.setAssumeUntrustedCertificateIssuer(false);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        }

        if (capabilities.getBrowserName().equals("internet explorer")) {
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        }
        return getDriver2(defaultHub, capabilities, testKey);
    }

    public static void closeDriver(String testKey) {
        /*WebDriver webDriver = driverMap.get(testKey);
        if (webDriver != null) {
            driver.quit();
            driverMap.remove(testKey);
        } else {
            LOGGER.error("Driver is not found for close - {}", testKey);
        }*/
    }

    public static void dismissDriver() {
        if (driver != null) {
            try {
                driver.quit();
                driver = null;
                key = null;
            } catch (WebDriverException ex) {
                // it can already be dead or unreachable
            }
        }

       /* for (WebDriver webDriver : driverMap.values()) {
            if (webDriver != null) {
                try {
                    webDriver.quit();
                } catch (WebDriverException ex) {
                    LOGGER.error("Dismiss driver", ex);
                }
            }
        }

        driverMap = new ConcurrentHashMap(new HashMap());*/
    }

    public static void closeDriver(WebDriver webDriver) {
        /*if (webDriver != null) {
            try {
                webDriver.quit();
            } catch (WebDriverException ex) {
                LOGGER.error("Close driver", ex);
            }
        }*/
    }

    // Factory internals

    private static WebDriver newWebDriver(String hub, DesiredCapabilities capabilities) throws IOException {
        driver = (hub == null)
                ? createLocalDriver(capabilities)
                : createRemoteDriver(hub, capabilities);
        key = capabilities.toString() + ":" + hub;
        count = 0;
        return driver;
    }

    private static WebDriver createRemoteDriver(String hub,
                                                DesiredCapabilities capabilities) throws IOException {


        if (capabilities.getBrowserName().equals("firefox")) {




       /* profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.manager.showWhenStarting", false);
        profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf, application/octet-stream, application/xml");*/
            profile.setPreference(UNEXPECTED_ALERT_BEHAVIOUR, String.valueOf(UnexpectedAlertBehaviour.IGNORE));
            profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
            profile.setAssumeUntrustedCertificateIssuer(false);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        }

        if (capabilities.getBrowserName().equals("internet explorer")) {
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        }


        try {
            remoteWebDriver = new RemoteWebDriver(new URL(hub), capabilities);
            remoteWebDriver.setFileDetector(new LocalFileDetector());
            return remoteWebDriver;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new Error("Could not connect to WebDriver hub", e);
        }


    }

    private static WebDriver createLocalDriver(DesiredCapabilities capabilities) throws IOException {
        String browserType = capabilities.getBrowserName();

        if (browserType.equals("firefox")) {


           /* profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.download.manager.showWhenStarting", false);

            profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf, application/octet-stream, application/xml");*/
            profile.setPreference("browser.download.dir", BaseFunction.getProperty("browser.download.dir"));
            profile.setPreference(UNEXPECTED_ALERT_BEHAVIOUR, String.valueOf(UnexpectedAlertBehaviour.IGNORE));
            profile.setAssumeUntrustedCertificateIssuer(false);
            capabilities.setCapability(FirefoxDriver.PROFILE, profile);

            return new FirefoxDriver(capabilities);

        }
        if (browserType.startsWith("internet explorer")) {


            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

            System.setProperty("webdriver.ie.driver", BaseFunction.getProperty("webdriver.ie.driver"));
            return new InternetExplorerDriver(capabilities);
        }
        if (browserType.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", BaseFunction.getProperty("webdriver.chrome.driver"));
            return new ChromeDriver(capabilities);
        }
        /*if (browserType.equals("opera"))
            return new OperaDriver(capabilities);*/
        throw new Error("Unrecognized browser type: " + browserType);
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                dismissDriver();
            }
        });
    }

}

