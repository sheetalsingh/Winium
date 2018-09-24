package com;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotepadTest2 {

	public static void main(String[] args) throws MalformedURLException,
			InterruptedException {

		WiniumDriver winDriver = null;
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
		try {
			winDriver = new WiniumDriver(new URL("http://localhost:9999"),options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		winDriver.switchTo().window(winDriver.getWindowHandle());
		
		winDriver.findElementByClassName("Edit").sendKeys("Hello Winium");
	}

}