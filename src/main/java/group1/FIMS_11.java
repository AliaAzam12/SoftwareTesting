/*
* Test case for Add Authorized Staff (1)
* */
package group1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FIMS_11 {
    ChromeDriver driver = new ChromeDriver();
    String URL = "https://fimsclone.kerisi.my/";

    @Before
    public void beforeTest() throws InterruptedException {
        //automate browser to FIMS
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();

        // Navigate to FIMS login page
        driver.get(URL);
        Thread.sleep(2000);

        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys("ENTRY1");
        Thread.sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("qwertyuiop");
        Thread.sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        Thread.sleep(1000);

        // Click Account Receivable
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        //click Authorized Receipting
        driver.findElement(By.xpath("//a[contains(text(),'Authorized Receipting')]")).click();
        Thread.sleep(1000);
    }

    //Test case for Add .....
    @Test
    public void FIMS_11_Add() throws InterruptedException {
        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        //click +New button 2
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[3]/a")).click();
        Thread.sleep(1000);

        //click Authorized Receipting Staff search field
        driver.findElement(By.xpath("//*[@id=\"inputArea_are_authorized_receipting_id\"]")).click();
        Thread.sleep(1000);

        //enter staff id
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/span/span/span[1]/input")).sendKeys("1088");
        Thread.sleep(1000);

        //click option
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/span/span/span[2]/ul")).click();
        Thread.sleep(1000);

        //enter reason
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[12]/input")).sendKeys("Test reason");
        Thread.sleep(1000);

        //click save button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[14]/div/button[2]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[12]/input")).getAttribute("value");

        // Expected Title
        String ExpectedTitle = "Test reason";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for Add is Valid");

    }
    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

