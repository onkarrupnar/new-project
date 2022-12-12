Feature: Automate the application

  Background: Verify the functionality
    Given User open the browser
    When User enter the email
    And User enters the password

  Scenario: verify the login functinality
    Then He clicks on login button

  Scenario: verify the Signup functinality
    And user confirms password
    And He selects the gender
    And He Select date of birth
    Then He clicks on submit button
