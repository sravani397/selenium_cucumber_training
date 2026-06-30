Feature:login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login home page
    When user enters <username> and <password>
    And user clicks on login
    Then user is validated home page

    Examples:
      | username | password |
#      | Raghav   |    12345 |
      | Ele      |    12345 |
      | standard_user|  secret_sauce|
