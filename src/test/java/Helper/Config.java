package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions actions;
	public static void maximaizewindow() {
		driver.manage().window().maximize();
	}
	public static void configchrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", Utils.getproprety("TestDriverPath"));
		driver=new ChromeDriver();
	}
	public static void navigate (String url) {
		driver.get(url);
	}
	public static void attente (long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
    public static void quit () {
	driver.quit();
}
}
