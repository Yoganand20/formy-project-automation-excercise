import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileuploadField=driver.findElement(By.id("file-upload-field"));
        fileuploadField.sendKeys("file-to-upload.png");

        Thread.sleep(3000);
        driver.quit();
    }
}
