Feature: External Vendors

  Background:
    Then reset Service configs

  # TODO: Flipp CERT environment fails?
  @WIP
  Scenario Outline: Flipp Token
    Given authorization token is created for Flipp with ScopeType:
      | scopeType |
      | storeInfo |

    Examples:
      |  |
      |  |

  @PartnerToken
  @SmokeTest
  Scenario Outline: Kraft Token
    Given authorization token is created for Kraft with ScopeType:
      | scopeType |
      | facet     |

    Examples:
      |  |
      |  |

  @PartnerToken
  @SmokeTest
  Scenario Outline: Shipt Token
    Given authorization token is created for Shipt with ScopeType:
      | scopeType |
      | product   |
      | ilc       |

    Examples:
      |  |
      |  |

  @PartnerToken
  @SmokeTest
  Scenario Outline: Meijer Restricted Vendor Token
    Given authorization token is created for Meijer restricted vendors with ScopeType:
      | scopeType |
      | product   |
      | price     |

    Examples:
      |  |
      |  |

  @PartnerToken
  @SmokeTest
  Scenario Outline: Meijer Vendor Token
    Given authorization token is created for Meijer vendors with ScopeType:
      | scopeType |
      | product   |
      | ilc       |

    Examples:
      |  |
      |  |