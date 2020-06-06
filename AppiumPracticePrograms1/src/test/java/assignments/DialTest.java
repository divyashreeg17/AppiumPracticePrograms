package assignments;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class DialTest extends DialerLaunch{
	@Test
	public void callFromDialer() {
		driver.findElementByXPath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout").click();
		driver.findElementByAccessibilityId("SIM2Dial").click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElementById("com.android.incallui:id/end_button").click();
	}
}
