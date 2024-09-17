/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package handling;


import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author 91895
 * Handling the check boxes in the web pag
 */
public class CheckBoxHandling {
    public static void main(String[] args) {
    	WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//        driver.manage().window().minimize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        
    // Select only automation checkbox
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        
       // UnSelect only automation checkbox
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        
   //===========Select all the check boxes of Automation Tools=========
        // Wait until the element is located
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement automation = driver.findElement(By.xpath("//span[normalize-space()='Automation Tools']"));
         WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated((By) (automation)));

        // Scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
        
       List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='tool' and @type='checkbox']"));
       
       for(WebElement checkbox:checkboxes)
       {
    	   checkbox.click();
       }
       
       
  // Select only last 2 options
       for (int i = 2; i < checkboxes.size(); i++) 
       {
    	  checkboxes.get(i).click(); 
		
	   }
       
    // Select only first 2 options and then unselect
       for (int i = 0; i < 2; i++) 
       {
    	  checkboxes.get(i).click(); 
		
	   }
       for(WebElement checkbox1:checkboxes)
       {
    	   if(checkbox1.isSelected())
    	   {
    		   checkbox1.click();
    	   }
       }
       
       

	}

}
