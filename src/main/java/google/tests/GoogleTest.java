package google.tests;

import google.PageUrls;
import org.testng.annotations.Test;

public class GoogleTest extends AbstractTest {

    @Test(priority = 1)
    public void verifyElementsOnGoogleFrameTest() {
        googleMainPage.open(PageUrls.GOOGLE.getUrl());
        googleMainPage.verifyAllElementsOnGooglePopUpAreDisplayed();
    }

    @Test(priority = 2)
    public void openMicrosoftLinkedinPageTest() {
        googleMainPage.open(PageUrls.GOOGLE.getUrl());
        googleMainPage.closeFrame();
        googleMainPage.searchTextInMainInput("Microsoft");
        googleSearchResultsPage.verifySearchResultPageIsDisplayed();
        googleSearchResultsPage.openSearchResult("Microsoft - LinkedIn");
    }
}
