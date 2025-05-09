package base;


import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;
    public static Properties prop;

    public WebDriver initialize() {
//        try {
//            prop = new Properties();
//            FileInputStream fis = new FileInputStream("config/config.properties");
//            prop.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

       // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.manage().window().maximize();
        return this.driver ;
    }

    public void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}

