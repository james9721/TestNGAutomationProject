package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class todoListPage extends BasePage {
	WebDriver driver;
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement Cat_TextBox;
	@FindBy(how = How.CSS, using = "input[value='Add category']")
	WebElement Add_cat_Button;
	@FindBy(how = How.NAME, using = "due_month")
	WebElement monthDropDown;
	String insertedCat;
	String beforeXpath = "//span[contains(text(), '";
	String afterXpath = "')]";

// //span[contains(text(), '')]

	public void addCatPage(WebDriver driver) {
		this.driver = driver;
	}

	public void catName(String fullCatNAme) {
		insertedCat = fullCatNAme +generateRndomNum(999);
		Cat_TextBox.sendKeys(insertedCat);

	}

	public void addCatButton() {
		Add_cat_Button.click();
	}
	public void dupeCatName(){
		Cat_TextBox.sendKeys(insertedCat);
		
		Add_cat_Button.click();
		
		
	}
	public void validateMonth() {
		String[] months = {"None","Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		Select sel = new Select(monthDropDown);
		List<WebElement> selectedOptions = sel.getOptions();
		
			for(int i = 0; i<months.length; i++) {

				System.out.println(selectedOptions.get(i).getText() + "-->" + months[i]);
				Assert.assertEquals(selectedOptions.get(i).getText(), months[i]);
				
			}
		}

	}


