package com.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Services",
        tags = {"@SmokeTest"})

/** Commonly Used Tagging Configurations:
 *
 *  @SmokeTest will run everything in the {@package level resources.features.Services}
 *
 *  @NavWebAppSvc will run everything in NavWebAppSvc.feature
 *  @OrderBaseSvc will run everything in OrderBaseSvc.feature
 *  @PricingBaseSvc will run everything in PricingBaseSvc.feature
 *  @StoreInfoSvc will run everything in StoreInfoSvc.feature
 *  @NavBaseSvc will run everything in NavBaseSvc.feature
 *
 *  @PartnerLayer will run everything in a Partner Coordination layer
 *  @Partner(givenSvcLayer) will run everything in the Partner Coordination
 *  layer for that given SvcLayer.
 *  @Example: @PartnerPricingBaseSvc will run the Pricing Base Svc with Partner layer access.
 *
 *  @PartnerToken will run everything in ExternalVendorTokens.feature
 *  @Token will run everything in Token.feature
 */
public class Definition_RunnerClass {

    /**
     *  Used to set the Test environment for Backend services.
     *  dev == 'Sprint'
     *  uat == ''
     *  qa  == 'Qa'
     */
    private static String Environment = "uat";

    public static String getEnvironment() { return Environment; }

    public static void setEnvironment(String environment) { Environment = environment; }


    /**
     * Used to set the services environment
     *  int  == 'Integration'
     *  cert == 'Certification'
     */
    private static String Services = "cert";

    public static String getServices() { return  Services; }

    public static void setServices(String service) { Services = service; }

    /**
     *  Used for debugging. Set to true, allows tester to see both request and response in the console.
     */
    private static Boolean debuggerMode = false;

    public static Boolean isDebuggerModeOn() { return debuggerMode; }

    public static void setDebuggerMode(boolean value) { debuggerMode = value; }

}

