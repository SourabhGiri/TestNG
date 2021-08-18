package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CurrentUR1{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.tutorialspoint.com/index.htm";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        // get current URL and print
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current Url is:"+ strUrl);
        driver.quit();
    }
}