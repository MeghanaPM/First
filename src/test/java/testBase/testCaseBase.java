package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCaseBase {
	protected WebDriver driver;
	public void setUp() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev.esigns.io/signin");
	}
}
