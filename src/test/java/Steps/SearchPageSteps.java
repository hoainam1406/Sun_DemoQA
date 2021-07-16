package Steps;

import Pages.SearchPage;
import Serenity.SearchSerenity;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SearchPageSteps {
    @Steps
    SearchSerenity searchSerenity;
    SearchPage searchPage;
    @Given("^I want open home page books$")
    public void iWantOpenHomePageBooks() {
        searchPage.openSearchPage();
    }


    @And("^I click to search$")
    public void iclickToSearch() {
        searchPage.Search();
    }

    @Then("^The website display data search\"([^\"]*)\"$")
    public void theWebsiteDisplayDataSearch(String text) throws Throwable {
        Assert.assertEquals(searchPage.getSearch(),text);


    }

    @And("^Valid data need find$")
    public void validDataNeedFind() {
        searchPage.Data();
    }

    @And("^I click Link to GitPocketGuide$")
    public void iClickLinkToGitPocketGuide() {
        searchPage.Link();
    }

    @Then("^The website display data book store search\"([^\"]*)\"$")
    public void theWebsiteDisplayDataBookStoreSearch(String text) throws Throwable {
        Assert.assertEquals(searchPage.getISBN(),text);

    }
}
