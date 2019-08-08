package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Notification {

    public static void main(String[] args) throws InterruptedException {
        sendEmail();
    }
    public static void sendEmail () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");

        WebElement EmailInput = driver.findElement(By.name("identifier"));
        EmailInput.sendKeys("arturkapirojok123@gmail.com" + Keys.ENTER);

        sleep(5);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("artur123Pirojok" + Keys.ENTER);


        sleep(10);
        //WebElement composeEmail = driver.findElement(By.cssSelector("#\\:4b > div > div"));
        WebElement composeEmail = driver.findElement(By.xpath("//div[@class='aic']/div/div"));

        composeEmail.click();

        sleep(3);

        WebElement toWhom = driver.findElement(By.name("to"));
        toWhom.sendKeys("adz.makanuotti@gmail.com" + Keys.ENTER);

        WebElement messageBody = driver.findElement(By.cssSelector("#\\:af"));
        messageBody.sendKeys("You Are HIRED"+ Keys.CONTROL + Keys.ENTER );
        sleep(5);
        driver.quit();



    }

    public static void sleep(int a) throws InterruptedException {
        Thread.sleep(a*1000);
    }
}
