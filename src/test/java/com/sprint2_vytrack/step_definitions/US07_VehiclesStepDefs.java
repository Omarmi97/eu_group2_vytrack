package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.pages.US07_VehiclesPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertFalse;

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

        for (WebElement checkbox : us07_vehiclesPage.checkboxes) {


            if (!checkbox.isSelected()) {
                throw new AssertionError("Not all cars are selected");
            }
            BrowserUtils.waitFor(5);
            Assert.assertTrue(checkbox.isSelected());
        }

    }


    @Then("I select the vehicle with checkbox")
    public void iSelectTheVehicleWithCheckbox() {
        
    }

    @Then("the vehicle should be selected")
    public void theVehicleShouldBeSelected() {
    }
}




