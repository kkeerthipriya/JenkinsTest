

Feature: Home Page Login
  User should login to forever new

Scenario Outline: Login
Given I am registered user
When I open Forever login page and enter login details '<UserName>' and '<Passwd>'
Then I should login to the forever new
Examples:
|UserName                 | Passwd   |
|k.keerthipriya@gmail.com | kiran143 |

Scenario Outline: GiftCard
Given I open the Forever New home page '<Uname>' and '<Pwd>'
When I open buy gift cards page
And give all the details '<GiftCardValue>' and '<QTY>' and '<SenName>' and '<SenEmail>' and '<RcvName>' and '<RcvEmail>' and '<Msg>' and '<CreditCardNo>' and '<ExpMonth>' and '<ExpYear>' and '<CVV>'
Then I should login to the forever new website
Examples:
|Uname                    | Pwd      | GiftCardValue        | QTY |SenName |SenEmail                    | RcvName | RcvEmail                 | Msg              | CreditCardNo     | ExpMonth | ExpYear | CVV |
|k.keerthipriya@gmail.com | kiran143 | Gift Card CA +$20.00 | 1   |Keerthi | k.keerthipriya@gmail.com   | Kiran | kiroooos@gmail.com         | Happy weekend    | 4444333322221111 | 11       | 20      | 123 |


