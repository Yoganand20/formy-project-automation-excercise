import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        //set chromedriver location. webdriver allows are code to connect to the web browser and perform steps
        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        //create a new instance of webdriver(chromedriver) with name driver
        WebDriver driver = new ChromeDriver();

        //set the web page/server to access to run the tests
        driver.get("https://formy-project.herokuapp.com/keypress");

        //locate html element on bage using id and assign it to object of type WebElement.
        WebElement tb_Name= driver.findElement(By.id("name"));

        //emulate mouse click on text box
        tb_Name.click();

        //emulate keyboard keystroke to the name field
        tb_Name.sendKeys("Yoganand Parab");

        WebElement btn_Button=driver.findElement(By.id("button"));

        btn_Button.click();

        driver.quit();
    }
}
