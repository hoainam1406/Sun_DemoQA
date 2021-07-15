package Steps;

import Objects.WebTablePageObjects;
import Pages.WebTablePage;
import Serenity.WebTableSerenity;
import UI.WebTableUI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class WebTableSteps {

    @Steps
    WebTableUI ui;
    WebTableSerenity webtableSerenity;
    WebTablePage webTablePage;

    @Given("^I want open webtable page$")
    public void iWantOpenWebtablePage() {
        webTablePage.openWebtablePage();

    }


    @When("^I click on add button$")
    public void iclickOnAddButton() {
        webTablePage.clickAddButton();
    }


    @And("^I enter data to all textfield$")
    public void ienterDataToAllTextfield(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            ui.txtFirstNameInput.sendKeys(webtable.getFirstName());
            ui.txtLastNameiInput.sendKeys(webtable.getLastName());
            ui.txtEmailInput.sendKeys(webtable.getEmail());
            ui.txtAgeInput.sendKeys(webtable.getAge());
            ui.txtSalaryInput.sendKeys(webtable.getSalary());
            ui.txtDepartmentInput.sendKeys(webtable.getDepartment());
        }
    }

    @And("^I click submit button$")
    public void iclickSubmitButton() {
        webTablePage.clickSubmitButton();
    }


    @Then("^The website display warning at email textfield$")
    public void theWebsiteDisplayWarningAtEmailTextfield() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getEmailInputColorCode());
    }


    @Then("^The website display warning at age textfield$")
    public void theWebsiteDisplayWarningAtAgeTextfield() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getAgeInputColorCode());
    }

    @Then("^The website display Default Member in Grid correct$")
    public void theWebsiteDisplayDefaultMemberInGridCorrect(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstName(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastName(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAge(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmail(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalary(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartment(), webtable.getDepartment());

        }

    }

    @Then("^The website display Registration Form correct$")
    public void theWebsiteDisplayRegistrationFormCorrect(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFormName(), webtable.getFormName());
        }
    }

    @Then("^The website display Member in Grid correct$")
    public void theWebsiteDisplayMemberInGridCorrect(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstNameNew(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastNameNew(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAgeNew(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmailNew(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalaryNew(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartmentNew(), webtable.getDepartment());

        }
    }

    @Then("^The website display warning at salary textfield$")
    public void theWebsiteDisplayWarningAtSalaryTextfield() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getSalaryInputColorCode());
    }

    @Then("^The website display warning at all textfields$")
    public void theWebsiteDisplayWarningAtAllTextfields() {
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getFirstNameInputColorCode());
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getLastNameInputColorCode());
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getAgeInputColorCode());
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getEmailInputColorCode());
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getSalaryInputColorCode());
        Assert.assertEquals(webTablePage.expectedColorWhenFalse(), webTablePage.getDepartmentInputColorCode());
    }

    @When("^I click on delete icon at any record$")
    public void iclickOnDeleteIconAtAnyRecord() {
        webTablePage.clickDeleteIcon();
    }

    @Then("^The website display Member in Grid except record deleted$")
    public void theWebsiteDisplayMemberInGridExceptRecordDeleted() {

        Assert.assertEquals(webTablePage.getFirstNameDelete(), "");
        Assert.assertEquals(webTablePage.getLastNameDelete(), "");
        Assert.assertEquals(webTablePage.getAgeDelete(), "");
        Assert.assertEquals(webTablePage.getEmailDelete(), "");
        Assert.assertEquals(webTablePage.getSalaryDelete(), "");
        Assert.assertEquals(webTablePage.getDepartmentDelete(), "");

    }

    @When("^I click on edit icon button$")
    public void iclickOnEditIconButton() {
        webTablePage.clickEditIcon();
    }

    @And("^I update data to all textfields$")
    public void iupdateDataToAllTextfields(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            ui.txtFirstNameInput.clear();
            ui.txtFirstNameInput.sendKeys(webtable.getFirstName());

            ui.txtLastNameiInput.clear();
            ui.txtLastNameiInput.sendKeys(webtable.getLastName());

            ui.txtEmailInput.clear();
            ui.txtEmailInput.sendKeys(webtable.getEmail());

            ui.txtAgeInput.clear();
            ui.txtAgeInput.sendKeys(webtable.getAge());

            ui.txtSalaryInput.clear();
            ui.txtSalaryInput.sendKeys(webtable.getSalary());

            ui.txtDepartmentInput.clear();
            ui.txtDepartmentInput.sendKeys(webtable.getDepartment());
        }
    }

    @Then("^The website display Member Updated in Grid correct$")
    public void theWebsiteDisplayMemberUpdatedInGridCorrect(List<WebTablePageObjects> usercredentials) {
        for (WebTablePageObjects webtable : usercredentials) {
            Assert.assertEquals(webTablePage.getFirstNameEdit(), webtable.getFirstName());
            Assert.assertEquals(webTablePage.getLastNameEdit(), webtable.getLastName());
            Assert.assertEquals(webTablePage.getAgeEdit(), webtable.getAge());
            Assert.assertEquals(webTablePage.getEmailEdit(), webtable.getEmail());
            Assert.assertEquals(webTablePage.getSalaryEdit(), webtable.getSalary());
            Assert.assertEquals(webTablePage.getDepartmentEdit(), webtable.getDepartment());

        }
    }


}
