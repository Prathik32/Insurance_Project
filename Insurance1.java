package Insuranceproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurance1  {

	public static void main (String []args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/header.php");
		driver.manage().window().maximize();
s
		//Home Module

		WebElement home = driver.findElement(By.xpath("//a[@tabindex='-1']"));
		home.click();

		//Edit Profile

		WebElement Editprfl = driver.findElement(By.id("ui-id-5"));
		Editprfl.click();

		WebElement e1 = driver.findElement(By.id("user_title"));
		e1.click();
		Select S1 = new Select (e1);
		S1.selectByIndex(0);
		WebElement Surnme = driver.findElement(By.name("user[surname]"));
		Surnme.sendKeys("Basangoudar");
		WebElement fstnme = driver.findElement(By.name("user[firstname]"));
		fstnme.sendKeys("Prathik R");
		WebElement Phno = driver.findElement(By.xpath("//input[@placeholder='Enter text here...']"));
		Phno.sendKeys("8197453035");
		WebElement Year = driver.findElement(By.name("user[dateofbirth(1i)]"));
		Select S2 = new Select(Year);
		S2.selectByValue("1995");
		WebElement month = driver.findElement(By.id("user_dateofbirth_3i"));
		Select S3 = new Select(month);
		S3.selectByValue("3");
		WebElement date = driver.findElement(By.id("user_dateofbirth_3i"));
		Select S4 = new Select(date);
		S4.selectByValue("15");
		driver.findElement(By.id("user_licencetype_f")).click();
		WebElement linprd = driver.findElement(By.xpath("//select[@name='user[licenceperiod]']"));
		Select S5 = new Select(linprd);
		S5.selectByVisibleText("5");

		WebElement occption = driver.findElement(By.id("user_occupation_id"));
		Select S6 = new Select(occption);
		S6.selectByValue("12");
		WebElement Street = driver.findElement(By.id("user_address_attributes_street"));
		Street.sendKeys("Btm 1st Stage 2nd Cross");
		WebElement City = driver.findElement(By.name("user[address_attributes][city]"));
		City.sendKeys("Banglore");
		WebElement Country = driver.findElement(By.name("user[address_attributes][county]"));
		Country.sendKeys("india");
		WebElement pincode = driver.findElement(By.id("user_address_attributes_postcode"));
		pincode.sendKeys("560076");
		driver.findElement(By.xpath("//input[@value='Update User']")).click();


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-600)"); 

		//Profile Module

		WebElement profile  = driver.findElement(By.xpath("//a[@id='ui-id-4']"));
		profile.click();
		Thread.sleep(1000);

		//Request Quotation

		WebElement Reqnt  = driver.findElement(By.xpath("//li[@tabindex='-1']"));
		Reqnt.click();

		WebElement bkdwn = driver.findElement(By.id("quotation_breakdowncover"));
		bkdwn.click();
		Select S7 = new Select(bkdwn);
		S7.selectByVisibleText("At home");

		driver.findElement(By.id("quotation_windscreenrepair_f")).click();
		WebElement incident = driver.findElement(By.xpath("//input[@placeholder='Enter incidents']"));
		incident.sendKeys("damages, accidents");
		WebElement regstn = driver.findElement(By.name("registration"));
		regstn.sendKeys("KA 01 JU 4668");
		WebElement milge = driver.findElement(By.name("mileage"));
		milge.sendKeys("23");
		WebElement value = driver.findElement(By.name("value"));
		value.sendKeys("100000");
		WebElement PL = driver.findElement(By.name("parkinglocation"));
		Select S8 = new Select(PL);
		S8.selectByValue("Driveway");

		WebElement yr = driver.findElement(By.xpath("//select[@name='year']"));
		Select S9 = new Select(yr);
		S9.selectByValue("2023");

		WebElement mnth = driver.findElement(By.xpath("//select[@name='month']"));
		Select S10 = new Select(mnth);
		S10.selectByValue("3");

		WebElement date1 = driver.findElement(By.xpath("//select[@name='date']"));
		Select S11 = new Select(date1);
		S11.selectByValue("15");

		WebElement Saveqtn =driver.findElement(By.xpath("//input[@value='Save Quotation']"));
		Saveqtn.click();

		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body")));                   
		String dynamicText = element.getText();         
		System.out.println("Dynamic Text: " + dynamicText);

		Thread.sleep(1000);	  
		driver.navigate().refresh();	   
		driver.navigate().back();	   
		Thread.sleep(1000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-400)"); 

		//Retrieve Quotation 

		WebElement Retrqtn = driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a"));
		Retrqtn.click();

		WebElement Ideinum =  driver.findElement(By.xpath("//input[@placeholder='identification number']"));
		Ideinum.sendKeys("43720");

		WebElement Retrv = driver.findElement(By.xpath("//input[@id='getquote']"));
		Retrv.click();



	}

}




