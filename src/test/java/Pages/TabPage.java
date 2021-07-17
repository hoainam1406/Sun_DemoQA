package Pages;

import UI.TabUI;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://demoqa.com/tabs")
public class TabPage extends PageObject {
    TabUI ui;

    public TabPage(WebDriver driver) {
        super(driver);
    }

    public void openTabPage(){
        open();
    }

    public String getTextWhatTab(){
        return ui.txtWhatTab.getTextValue();
    }

    public String getTextOriginTab(){
        return ui.txtOriginTab.getTextValue();
    }

    public String getTextUseTab(){
        return ui.txtUseTab.getTextValue();
    }
}
