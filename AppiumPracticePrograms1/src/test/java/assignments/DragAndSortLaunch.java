package assignments;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class DragAndSortLaunch {
	public DesiredCapabilities desiredCapabilities;
	public AndroidDriver driver;
	
	@BeforeTest
	public void launchDialer(){
		try {
			desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability("platform", "android");
			desiredCapabilities.setCapability("platformVersion", "9");
			desiredCapabilities.setCapability("deviceName", "vivo 1819");
			desiredCapabilities.setCapability("automationName", "UIAutomator2");
			desiredCapabilities.setCapability("UDID", "NF4SZHVGZ5Q47LVK");
			desiredCapabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
			desiredCapabilities.setCapability("appActivity", "Launcher");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
