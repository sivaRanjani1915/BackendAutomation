Feature: Navigation Base Services

  Background:
    Then reset Service configs


  @NavBaseSvc
  @SmokeTest
  Scenario Outline: Get Tiers
    Given authorization token is created for guest user
    Then get tiers, depth by '1'

    Examples:
      |  |
      |  |

  @NavBaseSvc
  @SmokeTest
  Scenario Outline: Get Tiers by Tier Id
    Given authorization token is created for guest user
    Then get tier by tier Id 'T1', depth by '1'

    Examples:
      |  |
      |  |