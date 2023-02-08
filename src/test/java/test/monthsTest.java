package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.todoListPage;
import util.BrowserFactory;

public class monthsTest {
	WebDriver driver;
	@BeforeMethod
	public void init() {
		driver = BrowserFactory.initDriver();
		
	}

	@Test
	public void validateDropTest() {
		todoListPage TD = PageFactory.initElements(driver, todoListPage.class);
		TD.validateMonth();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}