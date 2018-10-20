@login
Feature: Login the Application

  Scenario: Login the App with valid credential
    Given Open the app in chrome browser
    When Enter valid "malviyasunil095@gmail.com" and "15akansha"
    Then Application should login successfully
    And Shutdown the application

  Scenario Outline: Login App with multiple credemntials
    Given Open the app in chrome browser
    When Enter valid "<username>" and "<password>"
    Then Application should login successfully
    And Shutdown the application

    Examples: 
      | username                  | password  |
      | malviyasunil095@gmail.com | 15akansha |
      | malviyasunil095@gmail.com | 15akansha |
