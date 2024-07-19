package com.sprint2_vytrack.pages;

import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US010_CalendarEventsPage extends BasePage {


    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement activitiesTab;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement activitiesSales;

    @FindBy(xpath = "//li[@data-route='oro_calendar_event_index']")
    public WebElement calendarEvents;

    @FindBy(css = "a.btn.main-group.btn-primary.pull-right[title='Create Calendar event']")
    public WebElement clickCreateCalendarEvent;


    @FindBy(className = "controls")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//input[starts-with(@id,\"recurrence-repeat\")]")
    public WebElement repeatCheckBox1;


    @FindBy(xpath = "(//html/body/p[.=''])[1]")
    public WebElement description;

    @FindBy(tagName= "p")
    public WebElement eventdiscription;

    @FindBy(xpath= "//body[@id='tinymce']/p")
    public WebElement eventdiscription1;


    public void clickCalendarEvent() {
        calendarEvents.click();
    }

    public void clickCreateCalendarEvent() {
        clickCreateCalendarEvent.click();
    }


    public void setRepeatCheckBox() {
        repeatCheckBox.click();
    }

    public void enterDescription(String string) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(description)).sendKeys(string);
    }

    public void isEventDisplayed() {
        eventdiscription.isDisplayed();
    }
}




