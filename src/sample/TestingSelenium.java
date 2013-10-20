package sample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingSelenium {

 
  @Test
  public void gmail() {
    // TODO Auto-generated method stub    
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.gmail.com");
    String title = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/h1")).getText();
    Assert.assertTrue(title.equals("Gmail"),"Hurray! its GMail");
       
     // System.out.println("Oops! we are at wrong place");
  
    driver.quit(); 
  }

}
