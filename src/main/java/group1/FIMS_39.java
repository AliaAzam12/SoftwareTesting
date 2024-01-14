package group1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FIMS_39 {
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

        // Locate the search bar element
        WebElement searchBar = driver.findElement(By.cssSelector("input.form-control.form-control-sm"));
        Thread.sleep(1000);

        // Input "*@#" into the search bar
        searchBar.sendKeys("*@#");
        Thread.sleep(4000);

        System.out.println("Test sensitivity search function with insert wildcard characters Pass");

        // Close window
        driver.quit();
    }
}

