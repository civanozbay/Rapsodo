package Rapsodo.Step_Definitions;

import Rapsodo.Pages.DashboardPage;
import Rapsodo.Utilities.ConfigurationReader;
import Rapsodo.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddingProductStepDefs {

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("verify url opening as {string} category {string}")
    public void verify_url_opening_as_category(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify there is {string} at the cart")
    public void verify_there_is_at_the_cart(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify price amount is {string}")
    public void verify_price_amount_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
