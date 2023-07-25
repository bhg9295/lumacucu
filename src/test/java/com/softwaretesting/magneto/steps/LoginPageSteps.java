package com.softwaretesting.magneto.steps;

import com.softwaretesting.magneto.pages.GearTest;
import com.softwaretesting.magneto.pages.MenTest;
import com.softwaretesting.magneto.pages.WomenTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @Given("I am on luma page")
    public void iAmOnLumaPage() {
    }

    @When("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenTest().setWomen();
    }

    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new WomenTest().setTop();
    }

    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new WomenTest().clickOnJacket();
    }

    @And("I Mouse jackets name list")
    public void iMouseJacketsNameList() {
        new WomenTest().setJacketsNameListAfter();
    }

    @And("I Select Sort By filter “Product Name”")
    public void iSelectSortByFilterProductName() {
      // new WomenTest().realProductName();
        new WomenTest().selectProductName();
    }

    @Then("I Verify the products name display in alphabetical order")
    public void iVerifyTheProductsNameDisplayInAlphabeticalOrder(String actual) {
        String expected ="Adrienne Trek Jacket";
     //  String actual = new  GetTextFromElement(By.xpath("//a[contains(text(),'Adrienne Trek Jacket')]"));
        Assert.assertEquals(actual,expected);
    }


    @When("Mouse Hover on Women Menu")
    public void mouseHoverOnWomenMenu() {
        new WomenTest().setWomen1 ();
    }

    @And("Mouse Hover on Tops")
    public void mouseHoverOnTops() {
        new WomenTest(). setTop1 ();
    }

    @And("Click on Jackets")
    public void clickOnJackets() {
        new WomenTest().clickOnJacket1 ();
    }

    @And("Click on real price")
    public void clickOnRealPrice() {
        new WomenTest().realPrice ();
    }

    @And("I Select Product price")
    public void iSelectProductPrice() {
        new WomenTest().selectProductPrice ();
    }

    @And("Select Sort By filter “Price”")
    public void selectSortByFilterPrice() {
        new WomenTest().setJacketsPriceListAfter ();
    }

    @Then("Verify the products price display in Low to")
    public void verifyTheProductsPriceDisplayInLowTo(String actual ,String expected) {
        new WomenTest().setJacketsPriceListAfter ();
    }

    @When("Mouse Hover on Men Menu")
    public void mouseHoverOnMenMenu() {
        new MenTest().setMen();
    }

    @And("I Mouse Hover on bottom")
    public void iMouseHoverOnBottom() {
        new MenTest().setBottom();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new MenTest().setPants();
    }

    @And("I Mouse Hover on product name ‘Cronus Yoga Pant’")
    public void iMouseHoverOnProductNameCronusYogaPant() {
        new MenTest().setYogaPant();
    }

    @And("I  click on size {int}.")
    public void iClickOnSize(int arg0) {
        new MenTest().setSize();
    }

    @And("I  click on colour Black.")
    public void iClickOnColourBlack() {
        new MenTest().setBlackColour();
    }

    @And("I click on ‘Add To Cart’ Button.")
    public void iClickOnAddToCartButton() {
        new MenTest().clickOnAddToCart();
    }



    @And("Click on ‘shopping cart’ Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new MenTest().clickOnShoppingCart();
    }

    @And("Verify the text ‘Shopping Cart.’")
    public void verifyTheTextShoppingCart() {
        new MenTest().verifyMessage1();



    }

    @And("Verify the product name ‘Cronus Yoga Pant’")
    public void verifyTheProductNameCronusYogaPant() {
        new MenTest() .verifyMessage2();

    }

    @And("Verify the product size ‘{int}’")
    public void verifyTheProductSize(int arg0) {
        new MenTest().verifyMessage3();

    }

    @Then("Verify the product colour ‘Black’")
    public void verifyTheProductColourBlack() {
        new MenTest() .verifyMessage4();

    }

    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new GearTest().setGear();

    }
    @And("I  Click on Bags")
    public void iClickOnBags() {
        new GearTest().setBag();
    }

    @And("I Click on Product Name ‘Overnight Duffle’")
    public void iClickOnProductNameOvernightDuffle() {
        new GearTest().clickOnProduct();
    }

    @And("Verify the text ‘Overnight Duffle’")
    public void verifyTheTextOvernightDuffle() {
        new GearTest(). getText();
    }

    @And("I  Change Qty {int}")
    public void iChangeQty(int arg0) {
        new GearTest() .setProductQty("3");
    }

    @And("I  Click on button ‘Add to Cart’ Button.")
    public void iClickOnButtonAddToCartButton() {
        new GearTest() .clickOnAddToCart();
    }

    @And("I Verify the text {string}")
    public void iVerifyTheText(String arg0) {
        new GearTest() .getText1();

    }

    @And("I Click on ‘shopping cart’ Link into message")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new GearTest()  .clickOnShoppingCart();
    }


    @And("I Verify the Qty is ‘{int}’")
    public void iVerifyTheQtyIs(int arg0) {
        new GearTest().verifyProductQty();
    }
}
