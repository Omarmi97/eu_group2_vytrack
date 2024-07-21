package com.sprint2_vytrack.pages;
import com.sprint2_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage_OM {

    public AccountsPage_OM() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filtersButton;

}
