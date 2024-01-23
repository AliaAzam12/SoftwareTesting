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

public class Chan_286596 {
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


    //Test smart filter for search by Staff code
    @Test
    public void FIMS_31() throws InterruptedException {
            // Click on the "Smart Filter" button
            driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
            Thread.sleep(2000);

            // Click on the "Staff" search bar arrow
            WebElement staffSearchArrow = driver.findElement(By.cssSelector("span.select2-selection__arrow"));
            staffSearchArrow.click();
            Thread.sleep(2000);

            // Input "1478" into the "Staff" search bar
            WebElement staffSearchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
            staffSearchInput.sendKeys("1478");
            Thread.sleep(2000);

            // Wait for the result to appear
            List<WebElement> results = driver.findElements(By.cssSelector("li.select2-results__option"));

            // Click on the first result if available
            if (!results.isEmpty()) {
                results.get(0).click();
                Thread.sleep(2000);
            }

            // Click on the "OK" button
            driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
            Thread.sleep(3000);

            try {
                // Get Text From Page
                WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
                String actualText = anyEmptyCell.getText();

                // Expected Text
                String expectedText = "No records";

                // Assert that the "No records" message is present anywhere on the page
                Assert.assertEquals("Page content does not match", expectedText, actualText);
                System.out.println("Test smart filter for search by Staff code is Valid");
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("Entire page search test failed: " + e.getMessage());
            }

    }


    //Test smart filter for search by Staff name
    @Test
    public void FIMS_32() throws InterruptedException {
            // Click on the "Smart Filter" button
            driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
            Thread.sleep(2000);

            // Click on the "Staff" search bar arrow
            WebElement staffSearchArrow = driver.findElement(By.cssSelector("span.select2-selection__arrow"));
            staffSearchArrow.click();
            Thread.sleep(2000);

            // Input "1478" into the "Staff" search bar
            WebElement staffSearchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
            staffSearchInput.sendKeys("Nor Laily Binti Hashim");
            Thread.sleep(2000);

            // Wait for the result to appear
            List<WebElement> results = driver.findElements(By.cssSelector("li.select2-results__option"));

            // Click on the first result if available
            if (!results.isEmpty()) {
                results.get(0).click();
                Thread.sleep(2000);
            }

            // Click on the "OK" button
            driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
            Thread.sleep(2000);

            try {
                // Get Text From Page
                WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
                String actualText = anyEmptyCell.getText();

                // Expected Text
                String expectedText = "No records";

                // Assert that the "No records" message is present anywhere on the page
                Assert.assertEquals("Page content does not match", expectedText, actualText);
                System.out.println("Test smart filter for search by Staff name is Valid");
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("Entire page search test failed: " + e.getMessage());
            }

        }

    //Test smart filter for search by PTJ code
    @Test
    public void FIMS_33() throws InterruptedException {
            // Click on the "Smart Filter" button
            driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
            Thread.sleep(2000);

            // Click on the arrow to open the search bar
            driver.findElement(By.cssSelector("span#select2-oun_code_ptj-container + span.select2-selection__arrow")).click();
            Thread.sleep(1000);

            // Input "S10800" into the search bar
            WebElement searchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
            searchInput.sendKeys("S10800");
            Thread.sleep(1000);

            // Wait for the result to appear
            List<WebElement> results = driver.findElements(By.cssSelector("li.select2-results__option"));

            // Click on the first result if available
            if (!results.isEmpty()) {
                results.get(0).click();
                Thread.sleep(1000);
            }

            // Click on the "OK" button
            driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
            Thread.sleep(2000);

            try {
                // Get Text From Page
                WebElement targetCell = driver.findElement(By.cssSelector("td.small-column[key='oun_code_ptj']"));
                String actualText = targetCell.getText();

                // Expected Text
                String expectedText = "S10800";

                // Assert that the expected text is present in the specified <td> element
                Assert.assertEquals("Page content does not match", expectedText, actualText);

                System.out.println("Test smart filter for search by PTJ code is Valid");
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("Entire page search test 2 failed: " + e.getMessage());
            }
        }

   //Test smart filter for search by PTJ types
   @Test
    public void FIMS_34() throws InterruptedException {
            // Click on the "Smart Filter" button
            driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
            Thread.sleep(3000);

            // Click on the arrow to open the search bar
            driver.findElement(By.cssSelector("span#select2-oun_code_ptj-container + span.select2-selection__arrow")).click();
            Thread.sleep(1000);

            // Input "S10800" into the search bar
            WebElement searchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
            searchInput.sendKeys("UUMIT");
            Thread.sleep(1000);

            // Wait for the result to appear
            List<WebElement> results = driver.findElements(By.cssSelector("li.select2-results__option"));

            // Click on the first result if available
            if (!results.isEmpty()) {
                results.get(0).click();
                Thread.sleep(1000);
            }

            // Click on the "OK" button
            driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
            Thread.sleep(2000);

            try {
                // Get Text From Page
                WebElement targetCell = driver.findElement(By.cssSelector("td.small-column[key='oun_code_ptj']"));
                String actualText = targetCell.getText();

                // Expected Text
                String expectedText = "S10800";

                // Assert that the expected text is present in the specified <td> element
                Assert.assertEquals("Page content does not match", expectedText, actualText);

                System.out.println("Test smart filter for search by PTJ types is Valid");
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail("Entire page search test  failed: " + e.getMessage());
            }
        }

    //Test smart filter for search by “Entry” Status
    @Test
    public void FIMS_35() throws InterruptedException {
        try {
            // Click on the "Smart Filter" button
            driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
            Thread.sleep(2000);

            // Click on the arrow to open the search bar
            driver.findElement(By.cssSelector("span#select2-are_status-container + span.select2-selection__arrow")).click();
            Thread.sleep(1000);

            // Assuming 'ENTRY' is one of the results, click on it
            driver.findElement(By.xpath("//li[contains(text(), 'ENTRY')]")).click();
            Thread.sleep(1000);


            // Click on the "OK" button (Assuming it's a button, please update the selector accordingly)
            driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
            Thread.sleep(2000);

            entirePageSearchTest3();

            System.out.println("Test smart filter for search by “Entry” Status Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Test failed: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }

    //Test smart filter with empty input
    @Test
    public void FIMS_36() throws InterruptedException {
        try{
        // Click on the "Smart Filter" button
        driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
        Thread.sleep(2000);

        // Click on the "Staff" search bar arrow
        WebElement staffSearchArrow = driver.findElement(By.cssSelector("span.select2-selection__arrow"));
        staffSearchArrow.click();
        Thread.sleep(1000);

        // Input "1478" into the "Staff" search bar
        WebElement staffSearchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
        staffSearchInput.sendKeys("1478");
        Thread.sleep(1000);

        // Wait for the result to appear
        List<WebElement> results = driver.findElements(By.cssSelector("li.select2-results__option"));

        // Click on the first result if available
        if (!results.isEmpty()) {
            results.get(0).click();
            Thread.sleep(1000);
        }

        // Click on the arrow to open the search bar
        driver.findElement(By.cssSelector("span#select2-oun_code_ptj-container + span.select2-selection__arrow")).click();
        Thread.sleep(1000);

        // Input "S10800" into the search bar
        WebElement searchInput = driver.findElement(By.cssSelector("input.select2-search__field"));
        searchInput.sendKeys("S10800");
        Thread.sleep(1000);

        // Wait for the result to appear
        List<WebElement> results1 = driver.findElements(By.cssSelector("li.select2-results__option"));

        // Click on the first result if available
        if (!results1.isEmpty()) {
            results1.get(0).click();
            Thread.sleep(1000);
        }

        // Click on the arrow to open the search bar
        driver.findElement(By.cssSelector("span#select2-are_status-container + span.select2-selection__arrow")).click();
        Thread.sleep(1000);

        // Assuming 'ENTRY' is one of the results, click on it
        driver.findElement(By.xpath("//li[contains(text(), 'ENTRY')]")).click();
        Thread.sleep(1000);

        // Click on the "OK" button
        driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
        Thread.sleep(2000);

        // Click on the "Smart Filter" button
        driver.findElement(By.cssSelector("span#dt_listing_smartFilter")).click();
        Thread.sleep(2000);

        // Click the "Reset" button
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        Thread.sleep(2000);

        // Click on the "OK" button
        driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
        Thread.sleep(2000);

        System.out.println("Test smart filter with empty input Valid");
    } catch (Exception e) {
        e.printStackTrace();
        Assert.fail("Test failed: " + e.getMessage());
    } finally {
        if (driver != null) {
            driver.quit();
        }
    }
}

    //Test sensitivity search function with uppercase
    @Test
    public void FIMS_37() throws InterruptedException {
        // Locate the search bar element
        WebElement searchBar = driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        Thread.sleep(1000);

        // Input "NORIZA" into the search bar
        searchBar.sendKeys("NORIZA");
        Thread.sleep(4000);

        // Assuming the highlighted class is named "highlight"
        String highlightedClass = "highlight";

        // Locate the elements that may contain the highlighted text
        java.util.List<WebElement> highlightedElements = driver.findElements(By.cssSelector("." + highlightedClass));

        // Assert that at least one element with the highlighted class is found
        Assert.assertTrue("No element with class '" + highlightedClass + "' found.", highlightedElements.size() > 0);

        // Flag to check if the expected text is highlighted
        boolean isExpectedTextHighlighted = false;

        // Iterate through each highlighted element to check the text
        for (WebElement element : highlightedElements) {
            // Check if the text contains "NORIZA"
            if (element.getText().contains("NORIZA")) {
                isExpectedTextHighlighted = true;
                System.out.println("Test sensitivity search function with uppercase is Valid");
                break; // Break the loop if found

            }
        }

        // Assert if the expected text is highlighted
        Assert.assertTrue("Text 'NORIZA' is not highlighted.", isExpectedTextHighlighted);
    }


    //Test sensitivity search function with lowercase
    @Test
    public void FIMS_38() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        Thread.sleep(1000);

        // Input "NORIZA" into the search bar
        searchBar.sendKeys("noriza");
        Thread.sleep(4000);

        // Assuming the highlighted class is named "highlight"
        String highlightedClass = "highlight";

        // Locate the elements that may contain the highlighted text
        java.util.List<WebElement> highlightedElements = driver.findElements(By.cssSelector("." + highlightedClass));

        // Assert that at least one element with the highlighted class is found
        Assert.assertTrue("No element with class '" + highlightedClass + "' found.", highlightedElements.size() > 0);

        // Flag to check if the expected text is highlighted
        boolean isExpectedTextHighlighted = false;

        // Iterate through each highlighted element to check the text
        for (WebElement element : highlightedElements) {
            // Check if the text contains "NORIZA"
            if (element.getText().contains("NORIZA")) {
                isExpectedTextHighlighted = true;
                System.out.println("Test sensitivity search function with lowercase is Valid");
                break; // Break the loop if found

            }
        }

        // Assert if the expected text is highlighted
        Assert.assertTrue("Text 'NORIZA' is not highlighted.", isExpectedTextHighlighted);
    }


    //Test sensitivity search function with insert wildcard characters
    @Test
    public void FIMS_39() throws InterruptedException {
        WebElement searchBar = driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        Thread.sleep(1000);

        // Input "NORIZA" into the search bar
        searchBar.sendKeys("*@#");
        Thread.sleep(4000);

        try {
            // Get Text From Page
            WebElement anyEmptyCell = driver.findElement(By.cssSelector("td.dataTables_empty"));
            String actualText = anyEmptyCell.getText();

            // Expected Text
            String expectedText = "No records";

            // Assert that the "No records" message is present anywhere on the page
            Assert.assertEquals("Page content does not match", expectedText, actualText);
            System.out.println("Test sensitivity search function with insert wildcard characters Valid");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test failed: " + e.getMessage());
        }

    }

    // Test clear search bar
    @Test
    public void FIMS_40() throws InterruptedException {
        try{
        // Locate the search bar element
        WebElement searchBar = driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        Thread.sleep(1000);

        // Input "*@#" into the search bar
        searchBar.sendKeys("*@#");
        Thread.sleep(1000);

        // Clear the existing input in the search bar character by character
        for (int i = 0; i < 3; i++) {
            searchBar.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(4000);
        }

        entirePageSearchTest3();

        System.out.println("Test clear search bar Valid");
    } catch (Exception e) {
        e.printStackTrace();
        Assert.fail("Test clear search bar failed: " + e.getMessage());
    } finally {
        if (driver != null) {
            driver.quit();
        }
    }
    }


    private void entirePageSearchTest3() {
        try {
            // Get Text From Page
            WebElement targetCell = driver.findElement(By.cssSelector("td.small-column[key='oun_code_ptj']"));
            String actualText = targetCell.getText();

            // Expected Text
            String expectedText = "S10800";

            // Assert that the expected text is present in the specified <td> element
            Assert.assertEquals("Page content does not match", expectedText, actualText);

        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Entire page search test 2 failed: " + e.getMessage());
        }
    }
    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}


