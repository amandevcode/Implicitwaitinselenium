import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisha\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown1 =  driver.findElement(By.xpath("//option[@value='2']"));
		System.out.println(dropdown1 .getText());
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dropdown1.click();
	}

}
