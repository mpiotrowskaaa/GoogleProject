package google;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverManager {
    public static RemoteWebDriver DRIVER;

    @BeforeClass
    public static void startDriver() {
        switch (getDriverName().toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/java/google/drivers/chromedriver.exe");
                DRIVER = new ChromeDriver();
                break;
            default:
                throw new IllegalStateException("Unsupported browser name!");
        }
        DRIVER.manage().window().maximize();
    }

    @AfterClass
            (alwaysRun = true)
    public void tearDown() {
        DRIVER.quit();
    }

    private static String getDriverName() {
        String browserName = System.getProperty("browserName", "chrome");
        return browserName;
    }
}
