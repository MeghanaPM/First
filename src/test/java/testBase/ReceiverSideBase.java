package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReceiverSideBase {
	protected WebDriver driver;
	public void setUp() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://dev.esigns.io/emp-documents/preview/659ba0b7e4adf8e24af6a9c0/pp/vp/659690410610aaa77f5206d8?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJlbXBfZG9jdW1lbnRfaWQiOiI2NTliYTBiN2U0YWRmOGUyNGFmNmE5YzAiLCJwYXNzY29kZSI6InNsZ3JkOCIsIndvcmtmbG93X2lkIjpudWxsLCJpYXQiOjE3MDQ2OTgwMzksImV4cCI6MTcwNDg3MDgzOX0.KdpsJXoKAV_4go122ZcwPyh0J_olK80mENWxPVqmuSA");
	}
}
