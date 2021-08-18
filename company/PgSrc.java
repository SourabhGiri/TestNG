package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class PgSrc{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get ("https://www.tutorialspoint.com/about/about_careers.htm");
        //get page source
        String p = driver.getPageSource();
        System.out.println("Page Source is : " + p);
        driver.close();
    }
}