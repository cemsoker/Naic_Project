package org.naic.ui.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.naic.ui.pages.MainPage;
import org.naic.ui.utilities.ConfigurationReader;
import org.naic.ui.utilities.Driver;
import org.testng.Assert;

public class MainPageSteps {


   @Given("I am on the webPage")
    public void iAmOnTheWebPage() {

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("I test allLinks")
    public void iTestAllLinks() {

     MainPage mainPage = new MainPage();
     mainPage.checkLink();
    }

    @Then("I validate")
    public void iValidate() {

       MainPage mainPage = new MainPage();
       Assert.assertEquals(mainPage.checkLink(), 6);
    }
}
