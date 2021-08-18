package com.company;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Selenium1Test {
    @Test
    public void testAdd() {
        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium 3");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        //driver.findElement(By.xpath("/html/body/div[7]/div/div[8]/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div/div[1]/a/h3")).click();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("D:\\New folder (2)\\homeScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        driver.close();
    }

}