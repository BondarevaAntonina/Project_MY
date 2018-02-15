package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by antoni on 06.12.2017.
 */
/*
public abstract class AbstractPageObject {
    protected EventFiringWebDriver driver;

    public AbstractPageObject(EventFiringWebDriver driver) {
        try {
            initElements(driver);
        } catch (IllegalAccessException e) {
            throw new Error("Не удалось инициализировать AbstractPageObject:"+e.getMessage());
        }
    }

    private void initElements(EventFiringWebDriver driver) throws IllegalAccessException {
        Field[] fieldList = this.getClass().getDeclaredFields();
        for (Field field : fieldList) {
            if (WebElement.class.isAssignableFrom(field.getType()))
            {
                field.setAccessible(true);


                WrappedWebElement element = new WrappedWebElement(driver,null);//By вставится при инициализации
                field.set(this, element);
                PageFactoryForWrappedElements.initElements(driver, field.get(this), field);
            }
            else if(List.class.isAssignableFrom(field.getType())){
                field.setAccessible(true);
                WrappedList<WrappedWebElement> element = new WrappedList<WrappedWebElement>(driver,null);
                field.set(this, element);

                //WrappedList<WebElement> sss = new WrappedList<WebElement>();

                //PageFactoryForWrappedElements.initElements(driver,field.get(this), field);
                PageFactoryForWrappedElements.initElements(driver,element, field);
                //System.out.println("sss");
                //element.nodeList = sss;
            }
        }
        this.driver = driver;
    }
}*/
