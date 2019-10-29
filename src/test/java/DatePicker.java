import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DatePicker {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "XCUITest");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME , "iPhone 8");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "iOS");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , 11.0);
        dc.setCapability("bundileId" , "com.example.applie-samplecode.UICatalog");
        //dc.setBrowserName(MobileCapabilityType.APP,"App.location");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        //ios
        IOSDriver driver = new IOSDriver(url , dc);

        //date picker
        driver.findElementByAccessibilityId("datepicker").click();

        List <WebElement> values = driver.findElementsByXPath("//dte");
        for ( int i = 0; i < values.size(); i++ ) {
            System.out.println(values.get(i).getText());

        }
        values.get(0).sendKeys("June 3");
        values.get(0).sendKeys(Keys.TAB);
        values.get(1).sendKeys("8");
        values.get(1).sendKeys(Keys.TAB);
        values.get(2).sendKeys("9");

    }

}
