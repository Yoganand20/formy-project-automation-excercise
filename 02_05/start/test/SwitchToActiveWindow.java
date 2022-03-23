import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver_99.0.4844.51.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        //to open and switch to new windows
        //open a new tab
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        //store handle of the original window
        String originalHandle = driver.getWindowHandle();


        //check if we have any other windows open already
        //        assert driver.getWindowHandles().size()==1;

        //go through the window list till we find the newly opened window
        for(String handle: driver.getWindowHandles()){
            if(!originalHandle.contentEquals(handle)) {
                driver.switchTo().window(handle);
                Thread.sleep(5000);

            }
        }
        //close the tab
        driver.close();

        //Thread.sleep(5000);

        //switch to original window
        driver.switchTo().window(originalHandle);

        //driver.quit();
    }
}
