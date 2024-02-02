package Testsuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import HomePageTN.SearchProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {

	@Given("User is on the home page")
	public void user_is_on_the_home_page() throws Exception {
	    Config.configchrome();
	    Config.maximaizewindow();
	    Config.navigate(Utils.getproprety("web_Portal_link"));
	}

	@When("User Search for a specific product {string}")
	public void user_search_for_a_specific_product(String ProductName) throws InterruptedException {
		SearchProduct search=new SearchProduct(Config.driver);
		search.searchProduct(ProductName);
	}

	@Then("User Check the search result is find {string}")
	public void user_check_the_search_result_is_find(String expectedmessage) throws InterruptedException {
		SearchProduct search=new SearchProduct(Config.driver);
		String actualmessage=search.verifSearch();
		Assert.assertEquals(expectedmessage, actualmessage);
		Thread.sleep(5000);
		Config.quit();
	}

}
