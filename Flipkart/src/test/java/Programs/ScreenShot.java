package Programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
	   RemoteWebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	   driver.get("https://www.selenium.dev/downloads/");
	   
	   File src = driver.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./C:\\Users\\Admin\\OneDrive\\Pictures.png");
	   Files.copy(src, dest);
}
}
