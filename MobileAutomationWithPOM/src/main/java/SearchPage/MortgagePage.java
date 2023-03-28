package SearchPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
public class MortgagePage {
    AndroidDriver driver;
    public MortgagePage(AndroidDriver driver) {
        this.driver = driver;
    }
    public void mortgageRequest() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Mortgage Request']")).click();
    }
    public void mortgageInfo(String fn, String ln,String age, String ad1, String ad2) throws InterruptedException {
        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.xpath("//*[@text='First Name']"));
        firstname.click();
        firstname.sendKeys(fn);
        Thread.sleep(2000);
        WebElement lastname = driver.findElement(By.xpath("//*[@text='Last Name']"));
        lastname.click();
        lastname.sendKeys(ln);
        Thread.sleep(2000);
        WebElement ag = driver.findElement(By.xpath("//*[@text='Age']"));
        ag.click();
        ag.sendKeys(age);
        Thread.sleep(2000);
        WebElement address1 = driver.findElement(By.xpath("//*[@text='Address 1']"));
        address1.click();
        address1.sendKeys(ad1);
        Thread.sleep(2000);
        WebElement address2 = driver.findElement(By.xpath("//*[@text='Address 2']"));
        address2.click();
        address2.sendKeys(ad2);
    }
    public void selCountry() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Select']")).click();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(746, 530)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(585))).moveTo(PointOption.point(746, 207)).release().perform();
        driver.findElement(By.xpath("//*[@text='Bangladesh']")).click();

    }
    public void nextButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Next']")).click();
    }
    public void selectOtherInfo() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Personal']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='10']")).click();

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(427, 1124)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(585))).moveTo(PointOption.point(427, 179)).release().perform();
        driver.findElement(By.xpath("//*[@text='Private Job']")).click();
        driver.findElement(By.xpath("//*[@text='500000']")).click();

    }
    public void saveButton() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='Save']")).click();
    }
}
