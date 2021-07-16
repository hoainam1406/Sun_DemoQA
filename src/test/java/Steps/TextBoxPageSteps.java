package Steps;

import Objects.TextBoxPageObjects;
import Pages.TextBoxPage;
import Serenity.TextBoxSerenity;
import UI.LoginPageUI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class TextBoxPageSteps {
    @Steps
    TextBoxSerenity textBoxSerenity;
    TextBoxPage textBoxPage;
    LoginPageUI ui;
    @Given("^I want open textbox page$")
    public void iWantOpenTextboxPage() {
        textBoxPage.openTextBoxPage();
    }
    @And("^Valid data to all textfield$")
    public void validDataToAllTextfield(List<TextBoxPageObjects>  usercredentials) {
        for (TextBoxPageObjects textbox : usercredentials) {
            ui.txtUserName.sendKeys(textbox.getUserName());
            ui.txtEmail.sendKeys(textbox.getEmail());
            ui.txtCurrentAddress.sendKeys(textbox.getCurrentAddress());
            ui.txtPermanentAddress.sendKeys(textbox.getPermanentAddress());

        }
    }
    @Then("^The website display data in textbox correct$")
    public void theWebsiteDisplayDataInTextboxCorrect(List<TextBoxPageObjects>  usercredentials) {
        for (TextBoxPageObjects textbox : usercredentials) {
            Assert.assertEquals(textBoxPage.getUserName(),textbox.getUserName());
            Assert.assertEquals(textBoxPage.getEmail(),textbox.getEmail());
            Assert.assertEquals(textBoxPage.getCurrentAddress(),textbox.getCurrentAddress());
            Assert.assertEquals(textBoxPage.getPermanentAddress(),textbox.getPermanentAddress());
        }
    }
    @And("^I click to submit$")
    public void iClickToSubmit() {
        textBoxPage.clickSubmit();
    }
    @Then("^The website display input with color red$")
    public void theWebsiteDisplayInputWithColorRed() {
        Assert.assertEquals(textBoxPage.expectedColorWhenTrue(),textBoxPage.colorCode());
    }


}
