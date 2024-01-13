/*
 * Test case for Number of Rows function for Authorized Staff (1)
 * */
package group1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FIMS_17 {
    ChromeDriver driver = new ChromeDriver();
    String URL = "https://fimsclone.kerisi.my/";

    @Before
    public void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();

        //	Go to FIMS login page
        driver.get(URL);
        Thread.sleep(1000);

        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys("ENTRY1");
        Thread.sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("qwertyuiop");
        Thread.sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        //click Authorized Receipting
        driver.findElement(By.xpath("//a[contains(text(),'Authorized Receipting')]")).click();
        Thread.sleep(1000);
    }

    @Test
    public void FIMS_17_10rows() throws InterruptedException {
        //click edit button (AUTS10800/222/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        //click dropdown
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[1]/label/span/span[2]/span/span[2]")).click();
        Thread.sleep(1000);

        //click 10 rows
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[1]")).getText();

        // Expected Title
        String ExpectedTitle = "Authorized Staff";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for display 10 rows successful");
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}