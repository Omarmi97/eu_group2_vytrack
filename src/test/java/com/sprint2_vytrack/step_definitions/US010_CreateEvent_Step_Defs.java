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

    @When("the user navigates to the {string} - {string}")
    public void theUserNavigatesToThe(String activitiesTab , String calendarModule) {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        us010_calendarEventsPage.navigateToModule(activitiesTab,calendarModule);
    }

    @When("user clicks on Create Calendar Event")
    public void user_clicks_on_create_calendar_event() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        us010_calendarEventsPage.clickCreateCalendarEvent();

    }

    @When("user checks the Repeat checkbox")
    public void user_checks_the_repeat_checkbox() {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        us010_calendarEventsPage.repeatCheckBox1.click();

    }

    @When("user enters {string} in the Description")
    public void user_enters_in_the_description(String string) {
        us010_calendarEventsPage.waitUntilLoaderScreenDisappear();
        Driver.getDriver().switchTo().frame(0);

        us010_calendarEventsPage.enterDescription(string);
        Assert.assertEquals(string,us010_calendarEventsPage.eventdiscription1.getText());

    }




}