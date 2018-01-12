Feature: Nav Web App Services

  Background:
    Then reset Service configs

###############
# CREATE CART #
###############
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Create Cart - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then get users cart by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Create Cart - Sign In User
    When authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then get users cart by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Create Cart - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId 'optional'

    Examples:
      |  |
      |  |

###############
# DELETE CART #
###############
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Delete Cart - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then delete cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Delete Cart - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId 'optional'
    Then delete cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Delete Cart - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then delete cartId 'optional'

    Examples:
      |  |
      |  |

################
# ADD CUSTOMER #
################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Customer - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add customer information:
      | id | email                 | firstName | lastName | areaCode | phoneNumber |
      | 1  | randomEmail@email.com | FirstName | LastName | 616      | 9873694     |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Customer - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | verify48Hours@email.com | password1 |
    Then create cart for guest user: storeId '158'
    Then add customer by account id ''

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Customer - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for guest user: storeId '158'
    Then add customer information:
      | id | accountId | email                   | firstName | lastName | areaCode | phoneNumber |
      | 1  | 10657622  | jordan.palma@meijer.com | Jordan    | Palma    | 616      | 9853656     |

    Examples:
      |  |
      |  |

###################
# REMOVE CUSTOMER #
###################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Customer - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add customer information:
      | id | accountId | email                 | firstName | lastName | areaCode | phoneNumber |
      | 1  |           | randomEmail@email.com | FirstName | LastName | 616      | 9873694     |
    Then remove customer by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Customer - Sign In User
    When authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then remove customer by cartId 'optional'
    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Customer - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then remove customer by cartId 'optional'
    Then add customer information:
      | id | accountId | email                   | firstName | lastName | areaCode | phoneNumber |
      | 1  | 10657622  | jordan.palma@meijer.com | Jordan    | Palma    | 616      | 9853656     |

    Examples:
      |  |
      |  |

###############
# ADD PAYMENT #
###############
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Payment - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add payment information:
      | firstName    | lastName    |
      | FirstExample | LastExample |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Payment - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Payment - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |

    Examples:
      |  |
      |  |

##################
# REMOVE PAYMENT #
##################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Payment - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add payment information:
      | firstName    | lastName    |
      | FirstExample | LastExample |
    Then remove payment information by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Payment - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |
    Then remove payment information by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Payment - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |
    Then remove payment information by cartId 'optional'

    Examples:
      |  |
      |  |

###############
# ADD ITEM(S) #
###############
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Item(s) - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add item to users cart:
      | fGroupId | upc  | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4011 | 158     | BANANAS          | 1       | 0.53  | true             | 1                     | ea     |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Item(s) - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
      | 1        | 4011       | 158     | Banana           | 1       | 0.53  | true             | 0.5                   | ea     |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Item(s) - SSI User
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc  | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |

    Examples:
      |  |
      |  |

####################
# REMOVE ALL ITEMS #
####################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove All Items - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4011       | 158     | Banana           | 1       | 0.53  | true             | 0.5                   | ea     |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then remove ALL items by cartId 'optional'
    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline:  Remove All Items - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId '10657622'
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4011       | 158     | Banana           | 1       | 0.53  | true             | 0.5                   | ea     |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then remove ALL items by cartId 'optional'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline:  Remove All Items - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
      | 1        | 4011       | 158     | Banana           | 1       | 0.53  | true             | 0.5                   | ea     |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then remove ALL items by cartId 'optional'

    Examples:
      |  |
      |  |

###################
# ADD PICKUP SLOT #
###################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Pickup Slot - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add item to users cart:
      | fGroupId | upc         | storeId | itemName          | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 2        | 21306100000 | 158     | Meijer Party Tray | 1       | 22.99 | false            | 1                     |        |
    When user gets all available time slots by storeId '158', slotType '2'
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      | 3         | 6         | false     |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Pickup Slot - Sign In User
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId 'optional'
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      | 4         | 10        | true      |

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Add Pickup Slot - SSI
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      |           |           | true      |

    Examples:
      |  |
      |  |


######################
# REMOVE PICKUP SLOT #
######################
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Pickup Slot - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add item to users cart:
      | fGroupId | upc         | storeId | itemName          | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 2        | 21306100000 | 158     | Meijer Party Tray | 1       | 22.99 | false            | 0.0                   |        |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    When user gets all available time slots by storeId '158', slotType '3'
    Then add pickup slot, placeHold 'false'
    Then remove pickup slot

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Pickup Slot - Sign In User
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId '10657622'
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot, placeHold 'true'
    Then remove pickup slot

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Remove Pickup Slot - SSI
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then get cart by accountId 'optional'
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      |           |           | true      |
    Then remove pickup slot

    Examples:
      |  |
      |  |


################
# SUBMIT ORDER #
################
  @WIP
  Scenario Outline: Submit Order - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then add customer information:
      | accountId | email                 | firstName   | lastName   | areaCode | phoneNumber |
      |           | randomEmail@email.com | QaFirstName | QaLastName | 616      | 9846359     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    When user gets all available time slots by storeId '158', slotType '1'
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      |           |           | false     |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |
    Then add shipping information
    Then submit order

    Examples:
      |  |
      |  |

  @Submit
  Scenario Outline: Submit Order - Sign In User
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
      | 1        | 4011       | 158     | Banana           | 1       | 0.53  | true             | 0.5                   | ea     |
      | 1        | 4125004809 | 158     | Fuji Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot, placeHold 'true'
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |
    Then submit order

    Examples:
      |  |
      |  |

  @WIP
  Scenario Outline: Submit Order - SSI
    When authorization token is created for guest user
    When user gets all available time slots by storeId '158', slotType '1'
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then add item to users cart:
      | fGroupId | upc        | storeId | itemName         | itemQty | price | selectedByAltUoM | selectedAltWeightEach | altUoM |
      | 1        | 4125004807 | 158     | Gala Apples, Bag | 1       | 3.99  | false            | 0.0                   |        |
    Then add pickup slot:
      | dateIndex | slotIndex | placeHold |
      | 5         | 9         | true      |
    Then add payment information:
      | firstName | lastName |
      | optional  | optional |
    Then submit order

    Examples:
      |  |
      |  |

#############
# SET STORE #
#############
  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Set Customer's Store - Guest
    When authorization token is created for guest user
    Then create cart for guest user: storeId '158'
    Then set store to storeId: '50'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Set Customer's Store - Sign In User
    Given authorization token is created for Sign in user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for login user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then set store to storeId: '26'

    Examples:
      |  |
      |  |

  @NavWebAppSvc
  @SmokeTest
  Scenario Outline: Set Customer's Store - SSI
    Given authorization token is created for SSI user:
      | email                   | password  |
      | jordan.palma@meijer.com | password1 |
    Then create cart for SSI user:
      | id | accountId | eGuestId | mPerksId | firstName | lastName | email                   | customerPostalCode | storeId | areaCode | phoneNumber |
      | 1  | 10657622  |          |          | Jordan    | Palma    | jordan.palma@meijer.com | 49525              | 158     | 616      | 9853656     |
    Then set store to storeId: '50'

    Examples:
      |  |
      |  |