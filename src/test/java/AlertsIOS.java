import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class AlertsIOS {


    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "XCUITest");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 8");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "iOS");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , 11.0);
        //dc.setBrowserName(MobileCapabilityType.APP,"App.location");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //ios
        IOSDriver driver = new IOSDriver(url , dc);

        //to find element with the name
        driver.findElementByAccessibilityId("alert").click();
        driver.findElementByAccessibilityId("ok").click();
        driver.findElementByAccessibilityId("ok").click();

    }

}
