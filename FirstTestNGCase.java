import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FirstTestNGCase {
    WebDriver driver;
    @Test(priority = 1)
    void Openbrowser ()

    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\modin\\IdeaProjects\\TestNGFramework\\src\\test\\resources\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }
    @Test(priority = 2)
    void login(){
        driver.findElement(By.className("ico-login"));
        driver.findElement(By.className("email")).sendKeys("modinimesh.btech@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("modi2345");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
    @Test(priority = 3)
    void closeBrowser() throws InterruptedException{
        driver.quit();
    }
    }


