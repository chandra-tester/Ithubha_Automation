package com.ithuba.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class commonMethods {

	public void buttonClick(String xPath, WebDriver driver ){
		driver.findElement(By.xpath(xPath)).click();
		}
	
	public void sendInput(String xPath, WebDriver driver,String input ){
		driver.findElement(By.xpath(xPath)).sendKeys(input);
		}
	
}
	   
	
	
		

