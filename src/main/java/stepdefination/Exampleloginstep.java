package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exampleloginstep {
	WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://www.demo.guru99.com/V4/");
	}
	
	@When("^title is guru(\\d+)$")
	public void title_is_guru(int arg1) throws Throwable {
		
		
	 String title=driver.getTitle();
		   System.out.println(title);
}
	
	@Then("^user enter \"([^\"]*)\" and enters \"([^\"]*)\"$")
	public void user_enter_and_enters(String userid, String password) throws Throwable {
		driver.findElement(By.name("uid")).sendKeys(userid);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	driver.findElement(By.name("btnLogin")).click();
//	Alert alert=driver.switchTo().alert();
//	alert.accept();
	driver.quit();
}
}