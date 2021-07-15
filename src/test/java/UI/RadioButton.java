package UI;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends PageObject {

    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    public static WebElementFacade btnYes;

    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    public static WebElementFacade valueYes;

}
