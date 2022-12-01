package LabTask3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LabTask3 
{
	WebDriver driver;
	@BeforeMethod()
  public void omayoQAFoxTestingStep0() throws Exception
 { 
		driver=new ChromeDriver();                                                                   //Open Chrome Browser
		driver.manage().window().maximize();                                                          //Maximize chrome browser
		driver.get("https://omayo.blogspot.in/");                                                        //Goto Github Login Page
		
}@Test
  public void omayoQAFoxTestingStep1()
  {

  driver.findElement(By.id("ta1")).sendKeys("Noman Sharif");
  WebElement Clear1=driver.findElement(By.xpath("//*[ contains (text(), \"The cat was playing in the garden.\" ) ]"));
  Clear1.clear();
  Clear1.sendKeys("I am Ambitious Person");
	  
  }
//print table data
@Test
public void omayoQAFoxTestingStep2()
{
	int rowCount=driver.findElements(By.tagName("tr")).size();
	int ColumnCount=driver.findElements(By.xpath("//table/thead/tr/th")).size();
	System.out.println("Rows are : " + rowCount);
	System.out.println("Coulums are : " + ColumnCount);
	for(WebElement tabledata: driver.findElements(By.tagName("tr")))
	{
		System.out.println(tabledata.getText());
	}
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("nomansharif03@gmail.com");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456789");
	driver.findElement(By.xpath("//*[@type='button']")).click();
}
@Test
public void omayoQAFoxTestingStep3()
{
	String windowhandlers = driver.getWindowHandle();
	WebElement frame1= driver.findElement(By.id("iframe1"));
	driver.switchTo().frame(frame1);
	driver.switchTo().window(windowhandlers);
	
	WebElement frame2= driver.findElement(By.id("iframe2"));
	driver.switchTo().frame(frame2);
	driver.switchTo().window(windowhandlers);
	
	driver.findElement(By.name("userid")).sendKeys("nomansharif03@gmail.com");
	driver.findElement(By.name("pswrd")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@type='button']")).click();
	String alerttext=driver.switchTo().alert().getText();
	System.out.println(alerttext);
	driver.switchTo().alert().accept();
	driver.switchTo().window(windowhandlers);
	
	
}

public void omayoQAFoxTestingStep4()
{
	driver.findElement(By.xpath("//option[@value='audix']")).click();
	driver.findElement(By.xpath("//option[@id='drop1']")).click();
}
}
