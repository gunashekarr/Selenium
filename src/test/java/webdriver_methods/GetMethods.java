/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * Get Methods  = We can access these methods through webdriver instance
 * get(url) - opens the url on the browser
 * getTitle() - returns the title of the page
 * getCurrentUrl() - returns the Current Url of the page
 * getPageSource() - returns the Page Source of the page
 * getWindowHandle() - returns ID of the single browser window
 * getWindowHandles() - returns ID's of the multiple browser window
 */
public class GetMethods {
       public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		//get(url) - opens the url on the browser 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		//getTitle() - returns the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the Page-->"+title);
		
		//getCurrentUrl() - returns the Current Url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url of the page-->"+currentUrl);
		
		//getPageSource() - returns the Page Source of the page
		String pageSource = driver.getPageSource();
//		System.out.println("Page Source-->"+pageSource);
		
		//getWindowHandle() - returns ID of the single browser window
		String windowId = driver.getWindowHandle();
		System.out.println("Window ID-->"+windowId);
		
		//getWindowHandles() - returns ID's of the multiple browser window
		WebElement OrangeLink=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		OrangeLink.click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println("Window ID's-->"+windowIds);
		
        //Closes all the window
		driver.quit();
       }
}
