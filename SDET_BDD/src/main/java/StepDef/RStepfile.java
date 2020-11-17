package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RStepfile {
	WebDriver driver ;	
	@Given("^user is on Home Page$")
    public void user_is_on_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ya20081409\\eclipse-workspace\\BDD\\src\\main\\resources\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	       driver.manage().window().maximize();			
	       driver.get("https://www.gillette.co.in/en-in");
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	       String Title =driver.getTitle();
	       System.out.println(Title);
	     
   
}
	 @When("^user clicks on Register option$")
	    public void user_clicks_on_register_option() throws Throwable {
	      driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[2]")).click();
	    }
	 @And("^user enter (.+),(.+),(.+),(.+),(.+),(.+),(.+)and(.+)$")
	    public void user_enter_and(String firstname, String lastname, String email, String password, String confiormpassword, String month, String year, String zipcode) throws Throwable {
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[firstname]\"]")).sendKeys(firstname);
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[lastname]\"]")).sendKeys(lastname);
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[emails][0][address]\"]")).sendKeys(email);
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][password]\"]")).sendKeys(password);
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_account[password][confirm]\"]")).sendKeys(confiormpassword);
	      driver.findElement(By.name("phdesktopbody_0$phdesktopbody_0_grs_consumer[birthdate][month]")).sendKeys(month);
	      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_grs_consumer[birthdate][year]\"]")).sendKeys(year);
	      driver.findElement(By.name("phdesktopbody_0$phdesktopbody_0_grs_account[addresses][0][postalarea]")).sendKeys(zipcode);
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	      driver.findElement(By.id("phdesktopbody_0_ctl44")).click();
	      
	      driver.findElement(By.id("phdesktopbody_0_submit")).click();
	       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    }
	 @Then("^user able to see a message regestraion is completed$")
	    public void user_able_to_see_a_message_regestraion_is_completed() throws Throwable {
	        
		      driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_Header\"]"));
		      String msg =driver.getTitle();
		       System.out.println(msg);
		     
		      
  
	    }
	 
	 @Given("^user is on login Page$")
	    public void user_is_on_login_page() throws Throwable {   
		 driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink\"]/div/a[1]")).click();
	       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    }

	 @When("^user enter Email and password$")
	    public void user_enter_email_and_password() throws Throwable {
	    	driver.findElement(By.name("phdesktopbody_0$phdesktopbody_0_username")).sendKeys("dhoni1@gmail.com");
	    	driver.findElement(By.name("phdesktopbody_0$ctl04")).sendKeys("wipro123");
		      driver.findElement(By.name("phdesktopbody_0$Sign In")).click();
		       driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

	    }

	    @Then("^user able to log in$")
	    public void user_able_to_log_in() throws Throwable {
	        
	    	
	    	driver.findElement(By.xpath("//*[@id=\"phdesktopheader_0_phdesktopheadertop_2_pnlLogOffLink\"]/div/span"));
	    }
	    @And("^user clicks on Need help remembering your password$")
	    public void user_clicks_on_need_help_remembering_your_password() throws Throwable {
		      driver.findElement(By.id("phdesktopbody_0_forgotpassword")).click();

	    }

	    @When("^user enters email$")
	    public void user_enters_email() throws Throwable {
	    	driver.findElement(By.name("phdesktopbody_0$phdesktopbody_0_username")).sendKeys("dhoni1@gmail.com");
	    	driver.findElement(By.name("phdesktopbody_0$Create Your New Password")).click();
	    }
	    
	    @Then("^user sees appropriate message$")
	    public void user_sees_appropriate_message() throws Throwable {
			 driver.findElement(By.xpath("//*[@id=\"phdesktopbody_0_afterSubmit\"]/div[2]/h2")).click();

	    }

	   
}
