package Pages;

import UI.RadioButton;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/radio-button")
public class RadioButtonPage extends PageObject {
    RadioButton ui;
    public void openRadioButtonPage() {
        open();
    }


    public void clickYesRadioButton() {

        ui.btnYes.click();
    }

    public String getValue() {
        return ui.valueYes.getTextValue();
    }

}
