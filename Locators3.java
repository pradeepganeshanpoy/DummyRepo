import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Selenium Manager
		//if we write the System.setProperty line SeleniumManager will Off (Beta phase)
		//if we not write the System.setProperty line SeleniumManager will on (Beta phase), SeleniumWebdriverManager will automatically do the work of getting the chrome driver at backend
		System.setProperty("webdriver.chrome.driver", "D:/Selenium JAVA/NEW/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Sibling - child => parent traverse the locator
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Locators used = Parent to child and sibling to sibling
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		
		//Locators => Child to Parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).isDisplayed());
		
		driver.close();
		
		
		
		

	}

}
