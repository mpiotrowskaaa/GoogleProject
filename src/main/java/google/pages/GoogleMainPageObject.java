package google.pages;

import google.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class GoogleMainPageObject extends AbstractPageObject {

    public static final String ACCEPT_ALL = "Zaakceptuj wszystko";
    public static final String REJECT_ALL = "Odrzuć wszystko";
    public static final String LOG_IN = "Zaloguj się";

    @FindBy(xpath = "//textarea[@aria-label='Szukaj']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[text()='" + ACCEPT_ALL + "']")
    private WebElement popupAgreeButton;

    @FindBy(xpath = "//div[text()='" + REJECT_ALL + "']")
    private WebElement popupRejectButton;

    @FindBy(xpath = "//div[text()='" + LOG_IN + "' and (@role='none')]")
    private WebElement popupLogInButton;

    @FindBy(xpath = "//button[@aria-label='Wybierz język, pl']")
    private WebElement polishLanguageSelect;

    @FindBy(xpath = "//h3")
    private List<WebElement> searchResults;

    public GoogleMainPageObject() {
        super();
    }

    public void verifyAllElementsOnGooglePopUpAreDisplayed() {
        verifyLogInButtonIsDisplayed();
        verifyLanguageIsSetToPolish();
        verifyPopupAgreeButtonIsDisplayed();
        verifyPopupRejectButtonIsDisplayed();
    }

    private void verifyLogInButtonIsDisplayed() {
        action.scrollTo(popupLogInButton, LOG_IN);
        Assert.assertTrue(is.displayed(popupLogInButton, LOG_IN));
    }

    private void verifyLanguageIsSetToPolish() {
        action.scrollTo(polishLanguageSelect, "PL");
        Assert.assertTrue(is.displayed(polishLanguageSelect, "PL"));
    }

    private void verifyPopupAgreeButtonIsDisplayed() {
        action.scrollTo(popupAgreeButton, ACCEPT_ALL);
        Assert.assertTrue(is.displayed(popupAgreeButton, ACCEPT_ALL));
    }

    private void verifyPopupRejectButtonIsDisplayed() {
        action.scrollTo(popupRejectButton, REJECT_ALL);
        Assert.assertTrue(is.displayed(popupRejectButton, REJECT_ALL));
    }

    public void closeFrame() {
        action.click(popupAgreeButton, "Frame close button");
    }

    public void searchTextInMainInput(String textToType) {
        typeTextInSearchInput(textToType);
        clickEnterInSearchInput();
    }

    public void typeTextInSearchInput(String textToType) {
        action.type(searchInput, textToType, "Search input");
    }

    public void clickEnterInSearchInput() {
        action.clickEnterKey(searchInput);
    }
}
