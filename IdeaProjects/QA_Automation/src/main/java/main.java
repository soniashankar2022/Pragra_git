import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
    public static void main(String[] args) {
        WebDriver driver;
       //System.setProperty("webdriver.Chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.google.com/");

    }
}
