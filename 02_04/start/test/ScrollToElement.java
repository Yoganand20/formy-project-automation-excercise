import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name= driver.findElement(By.id("name"));


        //to perform scroll action on page
        //create an instance of Actions object. remember to it is Actions ( plural) and not Action (singular)
        //initialize it with contructor and app the driver object to tell the Actions object the driver to use to perform the action.
        Actions actions = new Actions(driver);

        //execute required action by invoking appropriate method/function
        //the below method tell the actions object to scroll to the element with id=name.
        actions.moveToElement(name);

        name.sendKeys("Yoganand Parab");

        WebElement date = driver.findElement(By.id("date"));
        //note: need to look into how to enter date in field with a date picker.
        date.sendKeys("01/01/2022");

        //Thread.sleep(5000);
        driver.quit();
    }
}
