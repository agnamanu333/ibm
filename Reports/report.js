$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/elearning.feature");
formatter.feature({
  "name": "signup functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "edit profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test4"
    }
  ]
});
formatter.step({
  "name": "user enters valid user\"\u003cusername\u003e\" and pass\"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks login option",
  "keyword": "Then "
});
formatter.step({
  "name": "user clicks on the homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "click on the edit option",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "pass"
      ]
    },
    {
      "cells": [
        "agnaali369",
        "sarang123"
      ]
    }
  ]
});
formatter.background({
  "name": "background session",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is in homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "test.user_is_in_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "edit profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test4"
    }
  ]
});
formatter.step({
  "name": "user enters valid user\"agnaali369\" and pass\"sarang123\"",
  "keyword": "When "
});
formatter.match({
  "location": "test.user_enters_valid_user_and_pass(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login option",
  "keyword": "Then "
});
formatter.match({
  "location": "test.user_clicks_login_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "test.user_clicks_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the edit option",
  "keyword": "Then "
});
formatter.match({
  "location": "test.click_on_the_edit_option()"
});
formatter.result({
  "status": "passed"
});
});