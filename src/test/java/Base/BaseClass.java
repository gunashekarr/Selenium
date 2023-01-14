package Base;
/** @author Gunashekar R
 *  gunashekarr11@gmail.com
 */


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
