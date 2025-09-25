package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;
import Utils.DriverFactory;
import Utils.SeleniumUtils;
import io.cucumber.java.en.Given;

public class LoginWithExcelData {
	
	private WebDriver driver = DriverFactory.getDriver();
	private LoginPage loginpage;
	private SeleniumUtils utils;

	public LoginWithExcelData() {

		utils = new SeleniumUtils(driver);
		loginpage = new LoginPage(driver);
	}
	
	@Given("User logs in using Excel row {int}")
	public void user_logs_in_using_excel_row(int rowNum) {
		
		 String filePath = "src/test/resources/TestData/TestData.xlsx";
		    String sheetName = "Login Data";

		    String username = SeleniumUtils.getCellData(filePath, sheetName, rowNum, 0);
		    String password = SeleniumUtils.getCellData(filePath, sheetName, rowNum, 1);
		    
			utils.enterText(loginpage.getUsernameText(), username);
			utils.enterText(loginpage.getPasswordText(), password);	
		
	}
}