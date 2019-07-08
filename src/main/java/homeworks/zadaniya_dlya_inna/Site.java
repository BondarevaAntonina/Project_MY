package homeworks.zadaniya_dlya_inna;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by antoni on 15.03.2019.
 */
public class Site {

    public class testt {
        @Test
        public void Testt() {
            System.setProperty("webdriver.chrome.driver", "d:\\Разное\\ChromeDriver\\chromedriver_win32\\");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.gismeteo.ua");
        }
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "path/to/my/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }

    @Test
    public void testGoogleSearch01() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "path/to/my/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gismeteo.ua");
        driver.quit();
    }

}