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

    @FindBy(css = "[data-route='oro_calendar_event_index']")
    public WebElement calendarEvents;

    @FindBy(css = "a.btn.main-group.btn-primary.pull-right[title='Create Calendar event']")
    public WebElement clickCreateCalendarEvent;



    @FindBy(className = "controls")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "(//html/body/p[.=''])[1]")
   public WebElement description;

     //  @FindBy(xpath = "")
     //  public WebElement eventList;

   // public void navigateToActivitiesTab() {
      //  activitiesTab.click();


   // }

    public void clickCalendarEvent(){
        calendarEvents.click();
    }
    public void clickCreateCalendarEvent(){
        clickCreateCalendarEvent.click();
    }


    public void setRepeatCheckBox(){
        repeatCheckBox.click();
    }
    public void enterDescription(String string){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(description)).sendKeys(string);
    }
  //  public void isEventDisplayed(){
    //    eventList.isDisplayed();
    }





