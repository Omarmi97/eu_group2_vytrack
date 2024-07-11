package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;


public class US02_OroincStepDefs {
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    WebDriver driver = Driver.getDriver();
    @Given("truck driver is logged in on the vytrack page")
    public void truck_driver_is_logged_in_on_the_vytrack_page() {
        Driver.getDriver().get("https://qa3.vytrack.com/");
        loginStepDefs.the_user_logged_in_as("driver");



    }


    @And("truck driver clicks on icon")
    public void truck_driver_clicks_on_icon() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement questionMarkIcon = driver.findElement(By.className("fa-question-circle"));
        questionMarkIcon.click();


    }

    @Then("truck driver switches window handles")
    public void truck_driver_switches_window_handles() {
        Set<String> windowHandles = driver.getWindowHandles();

        // Iterate over all handles to find the new window handle
        String originalWindowHandle = driver.getWindowHandle();
        String newWindowHandle = "";
        for (String handle : windowHandles) {
            if (!handle.equals(originalWindowHandle)) {
                newWindowHandle = handle;
                break;
            }
        }

        // Switch to the new window/tab
        driver.switchTo().window(newWindowHandle);
    }

    @Then("truck driver gets access to the Oroinc Documentation page")
    public void truck_driver_gets_access_to_the_oroinc_documentation_page() {

        String expectedTitle = "Welcome to Oro Documentation";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Successfully accessed Oroinc Documentation page");
        } else {
            System.out.println("Failed to access Oroinc Documentation page");
        }




    }

}
