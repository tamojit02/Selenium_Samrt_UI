package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_easyTrip {

    @Given("^I want to select travelType (.+)$")
    public void i_want_to_select_travel_type(String travelType) {
        System.out.println(travelType);

    }

    @When("^I want to select formcity as (.+)$")
    public void i_want_to_selectFormCity(String formCity) {
        System.out.println(formCity);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^I want to select to city as (.+)$")
    public void i_want_to_select_tocity(String toCity) {
        System.out.println(toCity);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I want to select depertureDate (.+)$")
    public void i_want_to_selectDate(String date) {
        System.out.println(date);
        // Write code here that turns the phrase above into concrete actions

    }

}
