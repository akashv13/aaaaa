package UTILS;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonActions {
	
	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor js;
	
	
	//doubt----------------------------------------------------------
	public static void setDriver(WebDriver driver) {
	    CommonActions.driver = driver;
	    act = new Actions(driver);
	    js = (JavascriptExecutor) driver;  // Initialize JavascriptExecutor once
	}
//mouse actions===========================================================================================================
	
	public static void action_click(WebElement element) {
		try{
			act.click(element).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_clickHold(WebElement element ) {
		try{
			act.clickAndHold(element).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_contextClick(WebElement element ) {
		try{
			act.contextClick(element).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_doubleClick( WebElement element ) {
		try{
			act.doubleClick(element).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
//check this-doubt
	public static void action_dragdrop(WebElement sourceElement, WebElement targetElement) {
		try{
			act.dragAndDrop(sourceElement, targetElement).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_keydown(WebElement element,String value ) {
		try{
			act.keyDown(element,value).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_keydownSendkeys(WebElement element,String value ) {
		try{
			act.keyDown(element, value).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_sendkeys(WebElement element,String value ) {
		try{
			act.sendKeys(value).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	public static void action_keyup(WebElement element,String value ) {
		try{
			act.keyUp(element,value).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void action_keyupSendkeys(WebElement element,String value ) {
		try{
			act.keyUp(element, value).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
//Javascriptexecutor==============================================================================================================================
	
	public static void script_scroll(WebElement element) {
		
			try {
				js.executeScript("arguments[0].scrollIntoView(true);",element);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
	
	public  static void script_click(WebElement element) {
		try{
			js.executeScript("arguments[0].click();", element);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void script_sendkeys(WebElement element,String value) {
		try{
			 js.executeScript("arguments[0].value='" + value + "';", element);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}

	
	
//Select==================================================================================================================
	//Select option=new Select();
	
	
}

