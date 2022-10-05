package SpringTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpringProjectTestClass {
	static WebDriver driver = null;

	@BeforeTest
	void saticMembers() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");

		driver = new ChromeDriver();

	}

//	@BeforeClass
//	void classInitialization() throws Exception {
//		driver.get("http://localhost:8082/sdnext/add.html");
//		Thread.sleep(3000);
//
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//
//		
//	}

	@Test(priority = 0)
	public void AddEmployeeName() throws InterruptedException {
		System.out.println("Testcase-1....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("suraj");

		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(3000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void EmployeeAge() throws Exception {
		System.out.println("Testcase-2....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("age")).sendKeys("25");

		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void Employeesalary() throws Exception {
		System.out.println("Testcase-3....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(4000);
		driver.findElement(By.id("salary")).sendKeys("35");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);

	}

	@Test(priority = 3)
	public void EmployeeAddress() throws Exception {
		System.out.println("Testcase-4....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("address")).sendKeys("kolhapur");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
		// driver.close();

	}

	@Test(priority = 4)
	public void AddNameAndAge() throws Exception {
		System.out.println("Testcase-5....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("age")).sendKeys("25");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	public void AddNameAndSalary() throws Exception {
		System.out.println("Testcase-6....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("salary")).sendKeys("35");
		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
	}
	@Test(priority = 6)
	public void AddAgeAndAddress() throws Exception {
		System.out.println("Testcase-7....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("address")).sendKeys("kolhapur");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
	}
	@Test(priority = 7)
	public void AddNamaAndAddress() throws Exception {
		System.out.println("Testcase-8....");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("address")).sendKeys("kolhapur");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
	}
	@Test(priority = 8)
	public void AddAllCredentials() throws Exception {
		System.out.println("Testcase-9 ");
		driver.get("http://localhost:8082/sdnext/add.html");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("suraj");
		driver.findElement(By.id("age")).sendKeys("25");
		driver.findElement(By.id("address")).sendKeys("kolhapur");
		driver.findElement(By.id("salary")).sendKeys("35");
		WebElement submit = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input"));
		submit.click();
		Thread.sleep(2000);
		String expected = "http://localhost:8082/sdnext/add.html";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
		Thread.sleep(4000);
	}
	
	
}