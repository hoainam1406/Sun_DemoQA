package Steps;

import Pages.TabPage;
import UI.TabUI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TabSteps {
    @Steps
    TabUI ui;
    TabPage tabPage;
    @Given("^I want open tab page$")
    public void iWantOpenTabPage() {
        tabPage.openTabPage();
    }

    @When("^The what tab should show the \"([^\"]*)\"$")
    public void theWhatTabShouldShowThe(String message) throws Throwable {
        Assert.assertEquals(tabPage.getTextWhatTab(),message);
    }

    @When("^I click origin button$")
    public void iClickOriginButton() {
        ui.btnOriginTab.click();
    }

    @Then("^The origin tab should show the \"([^\"]*)\"$")
    public void theOriginTabShouldShowThe(String arg0) throws Throwable {
    }

    @When("^I click use button$")
    public void iClickUseButton() {
        ui.btnUseTab.click();
    }
    @When("^The use tab should show the \"([^\"]*)\"$")
    public void theUseTabShouldShowThe(String message) throws Throwable {
        Assert.assertEquals(tabPage.getTextUseTab(),message);
    }



}
