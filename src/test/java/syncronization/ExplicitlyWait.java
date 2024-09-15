/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 91895
 * ExplicitlyWait = 
 * ExplicitlyWait added only for webElements which causing synchronization issue, not for all webElements
 * 
 * 
 * 
 * 
 * =============Commonly used methods====================
alertIsPresent()
elementSelectionStateToBe()
elementToBeClickable()
elementToBeSelected()
frameToBeAvailableAndSwitchToIt()
presenceOfAllElementsLocatedBy()
presenceOfElementLocated()
textToBePresentInElementLocated()
textToBePresentInElementValue()
titleContains()
titleIs()
visibilityOfAllElements
visibilityOfElementLocated
visibilityOfAllElementsLocatedBy
visibilityOf()
 */



public class ExplicitlyWait {
    public static void main(String[] args) {
    	
    	WebDriver driver = new EdgeDriver();
    	
    	// implicit wait declaration
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// implicit wait usage
		WebElement userName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		userName.sendKeys("Admin");
		
		WebElement password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys("admin123");
		
		WebElement loginButton = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		loginButton.click();
		
		myWait.until(ExpectedConditions.titleIs("OrangeHRM"));
		
		System.out.println("Execution Closed!!");
		
		driver.close();

	}

}
