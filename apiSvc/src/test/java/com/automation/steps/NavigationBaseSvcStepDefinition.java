package com.automation.steps;

import com.automation.steps.serenity.NavigationBaseSvcStepSerenity;
import cucumber.api.java.en.Then;

public class NavigationBaseSvcStepDefinition {

    private NavigationBaseSvcStepSerenity navBaseSvcStepSerenity = new NavigationBaseSvcStepSerenity();

    /**
     * @param depth , if empty/null, parameter will not be used.
     */
    @Then("get tiers, depth by '(.*)'")
    public void getTiers(String depth) {
        navBaseSvcStepSerenity.getTiers(depth);
    }

    /**
     * @param tierId , can either:
     *               @Example (1) give a Tier Level (i.e: T3) and will get a random T3 tier
     *               @Example (2) provide a direct TierId (i.e: T2-10121)
     *               @Example (3) empty "" will randomly pick a tier between T1-T4
     *
     * @param depth , if empty/null, parameter will not be used.
     */
    @Then("get tier by tier Id '(.*)', depth by '(.*)'")
    public void getTierByTierId(String tierId, String depth) {
        navBaseSvcStepSerenity.getTierByTierId(tierId, depth);
    }

}
