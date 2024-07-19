package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.pages.US003_PinbarPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US003_PinbarStepDefs {

US003_PinbarPage us003_pinbarPage = new US003_PinbarPage();

    @When("users click the {string} link on the homepage")
    public void users_click_the_link_on_the_homepage(String string) {
        us003_pinbarPage.learnPinbar.click();
        
    }


    @Then("user should see {string}")
    public void userShouldSee(String expectedText) {
        String actualText = us003_pinbarPage.howToUsePinbarText.getText();

        Assert.assertEquals(actualText,expectedText);

    }
    @Then("user will see {string}")
    public void userWillSee(String expectedMessage) {
        String actualMessage = us003_pinbarPage.fastAccessPinIcon.getText();

        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @Then("users should see an image on the page.")
    public void usersShouldSeeAnImageOnThePage() {

        String expectedImagePath = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertTrue(us003_pinbarPage.image.getAttribute("src").contains(expectedImagePath));
    }
}
