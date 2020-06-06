package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidKeyCode;

public class BigBasketTest extends BigBasketLaunch{
	@Test
	public void addToCart() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElementById("com.bigbasket.mobileapp:id/text_login").click();
		driver.findElementById("com.bigbasket.mobileapp:id/imgCloseIcon").click();
		driver.findElementById("com.bigbasket.mobileapp:id/homePageSearchBox").click();
		driver.findElementById("com.bigbasket.mobileapp:id/searchView").sendKeys("Mangoes");
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		List btnAddLst = driver.findElementsByAccessibilityId("com.bigbasket.mobileapp:id/btnAddToBasket");
		WebElement btn = (WebElement)btnAddLst.get(0);
		btn.click();
	}
}
