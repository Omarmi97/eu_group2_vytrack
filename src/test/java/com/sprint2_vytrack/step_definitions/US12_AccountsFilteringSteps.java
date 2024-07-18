package com.sprint2_vytrack.step_definitions;
import com.sprint2_vytrack.pages.AccountsPage_OM;
import com.sprint2_vytrack.pages.BasePage;
import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US12_AccountsFilteringSteps {


    BasePage basePage = new BasePage() {};

    @Then("user clicks the option Accounts under the menu option Customers")
    public void user_user_clicks_the_option_accounts_under_the_menu_option_customers() {
        try {
            Driver.getDriver().findElement(By.partialLinkText("Customers")).click();
            basePage.accountsButton.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found/you don't have permission to for this function");
        }

    }

    @Then("user is on the {string} page")
    public void user_is_on_the_page(String title) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(title, Driver.getDriver().getTitle());

    }

    @Then("user clicks the filters button")
    public void user_clicks_filters_button() {

        AccountsPage_OM page = new AccountsPage_OM();
        page.filtersButton.click();
    }

    @Then("user should see the following 8 filter items:")
    public void user_should_see_the_following_filter_items(List<String> filters) {

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        List<WebElement> dropDown = Driver.getDriver().findElements(By.xpath("//div[@class='filter-item oro-drop']"));
        List<String> dropDownItems = new ArrayList<>();

        for (WebElement option : dropDown) {

            dropDownItems.add(option.getText());

        }
        Assert.assertEquals(filters, dropDownItems);
    }

}

