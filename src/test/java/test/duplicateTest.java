package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.DuplicatePage;
import page.todoListPage;
import util.BrowserFactory;

public class duplicateTest {
	WebDriver driver;
	@BeforeMethod
	public void init() {
		driver = BrowserFactory.initDriver();
		
	}

	@Test
	public void duplicateTests() {
		todoListPage TD = PageFactory.initElements(driver, todoListPage.class);
		DuplicatePage DP = PageFactory.initElements(driver, DuplicatePage.class);
		TD.catName("sam");
		TD.addCatButton();
		TD.dupeCatName();
		DP.validation();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}