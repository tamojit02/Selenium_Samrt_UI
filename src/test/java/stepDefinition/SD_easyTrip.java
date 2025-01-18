package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SD_easyTrip {

    WebDriver driver = new ChromeDriver();

    @Given("^I want to select travelType (.+)$")
    public void i_want_to_select_travel_type(String travelType) throws InterruptedException {
        System.out.println(travelType);
        driver.get("https://www.easemytrip.com/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());



    }

    @When("^I want to select formcity as (.+)$")
    public void i_want_to_selectFormCity(String formCity) {
        System.out.println(formCity);
        driver.quit();
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
