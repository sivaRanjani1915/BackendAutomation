Feature: Pricing Base Services

  Background:
    Then reset Service configs

  @PricingBaseSvc
  @SmokeTest
  Scenario Outline: Get Pricing Details by UPC(s)
    Given authorization token is created for guest user
    Then get pricing details by storeId '158' and Upc
      | upcList |
      | 4011    |
      | 3283    |

    Examples:
      |  |
      |  |

  @PricingBaseSvc
  @SmokeTest
  Scenario Outline: Get Pricing Details by UPC
    Given authorization token is created for guest user
    Then get simple pricing by storeId '158' and Upc '3283'

    Examples:
      |  |
      |  |

  @PricingBaseSvc
  @SmokeTest
  Scenario Outline: Get Bottle Deposit by UPC and StoreId
    Given authorization token is created for guest user
    Then get bottle deposit by storeId '<storeId>' and Upc '<upc>'

    Examples:
      | storeId | upc       |
      | 26      | 827433333 |
      | 26      |           |
      |         | 827433333 |