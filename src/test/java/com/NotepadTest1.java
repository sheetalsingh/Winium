package com;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;


/**
 * No need to start any thing like server etc
 * Simply run the test
 * In case focus dont come on opened notepad then Winium will write text in console
 */
public class NotepadTest1 {

	public void writeToNotePad() throws IOException {
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\WINDOWS\\system32\\notepad.exe");
		try {
			WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
			System.out.println("Waiting...");
			Thread.sleep(2000);
			System.out.println("...Wait finish");
			driver.findElementByClassName("Edit").sendKeys("This is sample test");
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		NotepadTest1 nt = new NotepadTest1();
		nt.writeToNotePad();
	}

}
