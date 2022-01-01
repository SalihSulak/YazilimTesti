package com.hipet.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegisterTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Salih\\Downloads\\chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.amazon.com.tr/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.tr%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=trflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";

		driver.get(baseUrl);
		
		WebElement nameSurname = driver.findElement(By.id("ap_customer_name"));
		WebElement email = driver.findElement(By.id("ap_email"));
		WebElement password = driver.findElement(By.id("ap_password"));
		WebElement passwordCheck = driver.findElement(By.id("ap_password_check"));
		WebElement kayitOlButonu = driver.findElement(By.id("continue"));

        nameSurname.sendKeys("HiPet Team");
        email.sendKeys("hipetteam@gmail.com");
        password.sendKeys("HiPetTeam321");
        passwordCheck.sendKeys("HiPetTeam321");
        kayitOlButonu.click();
        

	}

}
