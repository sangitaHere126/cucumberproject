$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/mkmanish/workspace4/CucumberProject/src/test/resources/com/here/fcnr/Login.feature");
formatter.feature({
  "name": "Logging into Rediff Money",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Logging into rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginToRediffMoney"
    }
  ]
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.step({
  "name": "I login inside application",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Username",
        "ashishthakur1983"
      ]
    },
    {
      "cells": [
        "Password",
        "pass@1234"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser"
      ]
    },
    {
      "cells": [
        "Chrome"
      ]
    },
    {
      "cells": [
        "Mozilla"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Logging into rediff",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginToRediffMoney"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "GenericSteps.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to https://portfolio.rediff.com/portfolio-login",
  "keyword": "And "
});
formatter.match({
  "location": "GenericSteps.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login inside application",
  "rows": [
    {
      "cells": [
        "Username",
        "ashishthakur1983"
      ]
    },
    {
      "cells": [
        "Password",
        "pass@1234"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ApplicationSteps.login(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});