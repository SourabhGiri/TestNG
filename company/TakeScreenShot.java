package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public static void main(String[] args){
        //set the location of chrome browser
        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");

        // Initialize browser
        WebDriver driver = new ChromeDriver();

        //navigate to url
        driver.get("https://www.google.com");

        //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("D:\\New folder (2)\\homeScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //closing the webdriver
        driver.close();
    }
}