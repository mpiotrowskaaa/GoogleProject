package google.tests;

import google.DriverManager;
import google.pages.GoogleMainPageObject;
import google.pages.GoogleSearchResultsPageObject;
import org.testng.annotations.BeforeClass;

public class AbstractTest extends DriverManager {
    GoogleMainPageObject googleMainPage;
    GoogleSearchResultsPageObject googleSearchResultsPage;

    @BeforeClass
    public void setUp() {
        this.googleMainPage = new GoogleMainPageObject();
        this.googleSearchResultsPage = new GoogleSearchResultsPageObject();
    }
}
