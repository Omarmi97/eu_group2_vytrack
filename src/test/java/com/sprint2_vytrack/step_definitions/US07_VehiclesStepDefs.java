package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.pages.US07_VehiclesPage;
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




    }




