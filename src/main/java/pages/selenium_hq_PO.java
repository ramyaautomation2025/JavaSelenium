package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class selenium_hq_PO {

	private WebDriver driver;

	// ------------ Locators using @FindBy ----------------
	@FindBy(name = "my-text")
	private WebElement textBoxInput;

	@FindBy(css = "button")
	private WebElement submitButton;

	@FindBy(id = "message")
	private WebElement message;

	@FindBy(xpath = "//div[@class='error-message']")
	private WebElement errorMessage;

	// ------------ Constructor ----------------
	public selenium_hq_PO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize @FindBy
	}

	// ------------ Actions (Methods) ----------------

	public void enterValue(String username) {
		textBoxInput.sendKeys("Selenium");
	}

	public void ClickSubmit() {
		submitButton.click();
	}

	public String GetMessage() {
		return message.getText();
	}

}
