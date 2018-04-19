package com;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotepadTest {

	public void run() throws IOException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\WINDOWS\\system32\\notepad.exe");
		try {
			WiniumDriver driver = new WiniumDriver(new URL(
					"http://localhost:9999"), options);
			driver.findElementByClassName("Edit").sendKeys(
					"This is sample test");
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		NotepadTest nt = new NotepadTest();
		nt.run();
	}

}
