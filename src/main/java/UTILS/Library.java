package UTILS;

import org.openqa.selenium.WebElement;

public class Library {
	
	public static void custom_sendkeys(WebElement element, String value) {
		try{
			element.sendKeys(value);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_click(WebElement element) {
		try{
			element.click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void custom_clear(WebElement element) {
		try{
			element.clear();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void custom_getText(WebElement element) {
		try{
			element.getText();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void custom_size(WebElement element) {
		try{
			element.getSize();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void display(WebElement element) {
		try{
			element.isDisplayed();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void enable(WebElement element) {
		try{
			element.isEnabled();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static void select(WebElement element) {
		try{
			element.isSelected();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}
	
	

}
