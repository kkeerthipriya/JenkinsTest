

Feature: Peach mode page
  User should go to peach mode page

  Scenario Outline: Sale
    Given I am peach mode user
    When I open peachmode '<UserName>' and '<Passwd>'
    Then I should login to the forever new
    Examples:
      |UserName                 | Passwd   |
      |k.keerthipriya@gmail.com | kiran143 |

