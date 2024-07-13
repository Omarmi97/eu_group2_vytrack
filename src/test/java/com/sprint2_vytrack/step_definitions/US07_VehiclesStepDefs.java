package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.pages.US07_VehiclesPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class US07_VehiclesStepDefs {


    US07_VehiclesPage us07_vehiclesPage = new US07_VehiclesPage();
    


    @Then("user is on the Vehicles page")
    public void user_is_on_the_vehicles_page() {

        us07_vehiclesPage.fleet.click();

        us07_vehiclesPage.vehicles.click();


    }

    @Then("user should see all checkboxes as unchecked")
    public void user_should_see_all_checkboxes_as_unchecked() {

        for (WebElement checkbox : us07_vehiclesPage.checkboxes) {

            Assert.assertFalse(checkbox.isSelected());

        }

    }

    @Then("the user clicks the first checkbox")
    public void theUserClicksTheFirstCheckbox() {

        us07_vehiclesPage.firstcheckbox.click();


    }

    @Then("all cars should be selected")
    public void all_cars_should_be_selected() {

        for (WebElement checkbox : us07_vehiclesPage.checkboxRows) {

            if (!checkbox.isSelected()) {
                throw new AssertionError("Not all cars are selected");
            }
//            BrowserUtils.waitFor(5);
            assertTrue(checkbox.isSelected());
        }

    }

    @Then("user select the vehicle with driver {string}")
    public void userSelectTheVehicleWithDriver(String driverName) {
        for (WebElement eachDriver : us07_vehiclesPage.driverNames) {
            if (eachDriver.getText().contains(driverName)) {
                eachDriver.click();
                break;

            }

        }
    }


    @Then("the driver {string} should be selected")
    public void theDriverShouldBeSelected(String driverName ) {

        assertTrue(us07_vehiclesPage.selectedDriver.getText().contains(driverName));




    }



  }




