import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class AllButtonActions {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , 10.0);
        //dc.setBrowserName(MobileCapabilityType.APP,"App.location");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver <WebElement> driver = new AndroidDriver <WebElement>(url , dc);

        //selecting the element with the help of index
        driver.findElementsById("id").get(2).click();//give index no.

        //control just selecting next element
        driver.findElementsById("id").get(2).click();
        //to find element with the name
        driver.findElementByAccessibilityId("10 Dark ").click();

        //text box
        driver.findElementById("id").sendKeys("test");
        //check box
        driver.findElementById("checkbok").click();
        //Radio Button
        driver.findElementById("RadioButton").click();

    }

}