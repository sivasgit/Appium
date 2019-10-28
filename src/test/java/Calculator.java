import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Calculator {

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

        WebElement sev = driver.findElementById("com.android.calculator2:id/digit_7");
        sev.click();
        driver.findElementById("com.android.calcualtor2:id/op_add").click();
        driver.findElementById("com.android.calculator2:id/digit_7").click();
        driver.findElementById("com.android.calculator2:id/op_equ").click();
        String result = driver.findElementById("com.android.calculator2:id/result").getText();
        if ( result.equals("10") ) {
            System.out.println("Test Passed");

        }
        else {
            System.out.println("Test Failed");
        }
        driver.quit();

    }

}
