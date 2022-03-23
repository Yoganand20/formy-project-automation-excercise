import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        //find element using id
        WebElement checkBox1=driver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        Thread.sleep(2000);

        //find element using value of the element
        WebElement checkBox2=driver.findElement(By.id("checkbox-2"));
        checkBox2.click();
        Thread.sleep(2000);

        //find element using xpath
        WebElement checkBox3=driver.findElement(By.id("checkbox-3"));
        checkBox3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
