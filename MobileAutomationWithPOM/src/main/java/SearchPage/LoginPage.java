package SearchPage;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public static AndroidDriver driver;
    public LoginPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void userInformation(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Username']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Username']")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Password']")).sendKeys(password);

    }
    public void clickLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Login']")).click();
    }
    public void getText() throws InterruptedException {
        Thread.sleep(2000);
        String msg = driver.findElement(By.xpath("//*[@text='Your balance is: 100.00$']")).getText();
        System.out.println("Successful message: "+msg);
    }

}
