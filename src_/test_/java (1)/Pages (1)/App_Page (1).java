package Pages;

import stepDefinitions.TestRunner;

public class App_Page extends TestRunner{

    public static void  AppPage (){

        TestRunner.driver.findElementByAccessibilityId("App").click();
    }
}
