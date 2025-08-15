import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class GooglePageTest {

    public static void main (String []args) throws MalformedURLException {

        WebDriver delegate = new ChromeDriver();
        SelfHealingDriver driver = SelfHealingDriver.create((WebDriver) delegate);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//a[text()='About']")).click();


    }
}
