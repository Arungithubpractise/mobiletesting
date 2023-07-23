package Appiumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class longPress extends Baseclass{
	
	@Test
	public void longPressgesture ()
	{
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
	driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();	
	WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text= 'People Names']"));
	
	longpressaction(ele);
	
	String text = driver.findElement(By.id("android:id/title")).getText();
	Assert.assertEquals(text, "Sample menu");
		
	}

}
