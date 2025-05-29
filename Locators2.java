import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//Pollachi um Paal pandiyum

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "D:/Selenium JAVA/NEW/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		//getPassword() method passwaord la value va pass pannum so we stored in string.
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys(password);  //Locators used as regular expression in css selecors
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click(); 	//Locators used as regular expression in xpath
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());

		//Assertion 
		//Assert is a class used for validating test conditions. It helps verify that your application behaves as expected. If an assertion fails, the test fails.
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();	

	}

	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.partialLinkText("Forgot your password?")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		//String la split Concept use pannirukoom
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		// Please use temporary password 'rahulshettyacademy' to Login.
		//0th index = Please use temporary password 
		//1st index = rahulshettyacademy' to Login.
		String password= passwordArray[1].split("'")[0];
		//rahulshettyacademy' to Login.
		//0th index = rahulshettyacademy
		//1st index =  to Login.
		return password;




	}

}
