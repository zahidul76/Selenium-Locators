package Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SalesForceLoginFunctionality {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

//        Thread.sleep(500);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.MICROSECONDS);
        driver.navigate().to("https://salesforce.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("abd234");
//        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        driver.findElement(By.cssSelector("#Login")).click();


        String title = driver.getTitle();
        System.out.println("The title of the application is : "+ title);

//             driver.close();
//             driver.quit();

        System.out.println("The Test successfully completed");


    }
}
