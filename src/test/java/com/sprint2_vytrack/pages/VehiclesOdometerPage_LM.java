package com.sprint2_vytrack.pages;

import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesOdometerPage_LM {

    public VehiclesOdometerPage_LM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "ul.nav-multilevel.main-menu > li.dropdown.dropdown-level-1:nth-of-type(2)")
    public WebElement fleetModuleName;

    @FindBy (css = " a[href=\"/entity/Extend_Entity_VehiclesOdometer\"] > span.title.title-level-2")
    public WebElement vehicleOdometerModuleName;

    @FindBy(xpath = "//div[@class='message' and contains(text(), 'You do not have permission to perform this action.')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']" )
    public WebElement viewPerPageNumber;

    @FindBy (css = "ul.nav-multilevel.main-menu > li.dropdown.dropdown-level-1:nth-of-type(1)")
    public WebElement fleetSecondModuleName;

}
