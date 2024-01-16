package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;



public class abdulrahman_274922 {
    ChromeDriver driver = new ChromeDriver();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
    }
//Table 21: Test case for search in Process Flow (1)
    @Test
    public void FIMS_21() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
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

        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'Authorized Receipting')]")).click();
        Thread.sleep(1000);

        //click New button
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);


        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Navigate to Process Flow section
        driver.findElement(By.xpath("//*[@id=\"dt_processFlow_filter\"]/label/input")).click();
        Thread.sleep(1000);

        //In Process Flow section Insert “APPROVAL” in search bar
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[4]/div[2]/div[1]/label/input")).sendKeys("APPROVAL");
        Thread.sleep(1000);

        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[4]/div[2]/div[3]/table/tbody/tr/td[2]/span")).getText();

        // Expected Title
        String ExpectedTitle = "APPROVAL";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);



        System.out.println("Test Case for Search found");
        Thread.sleep(5000);
        driver.quit();
        Thread.sleep(5000);
    }

   // Table 22: Test case for search in Process Flow (2)
    @Test
    public void FIMS_22() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
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

        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'Authorized Receipting')]")).click();
        Thread.sleep(1000);

        //click New button
        driver.findElement(By.xpath("//*[@id=\"dt_listing_container\"]/div[3]/a")).click();
        Thread.sleep(1000);


        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Navigate to Process Flow section
        driver.findElement(By.xpath("//*[@id=\"dt_processFlow_filter\"]/label/input")).click();
        Thread.sleep(1000);

        //In Process Flow section Insert “APPROVAL” in search bar
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[4]/div[2]/div[1]/label/input")).sendKeys("xxx");
        Thread.sleep(1000);

        String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[4]/div[2]/div[3]/table/tbody/tr/td/a")).getText();

        // Expected Title
        String ExpectedTitle = "No records";

        // Assert to verify if test case is successful
        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);



        System.out.println("Test Case for Search not found");
        Thread.sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }
    // Table 23: Test case add new Discount Note Form(1)
    @Test
    public void FIMS_23() throws InterruptedException {
        // TODO Auto-generated method stub

        driver.get("https://fimsclone.kerisi.my/");
        Thread.sleep(1000);

        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys("ENTRY3");
        Thread.sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("qwertyuiop");
        Thread.sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        Thread.sleep(1000);

        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Discount Note")).click();
        Thread.sleep(1000);

        // Scroll down by 500 pixels
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //click +New button 1
        driver.findElement(By.xpath("//*[@id=\"DtArDiscountNoteList_container\"]/div[3]/a")).click();
        Thread.sleep(1000);

        //SELECT CUSTOMER TYPE
        driver.findElement(By.xpath("//*[@id=\"inputArea_sddCustomerType\"]/span/span[2]/span")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[4]")).click();
        Thread.sleep(1000);


        // enter customer name
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[4]/span/span[2]/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("SINTOK UTARA ENTERPRISE");
        Thread.sleep(3000);


        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li")).click();
        Thread.sleep(3000);

        // select Invoice No *

        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[8]/span/span[2]/span/span[1]")).click();
        Thread.sleep(5000);
//        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("IVD001370/23");
        // Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[38]")).click();
        Thread.sleep(5000);

        //click save button

        driver.findElement(By.xpath("//*[@id=\"invoiceId\"]")).click();
        Thread.sleep(3000);



        System.out.println("Test Case successful");
        Thread.sleep(2000);

        driver.quit();
        Thread.sleep(5000);

    }

    //Table 24: Test case add new Discount Note Form (2)
    @Test
    public void FIMS_24() throws InterruptedException {
        // TODO Auto-generated method stub


        driver.get("https://fimsclone.kerisi.my/");
        Thread.sleep(1000);

        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys("ENTRY3");
        Thread.sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("qwertyuiop");
        Thread.sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        Thread.sleep(1000);

        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Discount Note")).click();
        Thread.sleep(1000);




        //click +New button 1
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/a")).click();
        Thread.sleep(3000);





        //click save button

        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[7]/div/div/button[2]")).click();
        Thread.sleep(3000);

//
//        // Get Text From Page
//        String ActualTitle = driver.findElement(By.xpath("/html/body/div[22]/div/div/div[2]")).getText();
//
//
//        System.out.println(ActualTitle);
//        // Expected Title
//        String ExpectedTitle = "Application failed to be summited";
//
//        // Assert to verify if test case is successful
//        Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);



        System.out.println("Test Case for add successful");

        driver.quit();
        Thread.sleep(5000);
    }

   // Table 25: Test case edit Discount Note Form
    @Test
    public void FIMS_25() throws InterruptedException {
        // TODO Auto-generated method stub


        driver.get("https://fimsclone.kerisi.my/");
        Thread.sleep(1000);

        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys("ENTRY3");
        Thread.sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("qwertyuiop");
        Thread.sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        Thread.sleep(1000);

        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Discount Note")).click();
        Thread.sleep(1000);

        //click search bar
        driver.findElement(By.xpath("//*[@id=\"DtArDiscountNoteList_filter\"]/label/input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/label/input")).sendKeys("SINTOK UTARA ENTERPRISE");
        Thread.sleep(2000);

        //click edit button 1
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[2]/td[13]/a[2]")).click();
        Thread.sleep(3000);



        // update Discount Note

        driver.findElement(By.xpath("//*[@id=\"txtAreaDesc\"]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[10]/textarea")).sendKeys("New Discount");
        Thread.sleep(1500);

        //click save button
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[7]/div/div/button[2]")).click();
        Thread.sleep(1500);


        try {
            Alert alert = driver.switchTo().alert();
            // Get text from the alert
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);

            // Perform assertions or other actions based on the alert text
            // Assert.assertEquals("Information was successfully saved.", alertText);

            // Accept the alert (click the "OK" button)
            alert.accept();
        } catch (Exception e) {
            // Handle NoAlertPresentException or other exceptions
            System.out.println("No alert found or other exception occurred: " + e.getMessage());
        }

        // Get Text From Page
        //String ActualTitle = driver.findElement(By.xpath("/html/body/div[22]/div/div/div[2]")).getText();
//
//
//    System.out.println(ActualTitle);
//    // Expected Title
//    String ExpectedTitle = "Information was successfully saved.\r\n"
//    		+ "";
//
//    // Assert to verify if test case is successful
//    Assert.assertEquals("The test passed",ExpectedTitle, ActualTitle);

//    //click save button
//    driver.findElement(By.xpath("/html/body/div[4]/form/div/div[7]/div/div/button[2]")).click();
//    Thread.sleep(1000);

        System.out.println("Test Case for edit successful");

        driver.quit();
        Thread.sleep(5000);

    }
    //Table 26: Test case for search in Discount Note (1)
    @Test
    public void FIMS_26() throws InterruptedException {
        navigateToLoginPage1();
        login2("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage2();
        navigateToDiscountNotePage2();
        searchDiscountNoteRecord2("D46279");
        verifySearchResults2("D46279");
    }

    private void navigateToLoginPage1() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
        sleep(1000);
    }

    private void login2(String username, String password)throws InterruptedException {
        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys(username);
        sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys(password);
        sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        sleep(5000);
    }

    private void navigateToAccountReceivablePage2() throws InterruptedException{
        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        sleep(1000);
    }

    private void navigateToDiscountNotePage2()throws InterruptedException {
        // Navigate to "Discount Note" page
        driver.findElement(By.linkText("Discount Note")).click();
        sleep(1000);

        // Click the Search bar field
        driver.findElement(By.xpath("//*[@id=\"DtArDiscountNoteList_filter\"]/label/input")).click();
        sleep(1000);
    }

    private void searchDiscountNoteRecord2(String searchKeyword) throws InterruptedException{
        // In the search bar, insert the provided search keyword
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/label/input")).sendKeys(searchKeyword);
        sleep(1000);
    }

    private void verifySearchResults2(String expectedTitle) throws InterruptedException{
        String actualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[4]/span")).getText();

        // Assert to verify if the test case is successful
        Assert.assertEquals("The test passed", expectedTitle, actualTitle);

        System.out.println("Test Case for Search successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

//Table 27: Test case for search in Discount Note (2)
    @Test
    public void FIMS_27() throws InterruptedException {
        navigateToLoginPage();
        login("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage();
        navigateToDiscountNotePage();
        searchDiscountNoteRecord("D46279");
        verifySearchResults("D46279");
    }

    private void navigateToLoginPage() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
        sleep(1000);
    }

    private void login(String username, String password)throws InterruptedException {
        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys(username);
        sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys(password);
        sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        sleep(5000);
    }

    private void navigateToAccountReceivablePage() throws InterruptedException{
        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        sleep(1000);
    }

    private void navigateToDiscountNotePage()throws InterruptedException {
        // Navigate to "Discount Note" page
        driver.findElement(By.linkText("Discount Note")).click();
        sleep(1000);

        // Click the Search bar field
        driver.findElement(By.xpath("//*[@id=\"DtArDiscountNoteList_filter\"]/label/input")).click();
        sleep(1000);
    }

    private void searchDiscountNoteRecord(String searchKeyword) throws InterruptedException{
        // In the search bar, insert the provided search keyword
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/label/input")).sendKeys(searchKeyword);
        sleep(1000);
    }

    private void verifySearchResults(String expectedTitle) throws InterruptedException{
        String actualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[4]/span")).getText();

        // Assert to verify if the test case is successful
        Assert.assertEquals("The test passed", expectedTitle, actualTitle);

        System.out.println("Test Case for Search successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

//Table 28: Test case download documents for Discount Note(1)
    @Test
    public void FIMS_28() throws InterruptedException {
        navigateToLoginPage3();
        login3("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage3();
        navigateToDiscountNotePage3();
        Select_Record3();
        click_dowloand_button3();
    }

    private void navigateToLoginPage3() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
        sleep(1000);
    }

    private void login3(String username, String password)throws InterruptedException  {
        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys(username);
        sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys(password);
        sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        sleep(5000);
    }

    private void navigateToAccountReceivablePage3() throws InterruptedException {
        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        sleep(1000);
    }

    private void navigateToDiscountNotePage3() throws InterruptedException {
        // Navigate to "Discount Note" page
        driver.findElement(By.linkText("Discount Note")).click();
        sleep(1000);

        // Click the Search bar field
        driver.findElement(By.xpath("//*[@id=\"DtArDiscountNoteList_filter\"]/label/input")).click();
        sleep(1000);
    }

    private void Select_Record3() throws InterruptedException {
        // In the search bar, insert the provided search keyword
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[14]/div/label")).click();
        sleep(1000);
    }

    private void click_dowloand_button3() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/div[2]")).click();
        sleep(1000);

        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/div[1]")).click();
        sleep(1000);

//    	String actualMessage = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr/td/a")).getText();
//
//        // Expected Message
//        String expectedMessage = "No records";
//
//        // Assert to verify if the test case is successful
//        Assert.assertEquals("The test passed", expectedMessage, actualMessage);

        System.out.println("Test Case successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

    @Test
    public void FIMS_28_2() throws InterruptedException {
        navigateToLoginPage3();
        login3("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage3();
        navigateToDiscountNotePage3();
        Select_Record3();
        click_dowloand_DC1();
    }

    private void click_dowloand_DC1() throws InterruptedException {


        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/div[1]")).click();
        sleep(1000);

        System.out.println("Test Case successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

    //Table 29: Test case download documents for Discount Note(2)
    @Test
    public void FIMS_29() throws InterruptedException {
        navigateToLoginPage4();
        login4("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage4();
        navigateToDiscountNotePage4();
        //Select_Record();
        click_dowloand_button4();
    }

    private void navigateToLoginPage4() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
        sleep(1000);
    }

    private void login4(String username, String password)throws InterruptedException  {
        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys(username);
        sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys(password);
        sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        sleep(5000);
    }

    private void navigateToAccountReceivablePage4() throws InterruptedException {
        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        sleep(1000);
    }

    private void navigateToDiscountNotePage4() throws InterruptedException {
        // Navigate to "Discount Note" page
        driver.findElement(By.linkText("Discount Note")).click();
        sleep(1000);


    }

    private void Select_Record() throws InterruptedException {
        // In the search bar, insert the provided search keyword
//        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[14]/div/label")).click();
//        sleep(1000);
    }

    private void click_dowloand_button4() throws InterruptedException {


        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/div[1]")).click();
        sleep(1000);

//    	String actualMessage = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr/td/a")).getText();
//
//        // Expected Message
//        String expectedMessage = "No records";
//
//        // Assert to verify if the test case is successful
//        Assert.assertEquals("The test passed", expectedMessage, actualMessage);

        System.out.println("Test Case successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

    @Test
    public void FIMS_29_2() throws InterruptedException {
        navigateToLoginPage();
        login("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage();
        navigateToDiscountNotePage();
        // Select_Record();
        click_dowloand_DC();
    }

    private void click_dowloand_DC() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[3]/div[1]")).click();
        sleep(1000);

        System.out.println("Test Case successful");
        sleep(5000);

        driver.quit();
        Thread.sleep(5000);
    }

//Table 30: Test case Test view Discount Note data
    @Test
    public void FIMS_30() throws InterruptedException {
        navigateToLoginPage5();
        login5("ENTRY3", "qwertyuiop");
        navigateToAccountReceivablePage5();
        navigateToDiscountNotePage5();

        click_view_button5();
        check_test_case5();
    }

    private void navigateToLoginPage5() throws InterruptedException {
        driver.get("https://fimsclone.kerisi.my/");
        sleep(1000);
    }

    private void login5(String username, String password)throws InterruptedException  {
        // Input Email
        driver.findElement(By.xpath("//*[@id=\"userID\"]")).sendKeys(username);
        sleep(1000);

        // Input Password
        driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys(password);
        sleep(1000);

        // Click Login
        driver.findElement(By.xpath("/html/body/div/div/form/input")).click();
        sleep(5000);
    }

    private void navigateToAccountReceivablePage5() throws InterruptedException {
        // Navigate to "Account Receivable" page (assuming it's a link)
        driver.findElement(By.xpath("//a[contains(text(),'Account Receivable')]")).click();
        sleep(1000);
    }

    private void navigateToDiscountNotePage5() throws InterruptedException {
        // Navigate to "Discount Note" page
        driver.findElement(By.linkText("Discount Note")).click();
        sleep(2000);


    }

    private void click_view_button5() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[13]/a[1]/i")).click();
        sleep(2000);
    }

    private void check_test_case5() throws InterruptedException {


//    	 String ActualTitle = driver.findElement(By.xpath("/html/body/div[4]/form/div/div[1]/div[2]/div[1]/input")).getAttribute("value");
//        // Expected Message
//       String expectedMessage = "DCR00379/22";
////
//      // Assert to verify if the test case is successful
//        Assert.assertEquals("The test passed", expectedMessage, ActualTitle);

        System.out.println("Test Case successful");
        sleep(5000);


    }


    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    private void sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
}