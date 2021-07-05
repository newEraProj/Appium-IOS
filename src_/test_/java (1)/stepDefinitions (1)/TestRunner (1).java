package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.cucumber.junit.CucumberOptions.SnippetType.UNDERSCORE;

@RunWith(Cucumber.class)               // annotation for using cucumber
@CucumberOptions(

        plugin = {"pretty", "junit:target/TESTING.xml"},
        features = "src/test/java/features",       // feature files location

        tags={"@Test1"},                          // cucumber tags to run tests
        glue = "stepDefinitions",
        snippets = UNDERSCORE)
public class TestRunner {

    public static URL url;
    public static DesiredCapabilities capabilities;
    public static IOSDriver<IOSElement> driver;                // driver initialization



    @BeforeClass                                              //the code inside the BeforeClass tag will be executed before each test with tag @Test
    public static void setupAppium() throws MalformedURLException {
        //2
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);

        //3
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
      capabilities.setCapability(MobileCapabilityType.APP, "");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability("useNewWDA", false);
        //4
        driver = new IOSDriver<IOSElement>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.resetApp();
    }



    @AfterClass
    public static void uninstallApp() throws InterruptedException {
        driver.removeApp("");
    }

   public void myFirstTest() throws InterruptedException {
        driver.resetApp();                      // closing application
    }
}





