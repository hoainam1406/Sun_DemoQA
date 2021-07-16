package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginPageUI extends PageObject {

    @FindBy(xpath = "//input[@id='userName']")
    public WebElementFacade txtUserName;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElementFacade txtEmail;

    @FindBy(css = "textarea#currentAddress.form-control")
    public WebElementFacade txtCurrentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    public WebElementFacade txtPermanentAddress;

    @FindBy(xpath = "//button[@id='login']")
    public WebElementFacade btnLogin;

    @FindBy(xpath = "//label[@id='userName-value']")
    public WebElementFacade value;

    @FindBy(xpath = "//p[@id='name']")
    public WebElementFacade text;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElementFacade txtFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElementFacade txtLastName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElementFacade txtPassWord;

    @FindBy(xpath = "//button[@id='newUser']")
    public WebElementFacade btnNewUser;

    @FindBy(xpath = "//p[@id='name']")
    public WebElementFacade errorRecaptcha;


    @FindBy(xpath = "//input[@id='searchBox']")
    public WebElementFacade search;

    @FindBy(id="basic-addon2")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//button[contains(text(),'Log out')]")
    public WebElementFacade btnLogOut;

    @FindBy(xpath = " //a[contains(text(),'Git Pocket Guide')]")
    public WebElementFacade linkBook;

    @FindBy(xpath = " //label[contains(text(),'9781449325862')]")
    public WebElementFacade lblISBN;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/span[1]")
    public WebElementFacade btnDelete;

    @FindBy(xpath = "//button[@id='closeSmallModal-ok']")
    public WebElementFacade btnOK;

}
