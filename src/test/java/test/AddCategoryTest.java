package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryTest {
	
	WebDriver driver;
	@Test
	public void userShouldBeAbleToAddCategory() {
		driver = BrowserFactory.launchBrowser();
		
		AddCategoryPage addcategory = PageFactory.initElements(driver, AddCategoryPage.class);
		addcategory.enterCategoryName("Spring");
		addcategory.clickAddCategoryButton();
		BrowserFactory.tearDown();
	}

}
