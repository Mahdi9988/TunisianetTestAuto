package HomePageTN;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class disquessdPage {

	@FindBy (xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List <WebElement> Products ;
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[3]/span")
	WebElement Stock;
	@FindBy (tagName="h1")
	WebElement ProdPage;
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement ajout;
	@FindBy (xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement commander1;
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement ProdPanier;
	@FindBy (xpath="/html/body/main/section/div/div/div/section/div/div/div[3]/div/a")
	WebElement commander2;
	@FindBy (xpath="/html/body/main/header/div[2]/div/div/div[2]/div[4]/div/div/a/span[2]")
	WebElement panier;
	
public disquessdPage (WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}
public void ajoutpanier(String ProduitName) throws InterruptedException {
	try {
		Thread.sleep(2000);
	for(WebElement Product:Products) {
		if(Product.getText().contains(ProduitName)) {
			Thread.sleep(2000);
			Product.click();
			if(Stock.getText().contains("En stock")) {
			ajout.click();
			Thread.sleep(5000);
			commander1.click();
			Thread.sleep(5000);
			commander2.click();
			}
		}
	}
}catch (Exception e) {
	// TODO: handle exception
}
}
public String veifpanier () throws InterruptedException {
	Thread.sleep(3000);
	panier.click();
	Thread.sleep(3000);
	String actualmessage=ProdPanier.getText();
	return actualmessage;
}
}
