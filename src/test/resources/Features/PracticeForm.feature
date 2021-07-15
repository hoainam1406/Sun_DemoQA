Feature: Verify the Registration Form
  I want to verify the Registration Form

  @TC_FO_PF_01
  Scenario: Check the behavior of form by not filling up any data into the form.
    Given I want open the registration form page
    When I not filling up any data
    When I click the submit button
    Then Mandatory fields should show the red border and 'Thanks for submitting the form' should not show

  @TC_FO_PF_02
  Scenario Outline: Check the behavior of form by filling up all fields.
    Given I want open the registration form page
    When I filling up all the fields
    |FirstName|LastName|MobileNumber|Email|DateOfBirth|CurrentAddress|
    |  Nam   |Hoài    | 0123456789  |nam@abc.com  |14 Jun 1999 |29 Xuan Dieu|
    And I click the submit button
    Then The "<message>" should show
    Examples:
      | message                        |
      | Thanks for submitting the form |


  @TC_FO_PF_03
  Scenario Outline: Check the behavior of form by filling up the required fields only.
    Given I want open the registration form page
    When I filling up the required fields only
      |FirstName|LastName|MobileNumber|Email|
    |  Nam   |Hoài    | 0123456789  |nam@abc.com  |
    And I click the submit button
    Then The "<message>" should show
    Examples:
      | message                        |
      | Thanks for submitting the form |

  @TC_FO_PF_04
  Scenario: Check the Full name text field without adding First name.
    Given I want open the registration form page
    When I filling up last name field only
    |LastName|
    |  Hoài  |
    And I click the submit button
    Then  First name field should show the red border and Last name field should show the green border


  @TC_FO_PF_05
  Scenario: Check the Full name text field without adding Last name.
    Given I want open the registration form page
    When I filling up first name field only
      |FirstName|
    |  Nam  |
    And I click the submit button
    Then  Last name field should show the red border and First name field should show the green border

    @TC_FO_PF_06
  Scenario: Check the full name field by filling up numeric characters instead of string.
    Given I want open the registration form page
    When I filling up numeric characters instead of string in the full name text field
    |FirstName|LastName|
    | 01234   |56789   |
    And I click the submit button
    Then Lastname and Firstname fields should show the red border

  @TC_FO_PF_07
  Scenario: Check the behavior of form by filling up special characters instead of string.
    Given I want open the registration form page
    When I filling up special characters instead of string in the full name text field
    |FirstName|LastName|
    | Nam@!#  |Hoai%^&@|
    And I click the submit button
    Then Lastname and Firstname fields should show the red border

  @TC_FO_PF_08
  Scenario: Check the Email text field that can be empty
    Given I want open the registration form page
    When I not filling up any data into email field
    |Email|
    |     |
    And I click the submit button
    Then Email field should show the green border

  @TC_FO_PF_09
  Scenario: Check the Email text field that has random string instead of real email.
    Given I want open the registration form page
    When I filling up random string instead of real email
    |Email|
    |1213565465465  |
    And I click the submit button
    Then Email field should show the red border

  @TC_FO_PF_10
  Scenario: Check the Email text field that must be in correct format.
    Given I want open the registration form page
    When I filling up wrong format instead of real email
      |Email  |
      |abc@abc|
    And I click the submit button
    Then Email field should show the red border

  @TC_FO_PF_11
  Scenario: Check the Email text field that must not have a bank space.
    Given I want open the registration form page
    When I filling up email field have blank space
      |Email  |
      |a bc@abc|
    And I click the submit button
    Then Email field should show the red border

  @TC_FO_PF_12
  Scenario: Check the Gender field must be checked.
    Given I want open the registration form page
    When I not checking any data into gender field
    And I click the submit button
    Then Gender field should show the red border

  @TC_FO_PF_13
  Scenario: Mobile number field cannot be empty
    Given I want open the registration form page
    When I not checking any data into mobile number field
    |MobileNumber|
    |            |
    And I click the submit button
    Then Mobile number field should show the red border

  @TC_FO_PF_14
  Scenario: Mobile field must have 10 digits
    Given I want open the registration form page
    When I filling up wrong format of mobile number
    |MobileNumber|
    |123456789|
    And I click the submit button
    Then Mobile number field should show the red border

  @TC_FO_PF_15
  Scenario: Mobile field cannot contain letter or special symbols
    Given I want open the registration form page
    When I filling up wrong format of mobile number
      |MobileNumber|
      |abc123456@|
    And I click the submit button
    Then Mobile number field should show the red border


