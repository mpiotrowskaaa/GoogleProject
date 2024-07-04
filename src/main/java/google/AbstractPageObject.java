package google;

import google.utils.Action;
import google.utils.Is;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPageObject {
    public final RemoteWebDriver driver;
    protected Action action;
    protected Is is;

    public AbstractPageObject() {
        this.driver = DriverManager.DRIVER;
        initPageObject();
    }

    private void initPageObject() {
        PageFactory.initElements(this.driver, this);
        action = new Action(driver);
        is = new Is(driver);
    }

    public void open(String pageUrl) {
        driver.get(pageUrl);
        System.out.printf("'%s' URL opened%n", pageUrl);
    }
}

