/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package webdriver_methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * getWindowHandle()
 * 
 */
public class HandleBrowserWindows {
	public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		System.out.println("Window Id-->"+driver.getWindowHandle());
		System.out.println("Window Id's-->"+driver.getWindowHandles());
		
		Set<String> windowIDs = driver.getWindowHandles();
		
 //Approach 1 : When we have 2 windows
//		List<String> windowList = new ArrayList(windowIDs);
//		
//		String parentWindow = windowList.get(0);
//		String childWindow = windowList.get(1);
//		
//		driver.switchTo().window(parentWindow);
//		System.out.println("Title of the page-->"+driver.getTitle());
//		
//		driver.switchTo().window(childWindow);
//		System.out.println("Title of the page-->"+driver.getTitle());
		
//Approach 2 : When we have multiple windows
		
		for (String winID : windowIDs ) {
			
			String title=driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
			  System.out.println(driver.getCurrentUrl());	
//			  Some validation on required window
			}
		}
		
		driver.quit();

	}

}
