package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SendLinkToFriendSteps extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);

    @Given("^I open ProductPage$")
    public void iOpenProductPage() {
        googlePage.productLink();
    }

   /* @When("^I choose a product on the page site$")
    public void iChooseAProductOnThePageSite() {
        driver.findElements(By.cssSelector("//a[@title='Blouse']"));
    } */

    @When("^I press SendToAFriend link$")
    public void iPressSendToAFriendLink() {
        googlePage.SendFriendLink.isDisplayed();
        googlePage.SendFriendLink.click();
    }

    @And("^I fill in my friend Name$")
    public void iFillInMyFriendName() {
        driver.findElement(By.id("friend_name")).sendKeys("Iwona");
    }

    @And("^I fill in my friend EmailAddress$")
    public void iFillInMyFriendEmailAddress() {
        driver.findElement(By.id("friend_email")).sendKeys("iwi.zemankiewicz@gmail.com");
    }

    @And("^I press SendToFriend button$")
    public void iPressSendToFriendButton() {
        googlePage.SendFriendButton.isDisplayed();
        googlePage.SendFriendButton.click();
    }

    @Then("^I see SuccessfulSendLinkMessage$")
    public void iSeeSuccessfulSendLinkMessage() {
        Assert.assertTrue(googlePage.successMessageSendToFriend.isDisplayed());
    }

    @Then("^I see error SendLinkFail$")
    public void iSeeErrorSendLinkFail() {
        Assert.assertTrue(googlePage.errorMessageSendToFriend.isDisplayed());
    }


    @And("^I enter blank my friend EmailAddress$")
    public void iEnterBlankMyFriendEmailAddress() {
        driver.findElement(By.id("friend_email")).sendKeys("");
    }
}
