import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        //Thread.sleep(1000);
        WebDriverWait wait=new WebDriverWait(driver,10);

        Thread.sleep(3000);

        //WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        //autocompleteResult.click();
        WebElement okButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dismissButton")));//driver.findElement(By.className("dismissButton"));
        okButton.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
