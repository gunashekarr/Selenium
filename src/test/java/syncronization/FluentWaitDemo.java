/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package syncronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 * @author 91895
 * FluentWait = 
 * 
 * Exceptions even after timeout need to be handled using try-catch block
 */
public class FluentWaitDemo {
   public static void main(String[] args) {
	   
	   WebDriver driver = new EdgeDriver();
	   
//	   Fluent wait declaration
	   Wait<WebDriver> myWait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30))        // Set the maximum wait time
			    .pollingEvery(Duration.ofSeconds(5))        // Set the polling interval
			    .ignoring(NoSuchElementException.class);     // Ignore specific exceptions
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   
	   WebElement userName = myWait.until(new Function<WebDriver, WebElement>()
			   {
		          public WebElement apply(WebDriver driver)
		          {
		        	  return driver.findElement(By.xpath("//input[@name='username']"));
		          }
			   } );
	   
	   userName.sendKeys("Guna");
	   driver.close();
	
}
}
