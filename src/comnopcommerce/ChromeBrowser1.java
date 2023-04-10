package comnopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F/";
        // set up chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // Enter email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Ssp123@gmail.com");

        // Enter password to password field

        driver.findElement(By.name("Password")).sendKeys("Ssp1234");

        // Close the browser
        driver.close();


    }
}
