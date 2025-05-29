import java.time.Duration;

//Pollachi enra gopal

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/Selenium JAVA/NEW/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		//Normal Locators = ID, NAME, CLASS, etc...
		
		//1st User name and password enter aagum then forget to password click aagum...

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("test@123");
		
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		//Entering forget page details 
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("palani");
		
		driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys("palani@gmail.com");
		
		driver.findElement(By.cssSelector("input[placeholder*='Phone']")).sendKeys("9879896322");
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); 
		Thread.sleep(2000);

		// login page ku vanthu crt ana details koduthu sign in aagaum
		
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).clear();
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");  //Locators used as regular expression in css selecors

		driver.findElement(By.cssSelector("input[id*='chkboxOne']")).click(); 

		driver.findElement(By.xpath("//input[contains(@name,'chkboxT')]")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click(); 	//Locators used as regular expression in xpath
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText());
		
		driver.close();		


	}

}
