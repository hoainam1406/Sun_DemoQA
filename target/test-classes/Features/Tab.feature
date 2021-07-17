Feature: Tab
  I want to verify tab page

  @TC_WG_Tab_01
  Scenario Outline: Verify what tab
    Given I want open tab page
    Then The what tab should show the "<message>"
    Examples:
      | message  |
      |Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.|

  @TC_WG_Tab_02
  Scenario Outline: Verify origin tab
    Given I want open tab page
    When I click origin button
    Then The origin tab should show the "<message>"
    Examples:
      | message  |
      |Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old|

  @TC_WG_Tab_03
  Scenario Outline: Verify use tab
    Given I want open tab page
    When I click use button
    Then  The use tab should show the "<message>"
    Examples:
      | message  |
     |It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).|