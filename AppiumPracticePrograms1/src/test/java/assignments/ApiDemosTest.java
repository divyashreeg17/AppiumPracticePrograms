package assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
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
}
