import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        //2 JavascriptExecutor Methods
        //i. executeAsyncScript - must signal their end using provided callback
        //ii.executeScript -


        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        //put thread to sleep so that pop up is opened before performing any action on it.
        Thread.sleep(500);

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton);


        driver.quit();
    }
}
