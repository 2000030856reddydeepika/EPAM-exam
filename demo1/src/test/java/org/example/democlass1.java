package org.example;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class democlass1 {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://leetcode.com/accounts/login/?next=%2Flogin%2F");
        driver.findElement(By.id("id_login")).sendKeys("2000030856@kluniversity.in");
        driver.findElement(By.name("password")).sendKeys("deepika");
        driver.findElement(By.className("input-feedback"));
        driver.findElement(By.linkText("Forgot Password?")).click();








    }
}