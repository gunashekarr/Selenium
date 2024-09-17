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
 * Authenticated Popup - Browser Popup - rare Case 
 * SwitchTo() wont work
 * Explicit wait wont work
 * 
 * 
 */
public class Alerts_Authenticated {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // http://the-internet.herokuapp.com/basic_auth
        
        // Syntax : http://username:password@the-internet.herokuapp.com/basic_auth
        
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);	
        
        driver.close();

	}

}
