package google.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {

    private WebDriver driver;

    public Action(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element, String elementName) {
        element.click();
        System.out.printf("Element '%s' clicked%n", elementName);
    }

    public void clickEnterKey(WebElement element) {
        element.sendKeys(Keys.ENTER);
        System.out.printf("Enter key clicked%n");
    }

    public void type(WebElement element, String text, String inputName) {
        String actionName = String.format("Type text '%s' to '%s' input", text, inputName);
        System.out.println(actionName);
        element.sendKeys(text);
    }

    public void scrollTo(WebElement element, String elementName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        System.out.printf("Scrolled to '%s' element%n", elementName);
    }


}
