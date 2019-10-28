import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class DesiredCapability {


    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME , "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME , "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION , 10.0);// real device no""
        dc.setCapability(MobileCapabilityType.DEVICE_NAME , "Android Emulator");//Android
        //dc.setCapability(MobileCapabilityType.APP,""); app location

        //always we have to give url of appium server
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        //installing apk to emulatro
        AndroidDriver <WebElement> driver = new AndroidDriver <WebElement>(url , dc);

    }

}

