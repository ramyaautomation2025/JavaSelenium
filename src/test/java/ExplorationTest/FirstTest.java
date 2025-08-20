package ExplorationTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.selenium_hq_PO;
import utils.Log;

public class FirstTest extends BaseTest {

	@Test
	public void SeleniumSubmit() {
		//WebDriver driver = new ChromeDriver();
		//Log.info("Navigate to URL");

		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		driver.getTitle();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		selenium_hq_PO po = new selenium_hq_PO(driver);

		po.enterValue("Selenium");
		
		po.ClickSubmit();

		System.out.println(po.GetMessage());
		

		//driver.quit();
	}

}
