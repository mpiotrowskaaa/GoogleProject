package google.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Is {
    private WebDriver driver;

    public Is(WebDriver driver) {
        this.driver = driver;
    }

    public boolean displayed(WebElement element, String elementName) {
        boolean isDisplayed;
        isDisplayed = element.isDisplayed();
        System.out.println(String.format("Element '%s' is displayed: %s", elementName, isDisplayed));
        return isDisplayed;
    }
}
