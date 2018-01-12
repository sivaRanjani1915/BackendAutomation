Feature: Order Base Services

  Background:
    Then reset Service configs


  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Get Order By Order Id
    Given authorization token is created for guest user
    Then get Order by Order Id '10002063'

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Is Order Editable by Order Id
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
    Then get active '' Order Summary by AccountId 'optional'
    Then is Order Editable By Order Id ''

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Is Order Cancellable by Order Id
    Given authorization token is created for guest user
    Then is Order cancellable By Order Id '10010920'

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Cancel Order by Order Id
    Given authorization token is created for guest user
    Then cancel order '10010921' by Order Id

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Get Order Details By AccountId And OrderId
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
#    Then get Order History Details by OrderId '10010921'
    Then get all Active Orders Info By Account Id ''
    Then get Order History Details by OrderId ''

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Get all active Order Summaries By AccountId
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
    Then get active 'true' Order Summary by AccountId 'optional'

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Get all inactive Order Summaries By AccountId
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
    Then get active 'false' Order Summary by AccountId 'optional'

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: Update Active Order Pickup Slot
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
    Then get all Active Orders Info By Account Id ''
    Then get Order History Details by OrderId ''
    Then Update editable order id '' pickup time
      | dateIndex | slotIndex |
      | 3         | 15        |

    Examples:
      |  |
      |  |

  @OrderBaseSvc
  @SmokeTest
  Scenario Outline: get all Active Orders Info By Account Id
    Given authorization token is created for Sign in user:
      | email                  | password  |
      | meijer_auto8@email.com | password1 |
#    Then get all Active Orders Info By Account Id ''
    Then get all Editable Orders By Account Id ''

    Examples:
      |  |
      |  |