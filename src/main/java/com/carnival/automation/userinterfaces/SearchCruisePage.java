package com.carnival.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SearchCruisePage {

    public static final Target BUTTON_SIGN = Target.the("button sign").locatedBy("//a[text()='Sign me up']");
    public static final Target OPTION_SAIL_TO = Target.the("option sail to").locatedBy("//span[text()='Sail To']");
    public static final Target SAIL_OPTION = Target.the("port option").locatedBy("//button[contains(text(),'{0}')]");
    public static final Target OPTION_SAIL_FROM = Target.the("option sail from").locatedBy("//span[text()='Sail From']");
    public static final Target OPTION_DATES = Target.the("option dates").locatedBy("//span[text()='Dates']");
    public static final Target OPTION_DURATION = Target.the("option duration").locatedBy("//span[text()='Duration']");
    public static final Target DURATION = Target.the("duration").locatedBy("//button[contains(text(),'{0}')]");
    public static final Target SEARCH_BUTTON = Target.the("search button").locatedBy("//span[text()='SEARCH ' and text()=' CRUISES'][1]");
    public static final Target DATE = Target.the("date").locatedBy("//button[contains(@aria-label,'{0}')]");
    public static final Target QUANTITY_RESULTS = Target.the("quantity results").locatedBy("//span[text()='{0}']");
    public static final Target CARNIVAL_LOGO = Target.the("carnival logo").locatedBy("//*[@id=\"cclr-global-header-root\"]/div/header/nav[1]/div[1]/a/img");


    private SearchCruisePage() { throw new IllegalStateException("Target not found"); }

}
