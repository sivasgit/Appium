import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class VerticalScroll {


    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , 10.0);
        //dc.setBrowserName(MobileCapabilityType.APP,"App.location");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver <WebElement> driver = new AndroidDriver <WebElement>(url , dc);

        //Vertical scroll

        driver.findElementById("id").click();
        String s = driver.findElementById("text").getText();
        System.out.println(s);
        TouchAction touchAction = new TouchAction(( MobileDriver ) driver);
        touchAction.longPress(ElementOption.element(pro)).moveTo(ElementOption.element(pro , 250 , 250)).release().perform();
        String s1 = driver.findElementById("text").getText();
        System.out.println("here we will get new value on screen" + s1);
        driver.quit();

    }

}


}
