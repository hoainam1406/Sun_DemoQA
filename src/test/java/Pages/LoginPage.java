package Pages;
import UI.LoginPageUI;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/login")
public class LoginPage extends PageObject {

    LoginPageUI ui;

    public void openLoginPage(){
        open();
    }

    public String getValue(){
        return ui.value.getTextValue();
    }

    public String getText(){
        return ui.text.getTextValue();
    }

    public void clickLogin(){
        ui.btnLogin.click();
    }

    public void deleteBook(){
        ui.btnDelete.click();
    }

    public void clickOk(){
        ui.btnOK.click();
    }
    public String colorName(){
        String colorName= ui.txtUserName.getCssValue("border-bottom-color");
        return colorName;
    }

    public String colorPassword(){
        String colorPass= ui.txtPassWord.getCssValue("border-bottom-color");
        return colorPass;
    }
    public String expectedColorWhenTrue(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }



}
