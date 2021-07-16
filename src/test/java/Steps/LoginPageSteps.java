package Steps;

import Objects.LoginPageObjects;
import Pages.LoginPage;
import Serenity.LoginSerenity;
import UI.LoginPageUI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class LoginPageSteps {
    @Steps
    LoginSerenity loginSerenity;
    LoginPage loginPage;
    LoginPageUI ui;

    @Given("^I want open home page login$")
    public void iWantOpenHomePageLogin() {
        loginPage.openLoginPage();
    }

    @And("^I click to login button$")
    public void iclickToLoginButton() {
        loginPage.clickLogin();
    }

    @Then("^The website display book store login correct with \"([^\"]*)\"$")
    public void theWebsiteDisplayBookStoreLoginCorrectWithAnd(String value) throws Throwable {
        Assert.assertEquals(loginPage.getValue(), value);
    }
    @Then("^The website display book store login incorrect with \"([^\"]*)\"$")
    public void theWebsiteDisplayBookStoreLoginIncorrectWith(String text) throws Throwable {
        Assert.assertEquals(loginPage.getText(), text);
    }

    @And("^User enters Credentials to LogIn$")
    public void userEntersCredentialsToLogIn(List<LoginPageObjects>  usercredentials) throws Throwable {
        for (LoginPageObjects loginPageObject : usercredentials) {
            ui.txtUserName.sendKeys(loginPageObject.getUserLogin());
            ui.txtPassWord.sendKeys(loginPageObject.getPassWord());
        }
        }

    @Then("^Message displayed User Register Successfully\\.$")
    public void messageDisplayedUserRegisterSuccessfully() {
        System.out.println("User Register Successfully");
    }

    @When("^User LogOut from the Application$")
    public void userLogOutFromTheApplication() {
       ui.btnLogOut.click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void messageDisplayedLogOutSuccessfully() {
        System.out.println("LogOut Successfully");
    }

    @Then("^The website display warning textfield with boder red$")
    public void theWebsiteDisplayWarningTextfieldWithBoderRed() {
        Assert.assertEquals(loginPage.expectedColorWhenTrue(),loginPage.colorName());
        Assert.assertEquals(loginPage.expectedColorWhenTrue(),loginPage.colorPassword());
    }

    @Then("^The website display warning password textfield with boder red$")
    public void theWebsiteDisplayWarningPasswordTextfieldWithBoderRed() {
        Assert.assertEquals(loginPage.expectedColorWhenTrue(),loginPage.colorPassword());
    }

    @And("^I click to Delete button$")
    public void iclickToDeleteButton() {
        loginPage.deleteBook();
    }

    @And("^I click to OK to delete this book$")
    public void iclickToOKToDeleteThisBook() {
        loginPage.clickOk();
    }

    @Then("^The display message deleted$")
    public void theDisplayMessageDeleted() {
        System.out.println("Book deleted");
    }


}

