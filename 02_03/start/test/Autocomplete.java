import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete_Field=driver.findElement(By.id("autocomplete"));

        autocomplete_Field.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //test are run extremely fast due to which the autocompleteResult element is displayed on web browser
        //after the test is performed. to solve this issue we use sleep method to stop the test execution for some time.

        Thread.sleep(1000);

        //find the element and click
        //cannot execute the below steps due to some error on webpage
        //WebElement autoCompleteResult = driver.findElement(By.className("pac-item"));
        //autoCompleteResult.click();

        WebElement autoCompleteDismiss = driver.findElement(By.className("dismissButton"));
        autoCompleteDismiss.click();



        driver.quit();
    }
}
