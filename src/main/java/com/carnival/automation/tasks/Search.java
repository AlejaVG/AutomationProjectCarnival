package com.carnival.automation.tasks;

import com.carnival.automation.models.DataSearchCruise;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static com.carnival.automation.userinterfaces.SearchCruisePage.*;

public class Search implements Task {
    private DataSearchCruise dataSearchCruise;

    public Search(List<DataSearchCruise> dataSearchCruise) {
        this.dataSearchCruise = dataSearchCruise.get(0);
    }

    @Step("{0} Search the cruises")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_SIGN), Click.on(CARNIVAL_LOGO));
        searchCruisesWithAllOptionsSailFromAndDates(actor);
        searchCruisesWithOneOptionSailFromAndOneDate(actor);
    }

    private <T extends Actor> void searchCruisesWithOneOptionSailFromAndOneDate(T actor) {
        if (!((dataSearchCruise.getSailFrom().equals("Empty")) && (dataSearchCruise.getDates().equals("Empty")))) {
            actor.attemptsTo(Click.on(OPTION_SAIL_TO), Click.on(SAIL_OPTION.of(dataSearchCruise.getSailTo())),
                    Click.on(OPTION_SAIL_FROM), Click.on(SAIL_OPTION.of(dataSearchCruise.getSailFrom())),
                    Click.on(OPTION_DATES), Click.on(DATE.of(dataSearchCruise.getDates())),
                    Click.on(OPTION_DURATION), Click.on(DURATION.of(dataSearchCruise.getDuration())),
                    Click.on(SEARCH_BUTTON));
        }
    }

    private <T extends Actor> void searchCruisesWithAllOptionsSailFromAndDates(T actor) {
        if ((dataSearchCruise.getSailFrom().equals("Empty")) && (dataSearchCruise.getDates().equals("Empty"))) {
            actor.attemptsTo(Click.on(OPTION_SAIL_TO), Click.on(SAIL_OPTION.of(dataSearchCruise.getSailTo())));
            actor.attemptsTo(Click.on(OPTION_DURATION), Click.on(DURATION.of(dataSearchCruise.getDuration())));
            actor.attemptsTo(Click.on(SEARCH_BUTTON));
        }

    }

    public static Search CruisesWithSeveralOptions(List<DataSearchCruise> dataSearchCruise) {
        return Tasks.instrumented(Search.class, dataSearchCruise);
    }

}
