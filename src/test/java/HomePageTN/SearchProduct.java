package HomePageTN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SearchProduct {

	@FindBy (xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/input[4]")
	WebElement Search;
	@FindBy (xpath="/html/body/main/header/div[2]/div/div/div[2]/div[1]/div[1]/form/div[2]/button")
	WebElement Loupe; 
	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	WebElement ProductName;
	
	public SearchProduct (WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
	}
	public void searchProduct(String Produit) throws InterruptedException {
		Thread.sleep(3000);
		Search.sendKeys(Produit);
		Thread.sleep(2000);
		Loupe.click();
	}
	public String verifSearch() {
		Config.attente(10);
		String actualmessage=ProductName.getText();
		return actualmessage;
	}
}
