package stepDefinitions;


import Pages.App_Page;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
public class SampleStepdefs {

    @Given("^click on \"([^\"]*)\" button$")
    public void methodGiven(String buttonName) {
        System.out.println("method given");
       App_Page app = new App_Page();

        app.AppPage();
    }

    @When("^click on \"([^\"]*)\" action$")
    public void methodWhen(String actionName) {
        System.out.println("method When");

      //  AndroidElement openDialogButton = (AndroidElement) TestRunner.getDriver()
      //          .findElementByAndroidUIAutomator("new UiSelector().text(\""+actionName+"\")");
      //  openDialogButton.click();
    }

    @Then("^the \"([^\"]*)\" dialog is open$")
    public void methodThen(String dialogName) {
        System.out.println("method Then");

     //   AndroidElement alertElement = (AndroidElement) TestRunner.getDriver()
      //          .findElementById("android:id/alertTitle");
    //    String alertText = alertElement.getText();
     //   System.out.println("alertText : "+alertText);
     //   Assert.assertEquals(alertText, dialogName);
    }

    @Then("the Menu should have {string}")
    public void the_Menu_should_have(String dialogName) {
     //   AndroidElement alertElement = (AndroidElement) TestRunner.getDriver()
      //          .findElementById("Inflate from XML");
    //    String alertText = alertElement.getText();
   //     System.out.println("alertText : "+alertText);
    //    Assert.assertEquals(alertText, dialogName);

    }


    }


