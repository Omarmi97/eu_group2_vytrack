package com.sprint2_vytrack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US05_VehiclesModelPage {
    WebDriver driver;

    public US05_VehiclesModelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//table[@id='vehiclesModelTable']//th")
     public List<WebElement> columns;

    @FindBy(xpath = "//div[@id='errorMassage']")
    public WebElement errorMassage;

    public boolean
    verifyColumnsPresent(List<String>expectedColumns) {
        for (String expected: expectedColumns) {
            boolean found =columns.stream().anyMatch(column -> column.getText().equals(expected));
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public boolean isErrorMassageDisplayed(){
        return errorMassage.isDisplayed();
    }


}
