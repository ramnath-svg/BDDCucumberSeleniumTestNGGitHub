package GeneralTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelection {

	public static void main(String[] args) {
		// Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to a page with a multi-select dropdown
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        // Locate the multi-select dropdown
        WebElement multiSelect = driver.findElement(By.id("multi-select"));

        // Create Select object
        Select select = new Select(multiSelect);

        // Check if dropdown allows multiple selections
        if (select.isMultiple()) {
            // Select multiple values by visible text
            select.selectByVisibleText("California");
            select.selectByVisibleText("New York");
            select.selectByVisibleText("Texas");

            // Print selected options
            System.out.println("Selected options:");
            for (WebElement option : select.getAllSelectedOptions()) {
                System.out.println("- " + option.getText());
            }

            // Optionally deselect one or all
            // select.deselectByVisibleText("Texas");
            // select.deselectAll();
        } else {
            System.out.println("Dropdown does not support multiple selections.");
        }

        // Close browser
        driver.quit();
    
        

	}

}
