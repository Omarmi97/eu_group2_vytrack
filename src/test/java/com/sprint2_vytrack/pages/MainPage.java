package com.sprint2_vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage{


  @FindBy(xpath = "//a[@class='unclickable']")
 public List<WebElement> actualMainModules;
}







