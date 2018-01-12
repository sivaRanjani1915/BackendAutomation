Feature: Partner Coordination Lay - StoreInfo Base Services

  Background:
    Then reset Service configs

  @PartnerStoreInfoSvc
  @PartnerLayer
  @SmokeTest
  Scenario Outline: Get StoreInfo - External Vendor
    Then authorization token is created for Meijer vendors with ScopeType:
      | scopeType |
      | all       |
    Then get storeInfo by store Id '<storeId>' - External Vendor
    Examples:
      | storeId |
      |         |
      | 26      |