package com.cybertek.tests;

import com.cybertek.utulities.StringUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {
    public static void main(String[] args)  throws Exception {

        for(;;) {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://sites.google.com/taskrabbit.com/northamerica/available-ikea-tasks-for-north-est#h.p_JU43Djmfb37V");

            //WebElement tasks = driver.findElement(By.cssSelector("#h\\.p_zgvOD_X1-lg9 > div"));
            WebElement tasks = driver.findElement(By.className("oKdM2c"));

            String act = tasks.getText();
            String exp = "No Tasks Available - Set your availability and check nearby cities!";


            StringUtilities.verifyEquals(act, exp);


            if (StringUtilities.verifyEquals(act, exp) == false) {
                Notification.sendEmail();
            }
            Notification.sleep(20);
            driver.quit();
        }


    }
}
