@smoke
Feature: Login feature
  As a user
  I want to login
  So that I can see welcome page

  Scenario: check Login functionality
    Given user is on Login page
    When user enter username"Admin" and password"aediMNjU"
    Then user can get logged in successfully