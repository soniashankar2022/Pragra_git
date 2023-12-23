import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
     driver.findElement(By.xpath("//a[@value='BLR']")).click();
     //////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']
     Thread.sleep(5000);
     //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] ")).click();
    }
}