/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 91895
 * Selenium Alerts - 3 Types ( Normal alert, Confirmation alert & prompting alert)
 * 
 * Alert windows are not web elements, can't locate the webelements
 */
public class Alerts_Popups_With_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        //Handle simple normal alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        
        // Handling alerts without driver.switchTo()
        // Using Explicit wait
        Alert myAlert = mywait.until(ExpectedConditions.alertIsPresent());
        String alertMsg = myAlert.getText();
        System.out.println("Simple Alert Message : "+alertMsg);
        Thread.sleep(5000);
        myAlert.accept();
        
        //Closing the browser
        driver.close();

	}

}
