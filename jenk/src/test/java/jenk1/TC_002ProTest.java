package jenk1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class TC_002ProTest {
		@Test
		public void addLoan1() {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://meesho.com/");
		

		}


	}

		




