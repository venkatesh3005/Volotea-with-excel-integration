$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucu.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "user checks source and destination in volotea website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills source and destination",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_fills_source_and_destination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "list of flights should be shown",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.list_of_flights_should_be_shown()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});