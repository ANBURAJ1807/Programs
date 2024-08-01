package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * 
		 * driver.get("http://leaftaps.com/opentaps/control/main");
		 * 
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 */

		/*
		 * //BY BASIC LOCATORS :
		 * driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 * driver.findElement(By.partialLinkText("CRM")).click();
		 * driver.findElement(By.linkText("Create Lead")).click();
		 * driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESLEAF")
		 */

		/*
		 * // BY X-PATH :
		 * driver.findElement(By.xpath("//input[@id='username']")).sendKeys(
		 * "demosalesmanager");
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		 * driver.findElement(By.xpath("//input[@value='Login']")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 * driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 */
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		// Launch the url https://www.pvrcinemas.com/
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.findElement(By.xpath("//input[@placeholder='Search
		// city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();

		// Click on Cinema

		driver.findElement(By.className("cinemas-inactive")).click();

		// Select Cinima

		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();

		// Select Date

		driver.findElement(By.xpath("//span[contains(text(), 'Tomorrow')]")).click();

		// Select movie

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();

		// Select show time

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]"));

		// Click the book button

	}

}
