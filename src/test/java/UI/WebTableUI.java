package UI;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class WebTableUI extends PageObject {

    @FindBy(xpath = "//div[contains(text(),'Cierra')]")
    public  WebElementFacade txtFirstName;

    @FindBy(xpath = "//div[contains(text(),'Vega')]")
    public  WebElementFacade txtLastName;

    @FindBy(xpath = "//div[contains(text(),'39')]")
    public  WebElementFacade txtAge;

    @FindBy(xpath = "//div[contains(text(),'cierra@example.com')]")
    public  WebElementFacade txtEmail;

    @FindBy(xpath = "//div[contains(text(),'10000')]")
    public  WebElementFacade txtSalary;

    @FindBy(xpath = "//div[contains(text(),'Insurance')]")
    public  WebElementFacade txtDepartment;

    @FindBy(xpath = "//div[contains(text(),'Sun')]")
    public  WebElementFacade txtFirstNameEdit;

    @FindBy(xpath = "//div[contains(text(),'Team')]")
    public  WebElementFacade txtLastNameEdit;

    @FindBy(xpath = "//div[contains(text(),'18')]")
    public  WebElementFacade txtAgeEdit;

    @FindBy(xpath = "//div[contains(text(),'Sun123@gmail.com')]")
    public  WebElementFacade txtEmailEdit;

    @FindBy(xpath = "//div[contains(text(),'100000')]")
    public  WebElementFacade txtSalaryEdit;

    @FindBy(xpath = "//div[contains(text(),'Tester Team')]")
    public  WebElementFacade txtDepartmentEdit;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]")
    public  WebElementFacade txtFirstNameNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]")
    public  WebElementFacade txtLastNameNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]")
    public  WebElementFacade txtAgeNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]")
    public  WebElementFacade txtEmailNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[5]")
    public  WebElementFacade txtSalaryNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public  WebElementFacade txtDepartmentNew;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]")
    public  WebElementFacade txtFirstNameDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[2]")
    public  WebElementFacade txtLastNameDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]")
    public  WebElementFacade txtAgeDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[4]")
    public  WebElementFacade txtEmailDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[5]")
    public  WebElementFacade txtSalaryDelete;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[6]")
    public  WebElementFacade txtDepartmentDelete;

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    public  WebElementFacade btnAdd;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]")
    public  WebElementFacade btnDeleteIcon;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[1]")
    public  WebElementFacade btnEditIcon;

    @FindBy(xpath = "//div[@id='registration-form-modal']")
    public  WebElementFacade txtFormName;

    @FindBy(xpath = "//input[@id='firstName']")
    public  WebElementFacade txtFirstNameInput;

    @FindBy(xpath = "//input[@id='lastName']")
    public  WebElementFacade txtLastNameiInput;

    @FindBy(xpath = "//input[@id='userEmail']")
    public  WebElementFacade txtEmailInput;

    @FindBy(xpath = "//input[@id='age']")
    public  WebElementFacade txtAgeInput;

    @FindBy(xpath = "//input[@id='salary']")
    public  WebElementFacade txtSalaryInput;

    @FindBy(xpath = "//input[@id='department']")
    public  WebElementFacade txtDepartmentInput;

    @FindBy(xpath = "//button[@id='submit']")
    public  WebElementFacade btnSubmit;

}
