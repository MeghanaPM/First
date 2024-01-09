package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {
	WebDriver driver;

	public DragAndDrop(WebDriver driver) {
		this.driver=driver;
	}  
	public void draging() throws Exception {
		Thread.sleep(10000);
		
		//sender
		
		//date
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
//		WebElement Ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dateEle")));
		WebElement Target = driver.findElement(By.xpath("//*[@id=\"svg\"]"));
		Actions actions = new Actions(driver);
//		actions.clickAndHold(Ele).moveToElement(Target).release().build().perform();
		
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@placeholder='Select date']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"5\"]")).click();
		//Number
//		WebElement NumberField = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(NumberField).moveToElement(Target).release().build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//textarea[@class=\"el-textarea__inner\"]")).sendKeys("2");
		//multiLineText
//		WebElement multiLineText = driver.findElement(By.id("multiLineTextEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(multiLineText).moveToElement(Target).release().build().perform();
//		driver.findElement(By.id("MULTI_LINE_TEXT_1")).sendKeys("Hi meghana");
		//yesOrNo
//		WebElement selectYesOrNo = driver.findElement(By.id("yesOrNoEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(selectYesOrNo).moveToElement(Target).release().build().perform();       #not working
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		//multiselect
//		WebElement multiSelect = driver.findElement(By.id("multiSlectedEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(multiSelect).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("a");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@x-placement=\"bottom-start\"]//ul//li")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("b");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@x-placement=\"bottom-start\"]//ul//li")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("c");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@x-placement=\"bottom-start\"]//ul//li")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@aria-label='Field Properties']//span[contains(text(),'Save')]")).click();
//		driver.findElement(By.xpath("//input[@class='el-select__input']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li[1]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li[2]")).click();
		//currency field
//		WebElement currency = driver.findElement(By.xpath("//button[@id=\"currencyEle\"]"));
//		Thread.sleep(10000);
//		actions.clickAndHold(currency).moveToElement(Target).release().build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@class=\"field-textarea currency-input\"]")).sendKeys("100");
		
		//select
//		WebElement Select = driver.findElement(By.xpath("//button[@id=\"dropdownEle\"]"));
//		Thread.sleep(10000);
//		actions.clickAndHold(Select).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("a");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("b");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("c");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("d");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[3]/span/button[2]/span")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@placeholder=\"Please select...\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"d\"]")).click();
		
		//Date Time
//		WebElement datetime = driver.findElement(By.xpath("addDateTimeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(datetime).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//input[@placeholder=\"Select date and time\"]")).click();
//		driver.findElement(By.xpath("//span[normalize-space()=\"Now\"]")).click();
		
		//Formula Field
		
//		WebElement num1 = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(num1).moveToElement(Target).release().build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@data-text=\"Number 1\"]//textarea")).sendKeys("2");
//		WebElement num2 = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(num2).moveToElement(Target).release().build().perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@data-text=\"Number 2\"]//textarea")).sendKeys("4");
//		WebElement formulaField = driver.findElement(By.id("formulaEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(formulaField).moveToElement(Target).release().build().perform();
//		Thread.sleep(10000);
//		Set<String> windowHandles2 = driver.getWindowHandles();
//		for (String handle : windowHandles2) {
//			driver.switchTo().window(handle);
//		
//		}
//		driver.findElement(By.xpath("//input[@placeholder=\"Select Fields\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Number 1\"]")).click();
//		driver.findElement(By.xpath("//img[@src=\"/img/close.526eeae8.svg\"]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Select Fields\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Number 2\"]")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Field Properties']//span[contains(text(),'Save')]")).click();
//		WebElement sig = driver.findElement(By.id("signatureEle"));
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@placeholder=\"Select a Recipient\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Receiver-1\"]")).click();
//		Thread.sleep(10000);
//		actions.clickAndHold(sig).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//span[normalize-space()=\"Send Document\"]")).click();
		//Receiver side
		
		//essential fields
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder=\"Select a Recipient\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()=\"Receiver-1\"]")).click();
//		//signature
//		WebElement sig = driver.findElement(By.id("signatureEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(sig).moveToElement(Target).release().build().perform();
//		//initial
//		WebElement initial = driver.findElement(By.id("initialEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(initial).moveToElement(Target).release().build().perform();
//		//FullName
//		WebElement fullName = driver.findElement(By.id("fullNameEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(fullName).moveToElement(Target).release().build().perform();
//		//Date Signed
//		WebElement Dsign = driver.findElement(By.id("dateSingedEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(Dsign).moveToElement(Target).release().build().perform();
//		//Company
//		WebElement company = driver.findElement(By.id("companyEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(company).moveToElement(Target).release().build().perform();
//		//Title
//		WebElement title = driver.findElement(By.id("titleEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(title).moveToElement(Target).release().build().perform();
//		//singleLine Text
//		WebElement ST = driver.findElement(By.id("singleLineTextEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(ST).moveToElement(Target).release().build().perform();
//		//Checkboxs
//		WebElement checkb = driver.findElement(By.id("checkboxEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(checkb).moveToElement(Target).release().build().perform();
//		//Adress
//		WebElement Adress = driver.findElement(By.id("addressEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(Adress).moveToElement(Target).release().build().perform();
		
		//fillable fields
		//Request Document
//		WebElement reqDoc = driver.findElement(By.id("requestEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(reqDoc).moveToElement(Target).release().build().perform();
//		//Date
//		WebElement date = driver.findElement(By.id("dateEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(date).moveToElement(Target).release().build().perform();
//		//select
//		WebElement Select = driver.findElement(By.xpath("//button[@id=\"dropdownEle\"]"));
//		Thread.sleep(10000);
//		actions.clickAndHold(Select).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("a");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("b");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("c");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		driver.findElement(By.xpath("//input[@class=\"el-select__input\"]")).sendKeys("d");
//		driver.findElement(By.xpath("//div[@class=\"el-select-dropdown el-popper is-multiple\"]//li")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[@class='el-dialog__wrapper fields-dialog']//button[2]")).click();
//		Thread.sleep(10000);

//		//number
//		WebElement num = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(num).moveToElement(Target).release().build().perform();
//		//yesOrNo
//		WebElement yesOrNoEle = driver.findElement(By.id("yesOrNoEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(yesOrNoEle).moveToElement(Target).release().build().perform();
//		//multiLineText
//		WebElement multiLineTextEle = driver.findElement(By.id("multiLineTextEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(multiLineTextEle).moveToElement(Target).release().build().perform();
//		//multiSlecte
		WebElement multiSelect = driver.findElement(By.id("multiSlectedEle"));
		Thread.sleep(10000);
		actions.clickAndHold(multiSelect).moveToElement(Target).release().build().perform();
		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("a");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@x-placement=\"bottom-start\"]//ul//li")).click();
		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("b");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@x-placement=\"bottom-start\"]//ul//li")).click();
		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("c");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='el-dialog__wrapper fields-dialog']//button[2]")).click();
		
//		WebElement multiSlectedEle = driver.findElement(By.id("multiSlectedEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(multiSlectedEle).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("a");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[5]//ul[1]/li[1]")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("b");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[5]//ul[1]/li[1]")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("c");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[5]//ul[1]/li[1]")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("d");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[5]//ul[1]/li[1]")).click();
//		driver.findElement(By.xpath("//div[@class='el-col el-col-22']//div[@class='el-select__tags']//input[@type='text']")).sendKeys("e");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[5]//ul[1]/li[1]")).click();
//		driver.findElement(By.xpath("//div[@class='el-dialog__wrapper fields-dialog']//button[2]")).click();
		//formula

//		WebElement num1 = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(num1).moveToElement(Target).release().build().perform();
//		WebElement num2 = driver.findElement(By.id("numberEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(num2).moveToElement(Target).release().build().perform();
//		WebElement formulaEle = driver.findElement(By.id("formulaEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(formulaEle).moveToElement(Target).release().build().perform();
//		driver.findElement(By.xpath("//input[@placeholder='Select Fields']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Number 1\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//img[@src=\"/img/close.526eeae8.svg\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//input[@placeholder=\"Select Fields\"]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Number 2\"]")).click();
//		driver.findElement(By.xpath("//div[@aria-label='Field Properties']//span[contains(text(),'Save')]")).click();
		//currency
//		WebElement currencyEle = driver.findElement(By.id("currencyEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(currencyEle).moveToElement(Target).release().build().perform();
//		//addDateTime
//		WebElement addDateTimeEl = driver.findElement(By.id("addDateTimeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addDateTimeEl).moveToElement(Target).release().build().perform();
//		//addDateTimeRange
//		WebElement addDateTimeRangeEle = driver.findElement(By.id("addDateTimeRangeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addDateTimeRangeEle).moveToElement(Target).release().build().perform();
//		//addDateRange
//		WebElement addDateRangeEle = driver.findElement(By.id("addDateRangeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addDateRangeEle).moveToElement(Target).release().build().perform();
//		//addTime
//		WebElement addTimeEle = driver.findElement(By.id("addTimeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addTimeEle).moveToElement(Target).release().build().perform();
		//addList
//		WebElement addListEle = driver.findElement(By.id("addListEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addListEle).moveToElement(Target).release().build().perform();
//		Set<String> windowHandles2 = driver.getWindowHandles();
//		for (String handle : windowHandles2) {
//			driver.switchTo().window(handle);
//		
//		}
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys("a");
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Value\"]")).sendKeys("1");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Add\"]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys("b");
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Value\"]")).sendKeys("2");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Add\"]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Name\"]")).sendKeys("c");
//		driver.findElement(By.xpath("//input[@placeholder=\"Enter Value\"]")).sendKeys("3");
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[normalize-space()=\"Add\"]")).click();
//		driver.findElement(By.xpath("//div[@class='el-dialog__wrapper fields-dialog']//div[@class='el-dialog__footer']//button[1]")).click();
//		//addTimeRange
//		WebElement addTimeRangeEle = driver.findElement(By.id("addTimeRangeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addTimeRangeEle).moveToElement(Target).release().build().perform();
//		//addFixedTime
//		WebElement addFixedTimeEle = driver.findElement(By.id("addFixedTimeEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(addFixedTimeEle).moveToElement(Target).release().build().perform();
//		//weekdays
//		WebElement weekdaysEle = driver.findElement(By.id("weekdaysEle"));
//		Thread.sleep(10000);
//		actions.clickAndHold(weekdaysEle).moveToElement(Target).release().build().perform(); 
		driver.findElement(By.xpath("//span[normalize-space()=\"Send Document\"]")).click();

	}
	public boolean VerifyDragSucess() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));

		WebElement name = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@class=\"fw-normal fs-3 mb-0 text-dark\"]")));
		System.out.println("Drag And Drop Completed successfully");
		return name.isDisplayed();
	}
}
	
