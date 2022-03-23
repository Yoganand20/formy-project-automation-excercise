import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        //Find id of the div in which image is present.
        WebElement imageDiv= driver.findElement(By.id("image"));

        //Find id of the div in which image should be dropped.
        WebElement dropBox = driver.findElement(By.id("box"));

        Actions actions =new Actions(driver);
        actions.dragAndDrop(imageDiv,dropBox).build().perform();


        Thread.sleep(5000);





        driver.quit();
    }
}

