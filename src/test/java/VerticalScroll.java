import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
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
        //caputre all the list items
        AndroidElement list = ( AndroidElement ) driver.findElementById("id");

        //scrolling down till we reach desired element get.

        MobileElement listItem = ( MobileElement ) driver.findElement(
                 MobileBy.AndroidUIAutomator(
                          "new UiScrollable(newUiSelector()).scrollIntoView("
                                   + "new UiSelector().description(\"givedesiredStringName\"));"));

        System.out.println(listItem.getLocation());
        listItem.click();

    }

}



