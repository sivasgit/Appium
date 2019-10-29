import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class WheelersPicker {


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
        driver.findElementByAccessibilityId("wheeler").click();
        List <WebElement> values = driver.findElementsById("wheels");
        String val1 = values.get(0).getAttribute("value");
        String val2 = values.get(1).getAttribute("value");
        String val3 = values.get(2).getAttribute("value");
        System.out.println(val1 + " " + val2 + " " + val3);
        //input the values
        values.get(0).sendKeys("20");
        values.get(1).sendKeys("100");
        values.get(2).sendKeys("300");

    }

}
