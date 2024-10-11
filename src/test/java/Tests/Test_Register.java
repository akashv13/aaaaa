package Tests;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



import POM.POMRegister;
import UTILS.Base;
import UTILS.CommonActions;
import UTILS.Library;


public class Test_Register extends Base{
	
	public static WebDriverWait wait;
	public static POMRegister register = PageFactory.initElements(driver,POMRegister.class);
	
	@Test(priority=1)
	public void initilizeRegister() throws InterruptedException {

	//BY USING LIBRARY AND CUSTOMACTIOS WITHOUT USING EXCELDATA
	Library.custom_sendkeys(register.getFirstName(),"Akash");
	Library.custom_sendkeys(register.getLastName(),"Valiv");
	Library.custom_sendkeys(register.getEmail(),"akashvaliv@gmail.com");
	Library.custom_sendkeys(register.getPassword(),"Akash123");
	Library.custom_click(register.getSubscribeCheckBox());
	CommonActions.script_scroll(register.getContinueButton());
	
	
	/*if(register.getPrivacyCheckBox().isEnabled()) {
		Library.custom_click(register.getPrivacyCheckBox());
	}else {
		System.out.println("Privact checkbox not clickable");
	}*/
	Library.custom_click(register.getContinueButton());
	Thread.sleep(3000);
	}
	
	
	
	@Test(priority=0,enabled=false)
	public static void initilizeUsingExcel() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(register.getFirstName()));
		String FirstName=excel.getExcel("Sheet1",1,0);
		Library.custom_sendkeys(register.getFirstName(),FirstName);
	}
	}
	
	


 