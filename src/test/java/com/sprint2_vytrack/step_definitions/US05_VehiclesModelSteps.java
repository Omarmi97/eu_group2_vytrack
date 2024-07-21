package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US05_VehiclesModelSteps {

    WebDriver driver = Driver.getDriver();

    @Given("the user is logged in as {string}")
    public void the_user_is_logged_in_as(String role) {
        driver.get("http://qa3.vytrack.com");

        login(role);

    }



    //  @Given("the user navigates to the Vehicles Model page")

    public void the_user_navigates_to_the_Vehicles_Model_page() {

        driver.findElement(By.xpath("//span[contains(@class,'title')and contains(text(),'Fleet')]")).click();

        driver.findElement(By.xpath("//span[contains(@class,'title')and contains(text(),'Vehicle Model')]")).click();

    }

    @Then("the user should see the following columns on the Vehicles Model page:")

    public void the_user_should_see_the_following_columns_on_the_Vehicles_Model_page(List<String> expectedColumns) {

        List<WebElement> columns = driver.findElements(By.xpath("//thead//th//span[@class='grid-header-cell__label']"));

        for (int i = 0; i < expectedColumns.size(); i++) {
            Assert.assertEquals(expectedColumns.get(i),columns.get(i).getText());

        }
    }

    @When("the user navigates to the Vehicles Model page")

    public void the_user_navigates_to_the_Vehicles_Model_page_for_drivers(){
        driver.findElement(By.xpath("//span[contains(@class,'title')and contains(text(),'Fleet')]")).click();

        driver.findElement(By.xpath("//span[contains(@class,'title')and contains(text(),'Vehicle Model')]")).click();
    }

    @Then("the user should see a permission message {string}")

    public void the_user_should_see_a_permission_message(String expectedMessage) {

        WebElement mesage= driver.findElement(By.xpath("//div[@class='flash-messages-holder']//div[class='alert alert-error fade in top-messages']//div[@clas='message'and text()='"+expectedMessage+"']"));

        Assert.assertTrue(mesage.isDisplayed());
    }


    private void login(String role) {
        WebElement usernameField = driver.findElement(By.id("prependedInput"));
        WebElement passwordField = driver.findElement(By.id("prependedInput2"));
        WebElement loginButton = driver.findElement(By.id("_submit"));

        if (role.equalsIgnoreCase("Sales manager")) {
            usernameField.sendKeys("salesmanager5");
            passwordField.sendKeys("UserUser123");
        } else if (role.equalsIgnoreCase("Truck Driver")) {
            usernameField.sendKeys("user5");
            passwordField.sendKeys("UserUser123");
        }

        loginButton.click();
    }

    @Given("Users logged in as {string}")
    public void users_logged_in_as(String role) {
        the_user_is_logged_in_as(role);
    }
}
