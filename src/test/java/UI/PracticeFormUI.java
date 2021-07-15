package UI;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PracticeFormUI extends PageObject {

    @FindBy(xpath = "//button[@id='submit']")
    public WebElementFacade btnSubmit;

    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    public WebElementFacade txtMessage;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElementFacade txtFirstname;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElementFacade txtLastname;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElementFacade txtEmail;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    public WebElementFacade lblGenderMale;

    @FindBy(xpath = "//label[contains(text(),'Female')]")
    public WebElementFacade lblGenderfFemale;

    @FindBy(xpath = "//label[contains(text(),'Other')]")
    public WebElementFacade lblGenderOther;

    @FindBy(xpath = "//input[@id='userNumber']")
    public WebElementFacade txtMobile;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    public WebElementFacade txtDateOfBirth;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
    public WebElementFacade txtSubjects;

    @FindBy(xpath = "//label[contains(text(),'Sports')]")
    public WebElementFacade lblHobbieSprots;

    @FindBy(xpath = "//label[contains(text(),'Reading')]")
    public WebElementFacade lblHobbieReading;

    @FindBy(xpath = "//label[contains(text(),'Music')]")
    public WebElementFacade lblHobbieMusic;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    public WebElementFacade txtCurrentAddress;


}
