package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import com.Intive.Patronage.tests.pages.HomePagePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToWishListSteps extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);

    @When("^I press AddToWishlist link$")
    public void iPressAddToWishlistLink() {
        googlePage.Wishlistbutton.isDisplayed();
        googlePage.Wishlistbutton.click();
    }

    @Then("^I see error FailToAddWishList$")
    public void iSeeErrorFailToAddWishList() {
        Assert.assertTrue(googlePage.errorMessageAddToWishlist.isDisplayed());
    }

    @And("^I choose the Blouse link$")
    public void iChooseTheBlouseLink()
    {
        WebElement Blouse = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a"));

        Blouse.click();
    }

    @Then("^I see successMessageAddToWishlist$")
    public void iSeeSuccessMessageAddToWishlist() {
        Assert.assertTrue(googlePage.successMessageAddToWishlist.isDisplayed());
    }

    @And("^I press logo on the site$")
    public void iPressLogoOnTheSite() {
        googlePage.Logo.isDisplayed();
        googlePage.Logo.click();
    }
}
