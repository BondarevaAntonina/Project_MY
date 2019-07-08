package inna;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by antoni on 17.06.2019.
 */
public class FirstClass {
    @Test
    public void FirstTest (){
        System.setProperty("webdriver.chrome.driver", "/Users/hp/IdeaProjects/MyFirst/path/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));

        WebElement GoogleSearch = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        GoogleSearch.clear();
        GoogleSearch.sendKeys("калькулятор заливки пола");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement SearchButton = driver.findElement(By.cssSelector(".aajZCb"));
        SearchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement SearchLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[3]/div/div/div[1]/a/h3"));
        SearchLink.click();
        String title1 = driver.getTitle();
        Assert.assertTrue(title1.equals("Расчет цементной стяжки пола"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Dlina = driver.findElement(By.xpath("//*[@id=\"dlina\"]"));
        Dlina.clear();
        Dlina.sendKeys("9");
        WebElement Shirina = driver.findElement(By.xpath("//*[@id=\"shirina\"]"));
        Shirina.clear();
        Shirina.sendKeys("4");
        WebElement Cement = driver.findElement(By.xpath("//*[@id=\"main_form\"]/table/tbody/tr[4]/td[2]/label[3]/span"));
        Cement.click();
        WebElement Rastvor = driver.findElement(By.xpath("//*[@id=\"markars\"]/label[3]/span"));
        Rastvor.click();
        WebElement ButtonRasschet = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        ButtonRasschet.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ButtonPechat = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[3]/span/a"));
        ButtonPechat.click();
        //driver.quit();
    }}