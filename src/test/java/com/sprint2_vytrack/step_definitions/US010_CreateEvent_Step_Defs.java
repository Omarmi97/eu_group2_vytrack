package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.pages.US010_CalendarEventsPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US010_CreateEvent_Step_Defs {

    US010_CalendarEventsPage us010_calendarEventsPage = new US010_CalendarEventsPage();

    @When("user navigates to the Activities tab")
    public void user_navigates_to_the_activities_tab() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        // us010_calendarEventsPage.navigateToActivitiesTab();
        BrowserUtils.sleep(5);
        BrowserUtils.hover(us010_calendarEventsPage.activitiesTab);
    }

    @When("user clicks on Calendar Events")
    public void user_clicks_on_calendar_events() {
        us010_calendarEventsPage.clickCalendarEvent();

    }

    @When("user clicks on Create Calendar Event")
    public void user_clicks_on_create_calendar_event() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        us010_calendarEventsPage.clickCreateCalendarEvent();

    }

    @When("user checks the Repeat checkbox")
    public void user_checks_the_repeat_checkbox() throws InterruptedException {
        Thread.sleep(3000);
        us010_calendarEventsPage.setRepeatCheckBox();

    }

    @When("user enters {string} in the Description")
    public void user_enters_in_the_description(String string) {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().switchTo().frame(0);

        us010_calendarEventsPage.enterDescription(string);


    }

    @Then("the event {string} should be displayed")
    public void theEventShouldBeDisplayed(String arg0) {
        us010_calendarEventsPage.eventdiscription;
    }
/*
    @And("sales manager clicks on Create Calendar Event")
   public void salesManagerClicksOnCreateCalendarEvent() {

    }

    @When("sales manager navigates to the Activities tab")
    public void salesManagerNavigatesToTheActivitiesTab() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
    }

    @And("sales manager clicks on Calendar Events")
    public void salesManagerClicksOnCalendarEvents() {
    }

    @And("sales manager checks the Repeat checkbox")
    public void salesManagerChecksTheRepeatCheckbox() {
    }

    @When("sales manager enters {string} in the Description")
    public void salesManagerEntersInTheDescription(String arg0) {
    }

    @When("store manager navigates to the Activities tab")
    public void storeManagerNavigatesToTheActivitiesTab() {
    }

    @And("store manager clicks on Calendar Events")
    public void storeManagerClicksOnCalendarEvents() {
    }

    @And("store manager clicks on Create Calendar Event")
    public void storeManagerClicksOnCreateCalendarEvent() {
    }

    @And("store manager checks the Repeat checkbox")
    public void storeManagerChecksTheRepeatCheckbox() {
    }

    @When("store manager enters {string} in the Description")
    public void storeManagerEntersInTheDescription(String arg0) {
    }

    @Then("the event {string} should be displayed")
    public void the_event_should_be_displayed(String evenList) {

    }

}
}

 */

}