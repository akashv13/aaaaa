package POM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POMRegister {
	
	@FindBy(how=How.XPATH,using="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-newsletter' and @value='1']")
	private WebElement SubscribeCheckBox;
	
	@FindBy(how=How.XPATH,using="//input[@type=\"checkbox\" and @name=\"agree\" and @value=\"1\"]")
	private WebElement PrivacyCheckBox;
	
	@FindBy(how=How.XPATH,using="//button[text()='Continue']")
	private WebElement ContinueButton;


	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubscribeCheckBox() {
		return SubscribeCheckBox;
	}

	
	public WebElement getPrivacyCheckBox() {
		return PrivacyCheckBox;
	}


	public WebElement getContinueButton() {
		return ContinueButton;
	}

	

}
