package HomePageTN;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageTneT {
@FindBy (xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
List<WebElement> menus;
@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
List<WebElement> submenus;
@FindBy (xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
WebElement submenuPage;
public HomePageTneT(WebDriver driver) {
	PageFactory.initElements(Config.driver, this);
}
public void mousehover (String menuName,String submenuName) throws InterruptedException {
	try {
		Thread.sleep(3000);
	for(WebElement menu:menus) {
		System.out.println("ok1");
		if(menu.getText().contains(menuName)) {
			Config.actions =new Actions(Config.driver);
			Config.actions.moveToElement(menu).build().perform();
			System.out.println("ok2");
			for(WebElement submenu:submenus) {
				System.out.println("ok3");
				if(submenu.getText().contains(submenuName)) {
					Config.actions.moveToElement(submenu);
					Thread.sleep(3000);
					submenu.click();
				
				}
			}
		}
	}
}catch (Exception e) {
	// TODO: handle exception
}
}
public String verifPage () {
	String actualmessage = submenuPage.getText();
	return actualmessage;
}
}
