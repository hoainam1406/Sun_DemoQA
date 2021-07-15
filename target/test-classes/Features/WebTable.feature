Feature: Webtable
  I want to add member to Webtable element

#  @TC_EL_WT_01
#  Scenario: Verify that data display correct in Grid Member
#    Given I want open webtable page
#    Then The website display Default Member in Grid correct
#      | FirstName | LastName | Age | Email              | Salary | Department |
#      | Cierra    | Vega     | 39  | cierra@example.com | 10000  | Insurance  |

#  @TC_EL_WT_02
#  Scenario: Verify that open Registration Form success when user click on add button
#    Given I want open webtable page
#    When I click on add button
#    Then The website display Registration Form correct
#      | FormName          |
#      | Registration Form |
#
#
#  @TC_EL_WT_03
#  Scenario: Verify on entering data to all textfield
#    Given I want open webtable page
#    When I click on add button
#    And Enter data to all textfield
#      | FirstName | LastName | Email               | Age | Salary  | Department  |
#      | Phuong    | Hong     | phuong123@gmail.com | 18  | 2000000 | Tester Team |
#    And I click submit button
#    Then The website display Member in Grid correct
#      | FirstName | LastName | Age | Email               | Salary  | Department  |
#      | Phuong    | Hong     | 18  | phuong123@gmail.com | 2000000 | Tester Team |


#  @TC_EL_WT_04
#  Scenario: Verify on entering data to email textfield
#    Given I want open webtable page
#    When I click on add button
#    And I enter data to all textfield
#      | FirstName | LastName | Email  | Age | Salary  | Department  |
#      | Phuong    | Hong     | phuong | 18  | 2000000 | Tester Team |
#    And I click submit button
#    Then The website display warning at email textfield
#
#  @TC_EL_WT_05
#  Scenario: Verify on entering data to age textfield
#    Given I want open webtable page
#    When I click on add button
#    And I enter data to all textfield
#      | FirstName | LastName | Email               | Age | Salary  | Department  |
#      | Phuong    | Hong     | phuong123@gmail.com | ag  | 2000000 | Tester Team |
#    And I click submit button
#    Then The website display warning at age textfield
#
#  @TC_EL_WT_06
#  Scenario: Verify on entering data to salary textfield
#    Given I want open webtable page
#    When I click on add button
#    And I enter data to all textfield
#      | FirstName | LastName | Email               | Age | Salary  | Department  |
#      | Phuong    | Hong     | phuong123@gmail.com | 18  | abcd   | Tester Team |
#    And I click submit button
#    Then The website display warning at salary textfield
#
#  @TC_EL_WT_07
#  Scenario: Verify on all textfields are blank
#    Given I want open webtable page
#    When I click on add button
#    And I click submit button
#    Then The website display warning at all textfields

#  @TC_EL_WT_08
#  Scenario: Verify on updating data to all textfield
#    Given I want open webtable page
#    When I click on edit icon button
#    And I update data to all textfields
#      | FirstName | LastName | Email            | Age | Salary  | Department  |
#      | Sun       | Team     | Sun123@gmail.com | 18  | 100000 | Tester Team |
#    And I click submit button
#    Then The website display Member Updated in Grid correct
#      | FirstName | LastName | Email               | Age | Salary  | Department  |
#      | Sun       | Team     | Sun123@gmail.com  | 18 | 100000 | Tester Team |
#
#  @TC_EL_WT_09
#  Scenario: Verify on updating data to email textfield
#    Given I want open webtable page
#    When I click on edit icon button
#    And I update data to all textfields
#      | FirstName | LastName | Email  | Age | Salary  | Department  |
#      | Sun       | Team     | Sun123 | 18  | 100000 | Tester Team |
#    And I click submit button
#    Then The website display warning at email textfield
#
  @TC_EL_WT_10
  Scenario: Verify on updating data to age textfield
    Given I want open webtable page
    When I click on edit icon button
    And I update data to all textfields
      | FirstName | LastName | Email            | Age | Salary  | Department  |
      | Sun       | Team     | Sun123@gmail.com | hi  | 100000 | Tester Team |
    And I click submit button
    Then The website display warning at age textfield

  @TC_EL_WT_11
  Scenario: Verify on updating to salary textfield
    Given I want open webtable page
    When I click on edit icon button
    And I update data to all textfields
      | FirstName | LastName | Email            | Age | Salary  | Department  |
      | Sun       | Team     | Sun123@gmail.com | 18  | hello  | Tester Team |
    And I click submit button
    Then The website display warning at salary textfield

  @TC_EL_WT_12
  Scenario: Verify on click delete icon
    Given I want open webtable page
    When I click on delete icon at any record
    Then The website display Member in Grid except record deleted
