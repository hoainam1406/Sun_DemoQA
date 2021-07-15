package Pages;

import UI.PracticeFormUI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class PracticePage extends PageObject {
    PracticeFormUI practiceFormUi;

    public void openPracticeFormPage(){
        open();
    }

    public void btnClickSubmitButton(){
        evaluateJavascript("document.querySelector('#submit').click()");
    }

    public String getMessage(){
        return practiceFormUi.txtMessage.getText();
    }

    public String getColorCodeOfFirstNameBorder(){
        String colorCode= practiceFormUi.txtFirstname.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getColorCodeOfLastNameBorder(){
        String colorCode= practiceFormUi.txtLastname.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getColorCodeOfEmailBorder(){
        String colorCode= practiceFormUi.txtEmail.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getColorCodeOfMobileNumberBorder(){
        String colorCode= practiceFormUi.txtMobile.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getColorCodeOfGender(){
        String colorCode= practiceFormUi.lblGenderMale.getCssValue("color");
        return colorCode;
    }

    public String expectedColorCodeWhenFalse(){
        String expectedColorCodeInRGB= "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }

    public String expectedColorCodeWhenTrue(){
        String expectedColorCodeInRGB= "rgba(40, 167, 69, 1)";
        return expectedColorCodeInRGB;
    }
}

