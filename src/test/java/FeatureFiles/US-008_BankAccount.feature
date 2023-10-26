Feature: Bank Account Configuration

  Background: Login
    Given The user navigate to website
    When The user logs in with the data received from Excel
      | login | 2 |

  Scenario: Creating a new department
    When The user clicks the element
      |setup|
      |parameters|
      |bankAccounts|
    When The user clicks the elementDia
      |addButton|
    Then The user enters the required data
      |nameInput|rama|
      |ibanInput|001B   |
    When The user clicks the elementDia
      |currency|
      |currencyList|


    Then The user enters the required data
      |integrationCode|008TRY|

    When The user clicks the elementDia
      |saveButton|

    Then The user verifies the message
      |successMessage|successfully|

    When The user clicks the elementDia
      |editButton1|
    Then The user enters the required data
      |nameInput|Bilisim1|
      |ibanInput|002B   |
    When The user clicks the elementDia
      |saveButton|
    Then The user verifies the message
      |successMessage|successfully|


    And User delete the element from Dialog
      |Bilisim1|
