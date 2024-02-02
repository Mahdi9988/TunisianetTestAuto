package Testsuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import HomePageTN.HomePageTneT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	@Given("user is on home page")
	public void user_is_on_home_page() throws Exception {
	 Config.configchrome();
	 Config.maximaizewindow();
	 Config.navigate(Utils.getproprety("web_Portal_link"));
	}

	@When("user hover on {string} and hover on {string} and click on")
	public void user_hover_on_and_hover_on_and_click_on(String menu, String submenu) throws InterruptedException {
		HomePageTneT page=new HomePageTneT(Config.driver);
		page.mousehover(menu, submenu);
	}


	@Then("user is directed to {string} page")
	public void user_is_directed_to_page(String expectedmessage) throws InterruptedException {
		HomePageTneT page=new HomePageTneT(Config.driver);
		String actualmessage = page.verifPage();
		Assert.assertEquals(expectedmessage, actualmessage);
		Thread.sleep(5000);
		Config.quit();
	}


}
