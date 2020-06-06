package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class DragAndSortTest extends DragAndSortLaunch{
	@Test
	public void dragAndDrop() { 
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.LinearLayout[1]").click();
		List lst = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		WebElement ele1 = (WebElement)lst.get(0);
		WebElement ele2 = (WebElement)lst.get(2);
		TouchAction act = new TouchAction(driver);
		act.longPress(ele1).moveTo(ele2).release().perform();
	}	
}
