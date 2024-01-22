package group1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Alia_287784 {
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
    public void FIMS_11() throws InterruptedException {
        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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

    @Test
    public void FIMS_12() throws InterruptedException {
        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //click +New button 2
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[3]/a")).click();
        Thread.sleep(1000);

        //click save button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[14]/div/button[2]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr/td[12]")).getText();

        // Expected Title
        String ExpectedTitle = "Y";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for Add is Incorrect");
    }

    @Test
    public void FIMS_13() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //enter search field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[2]/label/input")).sendKeys("Zainol");
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr/td[3]/span")).getText();

        // Expected Title
        String ExpectedTitle = "ZAINOL";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for Search successful");
    }

    @Test
    public void FIMS_14() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //enter search field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[2]/label/input")).sendKeys("bbbbb");
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr/td/a")).getText();

        // Expected Title
        String ExpectedTitle = "No records";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for Search not found");
    }

    @Test
    public void FIMS_15() throws InterruptedException {
        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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

        //click edit button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr[1]/td[13]/a[1]")).click();
        Thread.sleep(1000);

        //click Authorized Receipting Staff search field
        driver.findElement(By.xpath("//*[@id=\"inputArea_are_authorized_receipting_id\"]")).click();
        Thread.sleep(1000);

        //edit staff id
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/span/span/span[1]/input")).sendKeys("128");
        Thread.sleep(1000);

        //click option
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/span/span/span[2]/ul")).click();
        Thread.sleep(1000);

        //edit reason
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[12]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[12]/input")).sendKeys("Test");
        Thread.sleep(1000);

        //click save button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[14]/div/button[2]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div/div/div[2]/div/div[12]/input")).getAttribute("value");

        // Expected Title
        String ExpectedTitle = "Test";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for Edit Successful");
    }

    @Test
    public void FIMS_16() throws InterruptedException {
        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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

        //click delete button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr/td[13]/a[2]")).click();
        Thread.sleep(1000);

        //click OK button
        driver.findElement(By.xpath("/html/body/div[19]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[4]/table/tbody/tr/td/a")).getText();

        // Expected Title
        String ExpectedTitle = "No records";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for delete successful");
    }

    @Test
    public void FIMS_17() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

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

    @Test
    public void FIMS_18() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //click dropdown
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[1]/label/span/span[2]/span/span[2]")).click();
        Thread.sleep(1000);

        //click 25 rows
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[3]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[1]")).getText();

        // Expected Title
        String ExpectedTitle = "Authorized Staff";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for display 25 rows successful");
    }

    @Test
    public void FIMS_19() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //click dropdown
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[1]/label/span/span[2]/span/span[2]")).click();
        Thread.sleep(1000);

        //click 50 rows
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[4]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[1]")).getText();

        // Expected Title
        String ExpectedTitle = "Authorized Staff";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for display 50 rows successful");
    }

    @Test
    public void FIMS_20() throws InterruptedException {
        //click edit button (AUTS10800/475/24)
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[2]")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //click dropdown
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[2]/div[1]/label/span/span[2]/span/span[2]")).click();
        Thread.sleep(1000);

        //click 100 rows
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[5]")).click();
        Thread.sleep(1000);

        // Get Text From Page
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div[1]")).getText();

        // Expected Title
        String ExpectedTitle = "Authorized Staff";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

        System.out.println("Test Case for display 100 rows successful");
    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

