package Steps;

import Objects.PracticeFormObjects;
import Pages.PracticePage;
import UI.PracticeFormUI;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.List;

public class PracticeFormSteps extends PageObject {

    @Steps
    PracticeFormUI Ui;
    PracticePage practicePage;

    @Given("^I want open the registration form page$")
    public void openTheRegistrationFormPage() {
        practicePage.openPracticeFormPage();
    }

    @When("^I not filling up any data$")
    public void iNotFillingUpAnyData() {
    }

    @When("^I click the submit button$")
    public void clickTheSubmitButton() {
        practicePage.btnClickSubmitButton();
    }

    @Then("^Mandatory fields should show the red border and 'Thanks for submitting the form' should not show$")
    public void mandatoryFieldsShouldShowTheRedBorderAndThanksForSubmittingTheFormShouldNotShow() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfFirstNameBorder());
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfLastNameBorder());
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfGender());
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfMobileNumberBorder());
    }

    @When("^I filling up all the fields$")
    public void iFillingUpAllTheFields(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtFirstname.sendKeys(practiceFormObjects.getFirstName());
            Ui.txtLastname.sendKeys(practiceFormObjects.getLastName());
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
            Ui.lblGenderMale.click();
            Ui.txtMobile.sendKeys(practiceFormObjects.getMobileNumber());
            Ui.txtDateOfBirth.sendKeys(practiceFormObjects.getDateOfBirth());
            Ui.lblHobbieReading.click();
            Ui.txtCurrentAddress.sendKeys(practiceFormObjects.getCurrentAddress());
        }
    }

    @Then("^The \"([^\"]*)\" should show$")
    public void theThanksForSubmittingTheFormShouldShow(String message) throws Throwable {
        Assert.assertEquals(practicePage.getMessage(), message);
    }

    @When("^I filling up the required fields only$")
    public void iFillingUpTheRequiredFieldsOnly(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtFirstname.sendKeys(practiceFormObjects.getFirstName());
            Ui.txtLastname.sendKeys(practiceFormObjects.getLastName());
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
            Ui.lblGenderMale.click();
            Ui.txtMobile.sendKeys(practiceFormObjects.getMobileNumber());
        }
    }



    @When("^I filling up first name field only$")
    public void iFillingUpFirstnameFieldOnly(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtFirstname.sendKeys(practiceFormObjects.getFirstName());
        }
    }
    @When("^I filling up last name field only$")
    public void iFillingUpLastNameFieldOnly(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtLastname.sendKeys(practiceFormObjects.getLastName());
        }
    }


    @Then("^First name field should show the red border and Last name field should show the green border$")
    public void firstNameFieldShouldShowTheRedBorderAndLastNameFieldShouldShowTheGreenBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfFirstNameBorder());
        Assert.assertEquals(practicePage.expectedColorCodeWhenTrue(), practicePage.getColorCodeOfLastNameBorder());
    }
    @Then("^Last name field should show the red border and First name field should show the green border$")
    public void lastNameFieldShouldShowTheRedBorderAndFirstNameFieldShouldShowTheGreenBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfLastNameBorder());
        Assert.assertEquals(practicePage.expectedColorCodeWhenTrue(), practicePage.getColorCodeOfFirstNameBorder());
    }
    @When("^I filling up numeric characters instead of string in the full name text field$")
    public void iFillingUpNumericCharactersInsteadOfStringInTheFullNameTextField(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtFirstname.sendKeys(practiceFormObjects.getFirstName());
            Ui.txtLastname.sendKeys(practiceFormObjects.getLastName());
        }
    }

    @When("^I filling up special characters instead of string in the full name text field$")
    public void iFillingUpSpecialCharactersInsteadOfStringInTheFullNameTextField(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtFirstname.sendKeys(practiceFormObjects.getFirstName());
            Ui.txtLastname.sendKeys(practiceFormObjects.getLastName());
        }
    }

    @Then("^Lastname and Firstname fields should show the red border$")
    public void lastnameAndFirstnameFieldsShouldShowTheRedBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfFirstNameBorder());
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfLastNameBorder());
    }

    @When("^I not filling up any data into email field$")
    public void iNotFillingUpAnyDataIntoEmail(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
        }
    }

    @Then("^Email field should show the green border$")
    public void emailFieldShouldShowTheGreenBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenTrue(), practicePage.getColorCodeOfEmailBorder());
    }

    @When("^I filling up random string instead of real email$")
    public void iFillingUpRandomStringInsteadOfRealEmail(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
        }
    }

    @Then("^Email field should show the red border$")
    public void emailFieldShouldShowTheRedBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfEmailBorder());
    }

    @When("^I filling up wrong format instead of real email$")
    public void iFillingUpWrongFormatInsteadOfRealEmail(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
        }
    }

    @When("^I filling up email field have blank space$")
    public void iFillingUpEmailFieldHaveBlankspace(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtEmail.sendKeys(practiceFormObjects.getEmail());
        }
    }

    @When("^I not checking any data into gender field$")
    public void iNotCheckingAnyDataIntoGenderField() {
    }

    @Then("^Gender field should show the red border$")
    public void genderFieldShouldShowTheRedBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfGender());
    }


    @Then("^Mobile number field should show the red border$")
    public void mobileNumberFieldShouldShowTheRedBorder() {
        Assert.assertEquals(practicePage.expectedColorCodeWhenFalse(), practicePage.getColorCodeOfMobileNumberBorder());
    }

    @When("^I filling up wrong format of mobile number$")
    public void iFillingUpWrongFormatOfMobileNumber(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtMobile.sendKeys(practiceFormObjects.getMobileNumber());
        }
    }

    @When("^I not checking any data into mobile number field$")
    public void iNotCheckingAnyDataIntoMobileNumberField(List<PracticeFormObjects>  usercredentials) throws Throwable {
        for (PracticeFormObjects practiceFormObjects : usercredentials) {
            Ui.txtMobile.sendKeys(practiceFormObjects.getMobileNumber());
        }
    }
}




