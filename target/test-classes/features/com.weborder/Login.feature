Feature: Login Functionality For WebOrder Page
  #tis is the way t resuce amount of code and increase the efficiency o fyour code. it acts like a before method annotation
  #it means it runs before steps of scenario.
  Background:
    Given the user navigates to the WebOrder website

@smoke @regression
  Scenario: Validation of WebOrder Login Positive Scenario
#    Given the user navigates to the WebOrder website
    When the user provides credentials
    Then the user is on the home page

  Scenario: Validation of WebOrder Login Negative Scenario 1
#    Given the user navigates to the WebOrder website
    When the user provides correct username and wrong password
    Then the user validate the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario 2
#    Given the user navigates to the WebOrder website
    When the user provides wrong "ahmet" and "baldir"
    Then the user validate the "Sign in Failed" error message
    @smoke @regression
    #last scenario be provided empty for both and validate the same message. parameters are not necessary
  Scenario: Validation of WebOrder Login Negative Scenario 3
#    Given the user navigates to the WebOrder website
    When the user provides blank username and blank password
    Then the user validate the "Sign in Failed" error message
