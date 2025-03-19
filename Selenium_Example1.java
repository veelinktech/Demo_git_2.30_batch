package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tutorial20_Taking_Screenshot 
{

	@BeforeClass
	public void setup()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown()

	{
	driver.close();	
	}

	@Test
	public  void m1() throws IOException 
	{
			
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\pc\\Desktop\\Demo\\TS"+System.nanoTime()+".png"));
		
		
		
	}
