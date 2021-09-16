$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/pops.feature");
formatter.feature({
  "name": "Pops",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "getting pops site up in google search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@promotion"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am navigating to the google",
  "keyword": "Given "
});
formatter.match({
  "location": "PopsStepDer.iAmNavigatingToTheGoogle()"
});
formatter.write("2021-09-16 19:24:33 PASS: Successfully navigated to the url");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am inputting \"richmond poker\" in search window",
  "keyword": "Then "
});
formatter.match({
  "location": "PopsStepDer.iAmInputtingInSearchWindow(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am clicking \"Pops poker\" link",
  "keyword": "Then "
});
formatter.match({
  "location": "PopsStepDer.iAmClickingLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am clicking \"Website\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "PopsStepDer.iAmClickingButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigating back",
  "keyword": "And "
});
formatter.match({
  "location": "PopsStepDer.navigatingBack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am clicking \"Directions\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "PopsStepDer.iAmClickingButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigating back",
  "keyword": "And "
});
formatter.match({
  "location": "PopsStepDer.navigatingBack()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am clicking \"Facebook\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "PopsStepDer.iAmClickingButton(String)"
});
formatter.result({
  "status": "passed"
});
});