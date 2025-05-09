package selenium_Maven;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class OpenBrowser {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://letcode.in/");
//        System.out.println(driver.getCurrentUrl());
//	}
	@Test
	public void openBrower1() {
		 WebDriver driver=new ChromeDriver();
          driver.get("https://letcode.in/");
        System.out.println(driver.getCurrentUrl());
	}
	
	
    
}
