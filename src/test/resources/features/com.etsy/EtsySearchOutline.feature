Feature: Etsy search Functionality

  Background: the user navigates to "https://www.etsy.com/"

  @regressionoutline
  Scenario Outline: Validation of etsy search Hat
   # Given the user navigates to "https://www.etsy.com/"
    When the user searches with "<searchvalue>"
    Then the user validates the title "<titlevalidation>"
    Examples:
      | searchvalue | titlevalidation |
      | Hat         | Hat \| Etsy     |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |

    #command +option+L