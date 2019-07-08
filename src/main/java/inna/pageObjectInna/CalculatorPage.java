package inna.pageObjectInna;

import annotation.WebElementDescription;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by antoni on 17.06.2019.
 */
public class CalculatorPage {

    @WebElementDescription("Поиск")
    @FindBy(xpath = "//*[@id=\"rso\"]/div/div/div[3]/div/div/div[1]/a/h3")
    private WebElement searchLink;

}
