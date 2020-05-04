package com.carnival.automation.stepdefinitions;

import com.carnival.automation.models.DataSearchCruise;
import com.carnival.automation.questions.SearchResultsValidations;
import com.carnival.automation.tasks.Search;
import com.carnival.automation.utils.OwnWebDirver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

public class SearchCruisesAndChooseSailStepDefinitions {

    Actor actor;

    @Given("^The user goes to Carnival site$")
    public void theUserGoesToCarnivalSite() {
        actor = Actor.named("Ale");
        actor.can(BrowseTheWeb.with(OwnWebDirver.web().onTheWebSite("https://www.carnival.com/")));
    }

    @When("^The user search cruises with several options$")
    public void theUserSearchCruisesWithSeveralOptions(List<DataSearchCruise> dataSearchCruise) {
        actor.attemptsTo(Search.CruisesWithSeveralOptions(dataSearchCruise));
    }


    @Then("^The user should see the results on a grid of the search (.*)$")
    public void theUserShouldSeeTheResultsOnAGridOfTheSearch(String results) {
        actor.should(GivenWhenThen.seeThat(SearchResultsValidations.exist(results)));
    }


    @When("^The user filter the price, using the slide bar (.*) to (.*)$")
    public void theUserFilterThePriceUsingTheSlideBarTo(String arg1, String arg2) {

    }

    @Then("^The user should see the price, default value will be cheapest first$")
    public void theUserShouldSeeThePriceDefaultValueWillBeCheapestFirst() {

    }

}
