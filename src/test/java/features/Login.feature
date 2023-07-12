Feature: Application Login
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "Jin" and password "123"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with "Jino" and password "1234"
    Then Home page is populated
    And Cards are not displayed

