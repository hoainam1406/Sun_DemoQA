Feature: TextBox
  I want to view textbox on screen

  @TC_EL_TB_1
  Scenario: Verify on entering data to all textfield
    Given I want open textbox page
    And Valid data to all textfield
      | UserName | Email       | CurrentAddress | PermanentAddress |
      | MyKieu      | kieu@gmail.com | DaNang            | QuangNam            |
    And   I click to submit
    Then  The website display data in textbox correct
      | MyKieu | kieu@gmail.com | DaNang | QuangNam |

  @TC_EL_TB_2
  Scenario:  Verify empty current address Textfield
    Given I want open textbox page
    And  Valid data to all textfield
      | UserName | Email       | CurrentAddress | PermanentAddress |
      | MyKieu      | kieu@gmail.com |                   | QuangNam            |
    And   I click to submit
    Then The website display data in textbox correct
      | UserName | Email       | CurrentAddress | PermanentAddress |
      | MyKieu      | kieu@gmail.com |                   | QuangNam            |

  @TC_EL_TB_3
  Scenario:Verify email textfield
    Given I want open textbox page
    And Valid data to all textfield
      | UserName | Email | CurrentAddress | PermanentAddress |
      | MyKieu      | kieu     | Da Nang           | QuangNam            |
    And   I click to submit
    Then  The website display input with color red

  @TC_EL_TB_4
  Scenario: Verify  textfield contain symbol
    Given I want open textbox page
    And Valid data to all textfield
      | UserName | Email       | CurrentAddress | PermanentAddress |
      | ""          | kieu@gmail.com | DaNang            | QuangNam            |
    And   I click to submit
    Then  The website display data in textbox correct
      | "" | kieu@gmail.com | DaNang | QuangNam |
  @TC_FL_TB_5
  Scenario: Check the Email text field that cannot be white space
    Given I want open textbox page
    And Valid data to all textfield
      | UserName | Email       | CurrentAddress | PermanentAddress |
      |My Kieu       | ki eu@gmail.com | DaNang            | QuangNam            |
    And   I click to submit
    Then The website display input with color red
