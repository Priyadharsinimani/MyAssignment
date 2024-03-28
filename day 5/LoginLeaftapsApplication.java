package week1.day5;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class LoginLeaftapsApplication {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");


          driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
          driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
          driver.findElement(By.className("decorativeSubmit")).click();
          
          
          String text = driver.findElement(By.tagName("h2")).getText();
          System.out.println(text);
          
          
          driver.findElement(By.linkText("CRM/SFA")).click();
          driver.findElement(By.partialLinkText("Leads")).click();
          driver.findElement(By.linkText("Create Lead")).click();
          driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
          driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyadharsini");
          driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mani");
      

	}
}
          
          
          