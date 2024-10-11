package UTILS;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static ExcelDataProvider excel;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static Actions act;
	public static WebDriver driver;
	public static ExcelUtils ex;
	
	@Parameters({"browsername"})
	@BeforeMethod
	public void BrowserOpen(String browsername) throws IOException {
        if (browsername.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(); 
            
        } else if (browsername.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(); 
            
        } 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigDataProvider.getConfigFile("url_1"));
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		act=new Actions(driver);
		js = (JavascriptExecutor) driver;
		excel=new ExcelDataProvider();
		ex=new ExcelUtils();
//doubt=====================================
		CommonActions.setDriver(driver);
	}
	@AfterMethod
	public void Teardown() {
		driver.close();
	}

}
