package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginCheckSteps extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);

    @Given("^I open HomePage$")
    public void iOpenHomePage() {
        googlePage.openAutomationPage();
    }

    @When("^I press SignIn link$")
    public void iPressSignInLink()
    {
        googlePage.SignInLink.isDisplayed();
        googlePage.SignInLink.click();
    }

    @And("^I fill in EmailAddress with correct EmailAddress$")
    public void iFillInEmailAddressWithCorrectEmailAddress() throws Throwable
    {
       driver.findElement(By.id("email")).sendKeys("iwi.zemankiewicz@gmail.com");
    }

    @And("^I fill in Password with correct Password$")
    public void iFillInPasswordWithCorrectPassword() throws Throwable
    {
        driver.findElement(By.id("passwd")).sendKeys("Tester92");
    }


    @And("^I press SignIn button$")
    public void iPressSignInButton() {
        googlePage.SubmitLogin.click();
    }

    @Then("^I see MyAccountPage$")
    public void iSeeMyAccountPage()
    {
        googlePage.AccountLink.isDisplayed();
        googlePage.AccountLink.isEnabled();

    }

    @And("^I fill in EmailAddress with incorrect EmailAddress$")
    public void iFillInEmailAddressWithIncorrectEmailAddress()
    {
        driver.findElement(By.id("email")).sendKeys("iwi1.zemankiewicz@gmail.com");
    }

    @And("^I fill in Password with incorrect Password$")
    public void iFillInPasswordWithIncorrectPassword()
    {
        driver.findElement(By.id("passwd")).sendKeys("Tester91");
    }

    @Then("^I see error LoginFail$")
    public void iSeeErrorLoginFail()
    {
        Assert.assertTrue(googlePage.alertMessage.isDisplayed());
    }

    @And("^I enter blank EmailAddress$")
    public void iEnterBlankEmailAddress()
    {
        driver.findElement(By.id("email")).sendKeys("");
    }

    @And("^I enter blank Password$")
    public void iEnterBlankPassword()
    {
        driver.findElement(By.id("passwd")).sendKeys("");
    }

}
