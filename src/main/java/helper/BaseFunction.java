package helper;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by antoni on 05.12.2017.
 */
public class BaseFunction {

    public static String getProperty(String key) {
        String result = null;
        //load properties
            /*if (propertiesMap == null) {
                propertiesMap = loadPropertiesMap(new FileInputStream("ifobs-selenium-test.properties"));
            }
            result = propertiesMap.get(key);*/
        result = System.getProperty(key);
        if (result == null) {
            throw new IllegalArgumentException("Property not found - " + key);
        }

        if (result.startsWith("//")) {
            URL url = BaseFunction.class.getResource(result.substring(1, result.length()));
            if (url != null) {
                String path = FilenameUtils.separatorsToSystem(url.getPath());
                if (path.startsWith("\\")) {
                    return path.substring(1, path.length());
                } else {
                    return path;
                }
            }
        }

        return result;
    }

    public static String getBaseUrl() throws IOException {
        String url = getProperty("base.url");
        Const.baseUrl = url;
        return url;
    }


    public static EventFiringWebDriver getDriver() throws IOException {
        //String driverType = getProperty("driver.type");

        WebDriver drivers;

        /*switch (driverType) {
            case "IE":
                drivers = WebDriverFactory.getDriverForTH(DesiredCapabilities.internetExplorer());
                break;
            case "chrome":
                drivers = WebDriverFactory.getDriverForTH(DesiredCapabilities.chrome());
                break;
            default:*/
                drivers = WebDriverFactory.getDriverForTH(DesiredCapabilities.firefox());
          //      break;
        //}

        EventFiringWebDriver eventDrivers = new EventFiringWebDriver(drivers);
        //eventDrivers.register(new AbstractHandle());
        drivers.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        drivers.manage().window().maximize();
        //LOGGER.debug("Get driver [{}], th {}, {}*{}", drivers, Thread.currentThread().getName(), drivers.manage().window().getSize().width,drivers.manage().window().getSize().height );
        return eventDrivers;
    }


}
