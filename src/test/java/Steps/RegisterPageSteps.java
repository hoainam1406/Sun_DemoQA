package Steps;

import Objects.RegisterPageObjects;
import Pages.RegisterPage;
import Serenity.RegisterSerenity;
import UI.LoginPageUI;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;

public class RegisterPageSteps {


    @Steps
    RegisterPage registerPage;
    RegisterSerenity registerSerenity;
    LoginPageUI ui;



    @And("^Click to Button NewUser$")
    public void clickToButtonNewUser() {
       registerPage.newUser();
    }

    @And("^Enter data in Form$")
    public void enterDataInForm(List<RegisterPageObjects> usercredentials) {
        for (RegisterPageObjects registerPageObject : usercredentials) {
            ui.txtFirstName.sendKeys(registerPageObject.getFistname());
            ui.txtLastName.sendKeys(registerPageObject.getLastname());
            ui.txtUserName.sendKeys(registerPageObject.getUsername());
            ui.txtPassWord.sendKeys(registerPageObject.getPassword());
        }
    }
    @And("^Click to Register$")
    public void clickToRegister() {
     registerPage.Register();
    }
    @Then("^The website display \"([^\"]*)\"$")
    public void theWebsiteDisplay(String text) throws Throwable {
        Assert.assertEquals(registerPage.getErrorRecaptcha(), text);
    }

    @Then("^The website display data in form register correct$")
    public void theWebsiteDisplayDataInFormRegisterCorrect(List<RegisterPageObjects> usercredentials) {
        for (RegisterPageObjects register : usercredentials) {
            Assert.assertEquals(registerPage.getFistname(),register.getFistname());
            Assert.assertEquals(registerPage.getLastname(),register.getLastname());
            Assert.assertEquals(registerPage.getName(),register.getUsername());
            Assert.assertEquals(registerPage.getPassword(),register.getPassword());
        }
    }

    @Then("^The website display warning firstName textfield with boder red$")
    public void theWebsiteDisplayWarningFirstNameTextfieldWithBoderRed() {
        Assert.assertEquals(registerPage.expectedColorWhenTrue(),registerPage.warningFirstName());
    }


}
