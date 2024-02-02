package Testsuites;

import org.junit.Assert;

import Helper.Config;
import Helper.Utils;
import HomePageTN.disquessdPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class disquessdStepDef {

	@Given("utilisateut et sur la page disque ssd")
	public void utilisateut_et_sur_la_page_disque_ssd() throws Exception {
		Config.configchrome();
		 Config.maximaizewindow();
		 Config.navigate(Utils.getproprety("web_disquessd_link"));
	}

	@When("utilisateur Verifier et commander un produit en stock {string}")
	public void utilisateur_verifier_et_commander_un_produit_en_stock(String Product) throws InterruptedException {
		disquessdPage page=new disquessdPage(Config.driver);
		page.ajoutpanier(Product);
	}

	@Then("utilisateur Verifier la commande {string}")
	public void utilisateur_verifier_la_commande(String expectedmessage) throws InterruptedException {
		disquessdPage page=new disquessdPage(Config.driver);
		String actualmessage=page.veifpanier();
		Assert.assertEquals(expectedmessage, actualmessage);
		Thread.sleep(5000);
		Config.quit();
	}
}
