package assignments;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

import java.util.List;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

public class ApiDemosTest extends APIDemosLaunch{
	
	@Test
	public void printListElements() {
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("3. Holo Light Theme").click();
		driver.hideKeyboard();
		driver.findElementById("android:id/text1").click();
		List lst = driver.findElementsById("android:id/text1");
		for(int i=0; i<lst.size(); i++) {
			System.out.println(((WebElement)lst.get(i)).getText());
		}
	}
	
	@Test
	public void testRating() {
		driver.findElementByAccessibilityId("Views").click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrolIntoView(text(\"Rating Bar\")").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"Rating Bar\"));").click();
		TouchAction action = new TouchAction(driver);
		WebElement ratingBar = driver.findElementById("io.appium.android.apis:id/ratingbar2");
		action.tap(740, 550).perform();
//		System.out.println(ratingBar.getLocation());
//		System.out.println(ratingBar.getSize());
	}
}
