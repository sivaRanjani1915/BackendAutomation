package com.services.baseLayerUtils;

import com.automation.steps.serenity.NavigationBaseSvcStepSerenity;
import com.services.responses.nav.tiers.Tier;
import com.services.responses.nav.tiers.Tiers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static com.automation.Definition_RunnerClass.isDebuggerModeOn;
import static com.automation.Definition_RunnerClass.setDebuggerMode;
import static java.util.Collections.shuffle;

public class NavBaseUtils {
    private static NavigationBaseSvcStepSerenity navBase = new NavigationBaseSvcStepSerenity();
    private static Tiers tiers = null;

    private static List<String> tier1IdList = new ArrayList<>();
    private static List<String> tier2IdList = new ArrayList<>();
    private static List<String> tier3IdList = new ArrayList<>();
    private static List<String> tier4IdList = new ArrayList<>();
    private static Stack<List<String>> shuffledTierIds = new Stack<>();

    public static String getRandomTier(String tierLevel) {
        String thisTier;
        switch (tierLevel.toUpperCase()) {
            case "T1":
                executeGetTiers();
                thisTier = getRandomTier1Id();
                break;
            case "T2":
                executeGetTiers();
                thisTier = getRandomTier2Id();
                break;
            case "T3":
                executeGetTiers();
                thisTier = getRandomTier3Id();
                break;
            case "T4":
                executeGetTiers();
                thisTier = getRandomTier4Id();
                break;
            case "":
                executeGetTiers();
                thisTier = getRandomTierId();
                break;
            default:
                thisTier = tierLevel;
        }

        return thisTier;
    }

    private static void executeGetTiers() {
        if (isDebuggerModeOn()) {
            setDebuggerMode(false);
            tiers = navBase.getTiers(null);
            setDebuggerMode(true);
        } else {
            tiers = navBase.getTiers(null);
        }
    }

    private static String getRandomTier1Id() {
        setListTier1();
        shuffle(tier1IdList);
        return tier1IdList.get(0);
    }

    private static void setListTier1() {
        if (tiers != null && tiers.getTiers() != null) {
            for (Tier tier : tiers.getTiers()) {
                if (!tier.getId().split("-")[0].equalsIgnoreCase("T1")) {
                    continue;
                }
                tier1IdList.add(tier.getId());
            }
        }
    }

    private static String getRandomTier2Id() {
        setListTier2();
        shuffle(tier2IdList);
        return tier2IdList.get(0);
    }

    private static void setListTier2() {
        if (tiers != null && tiers.getTiers() != null) {
            for (Tier tier : tiers.getTiers()) {
                if (!tier.getId().split("-")[0].equalsIgnoreCase("T2")) {
                    continue;
                }
                tier2IdList.add(tier.getId());
            }
        }
    }

    private static String getRandomTier3Id() {
        setListTier3();
        shuffle(tier3IdList);
        return tier3IdList.get(0);
    }

    private static void setListTier3() {
        if (tiers != null && tiers.getTiers() != null) {
            for (Tier tier : tiers.getTiers()) {
                if (!tier.getId().split("-")[0].equalsIgnoreCase("T3")) {
                    continue;
                }
                tier3IdList.add(tier.getId());
            }
        }
    }

    private static String getRandomTier4Id() {
        setListTier4();
        shuffle(tier4IdList);
        return tier4IdList.get(0);
    }

    private static void setListTier4() {
        if (tiers != null && tiers.getTiers() != null) {
            for (Tier tier : tiers.getTiers()) {
                if (!tier.getId().split("-")[0].equalsIgnoreCase("T4")) {
                    continue;
                }
                tier4IdList.add(tier.getId());
            }
        }
    }

    private static String getRandomTierId() {
        setListTier1();
        setListTier2();
        setListTier3();
        setListTier4();
        shuffledTierIds.addAll(Arrays.asList(tier1IdList, tier2IdList, tier3IdList, tier4IdList));
        shuffle(shuffledTierIds);
        List<String> thisTierLevel = shuffledTierIds.get(0);
        shuffle(thisTierLevel);
        return thisTierLevel.get(0);
    }

}
