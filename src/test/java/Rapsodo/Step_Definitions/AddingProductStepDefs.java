package Rapsodo.Step_Definitions;

import Rapsodo.Pages.DashboardPage;
import Rapsodo.Pages.DiamondSports;
import Rapsodo.Utilities.BrowserUtils;
import Rapsodo.Utilities.ConfigurationReader;
import Rapsodo.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AddingProductStepDefs {


    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @Given("the user hover over on {string} menu item")
    public void the_user_hover_over_on_menu_item(String string) {

        WebElement element = Driver.get().findElement(By.xpath("//a[@title='" + string + "']"));
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    @Given("click on DIAMOND SPORTS option")
    public void click_on() {
        new DashboardPage().diamondSportsOption.click();
    }

    @Given("verify url opening category {string}")
    public void verify_url_opening_category(String string) throws InterruptedException {
        //Thread.sleep(3000);
        BrowserUtils.waitFor(3);
        String currentUrl = Driver.get().getCurrentUrl();
        int i = currentUrl.indexOf("?");
        String substring = currentUrl.substring(i);
        Assert.assertEquals(string,substring);
    }


    @Then("verify there is {string} items at the cart")
    public void verify_there_is_items_at_the_cart(String string) {
        BrowserUtils.waitFor(2);
        DashboardPage dashboardPage = new DashboardPage();
        String text = dashboardPage.shoppingCard.getText();
        String substring = text.substring(0,1);
        Assert.assertEquals(string,substring);
    }

    @Then("verify price amount is {string}")
    public void verify_price_amount_is(String string) {
        String text = new DashboardPage().shoppingCardAmount.getText();
        Assert.assertEquals(string,text);
    }
    @Given("click on HITTING product")
    public void click_on_HITTING_product() {
        DiamondSports diamondSports = new DiamondSports();
        BrowserUtils.scrollToElement(diamondSports.productHıttıng);
        diamondSports.productHıttıng.click();
    }
    @When("verify url following this {string}")
    public void verify_url_following_this(String string) {
        BrowserUtils.waitFor(3);
        String currentUrl = Driver.get().getCurrentUrl();
        String substring = currentUrl.substring(19);
        Assert.assertEquals(string,substring);
    }

    @When("browser title should be {string}")
    public void browser_title_should_be(String string) {
        String title = Driver.get().getTitle();
        Assert.assertEquals(string,title);

    }
    @When("product SKU value should be {string}")
    public void product_SKU_value_should_be(String string) {
        String text = new DashboardPage().skuValue.getText();
        Assert.assertEquals(string,text);
    }
    @Then("verify add to cart button is disabled")
    public void verify_add_to_cart_button_is_disabled() {
        DashboardPage dashboardPage = new DashboardPage();

        BrowserUtils.scrollToElement(dashboardPage.addToCartButton);
        String currentWindow = Driver.get().getWindowHandle();

        dashboardPage.addToCartButton.click();
        BrowserUtils.waitFor(3);

        String afterClick = Driver.get().getWindowHandle();
        boolean flag ;

        if(currentWindow==afterClick){
            flag=true;
        }else{
            flag=false;
        }

        Assert.assertFalse(flag);

    }
    @When("price should be {string}")
    public void price_should_be(String string) {
        String text = new DashboardPage().priceAfterPlan.getText();
        Assert.assertEquals(string,text);
    }
    @When("choose {string} as option")
    public void choose_as_option(String string) {
        Select select = new Select(new DashboardPage().optionsDropdown);
        select.selectByValue(string);
        BrowserUtils.waitFor(3);
    }
    @Then("verify add to cart button is enabled")
    public void verify_add_to_cart_button_is_enabled() {
        new DashboardPage().addToCartButton.click();
        Assert.assertEquals("Cart | Rapsodo",Driver.get().getTitle());
    }
    @When("click on add to cart button")
    public void click_on_add_to_cart_button() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.addToCartButton.click();
        BrowserUtils.waitFor(3);
        dashboardPage.popUpCloseBtn.click();

    }

    @Then("enter this {string} coupon code")
    public void enter_this_coupon_code(String string) throws InterruptedException {
        BrowserUtils.waitFor(2);
        DashboardPage dashboardPage = new DashboardPage();
        boolean enabled = dashboardPage.couponCodeInput.isEnabled();
        System.out.println(enabled);
        BrowserUtils.waitFor(3);
        dashboardPage.couponCodeInput.sendKeys(string);

        //JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        //jse.executeScript("window.scrollBy(0,250)");
        //BrowserUtils.waitForClickablility(dashboardPage.couponCodeInput,20);
        //dashboardPage.couponCodeInput.click();
        //dashboardPage.couponCodeInput.clear();

        //jse.executeScript("arguments[0].value = '" + string + "'", dashboardPage.couponCodeInput);

        //jse.executeScript("arguments[0].click();",dashboardPage.applyCoupon);
    }
    @Then("verify error message is displayed")
    public void verify_error_message_is_displayed() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.applyCoupon.click();

    }




}
