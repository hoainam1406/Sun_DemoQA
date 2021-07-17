package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TabUI extends PageObject {
    @FindBy(xpath = "//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")
    public WebElementFacade txtWhatTab;

    @FindBy(xpath = " //a[@id='demo-tab-origin']")
    public WebElementFacade btnOriginTab;

    @FindBy(xpath = "//a[@id='demo-tab-use']")
    public WebElementFacade btnUseTab;

    @FindBy(id = "demo-tabpane-origin")
    public WebElementFacade txtOriginTab;

    @FindBy(id = "demo-tabpane-use")
    public WebElementFacade txtUseTab;
}
