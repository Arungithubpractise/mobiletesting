package Appiumbasics;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class scrollgesture extends Baseclass{
	
	@Test
	public void scroll()
	
	{
		
		Activity act = new Activity("io.appium.android.apis","io.appium.android.apis.ApiDemos");
		driver.startActivity(act);
		
		//driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollabale(new UiSelector()).scrollIntoView(text(\"webView\"));"));
		
		//when we have to scroll to the end of the view 
		
		scrolltoend();
			
	}

}
