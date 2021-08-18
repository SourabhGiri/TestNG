package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    public class PrintWebSiteTitle{
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
            // getTitle() to obtain page title
            System.out.println("Page title is : " + driver.getTitle());
            driver.close();
        }
    }