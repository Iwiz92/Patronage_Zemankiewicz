package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.GooglePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductFeedbackSteps extends DriverFactory {

    GooglePage googlePage = new GooglePage(driver);

    @And("^I press WriteAReview link$")
    public void iPressWriteAReviewLink() {
        googlePage.WriteReviewLink.isDisplayed();
        googlePage.WriteReviewLink.click();

    }


    @And("^I give fiveStars to the product$")
    public void iGiveFiveStarsToTheProduct() {
        WebElement FiveStars = driver.findElement(By.xpath("//*[@id=\"criterions_list\"]/li/div[1]/div[6]/a"));
        FiveStars.isDisplayed();
        FiveStars.click();
    }

    @And("^I fill TitleComment about product$")
    public void iFillTitleCommentAboutProduct() {
        driver.findElement(By.id("comment_title")).sendKeys("Blouse");
    }

    @And("^I fill Comment about product$")
    public void iFillCommentAboutProduct() {
        driver.findElement(By.id("content")).sendKeys("OK");
    }

    @And("^I press SendComment button$")
    public void iPressSendCommentButton() {
     googlePage.SendCommentButton.isDisplayed();
     googlePage.SendCommentButton.click();

    }

    @Then("^I see successAddComment$")
    public void iSeeSuccessAddComment() {
        Assert.assertTrue(googlePage.successMessageSendToFriend.isDisplayed());
    }

    @And("^I enter blank TitleComment about product$")
    public void iEnterBlankTitleCommentAboutProduct() {
        driver.findElement(By.id("comment_title")).sendKeys("");
    }

    @And("^I enter blank Comment about product$")
    public void iEnterBlankCommentAboutProduct() {
        driver.findElement(By.id("content")).sendKeys("");
    }

    @Then("^I see errorAddComment$")
    public void iSeeErrorAddComment() {
        WebElement errorAddComment = driver.findElement(By.xpath("//*[@id=\"new_comment_form_error\"]/ul/li[1]"));
        Assert.assertTrue(errorAddComment.isDisplayed());
    }
}
