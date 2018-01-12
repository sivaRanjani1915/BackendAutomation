Feature: Store Info Services


  Background:
    Then reset Service configs

  @StoreInfoSvc
  @SmokeTest
  Scenario Outline: get storeInfo by store id
    Given authorization token is created for guest user
    When get storeInfo, version '<version>' by store id '216'

    Examples:
      | version |
      | 3       |
      | 4       |
      | 5       |

  @StoreInfoSvc
  @SmokeTest
  Scenario Outline: Get Stores Near given Latitude and Longitude
    Given authorization token is created for guest user
    When get storeInfo, version '<version>' by store id '26'
    Then return stores near latitude 'optional', longitude 'optional', miles '5', number of stores '3'

    Examples:
      | version |
      | 3       |
      | 4       |
      | 5       |

  @StoreInfoSvc
  @SmokeTest
  Scenario Outline: Get Cache StoreInfo
    Given authorization token is created for guest user
    Then get storeInfo cache Version: '<version>'
    Examples:
      | version |
      | 3       |
      | 4       |
      | 5       |

  @WIP
  Scenario Outline: Clear Cache Stores
    Given authorization token is created for guest user
    Then clear storeInfo cache
    Examples:
      |  |
      |  |

  @StoreInfoSvc
  @SmokeTest
  Scenario Outline: Get Mobile StoreInfo
    Given authorization token is created for guest user
    Then get mobile storeInfo Version: '<version>'
    Examples:
      | version |
      | 3       |
      | 4       |
      | 5       |

  @StoreInfoSvc
  @SmokeTest
  Scenario Outline: Get Mobile storeInfo by Store Id
    Given authorization token is created for guest user
    Then get mobile storeInfo, version '<version>' by store id '26'
    Examples:
      | version |
      | 3       |
      | 4       |
      | 5       |
