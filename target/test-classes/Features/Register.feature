Feature: Register to Book Store

    @BTS_RE_01
      Scenario:  Verify all data on textfield
      Given I want open home page login
      And  Click to Button NewUser
      And  Enter data in Form
        | firstname | lastname | username | password   |
        | My        | Kieu     | Mykieu   | Mykieu123@ |
      Then The website display data in form register correct
        | firstname | lastname | username | password   |
        | My        | Kieu     | Mykieu   | Mykieu123@ |
  @BST_RE_02
  Scenario Outline: Verify recaptcha
    Given I want open home page login
    And Click to Button NewUser
    And  Enter data in Form
      | firstname | lastname | username | password   |
      | My        | Kieu     | Mykieu   | Mykieu123@ |
    And Click to Register
    Then The website display "<text>"
    Examples:
      | text     |
      | Please verify reCaptcha to register!|
    @BST_RE_03
    Scenario: Verify all data but firstName field is empty
      Given I want open home page login
      And Click to Button NewUser
      And Enter data in Form
        | firstname | lastname | username | password   |
        |        | Kieu     | Mykieu   | Mykieu123@ |
      And Click to Register
      Then The website display warning firstName textfield with boder red
