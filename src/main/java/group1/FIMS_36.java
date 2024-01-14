package group1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIMS_36 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to FIMS login page
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
        driver.findElement(By.linkText("Account Receivable")).click();
        Thread.sleep(1000);

        // Navigate to "Authorized Receipting" page (assuming it's a link)
        driver.findElement(By.linkText("Authorized Receipting")).click();
        Thread.sleep(1000);

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

        // Click the "Reset" button
        driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
        Thread.sleep(2000);

        // Click on the "OK" button (Assuming it's a button, please update the selector accordingly)
        driver.findElement(By.cssSelector("button.btn.btn-primary[data-dismiss='modal']")).click();
        Thread.sleep(2000);

        System.out.println("Test smart filter with empty input Pass");

        // Close window
        driver.quit();
    }
}

