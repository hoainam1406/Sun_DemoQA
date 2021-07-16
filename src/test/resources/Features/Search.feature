  Feature: Search
  Search to Book Store

  @BST_RE_01
  Scenario Outline: Verify all data on textfield
    Given I want open home page books
    And Valid data need find
    And I click to search
    Then The website display data search"<text>"
    Examples:
      | text             |
      | Git Pocket Guide |

  @BST_RE_02
  Scenario Outline: Display information for book
    Given I want open home page books
    And Valid data need find
    And I click to search
    And I click Link to GitPocketGuide
    Then The website display data book store search"<text>"
    Examples:
      | text          |
      | 9781449325862 |