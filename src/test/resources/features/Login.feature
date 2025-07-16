Feature: Login
  In order to manage employee records
  as a role
  i would like to login
  
  Background: 
  Given User have browser with OrangeHRM Application

  Scenario: Valid Login
    When User enter username "Admin"
    And User enter password "admin123"
    And User click on login
    Then User should get access to dashboard with content as "Time to work"

  Scenario Outline: Invalid Login
    When User enter username '<username>'
    And User enter password '<password>'
    And User click on login
    Then User should have error message as '<expectederror>'

    Examples: 
      | username | password | expectederror       |
      | john     | jhon123  | Invalid Credentials |
      | kim      | kim123   | Invalid Credentials |
