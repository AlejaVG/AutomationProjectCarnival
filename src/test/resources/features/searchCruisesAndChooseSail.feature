Feature: As a user I want to search cruises to The Bahamas with duration
  between 6 and 9 days so that I will visualize all the options to choose
  one, and learn more about the trip, so that I will get more info about itinerary

  Scenario Outline: Search a cruise To Bahamas.
  A set of results will be displayed, default view will be a grid.
  The user will be able to filter by price, using the slider bar.
  The user will be able to sort by price, default value will be cheapest first

    Given The user goes to Carnival site
    When  The user search cruises with several options
      | sailTo   | sailFrom   | dates   | duration   |
      | <sailTo> | <sailFrom> | <dates> | <duration> |
    Then  The user should see the results on a grid of the search <result>

    Examples:
      | sailTo      | sailFrom      | dates     | duration   | result     |
      | The Bahamas | Empty         | Empty     | 6 - 9 Days | 11 results |
      | The Bahamas | Baltimore, MD | June 2021 | 6 - 9 Days | 1 results  |
