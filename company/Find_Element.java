package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

    public static void main(String[] args) {
// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

// Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("no")).click();

//Click on Check Button
        driver.findElement(By.id("buttoncheck")).click();

    }

}