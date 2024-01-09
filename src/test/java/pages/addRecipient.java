package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addRecipient {
	WebDriver driver;

	public addRecipient(WebDriver driver) {
		this.driver = driver;
	}

	public void recipient() throws Exception {
		By ele = By.xpath("//span[contains(text(),'Add Recipient')]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
		c.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user_1']//input[@placeholder='Select contact type']")).click();
		Thread.sleep(10000);
		By ad1 = By.xpath("//div[@x-placement]//ul//li[normalize-space()='Receiver']");
		WebDriverWait hold1 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add1 = hold1.until(ExpectedConditions.elementToBeClickable(ad1));
		add1.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user_1']//input[@placeholder='Search with Email']")).click();
		Thread.sleep(10000);
		By ad2 = By.xpath("//div[@x-placement]//ul//li[1]");
		WebDriverWait hold2 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add2 = hold2.until(ExpectedConditions.elementToBeClickable(ad2));
		add2.click();
		driver.findElement(By.xpath("//span[normalize-space()=\"Save Users\"]")).click();

		
	}
	public boolean VerifyAddRecipientSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder=\"Enter Template Title\"]")));
		System.out.println("Reciever added Sucessfully");
		return name.isDisplayed();
	}
	/*
	 * public void receiver() { By ele =
	 * By.xpath("//*[@id=\"user_1\"]/form/div/div[1]/div/div/div/div/span/span/i");
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
	 * WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
	 * c.click(); } public void Details() { WebElement unorderedList =
	 * driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/ul"));
	 * 
	 * // Find the <li> element with text "receiver" within the <ul> WebElement
	 * receiverListItem = unorderedList.findElement(By.xpath("//div[4]//ul/li[2]"));
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
	 * WebElement c =
	 * wait.until(ExpectedConditions.elementToBeClickable(receiverListItem));
	 * c.click(); }
	 */
	
	//Multiple Recipients
	public void mulRecipient() throws Exception{
		//recipient 1
		By ele = By.xpath("//span[contains(text(),'Add Recipient')]");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c = wait.until(ExpectedConditions.elementToBeClickable(ele));
		c.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user_1']//input[@placeholder='Select contact type']")).click();
		Thread.sleep(10000);
		By ad1 = By.xpath("//div[@x-placement]//ul//li[normalize-space()='Receiver']");
		WebDriverWait hold1 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add1 = hold1.until(ExpectedConditions.elementToBeClickable(ad1));
		add1.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user_1']//input[@placeholder='Search with Email']")).click();
		Thread.sleep(10000);
		By ad2 = By.xpath("//div[@x-placement]//ul//li[1]");
		WebDriverWait hold2 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add2 = hold2.until(ExpectedConditions.elementToBeClickable(ad2));
		add2.click();
		//recipient 2
		By ele2 = By.xpath("//span[contains(text(),'Add Recipient')]");
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement c2 = wait2.until(ExpectedConditions.elementToBeClickable(ele2));
		c2.click();
		driver.findElement(By.xpath("//div[@id='user_2']//input[@placeholder='Select contact type']")).click();
		Thread.sleep(10000);
		By ad3 = By.xpath("//div[@x-placement]//ul//li[3]");
		WebDriverWait hold3 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add3 = hold3.until(ExpectedConditions.elementToBeClickable(ad3));
		add3.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@id='user_2']//input[@placeholder='Search with Email']")).click();
		By ad4 = By.xpath("//div[@x-placement]//ul//li[2]");
		WebDriverWait hold4 = new WebDriverWait(driver, Duration.ofMinutes(3));
		WebElement add4 = hold4.until(ExpectedConditions.elementToBeClickable(ad4));
		add4.click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@id=\"user_2\"]//p")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@id=\"user_2\"]//input[@placeholder=\"middle_name\"]")).sendKeys("Reddy");
//		driver.findElement(By.xpath("//div[@id=\"user_2\"]//input[@placeholder='Address']")).sendKeys("sdfghjklcvbn");
//		driver.findElement(By.xpath("//div[@id=\"user_2\"]//input[@placeholder='Company name']")).sendKeys("meghana");
//		driver.findElement(By.xpath("//div[@id=\"user_2\"]//input[@placeholder='Phone']")).sendKeys("9347618053");
//		driver.findElement(By.xpath("//span[normalize-space()=\"Save Users\"]")).click();
		
	}
}
