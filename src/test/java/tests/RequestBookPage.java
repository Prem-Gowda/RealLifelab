package tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RequestPage;
import pages.TestBase;
import utilities.ExcelUtility;
import utilities.Retry;

public class RequestBookPage extends TestBase {
	HomePage hp;
	RequestPage rp;
//	public static int RowNum=1;
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser();
		hp = new HomePage(driver);
		rp = new RequestPage(driver);
	}
	@Test(priority = 1,retryAnalyzer=Retry.class)
	public void requestbook() {
		hp.navigateToRequestBookPage();
		String ExceptedTitle = "Online BookStore India | Buy Books Online | Buy Book Online India";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(ExceptedTitle, actualTitle,"Title does'nt match");
		System.out.println("The title of the page is:"+actualTitle);
		
	}
	
	@Test(priority=2)
		public void enterbookdetails() {
			rp.requestbookdetails();
		}
	
	
	@Test(dataProvider="RequestBookCrendentials",retryAnalyzer=Retry.class)
	public void requestBookTest(String isbn, String bookTitle,String authorName,String quantityNo,String emailId,String Phno) throws IOException,InterruptedException {
//		rp.navigateToRequestBookPage();
		
		
		rp.requestBook(isbn, bookTitle, authorName, quantityNo, emailId, Phno);
				
		
	}
	@DataProvider(name="RequestBookCrendentials")
	public Object[][] datasupplier() throws EncryptedDocumentException, IOException {
		Object[][] inputdata = ExcelUtility.getTestData("Book");
		System.out.println("Data Provider Rows: "+ inputdata.length);		
		return inputdata;
	  
	  }	 

	
//	public void close_browser()
//	{
//		driver.close();
//	}

}
