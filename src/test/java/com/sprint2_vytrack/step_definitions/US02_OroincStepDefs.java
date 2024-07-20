package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.pages.US02_OroincPage;
import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.Set;


public class US02_OroincStepDefs {
    US02_OroincPage us02_oroincPage = new US02_OroincPage();
    WebDriver driver = Driver.getDriver();


    @Given("user clicks on the question mark icon")
    public void user_clicks_on_the_question_mark_icon() {
        us02_oroincPage.questionMarkIcon.click();

    }

    @Then("user should switches window handles")
    public void user_should_switches_window_handles() {
        Set<String> windowHandles = driver.getWindowHandles();

        String originalWindowHandle = driver.getWindowHandle();
        String newWindowHandle = "";

        for (String handle : windowHandles) {
            if (!handle.equals(originalWindowHandle)) {
                newWindowHandle = handle;
                break;
            }

        }
        driver.switchTo().window(newWindowHandle);

    }

    @And("the user should gets access to the Oroinc Documentation page")
    public void the_user_should_gets_access_to_the_oroinc_documentation_page() {

        String expectedTitle = "Welcome to Oro Documentation";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Successfully accessed Oroinc Documentation page");
        } else {
            System.out.println("Failed to access Oroinc Documentation page");
        }

    }


}