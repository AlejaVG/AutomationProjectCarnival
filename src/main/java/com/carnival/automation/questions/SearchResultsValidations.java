package com.carnival.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.carnival.automation.userinterfaces.SearchCruisePage.QUANTITY_RESULTS;

public class SearchResultsValidations implements Question<Boolean> {
    private String quantityResults;

    public SearchResultsValidations(String quantityResults) {
        this.quantityResults = quantityResults;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        QUANTITY_RESULTS.of(quantityResults).resolveFor(actor).waitUntilVisible();
        return QUANTITY_RESULTS.of(quantityResults).resolveFor(actor).isVisible();
    }
    public static SearchResultsValidations exist(String quantityResults) {
        return new SearchResultsValidations(quantityResults);
    }
}
