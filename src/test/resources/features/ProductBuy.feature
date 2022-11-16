Feature: Product Buy functionality
  @Positive
  Scenario Outline: Ensure user succesfully product buy
    # precondition
    Given user is on SauceDemo homepage
    #steps
    When user input <username> as username
    And user input <password> as password
    And user click enter
    When user click  product
    And user click shoping cart
    And user click checkout
    And user input firstname
    And user input lastname
    And user input postal code
    And user click continue
    And user click finish

    # expected
    Then user verify success checkout result

    Examples:
      | username                | password      |
      | standard_user           | secret_sauce  |
      | performance_glitch_user | secret_sauce  |
