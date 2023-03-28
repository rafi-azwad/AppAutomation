package SearchPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class PaymentPage {

   AndroidDriver driver;
    public PaymentPage(AndroidDriver driver) {
        this.driver = driver;
    }
    public void paymentClick() {
        driver.findElement(By.xpath("//*[@text='Make Payment']")).click();
    }
    public void paymentInfo(String phn, String name, String amount) throws InterruptedException {
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.xpath("//*[@text='Phone']"));
        phone.click();
        phone.sendKeys(phn);
        Thread.sleep(2000);
        WebElement nm = driver.findElement(By.xpath("//*[@text='Name']"));
        nm.click();
        nm.sendKeys(name);
        Thread.sleep(2000);
        WebElement amt = driver.findElement(By.xpath("//*[@text='Amount']"));
        amt.click();
        amt.sendKeys(amount);

    }
    public void selectCou() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Select']")).click();

        TouchAction touchAction =new TouchAction(driver);
        touchAction.press(PointOption.point(857, 442)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(585))).moveTo(PointOption.point(857,119)).release().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Bangladesh']")).click();
    }
    public void sendButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Send Payment']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
