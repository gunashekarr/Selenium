/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class DeSelectBy_Index_Value_VisibleText extends BaseClass {

	@Test
	public static void Index() throws InterruptedException
	{
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("fruits"));
		Select drp = new Select(dropdown);
		if (drp.isMultiple())
		{
		System.out.println("This is Mulitple Select DropDown!!");
		}
		drp.selectByIndex(0);
		drp.selectByVisibleText("Apple");
		drp.selectByValue("orange");
		drp.selectByVisibleText("Grape");
		Thread.sleep(3000);
		
		drp.deselectByIndex(0);
		Thread.sleep(3000);
		drp.deselectByValue("apple");
		Thread.sleep(3000);
		drp.deselectByVisibleText("Orange");
		Thread.sleep(3000);

	}
}
