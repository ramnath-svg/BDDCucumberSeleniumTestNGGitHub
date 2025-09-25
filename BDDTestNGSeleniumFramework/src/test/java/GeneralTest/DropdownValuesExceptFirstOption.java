package GeneralTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownValuesExceptFirstOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/selenium-training/");
		driver.findElement(By.xpath("//a[contains(text(),'Go To Registration ')]")).click();
		WebElement dropdown = driver.findElement(By.name("country"));
		
		Select select = new Select(dropdown);
		
		List<WebElement> Options = select.getOptions();
		System.out.println("Drop down values are as below except first: ");
		for(int i=1;i<Options.size();i++) {
			select.selectByIndex(i);
			System.out.println("-"+Options.get(i).getText());
			
		}

	}

}
