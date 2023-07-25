@regression
Feature: Testcases for women men and gear
  As user I want search  Job  Test in cv library

@sanity
Scenario: As a user verify The Sort By Product Name Filter
  Given I am on luma page
  When I Mouse Hover on Women Menu
  And I Mouse Hover on Tops
  And I Click on Jackets
  And I Mouse jackets name list
  And I Select Sort By filter “Product Name”
  Then I Verify the products name display in alphabetical order
@smoke
  Scenario: As a user verifyTheSortByPriceFilter
    Given I am on luma page
    When  Mouse Hover on Women Menu
    And Mouse Hover on Tops
    And Click on Jackets
    And  Click on real price
    And I Select Product price
    And Select Sort By filter “Price”
    Then Verify the products price display in Low to

@smoke
    Scenario: As a userShouldAddProductSuccessFullyTo ShoppinCart
      Given I am on luma page
      When  Mouse Hover on Men Menu
      And I Mouse Hover on bottom
      And  I Click on Pants
      And  I Mouse Hover on product name ‘Cronus Yoga Pant’
      And I  click on size 32.
      And I  click on colour Black.
      And I click on ‘Add To Cart’ Button.
#      And  Verify the text "You added Cronus Yoga Pant to your shopping cart"
      And Click on ‘shopping cart’ Link into message

      And Verify the text ‘Shopping Cart.’
      And Verify the product name ‘Cronus Yoga Pant’
      And Verify the product size ‘32’
      Then Verify the product colour ‘Black’
@regression
 Scenario: As a user Should Add Product SuccessFully To shopping Cart
   Given I am on luma page
   When  I Mouse Hover on Gear Menu
   And  I  Click on Bags
   And  I Click on Product Name ‘Overnight Duffle’
   And Verify the text ‘Overnight Duffle’
    And I  Change Qty 3
   And I  Click on button ‘Add to Cart’ Button.
   And  I Verify the text "You added Overnight Duffle to your shopping cart"
   And I Click on ‘shopping cart’ Link into message
   And I Verify the Qty is ‘3’



















