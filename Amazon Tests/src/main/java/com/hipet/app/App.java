package com.hipet.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Salih\\Downloads\\chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.amazon.com.tr";

        driver.get(baseUrl);
        WebElement girisButonu = driver.findElement(By.linkText("Giriþ yap"));
        girisButonu.click();

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("hipetteam@gmail.com");
        
        WebElement devamButonu = driver.findElement(By.id("continue"));
        devamButonu.click(); 

        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("HiPetTeam321");

        WebElement girisYapButonu = driver.findElement(By.id("signInSubmit"));
        girisYapButonu.click();
        
        WebElement username = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        
        if(username.getText().equals("HiPet")) 
        	System.out.println("Test Passed");
        
        else
        	System.out.println("Test Failed");
       
        
    }
}
