package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Navigate_Command {

    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.browserstack.com/");


        // Launch Website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
         Thread.sleep(3000);
        //Click on the Link Text using click() command
        //driver.findElement(By.linkText("This is a Link")).click();
        driver.findElement(By.xpath("//a[contains(text(),'This is a link')]")).click();

        //Go back to Home Page
        driver.navigate().back();
        Thread.sleep(3000);
        //Go forward to Registration page
        driver.navigate().forward();
        Thread.sleep(3000);
        // Go back to Home page
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //Refresh browser
        driver.navigate().refresh();

        //Closing browser
        driver.close();
    }
}