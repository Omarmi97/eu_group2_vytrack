package com.sprint2_vytrack.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US003_PinbarPage extends BasePage{

    @FindBy(xpath = "//a[text()='Learn how to use this space']")
    public WebElement learnPinbar;

    @FindBy(xpath = "//h3[text()='How To Use Pinbar']")
    public WebElement howToUsePinbarText;


    @FindBy(xpath = "(//p)[1]")
    public WebElement fastAccessPinIcon;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement image;

}
