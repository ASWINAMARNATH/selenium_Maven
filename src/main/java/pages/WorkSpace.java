package pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorkSpace {
     public WebDriver driver;
     
     public WorkSpace(WebDriver driver){
    	 this.driver=driver;
     }
     
    //WebElement workSpaceElement= driver.findElement(By.xpath("//a[text()='Work-Space']"));
	
     public void clickWorkSpace(){
    	 Properties prop = null;
    	 try {
           prop = new Properties();
           FileInputStream fis = new FileInputStream("tests/testdata.properties");
           prop.load(fis);
       } catch (IOException e) {
           e.printStackTrace();
       }
    	 String url=prop.getProperty("url");
    	 driver.get(url);
    	 WebElement workSpaceElement= driver.findElement(By.xpath("//a[text()='Work-Space']"));
    	 workSpaceElement.click();
     }
}
