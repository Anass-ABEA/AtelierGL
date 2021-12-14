package org.springframework.samples.petclinic;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
public class TestExistencePetOwnerTest {
	private WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void testdexistencedunpetowner() {
		driver.get("http://localhost:8080/");
		driver.manage().window().setSize(new Dimension(1552, 840));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) span:nth-child(2)")).click();
		driver.findElement(By.id("lastName")).click();
		driver.findElement(By.id("lastName")).sendKeys("Davis");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		driver.findElement(By.linkText("Betty Davis")).click();
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > td")).getText(), is("Betty Davis"));
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(2) > td")).getText(), is("638 Cardinal Ave."));
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(3) > td")).getText(), is("Sun Prairie"));
		assertThat(driver.findElement(By.cssSelector("tr:nth-child(4) > td")).getText(), is("6085551749"));
	}
}
