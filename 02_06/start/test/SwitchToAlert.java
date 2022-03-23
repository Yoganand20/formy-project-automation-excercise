import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //find the button which will open the alert window and click on that button
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();

        //create a new variable and find and assign the newly open alert window to it
        Alert alert= driver.switchTo().alert();

        //Thread.sleep(3000);

        //accept the alert using accept method.
        alert.accept();
        //Thread.sleep(3000);

        driver.quit();
    }
}
