import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework16 extends BaseTest {
    @Test //Mariia Grishchenko
    public static void registrationNavigation() throws InterruptedException {
        //Precondition: Chrome broweser should be open
        //Step 1: Click on Registration link
        //Expexted result: User redirected to Registration page

        WebDriver driver = new ChromeDriver();
        String url = "https://bbb.testpro.io/";
        driver.get(url);

        //Find Registration link
        WebElement registrationLink = driver.findElement(By.cssSelector("#hel"));
        //Click on Registration link
        registrationLink.click();

        WebElement registerButton = driver.findElement(By.cssSelector("[type='submit']"));
        Assert.assertTrue(registerButton.isDisplayed());

        driver.quit();


    }
}
