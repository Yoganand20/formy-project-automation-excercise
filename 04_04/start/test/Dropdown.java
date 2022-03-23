import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenu=driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();
        Thread.sleep(1000);//wait for the dropdown menu to open
        WebElement dropdownItem=driver.findElement(By.id("autocomplete"));
        dropdownItem.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
