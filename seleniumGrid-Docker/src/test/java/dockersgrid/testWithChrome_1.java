package dockersgrid;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class testWithChrome_1 {

	
	@Test
	public void test() throws IOException {
		// TODO Auto-generated method stub

		DesiredCapabilities dc=DesiredCapabilities.chrome();
		URL url=new URL("http://54.157.131.135:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,dc);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	    FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		driver.quit();
		
	}

	

}
