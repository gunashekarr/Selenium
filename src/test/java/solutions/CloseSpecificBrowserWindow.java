/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package solutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author 91895
 * CloseSpecificBrowserWindow
 */
public class CloseSpecificBrowserWindow {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		System.out.println("Window Id-->"+driver.getWindowHandle());
		System.out.println("Window Id's-->"+driver.getWindowHandles());
		
		Set<String> windowIDs = driver.getWindowHandles();

		
		for (String winID : windowIDs ) {
			
			String title=driver.switchTo().window(winID).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
			  System.out.println(driver.getCurrentUrl());	
			  driver.close();
			}
		}
	}

}
