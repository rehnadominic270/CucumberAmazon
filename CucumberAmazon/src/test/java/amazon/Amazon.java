package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Amazon {
	
WebDriver driver;
	
	@Given("The Website is available")
	public void the_website_is_available() {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	   
	}

	@Then("Verify the correct page is available")
	public void verify_the_correct_page_is_available() {
		
		String title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		
		String actual ="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		Assert.assertEquals(title, actual);
		
		driver.close();
	  
	}
	

}
