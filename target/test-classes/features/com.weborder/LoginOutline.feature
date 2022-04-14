@smokeLoginTest
Feature: Login Functionality For WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: Validation of WebOrder Login Positive Scenario
    When the user provides credentials
    Then the user is on the home page

  Scenario: Validation of WebOrder Login Negative Scenarios
    When the user provides wrong "<username>" and "<password>"
    Then the user validate the "<errormessage>" error message

     #Do not touch the positive scenario
     #Create as many as negative scenario with Scenario Outline

  Scenario Outline: Validation of negative log in functionality

    Examples:
      | username              | password   | errormessage   |
      | guest1@microworks.com | Guest1!    | Sign in Failed |
      | ahmet@gmail.com       | Guest1!    | Sign in Failed |
      | ahmet@gmail.com       | ahmet123   | Sign in Failed |
      |                       | Guest1!    | Sign in Failed |
      | guest1@microworks.com |            | Sign in Failed |
      | ahmet                 | $*!@#$%^&* | Sign in Failed |
      | $*!@#$%^&*            | Guest1!    | Sign in Failed |
      | ahmet@gmail.com       | ahmet      | Sign in Failed |
