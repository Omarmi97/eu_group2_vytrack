package com.sprint2_vytrack.step_definitions;


import com.sprint2_vytrack.pages.US010_CalendarEventsPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import com.sprint2_vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US010_CreateEvent_Step_Defs {

    US010_CalendarEventsPage us010_calendarEventsPage = new US010_CalendarEventsPage();
    @When("driver navigates to the Activities tab")
    public void driver_navigates_to_the_activities_tab() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
    // us010_calendarEventsPage.navigateToActivitiesTab();
        BrowserUtils.sleep(5);
        BrowserUtils.hover(us010_calendarEventsPage.activitiesTab);
    }
    @When("driver clicks on Calendar Events")
    public void driver_clicks_on_calendar_events() {
        us010_calendarEventsPage.clickCalendarEvent();

    }
    @When("driver clicks on Create Calendar Event")
    public void driver_clicks_on_create_calendar_event() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        us010_calendarEventsPage.clickCreateCalendarEvent();

    }
    @When("driver checks the Repeat checkbox")
    public void driver_checks_the_repeat_checkbox() throws InterruptedException {
        Thread.sleep(3000);
        us010_calendarEventsPage.setRepeatCheckBox();

    }
    @When("driver enters {string} in the Description")
    public void driver_enters_in_the_description(String string) {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().switchTo().frame(0);

        us010_calendarEventsPage.enterDescription(string);


    }

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


