/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */
package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseClass;

public class SelectBy_Index_Value_VisibleText extends BaseClass {

	@Test
	public static void Index() throws InterruptedException
	{
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		Select drp = new Select(dropdown);
		drp.selectByIndex(5);
		Thread.sleep(3000);
		drp.selectByValue("AUSTRALIA");
		Thread.sleep(3000);
		drp.selectByVisibleText("INDIA");
		Thread.sleep(3000);
	}
}
