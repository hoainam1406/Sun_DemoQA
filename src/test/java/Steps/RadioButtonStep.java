package Steps;

import Pages.RadioButtonPage;
import Serenity.RadioButtonSerenity;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RadioButtonStep {

    @Steps
    RadioButtonSerenity radiobuttonSerenity;
    RadioButtonPage radioButtonPage;

    @Given("^I want open radio button page$")
    public void iWantOpenRadioButtonPage() {
        radioButtonPage.openRadioButtonPage();
    }

    @When("^I click on \\[Yes\\] radio button$")
    public void iClickOnYesRadioButton() {
        radioButtonPage.clickYesRadioButton();
    }

    @Then("^The website display the selected value correctly  with \"([^\"]*)\"$")
    public void theWebsiteDisplayTheSelectedValueCorrectlyWith(String value) throws Throwable {
        Assert.assertEquals(radioButtonPage.getValue(), value);

    }



}
