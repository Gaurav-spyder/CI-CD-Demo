package pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

		WebDriver driver;
		
		public RediffHomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="srchquery_tbox")
		WebElement clickOnSearch;
		@FindBy(xpath="(//input[@type='submit'])[2]")
		WebElement submit;
		
		
		public void clickOnSearch(String text) {
			clickOnSearch.sendKeys(text);
			String attributeText=clickOnSearch.getAttribute("placeholder");
			System.out.println(attributeText);
			clickOnSearch.sendKeys(Keys.ENTER);
			//submit.click();
		}
	}


