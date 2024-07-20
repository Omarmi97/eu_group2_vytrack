package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.pages.BasePage;
import com.sprint2_vytrack.pages.LoginPage;
import com.sprint2_vytrack.pages.VehiclesOdometerPage_LM;
import com.sprint2_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US011_VehiclesOdometerSteps {

    LoginPage loginPage = new LoginPage();
    VehiclesOdometerPage_LM vehiclesOdometerPage = new VehiclesOdometerPage_LM();


    @Given("the user logged in with {string}, {string}")
    public void theUserLoggedInWith(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user should be able to click Fleet modules")
    public void userShouldBeAbleToClickFleetModules() {
        vehiclesOdometerPage.fleetModuleName.click();
    }


    @When("user should be able to click Vehicle Odometer modules")
    public void userShouldBeAbleToClickVehicleOdometerModules() {
        BrowserUtils.waitFor(2);
        vehiclesOdometerPage.vehicleOdometerModuleName.click();
    }


    @Then("user should be able to see {string}")
    public void userShouldBeAbleToSeeErrorMessage(String errorMessage) {
        String actualMessage = vehiclesOdometerPage.errorMessage.getText();
        Assert.assertEquals("You do not have permission to perform this action.", actualMessage);

    }

    @Given("user in logged as Driver")
    public void user_in_logged_as_driver() {
        loginPage.login("user1", "UserUser123");

    }

    @When("user should be able to click on Fleet modules")
    public void userShouldBeAbleToClickOnFleetModules() {
        vehiclesOdometerPage.fleetSecondModuleName.click();
    }

    @Then("user should be able to see by default page {string}")
    public void userShouldBeAbleToSeeByDefaultPage(String arg0) {
        String actualResult = vehiclesOdometerPage.pageNumber.getAttribute("value");
        Assert.assertEquals("1", actualResult);
    }

    @Then("user should be able to see View Per Page as {string} by default")
    public void userShouldBeAbleToSeeViewPerPageAsByDefault(String arg0) {
        Assert.assertEquals("25", vehiclesOdometerPage.viewPerPageNumber.getText());

    }

}


