import java.awt.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

 public static void main(String[] args) {
	    try {
	String projectPath = System.getProperty("user.dir"); //give location of the project
    System.out.println("projectPath : "+projectPath);
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--start-maximized");
    //System.setProperty("webdriver.gecho.driver", "D:\\my projects\\Automation testing ithuba\\Drivers\\gechodriver\\geckodriver.exe");
    //WebDriver driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
    WebDriver driver = new ChromeDriver(co);
    //driver.manage().window().maximize();
    driver.get("http://beta.lottoweaver.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[10]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
    driver.findElement(By.xpath("//*[@name='userName_email']")).sendKeys("0800123456");
    driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("54321");
    //String parent = driver.getWindowHandle();
    /*WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Login']"));
    loginbutton.click();
    Thread.sleep(5000);*/
    
    WebElement play = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]"));
    Actions act=new Actions(driver);//to perform hover
    act.moveToElement(play).perform();
    Thread.sleep(10000);
    
    /*List<WebElement> links=driver.findElements(By.xpath(""));
       int total_count=links.size();
       for(int i=0;i<total_count;i++)
        {
    	 
    	    WebElement element=links.get(i);
    	    String text=element.getAttribute("");
    	    System.out.println("Links name is "+text);
         }*/
    
   /* WebElement playnow= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]"));
    playnow.click();
    
    WebElement wallet = driver.findElement(By.xpath("//span[text()='My Wallet']"));
    wallet.click(); */  
    }catch (InterruptedException ie) {
        ie.printStackTrace();
    }
    
/*    try {
        Thread.sleep(5000);
    } catch (InterruptedException ie) {
        ie.printStackTrace();
    } 
*/     
   //driver.close();
  //driver.quit();
	}
}
