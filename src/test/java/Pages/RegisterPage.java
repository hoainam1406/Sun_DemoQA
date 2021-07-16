package Pages;

import UI.LoginPageUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/login")
public class RegisterPage extends PageObject {
    LoginPageUI ui;
    public String getFistname(){
        return ui.txtFirstName.getTextValue();
    }
    public String getLastname(){
        return ui.txtLastName.getTextValue();
    }
    public String getPassword(){
        return ui.txtPassWord.getTextValue();
    }
    public String getName(){
        return ui.txtUserName.getTextValue();
    }
    public void newUser(){
        ui.btnNewUser.click();
    }
    public  String getErrorRecaptcha(){
        return  ui.errorRecaptcha.getTextValue();}
    public void Register(){
        evaluateJavascript("document.querySelector('#register').click()");

    }
    public String warningFirstName(){
        String colorFirstName= ui.txtFirstName.getCssValue("border-bottom-color");
        return colorFirstName;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }

}
