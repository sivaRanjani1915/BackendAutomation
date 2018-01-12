Feature: Token Generator Api

  Background:
    Then reset Service configs

  @Token
  @SmokeTest
  Scenario Outline: Token - Guest
    When authorization token is created for guest user

    Examples:
      |  |
      |  |

  @Token
  @SmokeTest
  Scenario Outline: Token - Sign In User
    When authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |

    Examples:
      |  |
      |  |

  @Token
  @SmokeTest
  Scenario Outline: Token - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then test ssi token is valid

    Examples:
      |  |
      |  |
