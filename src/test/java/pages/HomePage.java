package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
//	Actions a = new Actions(driver);
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);		
	}

	@FindBy(linkText = "Request a Book")
	WebElement requestButton;
	
    public void navigateToRequestBookPage() {		
    	requestButton.click();
        
    }
    
    @FindBy(xpath="//*[@id=\'ctl00_phBody_RequestBook_txtISBN\']")
	WebElement ISBN;
    public void requestbookdetails() {
    	ISBN.sendKeys("9789353338459d");
    }
   
}
