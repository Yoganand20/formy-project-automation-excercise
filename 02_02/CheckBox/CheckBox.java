import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDr
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        //find element using id
        WebElement radioButton1=driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(2000);

        //find element using value of the element
        WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(2000);

        //find element using xpath
        WebElement radioButton3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
