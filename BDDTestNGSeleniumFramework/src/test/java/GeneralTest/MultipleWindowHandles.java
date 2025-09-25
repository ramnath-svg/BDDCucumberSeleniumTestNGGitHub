package GeneralTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		String mainWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		Set<String> allWindows=driver.getWindowHandles();
		for(String windowHandle:allWindows ) {
			if(!windowHandle.equals(mainWindow)) {
				driver.switchTo().window(windowHandle);
				Thread.sleep(1000);
				System.out.println("New window Title: "+driver.getTitle());
				driver.close();
			}
			
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Main window Title: " +driver.getTitle());
		driver.quit();
	}
}