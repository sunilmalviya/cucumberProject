$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginFlipKArt.feature");
formatter.feature({
  "line": 2,
  "name": "Login the Application",
  "description": "",
  "id": "login-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Login the App with valid credential",
  "description": "",
  "id": "login-the-application;login-the-app-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the app in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter valid \"malviyasunil095@gmail.com\" and \"15akansha\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Application should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Shutdown the application",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_the_app_in_chrome_browser()"
});
formatter.result({
  "duration": 16194663901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malviyasunil095@gmail.com",
      "offset": 13
    },
    {
      "val": "15akansha",
      "offset": 45
    }
  ],
  "location": "Steps.enter_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 12979755712,
  "status": "passed"
});
formatter.match({
  "location": "Steps.application_should_login_successfully()"
});
formatter.result({
  "duration": 89013860,
  "status": "passed"
});
formatter.match({
  "location": "Steps.shutdown_the_application()"
});
formatter.result({
  "duration": 5760932657,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Login App with multiple credemntials",
  "description": "",
  "id": "login-the-application;login-app-with-multiple-credemntials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "Open the app in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Application should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Shutdown the application",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-the-application;login-app-with-multiple-credemntials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-the-application;login-app-with-multiple-credemntials;;1"
    },
    {
      "cells": [
        "malviyasunil095@gmail.com",
        "15akansha"
      ],
      "line": 18,
      "id": "login-the-application;login-app-with-multiple-credemntials;;2"
    },
    {
      "cells": [
        "malviyasunil095@gmail.com",
        "15akansha"
      ],
      "line": 19,
      "id": "login-the-application;login-app-with-multiple-credemntials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Login App with multiple credemntials",
  "description": "",
  "id": "login-the-application;login-app-with-multiple-credemntials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Open the app in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter valid \"malviyasunil095@gmail.com\" and \"15akansha\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Application should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Shutdown the application",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_the_app_in_chrome_browser()"
});
formatter.result({
  "duration": 8210995035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malviyasunil095@gmail.com",
      "offset": 13
    },
    {
      "val": "15akansha",
      "offset": 45
    }
  ],
  "location": "Steps.enter_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 9808088364,
  "status": "passed"
});
formatter.match({
  "location": "Steps.application_should_login_successfully()"
});
formatter.result({
  "duration": 158692301,
  "status": "passed"
});
formatter.match({
  "location": "Steps.shutdown_the_application()"
});
formatter.result({
  "duration": 19067532278,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login App with multiple credemntials",
  "description": "",
  "id": "login-the-application;login-app-with-multiple-credemntials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "Open the app in chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Enter valid \"malviyasunil095@gmail.com\" and \"15akansha\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Application should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Shutdown the application",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.open_the_app_in_chrome_browser()"
});
formatter.result({
  "duration": 7948792584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "malviyasunil095@gmail.com",
      "offset": 13
    },
    {
      "val": "15akansha",
      "offset": 45
    }
  ],
  "location": "Steps.enter_valid_username_and_password(String,String)"
});
formatter.result({
  "duration": 10280554308,
  "status": "passed"
});
formatter.match({
  "location": "Steps.application_should_login_successfully()"
});
formatter.result({
  "duration": 127513074,
  "status": "passed"
});
formatter.match({
  "location": "Steps.shutdown_the_application()"
});
formatter.result({
  "duration": 5740444901,
  "status": "passed"
});
});