package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.todoListPage;
import util.BrowserFactory;

public class addCatAndValidate {
	WebDriver driver;
	@BeforeMethod
	public void init() {
		driver = BrowserFactory.initDriver();
		
	}

	@Test
	public void addCatAndValidateAdd()  {
		todoListPage TD = PageFactory.initElements(driver, todoListPage.class);
		TD.catName("sam");
		TD.addCatButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
