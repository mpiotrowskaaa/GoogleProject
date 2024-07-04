package google.pages;

import google.AbstractPageObject;
import google.PageUrls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.NoSuchElementException;

public class GoogleSearchResultsPageObject extends AbstractPageObject {

    @FindBy(xpath = "//h3")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//span[text()='Następna' or text()='Next']")
    private WebElement nextPageButton;

    public GoogleSearchResultsPageObject() {
        super();
    }

    public void verifySearchResultPageIsDisplayed() {
        String expectedUrl = String.format("%ssearch?", PageUrls.GOOGLE.getUrl());
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(
                actualUrl.contains(expectedUrl),
                String.format("Expected: '%s' contains '%s'",
                        actualUrl,
                        expectedUrl));
    }

    public void openSearchResult(String text) {
        try {
            WebElement webElement = searchResults.stream()
                    .filter(e -> e.getText().equals(text))
                    .findFirst()
                    .orElseThrow();

            action.click(webElement, text);
        } catch (NoSuchElementException e) {
            clickNextPageButton();
            openSearchResult(text);
        }
    }

    private void clickNextPageButton() {
        action.click(nextPageButton, "Next page");
    }
}
