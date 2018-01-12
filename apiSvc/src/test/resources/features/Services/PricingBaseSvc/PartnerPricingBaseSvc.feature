Feature: Partner Coordination Lay - Pricing Base Services

  Background:
    Then reset Service configs

  @PartnerPricingBaseSvc
  @PartnerLayer
  @SmokeTest
  Scenario Outline: Get Bottle Deposit by UPC and StoreId - Shipt
    Given authorization token is created for Shipt with ScopeType:
      | scopeType |
      | price     |
    Then get bottle deposit by storeId '<storeId>' and Upc '<upc>'

    Examples:
      | storeId | upc       |
      | 7       | 827433333 |
      | 7       |           |
      |         | 827433333 |