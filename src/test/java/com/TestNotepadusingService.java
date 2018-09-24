package com;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestNotepadusingService {


    WiniumDriver driver = null;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesktopOptions options = new DesktopOptions();
        options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
        driver = new WiniumDriver(new URL("http://localhost:9999"), options);

//        WiniumDriverService service = new WiniumDriverService.Builder()
//                .usingDriverExecutable("path_to_driver_executable")
//                .usingAnyFreePort()
//                .withVerbose(true)
//                .withSilent(false)
//                .buildDesktopService();
//
//        WiniumDriver driver = new WiniumDriver(service, options);
    }


    @Test
    public void testNotepd(){
        driver.findElementByClassName("Edit").sendKeys("Hello Winium");
    }

}



