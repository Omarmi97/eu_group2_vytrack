package com.sprint2_vytrack.pages;

import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_OroincPage extends BasePage{

    public US02_OroincPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (className = "fa-question-circle")
    public WebElement questionMarkIcon;

}
