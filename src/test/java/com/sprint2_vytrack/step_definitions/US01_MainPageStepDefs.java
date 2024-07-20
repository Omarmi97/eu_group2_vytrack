package com.sprint2_vytrack.step_definitions;

import com.sprint2_vytrack.pages.MainPage;
import com.sprint2_vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class US01_MainPageStepDefs {
      MainPage mainPage = new MainPage();
    @Then("driver should see four main modules")
    public void driver_should_see_four_main_modules(List<String> mainModules) {
       mainPage.waitUntilLoaderScreenDisappear();
       List<String> actualModules = BrowserUtils.getElementsText(mainPage.actualMainModules);
        Assert.assertEquals(mainModules, actualModules);
        System.out.println("actual modules = " + actualModules);
        System.out.println("expected modules = " + mainModules);

    }

    @Then("store manager should see eight main modules")
    public void store_manager_should_see_eight_main_modules(List<String> mainModules) {
        mainPage.waitUntilLoaderScreenDisappear();
        List<String> actualModules = BrowserUtils.getElementsText(mainPage.actualMainModules);
        List<String> actualModuless =  actualModules.stream().map(text -> text.replaceAll(",\\s*,+", ", ") ).map(text-> text.replaceAll("\\s*,\\s*",", " )).filter(text->!text.isEmpty()).collect(Collectors.toList());
        Assert.assertEquals(mainModules, actualModuless);
        System.out.println("actual modules = " + actualModuless);
        System.out.println("expected modules = " + mainModules);



    }

    @Then("sales manager should see eight main modules")
    public void sales_manager_should_see_eight_main_modules(List<String> mainModules) {
        mainPage.waitUntilLoaderScreenDisappear();
        List<String> actualModules = BrowserUtils.getElementsText(mainPage.actualMainModules);
        List<String> actualModuless =  actualModules.stream().map(text -> text.replaceAll(",\\s*,+", ", ") ).map(text-> text.replaceAll("\\s*,\\s*",", " )).filter(text->!text.isEmpty()).collect(Collectors.toList());
        Assert.assertEquals(mainModules, actualModuless);
        System.out.println("actual modules = " + actualModuless);
        System.out.println("expected modules = " + mainModules);



    }

}
