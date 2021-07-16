package Pages;

import UI.LoginPageUI;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/books")
public class SearchPage  extends PageObject {

    LoginPageUI ui;

    public void openSearchPage(){
        open();
    }

    public String getSearch(){
        return  ui.search.getTextValue();
    }

    public String getISBN(){
        return  ui.lblISBN.getTextValue();
    }

    public void Search(){
        ui.btnSearch.click();
    }

    public void Data(){
        ui.search.sendKeys("Git Pocket Guide");
    }

    public void Link(){
       ui.linkBook.click();
    }

}
