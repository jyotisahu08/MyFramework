package MyFrstMavnProjct.MavenProjct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public void custTest()
	{
		System.out.println("My test");
	}
	@Test
	public void deleteTest() {
		System.out.println("My Delete customer");
	}
	@Test
	public void modifyTest() {
		System.out.println("My modify customer");
	}
	@Test
	public void launchTheBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("wwww.gmail.com");
		driver.close();
	}
}
