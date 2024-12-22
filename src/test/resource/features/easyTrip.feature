Feature: Test easy Trip website
  @easytripTest
  Scenario Outline: Easy trip search page check
    Given I want to select travelType <travelType>
    When I want to select formcity as <formCity>
    Then I want to select to city as <toCity>
    And I want to select depertureDate <depertureDate>

    Examples:
    |travelType|formCity|toCity|depertureDate|
    |One Way   |Kolkata |Delhi |03/02/2025   |
    |One Way   |mumbai  |delhi |04/05/2025   |

