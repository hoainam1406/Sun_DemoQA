package Pages;

import UI.WebTableUI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/webtables")
public class WebTablePage extends PageObject {

    WebTableUI ui;

    public void openWebtablePage(){
        open();
    }

    public String getFirstName() {
        return ui.txtFirstName.getTextValue();
    }

    public String getLastName() {
        return ui.txtLastName.getTextValue();
    }

    public String getAge() {
        return ui.txtAge.getTextValue();
    }

    public String getEmail() {
        return ui.txtEmail.getTextValue();
    }

    public String getSalary() {
        return ui.txtSalary.getTextValue();
    }

    public String getDepartment() {
        return ui.txtDepartment.getTextValue();
    }

    public String getFirstNameNew() {
        return ui.txtFirstNameNew.getTextValue();
    }

    public String getLastNameNew() {
        return ui.txtLastNameNew.getTextValue();
    }

    public String getAgeNew() {
        return ui.txtAgeNew.getTextValue();
    }

    public String getEmailNew() {
        return ui.txtEmailNew.getTextValue();
    }

    public String getSalaryNew() {
        return ui.txtSalaryNew.getTextValue();
    }

    public String getDepartmentNew() {
        return ui.txtDepartmentNew.getTextValue();
    }
    public String getFirstNameEdit() {
        return ui.txtFirstNameEdit.getTextValue();
    }

    public String getLastNameEdit() {
        return ui.txtLastNameEdit.getTextValue();
    }

    public String getAgeEdit() {
        return ui.txtAgeEdit.getTextValue();
    }

    public String getEmailEdit() {
        return ui.txtEmailEdit.getTextValue();
    }

    public String getSalaryEdit() {
        return ui.txtSalaryEdit.getTextValue();
    }

    public String getDepartmentEdit() {
        return ui.txtDepartmentEdit.getTextValue();
    }

    public String getFirstNameDelete() {
        return ui.txtFirstNameDelete.getTextValue();
    }

    public String getLastNameDelete() {
        return ui.txtLastNameDelete.getTextValue();
    }

    public String getAgeDelete() {
        return ui.txtAgeDelete.getTextValue();
    }

    public String getEmailDelete() {
        return ui.txtEmailDelete.getTextValue();
    }

    public String getSalaryDelete() {
        return ui.txtSalaryDelete.getTextValue();
    }

    public String getDepartmentDelete() {
        return ui.txtDepartmentDelete.getTextValue();
    }

    public void clickAddButton() {
        ui.btnAdd.click();
    }

    public void clickEditIcon() {

        ui.btnEditIcon.click();
    }

    public void clickDeleteIcon() {

        ui.btnDeleteIcon.click();
    }

    public String getFormName() {
        return ui.txtFormName.getTextValue();
    }

    public void clickSubmitButton() {

        ui.btnSubmit.click();
    }

    public String getFirstNameInputColorCode() {
        String colorCode = ui.txtFirstNameInput.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getLastNameInputColorCode() {
        String colorCode = ui.txtLastNameiInput.getCssValue("border-bottom-color");
        return colorCode;
    }

    public String getEmailInputColorCode() {
        String colorCode = ui.txtEmailInput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String getAgeInputColorCode() {
        String colorCode = ui.txtAgeInput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String getSalaryInputColorCode() {
        String colorCode = ui.txtSalaryInput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String getDepartmentInputColorCode() {
        String colorCode = ui.txtDepartmentInput.getCssValue("border-bottom-color");
        return colorCode;
    }
    public String expectedColorWhenFalse() {
        String expectedColorCodeInRGB = "rgba(220, 53, 69, 1)";
        return expectedColorCodeInRGB;
    }
    public String expectedColorWhenTrue() {

        return "rgb(40, 167, 69)";
    }
}
