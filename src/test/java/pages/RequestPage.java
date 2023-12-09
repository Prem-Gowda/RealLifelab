package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RequestPage extends TestBase {
	Actions a = new Actions(driver);
	
	
//	@FindBy(xpath="//span[@id='ctl00_phBody_RequestBook_rfvISBN']")
//	WebElement ISBN;
	@FindBy(css="#ctl00_phBody_RequestBook_txtPhone")
	WebElement ISBN;
    public void requestbookdetails() {
    	ISBN.sendKeys("9789353338459d");
    }
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtTitle']")
	WebElement title;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtAuthor']")
	WebElement author;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtQty']")
	WebElement quantity;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_txtEmailReq']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='ctl00_phBody_RequestBook_btnVeiry']")
	WebElement verify;
	
	@FindBy(xpath="//*[@id='ctl00_phBody_RequestBook_txtPhone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='ctl00_phBody_RequestBook_imgbtnSave']")
	WebElement submit;
	
	public RequestPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}
	public void requestBook(String isbn, String bookTitle,String authorName,String quantityNo,String emailId,String Phno) throws InterruptedException {
		ISBN.sendKeys(isbn);
		driver.wait(1000);
//		title.sendKeys(bookTitle);
//		author.sendKeys(authorName);
//		quantity.clear();
//		quantity.sendKeys(quantityNo);
//		email.sendKeys(emailId);
//		verify.click();
//		phone.sendKeys(Phno);
//		submit.click();
	}
	

}
