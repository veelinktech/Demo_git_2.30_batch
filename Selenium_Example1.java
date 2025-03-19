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

	public static void main(String[] args) throws IOException 
	{
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.fb.com");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Users\\pc\\Desktop\\Demo\\TS"+System.nanoTime()+".png"));
		
		
		
	}

}
