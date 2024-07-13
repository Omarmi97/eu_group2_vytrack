package com.sprint2_vytrack.pages;

import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US07_VehiclesPage {

    public US07_VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicles;

    @FindBy(xpath = "//input[@type='checkbox']")
    public  List<WebElement> checkboxes;

    @FindBy(xpath = "//div[@class='btn-group dropdown']//input[1]")
    public WebElement firstcheckbox;

    @FindBy(xpath = "//tr[@class='grid-row row-selected']")
    public List<WebElement> checkboxRows;

    @FindBy(xpath = "//tr[@class ='grid-row row-click-action']//td[4]")
    public List<WebElement> driverNames;

    @FindBy(xpath = "//tr[@class ='grid-row row-click-action']//td[.='Martin Upton']")
    public WebElement selectedDriver;


}



