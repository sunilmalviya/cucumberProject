package stepDefinition;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps  {
	
	public WebDriver driver; 
	public WebElement element;
	
	
	@Given("^Open the app in chrome browser$")
	public void open_the_app_in_chrome_browser() throws Throwable {
		//File file = new File("./src/main/resources/utilities/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\utilities\\chromedriver.exe");		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_username_and_password(String uname,String password) throws Throwable {
		element = driver.findElement(By.xpath("//span[@class='nav-line-2' and text()='Your Orders']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element);
		element = driver.findElement(By.xpath("//div[@id='nav-flyout-yourAccount']//span[text()='Sign in']"));
		action.moveToElement(element).click().build().perform();
		element = driver.findElement(By.id("ap_email"));
		element.clear();
		element.sendKeys(uname);
		element = driver.findElement(By.id("continue"));
		element.click();
		element = driver.findElement(By.id("ap_password"));
		element.clear();
		element.sendKeys(password);		
		element = driver.findElement(By.id("signInSubmit"));
		element.click();
	    
	}

	@Then("^Application should login successfully$")
	public void application_should_login_successfully() throws Throwable {
		element=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']/span[1]"));
		String userName=element.getText();
		System.out.println("username is "+userName);
		if(userName.contains("Sunil"))
			System.out.println("PASS");
		else
			System.out.println("FAILED");
	    
	}
	
	@Then("^Shutdown the application$")
	public void shutdown_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		element = driver.findElement(By.xpath("//span[@class='nav-line-2' and text()='Your Orders']"));
		Actions action = new Actions(driver);
		action.moveToElement(element);
		element = driver.findElement(By.xpath("//*[@id='nav-item-signout']/span"));
		action.moveToElement(element).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='a-page']/div[1]/div[1]/div/a/i[1]")));
		
	    if(driver !=null){
	    	driver.quit();
	    }
	}



}
