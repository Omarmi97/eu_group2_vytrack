package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.pages.US04_ContractsPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class US04_vehicleContracts_StepDefinitions {

    US04_ContractsPage us04_contractsPage = new US04_ContractsPage();
    @When("the user click Fleet to see the vehicle contracts page")
    public void the_user_click_fleet_to_see_the_vehicle_contracts_page() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        us04_contractsPage.fleet.click();

    }
    @When("the user click into vehicle contracts page")
    public void the_user_click_into_vehicle_contracts_page() {
        us04_contractsPage.vehicleContracts.click();


    }
    @Then("the user should see title is as expected")
    public void the_user_should_see_title_is_as_expected() {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        //BrowserUtils.verifyTitle(expectedTitle);

    }

    @Then("the user see the message {string}")
    public void theUserSeeTheMessage(String arg0) {

    }
}
