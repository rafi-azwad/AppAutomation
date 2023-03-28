package SearchPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
public class ExpensePage {
    AndroidDriver driver;
    public ExpensePage(AndroidDriver driver){
        this.driver = driver;
    }
    public void clickExpense() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Expense Report']")).click();
    }
    public void addExpense() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Add']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Add']")).click();

    }
    public void backButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Back']")).click();
    }
    public void logOut() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Logout']")).click();
    }
}
