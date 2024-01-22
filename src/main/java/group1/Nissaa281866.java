package group1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;


public class Nissaa281866{
	
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
	        Thread.sleep(3000);
	    }

	@Test
    public void FIMS_01 () throws InterruptedException {
		
        
     // Click Arrow button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/back")).click();
        Thread.sleep(1000);

        
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test arrow code is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
	public void FIMS_02() throws InterruptedException {
	    // Click Arrow button
	    driver.findElement(By.xpath("//*[@id=\"breadcrumbs\"]/back")).click();
	    Thread.sleep(1000);

	    // Navigate to "portal" page (assuming it's a link)
	    driver.findElement(By.linkText("Portal")).click();
	    Thread.sleep(1000);

	    // Navigate to "Authorized Receipting" page (assuming it's a link)
	    driver.findElement(By.linkText("Payslip")).click();
	    Thread.sleep(1000);

	    System.out.println("Test nav button code Pass");
	    Thread.sleep(4000);

	    try {
	        // Get Text From Page
	        WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
	        String actualText = anyEmptyCell.getText();

	        // Expected Text
	        String expectedText = "No records";

	        // Assert that the "No records" message is present anywhere on the page
	        Assert.assertEquals("Page content does not match", expectedText, actualText);
	        System.out.println("Test Case for nav button is Valid");
	    } catch (Exception e) {
	        e.printStackTrace();
	        Assert.fail("Entire page search test failed: " + e.getMessage());
	    }
	}

	@Test
    public void FIMS_03 () throws InterruptedException {
		
        
        // Navigate to "Authorized Receipting" page (assuming it's a link)
        driver.findElement(By.linkText("Authorized Receipting")).click();
        Thread.sleep(1000);
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
        
     // Click save & submit button
        driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
        Thread.sleep(1000);
        
     // Click "Ok" button
        driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);
       
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for add detail is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_04 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
        
     // Click date button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[2]/div/div/input")).click();
        Thread.sleep(1000);
        
     // Click year button
        driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[2]")).click();
        Thread.sleep(1000);
       
     // Choose year 
        driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[2]/option[100]")).click();
        Thread.sleep(1000);
        
        
      // Click month 
         driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[1]")).click();
         Thread.sleep(1000);
           
      // Click day 
         driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/tbody/tr[3]/td[1]")).click();
         Thread.sleep(1000);
         
      // Click save & submit button
         driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
         Thread.sleep(1000);
         
      // Click "Ok" button
         driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
         Thread.sleep(1000);
       
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for add detail is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_05 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
        
     // Click date button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[2]/div/div/input")).click();
        Thread.sleep(1000);
        
     // Click year button
        driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[2]")).click();
        Thread.sleep(1000);
       
     // Choose year 
        driver.findElement(By.xpath("//html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[2]/option[102]")).click();
        Thread.sleep(1000);
        
        
      // Click month 
         driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/thead/tr[1]/th[2]/select[1]")).click();
         Thread.sleep(1000);
           
      // Click day 
         driver.findElement(By.xpath("/html/body/div[18]/div[2]/div[1]/table/tbody/tr[3]/td[2]")).click();
         Thread.sleep(1000);
         
      // Choose collection type
         driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
         Thread.sleep(1000);
         
      // Choose collection type (Event)
         driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]")).click();
         Thread.sleep(1000);
         
       
      // Click save & submit button
         driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
         Thread.sleep(1000);
         
      // Click "Ok" button
         driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
         Thread.sleep(1000);
       
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for date is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_06 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
         
      // Choose collection type
         driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
         Thread.sleep(1000);
         
      // Choose collection type (Event)
         driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]")).click();
         Thread.sleep(1000);
         
         // write purpose
         driver.findElement(By.xpath(" //*[@id=\"are_reason\"]")).sendKeys("Any Random Purpose");
         Thread.sleep(1000);
      
      // Click save & submit button
         driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
         Thread.sleep(1000);
         
      // Click "Ok" button
         driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
         Thread.sleep(1000);
         
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for random purpose is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_07 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
         
      // Choose collection type
         driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
         Thread.sleep(1000);
         
      // Choose collection type (Event)
         driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[1]")).click();
         Thread.sleep(1000);
         
      // Click save & submit button
         driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
         Thread.sleep(1000);
         
      // Click "Ok" button
         driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
         Thread.sleep(1000);
         
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for random purpose is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_08 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
         
      // Choose collection type
         driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
         Thread.sleep(1000);
         
      // Choose collection type (General)
         driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
         Thread.sleep(1000);
         
      // write purpose
         driver.findElement(By.xpath(" //*[@id=\"are_reason\"]")).sendKeys("Any Random Purpose");
         Thread.sleep(1000);
         
      // Click save & submit button
         driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
         Thread.sleep(1000);
         
      // Click "Ok" button
         driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
         Thread.sleep(1000);
         
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for random purpose is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_09 () throws InterruptedException {
		
        
     // Click +New button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
        Thread.sleep(1000);
        
        
        // Choose collection type
           driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
           Thread.sleep(1000);
         
        // Choose collection type (General)
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        Thread.sleep(1000);
        
        
     // Click save & submit button
        driver.findElement(By.xpath("//*[@id=\"entrySaveSubmit\"]")).click();
        Thread.sleep(1000);
        
     // Click "Ok" button
        driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);
         
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for no purpose is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	@Test
    public void FIMS_10 () throws InterruptedException {
		
        
	// Click +New button
       driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a/span")).click();
       Thread.sleep(1000);
        
    // Choose collection type
       driver.findElement(By.xpath("//*[@id=\"inputArea_are_purposed_code\"]/span/span[2]/span")).click();
       Thread.sleep(1000);
         
    // Choose collection type (General)
       driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
       Thread.sleep(1000);
        
     // Choose save
        driver.findElement(By.xpath(" //*[@id=\"entrySave\"]")).click();
        Thread.sleep(1000);
        
     // Choose ok
        driver.findElement(By.xpath("//*[@id=\"modalAlert\"]/div/div/div[3]/button")).click();
        Thread.sleep(1000);
        
     // Choose 
        driver.findElement(By.xpath("//*[@id=\"dt_listing\"]/tbody/tr[1]/td[9]/a[3]")).click();
        Thread.sleep(1000);
        
        // Choose collection type (General)
        driver.findElement(By.xpath("//*[@id=\"modalConfirm7\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);
          
         
         
        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test Case for delete is Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }
    }
	
	
	@After
    public void afterTest() {
        // Close the WebDriver after each test case
        if (driver != null) {
            driver.quit();
}
	}
}
        
        
        