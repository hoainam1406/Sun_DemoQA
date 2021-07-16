package Pages;

import UI.LoginPageUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/text-box")
public class TextBoxPage extends PageObject {
    LoginPageUI ui;

    public void openTextBoxPage(){
        open();
    }

    public String getUserName() {

        return ui.txtUserName.getTextValue();
    }

    public String getEmail() {

        return ui.txtEmail.getTextValue();
    }
    public String getCurrentAddress() {

        return ui.txtCurrentAddress.getValue();
    }
    public String getPermanentAddress() {

        return ui.txtPermanentAddress.getValue();
    }
    public void  clickSubmit() {
        evaluateJavascript("document.querySelector('#submit').click()");
    }
    public String colorCode(){
        String colorCode= ui.txtEmail.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(255, 0, 0, 1)";
        return expectedColorCodeInRGB;
    }
}
