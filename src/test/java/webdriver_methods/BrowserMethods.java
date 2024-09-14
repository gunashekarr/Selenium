/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * Close() - Closes single browser where driver is focusing
 * Quit() - Closes multiple browser
 */
public class BrowserMethods {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement OrangeLink=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		OrangeLink.click();
		Thread.sleep(5000);
//		driver.close();
		driver.quit();

	}

}
