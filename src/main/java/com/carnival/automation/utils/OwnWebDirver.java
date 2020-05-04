package com.carnival.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnWebDirver {

    private static WebDriver driver;

    public static OwnWebDirver web() {

        System.setProperty("webdriver.chrome.driver", "src//test//java//resources//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return new OwnWebDirver();
    }

    public WebDriver onTheWebSite(String url) {
        driver.get(url);
        return driver;
    }
}

