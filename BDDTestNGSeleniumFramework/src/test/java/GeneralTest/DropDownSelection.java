package GeneralTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-training/");
		driver.findElement(By.xpath("//a[contains(text(),'Go To Registration ')]")).click();
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select select = new Select(dropdown);
		System.out.println("First Selected: " + select.getFirstSelectedOption().getText());
		select.selectByVisibleText("India");
	}

}
