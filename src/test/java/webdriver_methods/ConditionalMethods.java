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
 * Conditional Methods = Access these commands through WebElement - return boolean value ( true/false)
 * isDisplayed() = We can check display status of the element
 * isEnbaled() = we can check enable/disable status of the element of the element/operational element
 * isSelected() = we can use to check the element is selected or not
 */
public class ConditionalMethods {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		WebElement firstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
			
		// isDisplayed()
		System.out.println(logo.isDisplayed());
		
		// isEnabled()
		System.out.println(firstName.isEnabled());
		
		// isSelected()
		System.out.println("Before Selecting");
		System.out.println(maleRadioBtn.isSelected());
		
		System.out.println("After Selecting");
		maleRadioBtn.click();
		System.out.println(maleRadioBtn.isSelected());
		

	}

}
