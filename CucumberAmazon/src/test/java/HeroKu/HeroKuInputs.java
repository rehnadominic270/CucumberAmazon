package HeroKu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HeroKuInputs {
	
	WebDriver driver;
	WebElement ele;
	int temp;
	
	
	@Given("The website HeroKuInputs is available")
	public void the_website_hero_ku_inputs_is_available() {
		
	   driver=new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/inputs");
	}

	@When("Able to Enter the {int} inputs")
	public void able_to_enter_the_inputs(Integer int1) {
		
		temp=int1;
		 ele=driver.findElement(By.xpath("//input[@type='number']"));
		ele.sendKeys(int1.toString());
		
	
	    
	}

	@Then("Verify the results {int}")
	public void verify_the_results(Integer int1) {
		
		int result=Integer.parseInt(ele.getAttribute("value"));
		
		Assert.assertEquals(result,temp);
		
		driver.close();
		
	   
	}

}
