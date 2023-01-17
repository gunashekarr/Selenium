/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class DeSelectAll extends BaseClass {

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
		
        List<WebElement> options1 = drp.getAllSelectedOptions();
		
		for (WebElement webElement : options1) {
			System.out.println(webElement.getText());
		}
		
		
		System.out.println(drp.getFirstSelectedOption().getText());
		List<WebElement> options = drp.getOptions();
		
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	
		drp.deselectAll();
		Thread.sleep(3000);

	}
}
