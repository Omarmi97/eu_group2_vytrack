package com.sprint2_vytrack.pages;

import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US04_ContractsPage extends BasePage{

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[6]")
    public WebElement vehicleContracts;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement driverFleet;

    @FindBy(xpath = "//span[text()='Vehicle Contracts']")
    public WebElement driverVehicleContracts;

    @FindBy (xpath = "(//div[@class='message'])[2]")
    public WebElement promptMessage;



}
