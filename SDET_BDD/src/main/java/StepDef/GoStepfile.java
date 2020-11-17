package StepDef;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoStepfile {
	WebDriver driver ;	

	 @Given("^user is on Home Page of website$")
	    public void user_is_on_home_page_of_website() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ya20081409\\eclipse-workspace\\BDD\\src\\main\\resources\\drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			
		       driver.manage().window().maximize();			
		       driver.get("https://www.goibibo.com/");
		       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		       String Title =driver.getTitle();
		       System.out.println(Title);
		     
	 }
	 @When("^user select a round trip option$")
	    public void user_select_a_round_trip_option() throws Throwable {
	        driver.findElement(By.id("roundTrip")).click();
	    }

	 @And("^select from and to destination$")
	    public void select_from_and_to_destination() throws Throwable {
		 driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Chennai");
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-autosuggest-1")));

		 driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
		 
		 
		 driver.findElement(By.id("gosuggest_inputDest")).sendKeys("vijayawada");
		 WebDriverWait wait1 = new WebDriverWait(driver, 10);
		 wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("react-autosuggest-1")));

		 driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
		 
	    }
	   
	 @Then("^select the Departure date  future Date$")
	    public void select_the_departure_date_future_date() throws Throwable {
	      
		 
		 driver.findElement(By.id("departureCalendar")).click();
		 driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"fare_20200824\"]")).click();

		 
		 driver.findElement(By.id("returnCalendar")).click();
	       driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[7]/div/div/div[1]/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"fare_20200922\"]")).click();

		 //next step
		 

		
		 
		 

	    }
	 @When("^user enters traveller details$")
	    public void user_enters_traveller_details() throws Throwable {
		 driver.findElement(By.id("pax_link_common")).click();
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		 driver.findElement(By.id("pax_close")).click();
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    }

	    @Then("^user should see cheapest flights$")
	    public void user_should_see_cheapest_flights() throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"PRICE\"]/span/span")).click();
	    }

	    @And("^clicks search button$")
	    public void clicks_search_button() throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();
	    }

	
}
