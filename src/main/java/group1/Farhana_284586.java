package group1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Farhana_284586 {

    //static ChromeDriver driver = new ChromeDriver();

    static WebDriver driver; // Declaring WebDriver instance

    @BeforeClass
    public static void beforeClass() throws InterruptedException {
        System.out.println("Before Class");
        //System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\SOFTWARE TESTING\\PROJECT\\EdgeDriver\\msedgedriver.exe");
        driver = new EdgeDriver(); // Initialize WebDriver

        driver.manage().window().maximize();

        driver.get("https://fimsclone.kerisi.my/"); // Open website
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        // Login using username and password
        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("ENTRY1");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/div[2]/form/div[4]/input")).sendKeys("qwertyuiop");
        Thread.sleep(2000);

        // Click SIGN IN button
        driver.findElement(By.xpath("/html/body/div/div[2]/form/input")).click();
        System.out.println("Log in successful");
        System.out.println("Before Class - successful");
        Thread.sleep(5000);
    }


    /* Before each test cases, navigate to the menu:
     ** Menu > Portal > Stock Application
     */
    @Before
    public void before() throws InterruptedException {
        System.out.println("\nBefore Test Case");

        driver.navigate().refresh();

        // Select Portal Menu
        driver.findElement(By.id("menu_id_1533")).click();
        System.out.println("Portal");
        Thread.sleep(2000);

        // Select Stock Application in the Menu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/a")).click();
        System.out.println("Stock Application");
        Thread.sleep(5000);

        System.out.println("Before success - Stock Application Menu");
    }


    /* Test Case 1 : FIMS_41 : Insert Store Field
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_41() throws InterruptedException {

        System.out.println("\nTest 1 : Insert Store Field");

        // Select New Application in the submenu
        driver.findElement(By.xpath("//*[@id=\"menu_id_2868\"]")).click();
        Thread.sleep(1000);

        // Click Store field
        driver.findElement(By.xpath("//*[@id=\"inputArea_sma_store_code\"]/span/span[2]/span")).click();
        Thread.sleep(1000);
        System.out.println("Click Store Field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Get the value from the store field
        String actualValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span/span[1]")).getText();

        // Get the value from the PTJ field
        String expectedValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/input")).getAttribute("value");

        // Use an assertion to verify that both actual and expected values are not empty
        Assert.assertTrue("The store field is empty", !actualValue.isEmpty());
        Assert.assertTrue("The PTJ field is empty", !expectedValue.isEmpty());

        System.out.println("Store field and PTJ field is not empty" +
                "\nStore field: " + actualValue +
                "\nPTJ field: " + expectedValue);
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search Button");
        Thread.sleep(2000);

        System.out.println("Test 1 success");
    }


    /* Test Case 2 : FIMS_42 : Insert Store Field with No Input
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_42() throws InterruptedException {

        System.out.println("\nTest 2 : Insert Store Field with No Input");

        //Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Get the error message after clicking Search Button
        String actualValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/div")).getText();

        // Define expected string output
        String expectedValue = "Compulsory";

        // Assert to verify whether Expected Value is equal to Actual Value
        Assert.assertEquals("Error message is not same", expectedValue, actualValue);

        System.out.println("Actual Error Message is same with Expected Error Message" +
                "\nActual Value: " + actualValue +
                "\nExpected Value: " + expectedValue);
        Thread.sleep(2000);

        System.out.println("Test 2 success");
    }


    /* Test Case 3 : FIMS_43 : Add New Item to Store
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_43() throws InterruptedException {

        System.out.println("\nTest 3 : Add New Item to Store");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click +Add Item button
        driver.findElement(By.id("btn_add")).click();
        System.out.println("Click +Add Item button");
        Thread.sleep(2000);

        // Click Item field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[1]/span/span[2]/span")).click();
        System.out.println("Click Item field");
        Thread.sleep(2000);

        // Input Item field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/span/span/span[1]/input")).sendKeys("fail");
        System.out.println("Type fail");
        Thread.sleep(2000);

        // Select Fail Jabatan Putih
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/span/span/span[2]/ul/li[3]")).click();
        System.out.println("Select Fail Jabatan Putih");
        Thread.sleep(2000);

        // Get quantity available
        String expectedValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[3]/input")).getAttribute("value");
        System.out.println("Get quantity available : " + expectedValue);
        Thread.sleep(2000);

        // Check if expectedValue is not empty before parsing
        if (!expectedValue.isEmpty()) {

            // Enter quantity
            driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).sendKeys("1");
            System.out.println("Enter quantity request");
            Thread.sleep(2000);

            String actualValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).getAttribute("value");

            // Parse the string values to integers
            int actualValueAsInt = Integer.parseInt(actualValue);
            int quantityAvailableAsInt = Integer.parseInt(expectedValue);

            // Verify that actualValue is less than or equal to quantityAvailable
            Assert.assertTrue("Actual value is greater than quantity available", actualValueAsInt <= quantityAvailableAsInt);

            // Click Save button
            driver.findElement(By.id("srd_store_req_detl_id")).click();
            System.out.println("Click Save button");
            Thread.sleep(2000);

            // Click Ok button
            driver.findElement(By.xpath("/html/body/div[19]/div/div/div[3]/button[2]")).click();
            System.out.println("Click Ok button");
            System.out.println("Add Fail Jabatan Putih");
            Thread.sleep(2000);

            System.out.println("Test 3 success");
        } else {
            System.out.println("Quantity available is empty");
        }
    }


    /* Test Case 4 : FIMS_44 : Add New Item to Store with No Input
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_44() throws InterruptedException {

        System.out.println("\nTest 4 : Add New Item to Store with No Input");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click +Add Item button
        driver.findElement(By.id("btn_add")).click();
        System.out.println("Click +Add Item button");
        Thread.sleep(2000);

        // Click Save button
        driver.findElement(By.id("srd_store_req_detl_id")).click();
        System.out.println("Click Save button");
        Thread.sleep(2000);

        // Get the actual error message after clicking Save Button
        String actualValue1 = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[1]/div")).getText();
        String actualValue2 = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/div")).getText();
        String actualErrMessage = actualValue1 + actualValue2;

        // Define expected string output
        String expectedValue1 = "Compulsory";
        String expectedValue2 = "Min 1";
        String expectedErrMessage = expectedValue1 + expectedValue2;

        // Assert to verify whether Expected Value is equal to Actual Value
        Assert.assertEquals("Error message is not same", actualErrMessage, expectedErrMessage);
        Thread.sleep(2000);

        System.out.println("Actual Error Message is same with Expected Error Message" +
                "\nActual Value 1: " + actualValue1 + ", Actual Value 2: " + actualValue2 +
                "\nExpected Value 1: " + expectedValue1 + ", Expected Value 2: " + expectedValue2);
        Thread.sleep(2000);

        System.out.println("Test 4 success");
    }


    /* Test Case 5 : FIMS_45 : Search Item
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_45() throws InterruptedException {

        System.out.println("\nTest 5 : Search Item");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click search bar
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div[2]/div[1]/label/input")).click();
        System.out.println("Click Search bar");
        Thread.sleep(2000);

        // Enter "fail"
        String searchText = "fail";
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div[2]/div[1]/label/input")).sendKeys(searchText);
        System.out.println("Enter " + searchText);
        Thread.sleep(2000);

        // Verify that the search results are displayed
        String expectedItem = "Fail Putih Jabatan";
        List<WebElement> searchResults = driver.findElements(By.xpath("/html/body/div[4]/form/div/div[2]/div[2]/div[3]/table/tbody/tr"));
        boolean isItemFound = false;

        for (WebElement result : searchResults) {
            if (result.getText().contains(expectedItem)) {
                isItemFound = true;
                break;
            }
        }

        // Assert that the expected item is found in the search results
        Assert.assertTrue("Expected item not found in search results", isItemFound);

        System.out.println("Test 5 success");
    }


    /* Test Case 6 : FIMS_46 : Edit Store Item
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_46() throws InterruptedException {

        System.out.println("\nTest 6 : Edit Store Item");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click edit icon button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div[2]/div[3]/table/tbody/tr/td[5]/a[1]/i")).click();
        System.out.println("Click edit icon button");
        Thread.sleep(2000);

        // Click Item field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[1]/span/span[2]/span/span[1]")).click();
        System.out.println("Click item field");
        Thread.sleep(2000);

        // Input Item field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/span/span/span[1]/input")).sendKeys("pen");
        System.out.println("Type pen");
        Thread.sleep(2000);

        // Select Pen - Hitam
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/span/span/span[2]/ul/li[1]")).click();
        System.out.println("Select Pen - Hitam");
        Thread.sleep(2000);

        // Get quantity available
        String expectedValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[3]/input")).getAttribute("value");
        System.out.println("Get quantity available : " + expectedValue);
        Thread.sleep(2000);

        // Check if expectedValue is not empty before parsing
        if (!expectedValue.isEmpty()) {

            // Enter quantity
            driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).clear();
            driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).sendKeys("1");
            System.out.println("Enter quantity request");
            Thread.sleep(2000);

            String actualValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).getAttribute("value");

            // Parse the string values to integers
            int actualValueAsInt = Integer.parseInt(actualValue);
            int quantityAvailableAsInt = Integer.parseInt(expectedValue);

            // Verify that actualValue is less than or equal to quantityAvailable
            Assert.assertTrue("Actual value is greater than quantity available", actualValueAsInt <= quantityAvailableAsInt);

            // Click Save button
            driver.findElement(By.id("srd_store_req_detl_id")).click();
            System.out.println("Click Save button");
            Thread.sleep(2000);

            // Click Ok button
            driver.findElement(By.xpath("/html/body/div[19]/div/div/div[3]/button[2]")).click();
            System.out.println("Click Ok button");
            Thread.sleep(2000);

            System.out.println("Test 6 success");
        } else {
            System.out.println("Quantity available is empty");
        }
    }


    /* Test Case 7 : FIMS_47 : Delete Store Item
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_47() throws InterruptedException {

        System.out.println("\nTest 7 : Delete Store Item");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click delete icon button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[2]/div[2]/div[3]/table/tbody/tr/td[5]/a[2]/i")).click();
        System.out.println("Click delete icon button");
        Thread.sleep(2000);

        // Click Ok button
        driver.findElement(By.cssSelector("#modalConfirm7 > div > div > div.modal-footer > button.btn.btn-primary")).click();
        System.out.println("Click Ok button");
        Thread.sleep(2000);

        // Get the message after clicking delete icon button.
        String actualValue = driver.findElement(By.xpath("/html/body/div[18]/div/div/div[2]")).getText();

        // Define expected string output, delete pen-hitam
        String expectedValue = "Information was successfully deleted.";

        // Assert to verify whether Expected Value is equal to Actual Value
        Assert.assertEquals("Delete process failed", expectedValue, actualValue);

        System.out.println("Actual Message is same with Expected Message" +
                "\nActual Message: " + actualValue +
                "\nExpected Message: " + expectedValue);
        Thread.sleep(2000);

        // Click Ok button
        driver.findElement(By.xpath("/html/body/div[18]/div/div/div[3]/button")).click();
        System.out.println("Click Ok button");
        Thread.sleep(2000);

        System.out.println("Test 7 success");
    }


    /* Test Case 8 : FIMS_48 : Save and Submit Store Item
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_48() throws InterruptedException {

        System.out.println("\nTest 8 : Save and Submit Store Item");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click +Add Item button
        driver.findElement(By.id("btn_add")).click();
        System.out.println("Click +Add Item button");
        Thread.sleep(2000);

        // Click Item field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[1]/span/span[2]/span")).click();
        Thread.sleep(2000);

        // Select Fail Sampul Kecil
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/span/span/span[2]/ul/li[17]")).click();
        System.out.println("Select Fail Sampul Kecil");
        Thread.sleep(2000);

        // Get quantity available
        String expectedValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[3]/input")).getAttribute("value");
        System.out.println("Get quantity available : " + expectedValue);
        Thread.sleep(2000);

        // Check if expectedValue is not empty before parsing
        if (!expectedValue.isEmpty()) {

            // Enter quantity
            driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).sendKeys("1");
            System.out.println("Enter quantity request");
            Thread.sleep(2000);

            String actualValue = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[3]/div/div/div[2]/div/div[2]/input")).getAttribute("value");

            // Parse the string values to integers
            int actualValueAsInt = Integer.parseInt(actualValue);
            int quantityAvailableAsInt = Integer.parseInt(expectedValue);

            // Verify that actualValue is less than or equal to quantityAvailable
            Assert.assertTrue("Actual value is greater than quantity available", actualValueAsInt <= quantityAvailableAsInt);

            // Click Save button
            driver.findElement(By.id("srd_store_req_detl_id")).click();
            System.out.println("Click Save button");
            Thread.sleep(2000);

            // Click Ok button
            driver.findElement(By.xpath("/html/body/div[19]/div/div/div[3]/button[2]")).click();
            System.out.println("Click Ok button");
            Thread.sleep(2000);

            System.out.println("Add Fail Sampul Kecil");
        } else {
            System.out.println("Quantity available is empty");
        }

        // Click save and submit button
        driver.findElement(By.id("srm_store_request_id")).click();
        System.out.println("Click Save and Submit button");
        Thread.sleep(2000);

        // Click Ok button
        driver.findElement(By.xpath("/html/body/div[18]/div/div/div[3]/button[2]")).click();
        System.out.println("Click Ok button");
        Thread.sleep(3000);

        // Extract text from the modal-body element
        String modalText = driver.findElement(By.cssSelector("#modalAlert > div > div > div.modal-body")).getText();
        ///html/body/div[18]/div/div/div[2]
        Thread.sleep(2000);

        // Split the text based on the period (.)
        String[] message = modalText.split("\\.");

        // Get the first sentence (index 0) and trim any leading or trailing spaces
        String actualValueMsg = message[0].trim();

        // Define expected string output
        String expectedValueMsg = "Information was successfully been processed";

        // Assert to verify whether Expected Value is equal to Actual Value
        Assert.assertEquals("The actual message does not match the expected message", expectedValueMsg.trim(), actualValueMsg);

        System.out.println("Actual Message is same with Expected Message" +
                "\nActual Message: " + actualValueMsg +
                "\nExpected Message: " + expectedValueMsg);
        Thread.sleep(2000);

        // Click Ok button
        driver.findElement(By.cssSelector("#modalAlert > div > div > div.modal-footer > button")).click();
        System.out.println("Click Ok button");
        Thread.sleep(2000);

        System.out.println("Test 8 success");
    }


    /* Test Case 9 : FIMS_49 : Save and Submit Store Item with No Item
     ** Menu > Portal > Stock Application > New Application
     */
    //@Ignore
    @Test
    public void FIMS_49() throws InterruptedException {

        System.out.println("\nTest 9 : Save and Submit Store Item with No Item");

        // Select New Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[1]/a")).click();
        System.out.println("New Application Menu");
        Thread.sleep(2000);

        // Click Store field
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/span/span[2]/span")).click();
        System.out.println("Click store field");
        Thread.sleep(2000);

        // Input Store field
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Stor");
        System.out.println("Type Stor");
        Thread.sleep(2000);

        // Select Store field in dropdown
        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
        System.out.println("Select Stor Alat Tulis");
        Thread.sleep(2000);

        // Click Search button
        driver.findElement(By.id("searchbtn")).click();
        System.out.println("Click Search button");
        Thread.sleep(2000);

        // Click save and submit button
        driver.findElement(By.id("srm_store_request_id")).click();
        System.out.println("Click Save and Submit button");
        Thread.sleep(2000);

        // Extract text from the modal-body element
        String actualValue = driver.findElement(By.cssSelector("#modalAlert > div > div > div.modal-body")).getText();

        // Define expected string output
        String expectedValue = "Please add 1 or more store item before proceed";

        // Assert to verify whether Expected Value is equal to Actual Value
        Assert.assertEquals("Error message is not same", expectedValue, actualValue);

        System.out.println("Actual Message is same with Expected Message" +
                "\nActual Message: " + actualValue +
                "\nExpected Message: " + expectedValue);
        Thread.sleep(2000);

        // Click Ok button
        driver.findElement(By.xpath("/html/body/div[18]/div/div/div[3]/button")).click();
        System.out.println("Click Ok button");
        Thread.sleep(2000);

        System.out.println("Test 9 success");
    }


    /* Test Case 10 : FIMS_50 : View Store Item and Application Details
     ** Menu > Portal > Stock Application > List of Application
     */
    //@Ignore
    @Test
    public void FIMS_50() throws InterruptedException {

        System.out.println("\nTest 10 : View Store Item and Application Details");

        // Select List of Application in the submenu
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/ul/li[3]/ul/li[18]/ul/li[2]/a")).click();
        System.out.println("List of Application Menu");
        Thread.sleep(2000);

        // Click view icon button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[9]/a[1]/i")).click();
        System.out.println("Click view icon button");
        Thread.sleep(2000);

        // 2 section will appear after click view button
        WebElement prompt = driver.findElement(By.className("cardHeader"));

        // Assert to verify whether the sections are displayed
        assertTrue("Store's Item and Application Status section is not displayed", prompt.isDisplayed());

        System.out.println("Store's Item and Application Status section displayed");
        Thread.sleep(2000);

        System.out.println("Test 10 success");
    }


    // After each test cases, back to main dashboard
    @After
    public void after() throws InterruptedException {

        System.out.println("\nAfter Test Case");

        // Redirect to the main dashboard
        driver.get(" https://fimsclone.kerisi.my/index.php?a=NDg3PUFYWW5WV1BrRjJjb0oyYmhKSFptMFdadVZYU0Uxak13Y1RONTcz");
    }


    @AfterClass
    public static void tearDown() {

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}