Feature: Book Store
  I want Login in book store
#
  @BST_LG_01
  Scenario Outline: Verify on entering data to all textfield
    Given I want open home page login
    And   User enters Credentials to LogIn
      | userLogin | passWord   |
      | kieu    | Mykieu123@ |
    And   I click to login button
    Then  The website display book store login correct with "<value>"
    Examples:
      | value  |
      | kieu |

  @BST_LG_02
  Scenario Outline: Verify password field
    Given I want open home page login
    And   User enters Credentials to LogIn
      | userLogin | passWord |
      | b         | kieu1    |
    And   I click to login button
    Then  The website display book store login incorrect with "<text>"
    Examples:
      | text                          |
      | Invalid username or password! |

  @BST_LG_03
  Scenario: Verify blank textfield
    Given I want open home page login
    And   I click to login button
    Then  The website display warning textfield with boder red

  @BST_LG_04
  Scenario: Successful Login with Valid Credentials then LogOut
    Given I want open home page login
    And User enters Credentials to LogIn
      | userLogin | passWord |
      | a         | Test@153 |
    And   I click to login button
    Then Message displayed User Register Successfully.
    When User LogOut from the Application
    Then Message displayed LogOut Successfully

  @BST_LG_05
  Scenario: Empty password field
    Given I want open home page login
    And User enters Credentials to LogIn
      | userLogin | passWord |
      | Mykieu    |          |
    And   I click to login button
    Then The website display warning password textfield with boder red
  @BST_LG_06
  Scenario: Login and delete book store
    Given I want open home page login
    And User enters Credentials to LogIn
        | userLogin | passWord   |
        | kieu    | Mykieu123@ |
    And   I click to login button
    And I click to Delete button
    And I click to OK to delete this book
    Then The display message deleted

#
