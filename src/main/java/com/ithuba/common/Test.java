package com.ithuba.common;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.ithuba.utils.commonMethods;
import com.ithuba.utils.xpathHolder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		Properties prop = new Properties();
		configManager.readpropertiesFile();
		try {

			WebDriverManager.chromedriver().setup();// For Chrome
			// WebDriver driver = new ChromeDriver();

			/*
			 * String projectPath = System.getProperty("user.dir"); // give location of the
			 * project System.out.println("projectPath : " + projectPath);
			 * 
			 * // For Chrome System.setProperty("webdriver.chrome.driver", projectPath +
			 * "/Drivers/Chromedriver/chromedriver.exe");
			 */

			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(chromeoptions);

			Thread.sleep(5000);

			driver.get(prop.getProperty("Url").toString());
			Thread.sleep(3000);

			commonMethods common = new commonMethods();
			common.buttonClick(xpathHolder.welcomePopup, driver);
			common.sendInput(xpathHolder.userName, driver, "0800123456");
			common.sendInput(xpathHolder.passWord, driver, "54321");
			// common.buttonClick(xpathHolder.loginButton,driver);

			// driver.findElement(By.xpath(xpathHolder.welcomePopup)).click();
			// driver.findElement(By.xpath("//*[@id=\"userName_email\"]")).sendKeys("0800123456");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("54321");
			WebElement login = driver.findElement(By.xpath("//*[@id=\"login-form-1\"]/div/div/fieldset/div[4]/button"));

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", login);
			Thread.sleep(7000);

			WebElement play = driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/div/ul/li[2]"));
			Actions act = new Actions(driver);// to perform hover
			act.moveToElement(play).perform();
			Thread.sleep(1000);

			driver.findElement(By.xpath(
					"//*[@id=\"sp-menu\"]/div/div/ul/li[2]/div/div/div/div/div/div/div/div[2]/div/div/ul/li[1]/a[1]/span"))
					.click();// click on lotto
			Thread.sleep(1000);
			driver.findElement(
					By.xpath("//*[@id='sp-component']/div/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div"))
					.click();// Achoose6numbers
			Thread.sleep(5000);
			// selection of numbers
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[1]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[12]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[13]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[25]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[11]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[5]"))
					.click();
			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[17]"))
					.click();
			// close the prompt when select 7th number
			Thread.sleep(7000);
			WebElement ErrorPopup = driver
					.findElement(By.xpath("//*[@id=\"error_popup\"]/div/div/div[2]/div[1]/a/span"));
			executor.executeScript("arguments[0].click();", ErrorPopup);// close the error Popup
			Thread.sleep(5000);

			WebElement SubmitButton = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div"));// submit
																													// button
			executor.executeScript("arguments[0].click();", SubmitButton);

			Thread.sleep(10000);

			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div"))
					.click();// Bchoose6nombers
			Thread.sleep(10000);

			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[11]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[32]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[35]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[10]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[15]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[51]/div/span"))
					.click();
			Thread.sleep(5000);

			WebElement Bsubmit = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div"));// submit
																													// button
			executor.executeScript("arguments[0].click();", Bsubmit);
			Thread.sleep(5000);

			/*
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[1]/div[4]/div[2]/div[2]/div"
			 * )).click();//Cchoose6nombers Thread.sleep(5000);
			 * 
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[15]/div/span"
			 * )).click(); driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[31]/div/span"
			 * )).click(); driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[29]/div/span"
			 * )).click(); driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[29]/div/span"
			 * )).click(); driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[29]/div/span"
			 * )).click(); driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/ul/li[29]/div/span"
			 * )).click(); Thread.sleep(5000);
			 * 
			 * 
			 * WebElement Csubmit = driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div"));//
			 * submit executor.executeScript("arguments[0].click();", Csubmit);
			 * Thread.sleep(5000);
			 */
			WebElement AddTocart = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[3]/div[2]/button"));// add
																														// to
																														// cart
			executor.executeScript("arguments[0].click();", AddTocart);
			Thread.sleep(5000);

			WebElement Gotocart = driver
					.findElement(By.xpath("//*[@id=\"error_popup\"]/div/div/div[2]/div[2]/div[2]/div/div/div/a/div"));// go
																														// to
																														// to
																														// cart
			executor.executeScript("arguments[0].click();", Gotocart);
			Thread.sleep(5000);

			/*
			 * WebElement Rmvticket = driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[2]/div/div/div[1]/div[1]/div[4]/div/form/div/span"
			 * ));//Rmv ticket executor.executeScript("arguments[0].click();", Rmvticket);
			 * Thread.sleep(5000);
			 */

			/*
			 * WebElement CrossPopup = driver.findElement(By.xpath(
			 * "//*[@id=\"error_popup\"]/div/div/div[2]/div[1]/a/span"));//CrossPopup
			 * executor.executeScript("arguments[0].click();", CrossPopup);
			 * Thread.sleep(5000);
			 */

			/*
			 * //Identify the web element which will appear after scrolling down WebElement
			 * visielement = driver.findElement(By.xpath(
			 * "//*[@id=\"sp-cartbanner2\"]/div/div/div/div/p/a/img")); this will execute
			 * until that element is not appeared on page
			 * executor.executeScript("argument[0],scrollIntoview(true);",visielement);
			 * executor.executeScript("window.scrollBy(0,1000));",visielement);
			 * System.out.println(visielement.getText());
			 */ // executor.executeScript("scrollBy(0,3000)");
				// executor.executeScript("scrollBy(3000,0)");

			WebElement payByWallet = driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[2]/div/div/div[2]/div[2]/div[3]/div/div/div"));// PayBywallet
			act.moveToElement(payByWallet).perform();
			Thread.sleep(1000);
			executor.executeScript("arguments[0].click();", payByWallet);
			Thread.sleep(5000);

			/*
			 * WebElement payNow = driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/div/div/div"
			 * ));//PayNow executor.executeScript("arguments[0].click();", payNow);
			 * Thread.sleep(5000);
			 * 
			 * WebElement closeBtn = driver.findElement(By.xpath(
			 * "//*[@id=\"error_popup\"]/div/div/div[2]/div[1]/a/span"));//close btn
			 * executor.executeScript("arguments[0].click();", closeBtn);
			 * Thread.sleep(10000);
			 */

			// play poweball
			WebElement play2 = driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/div/ul/li[2]"));
			Actions act2 = new Actions(driver);// to perform hover
			act2.moveToElement(play2).perform();
			Thread.sleep(1000);

			WebElement playPowerball = driver.findElement(By.xpath(
					"//*[@id=\"sp-menu\"]/div/div/ul/li[2]/div/div/div/div/div/div/div/div[2]/div/div/ul/li[2]/a[1]/img"));// play
																															// power
																															// ball
			executor.executeScript("arguments[0].click();", playPowerball);
			Thread.sleep(5000);

			WebElement drawslider = driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div/input"));
			// Webelement output =
			// driver.findElement(By.xpath("//*[@id="sp-component"]/div/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/span[2]"))
			Actions act3 = new Actions(driver);
			act3.dragAndDropBy(drawslider, 80, 0).perform();
			Thread.sleep(1000);

			driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div"))
					.click();// Achoose6numbers
			Thread.sleep(5000);
			// selection of numbers
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[5]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[7]/div/span"))
					.click();
			// driver.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[14]/div/span")).click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[48]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[40]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/ul/li[12]/div/span"))
					.click();
			driver.findElement(By.xpath(
					"//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div/div[2]/ul/li[37]/div/span"))
					.click();
			Thread.sleep(1000);

			/*
			 * WebElement closePopup = driver.findElement(By.xpath(
			 * "//*[@id=\"error_popup\"]/div/div/div[2]/div[1]/a/span"));
			 * executor.executeScript("arguments[0].click();", closePopup);//close the error
			 * Popup Thread.sleep(5000);
			 */
			/*
			 * WebElement closePopup2 = driver.findElement(By.xpath(
			 * "//*[@id="error_popup"]/div/div/div[2]/div[1]/a/span"));
			 * executor.executeScript("arguments[0].click();", closePopup2);//close the
			 * error Popup Thread.sleep(2000);
			 */

			/*
			 * driver.findElement(By.xpath(
			 * "//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[2]/ul/li[12]/div/span"
			 * )); Thread.sleep(1000);
			 */

			WebElement selectBTN = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div"));
			executor.executeScript("arguments[0].click();", selectBTN);// select
			Thread.sleep(1000);

			WebElement chooseagain = driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div"));
			executor.executeScript("arguments[0].click();", chooseagain);// no selections
			Thread.sleep(1000);

			WebElement Quickpick = driver.findElement(
					By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[1]/div[1]/div[3]/div"));
			executor.executeScript("arguments[0].click();", Quickpick);// select quick pick
			Thread.sleep(1000);

			WebElement select2 = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div"));
			executor.executeScript("arguments[0].click();", select2);// select
			Thread.sleep(1000);

			WebElement addcart = driver
					.findElement(By.xpath("//*[@id=\"sp-component\"]/div/div[3]/div[3]/div[2]/div[3]/div[2]/button"));
			executor.executeScript("arguments[0].click();", addcart);// addtocart
			Thread.sleep(1000);

		} catch (InterruptedException ie) {

			ie.printStackTrace();
		}
		// driver.close();
		// driver.quit();
	}
}