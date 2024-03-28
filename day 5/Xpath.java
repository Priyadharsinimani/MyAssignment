package week1.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
           EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	}

}
