package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicatePage extends BasePage{
WebDriver driver;
public void duplicatePage(WebDriver driver) {
	this.driver = driver;
}
@FindBy (how =How.XPATH, using= "/html/body") WebElement duplicate;
public void validation() {
	if(duplicate.isDisplayed()) {
		System.out.println("The category you want to add already exists");
	}
	else {
		System.out.println("Category was created");
	}
}
}
