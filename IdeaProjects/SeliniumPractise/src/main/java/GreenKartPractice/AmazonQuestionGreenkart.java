package GreenKartPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AmazonQuestionGreenkart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] veggies = {"Cucumber", "Brocolli", "Cauliflower","Raspberry"};

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        Thread.sleep(4000);
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            String[] spilt = name.split("-");
            String vegetablename = spilt[0].trim();

            //convert array to arraylist
            //check whether the name is present in the array or not
            int j = 0;
            List items = Arrays.asList(veggies);

            if (items.contains(vegetablename)) {
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j == veggies.length) {
                    break;
                }

            }


        }
    }
}

