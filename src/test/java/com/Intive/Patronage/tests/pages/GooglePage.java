package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;



public class GooglePage {

    private static String GOOGLE_URL = "https://www.google.com/";
    private static String Automation_URL = "http://automationpractice.com/index.php";
    private static String ProductLink = "http://automationpractice.com/index.php?id_product=2&controller=product";
    private WebDriver driver;

    @FindBy(how = How.NAME, using = "q")
    public WebElement searchField;

    @FindBy(how = How.ID, using = "rcnt")
    public WebElement resultsWebPart;

    @FindBy (how = How.CLASS_NAME, using = "LC20lb")
    public WebElement firstSearchResult;

    //odnośniki

    @FindBy (how =How.ID, using = "contact-link")
    public WebElement ContactUsLink;

    @FindBy (how = How.CLASS_NAME, using = "header_user_info")
    public WebElement SignInLink;

    @FindBy (how = How.CLASS_NAME, using = "logout")
    public WebElement LogOutLink;

    @FindBy (how = How.CLASS_NAME, using = "account")
    public WebElement AccountLink;

    @FindBy (how = How.ID, using = "send_friend_button")
    public WebElement SendFriendLink;

    @FindBy (how = How.ID, using = "wishlist_button")
    public WebElement Wishlistbutton;

    @FindBy (how =How.CLASS_NAME, using = "product_img_link")
    public WebElement BlouseLink;

    @FindBy (how = How.ID, using = "header_logo")
    public WebElement Logo;

    @FindBy (how = How.CLASS_NAME, using = "open-comment-form")
    public WebElement WriteReviewLink;

    //przyciski

    @FindBy (how = How.ID, using = "submitMessage")
    public WebElement SubmitButtonSend;

    @FindBy (how = How.ID, using = "SubmitLogin")
    public WebElement SubmitLogin;

    @FindBy (how = How.ID, using = "sendEmail")
    public WebElement SendFriendButton;

    @FindBy (how = How.CLASS_NAME, using = "btn btn-default button-search")
    public WebElement SearchButton;

    @FindBy (how = How.ID, using = "submitNewMessage")
    public WebElement SendCommentButton;

    //komunikaty

    @FindBy (how = How.CLASS_NAME, using = "alert-danger")
    public WebElement alertMessage;

    @FindBy (how = How.CLASS_NAME, using = "fancybox-inner")
    public WebElement successMessageSendToFriend;

    @FindBy (how = How.ID, using = "send_friend_form_error")
    public WebElement errorMessageSendToFriend;

    @FindBy (how = How.CLASS_NAME, using = "fancybox-error")
    public WebElement errorMessageAddToWishlist;

    @FindBy (how = How.CLASS_NAME, using = "fancybox-inner")
    public WebElement successMessageAddToWishlist;

    @FindBy (how = How.ID, using = "new_comment_form_error")
    public WebElement errorAddComment;

    // dane

    @FindBy (how = How.ID, using = "email")
    public WebElement Email;

    @FindBy (how = How.ID, using = "passwd")
    public WebElement Password;

    public GooglePage(final WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   /* public class WebDriverFactory {
        public WebDriver createWebDriver() {
            String webdriver = System.getProperty("browser", "firefox");
            switch(webdriver) {
                case "firefox":
                    return new FirefoxDriver();
                case "chrome":
                    return new ChromeDriver();
                default:
                    throw new RuntimeException("Unsupported webdriver: " + webdriver);
            }
        }
    } */

    public void openGooglePage() { driver.get(GOOGLE_URL); }

    public void openAutomationPage() {driver.get(Automation_URL);}

    public void productLink () {driver.get(ProductLink);}

    public void searchInGoogle(String searchPhrase)
    {
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }

    public void verifyIfResultsAreVisible() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultsWebPart));
    }
}
