package com.softwaretesting.magneto.pages;

import com.softwaretesting.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearTest extends Utility
{
    private static final Logger log = LogManager.getLogger(GearTest.class.getName());

    public GearTest() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement gear;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bag;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement text1;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;



    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productQty;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement productPrice;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span)[2]")
    WebElement newPrice;

    //By gear = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
   // By bag = By.xpath("//span[normalize-space()='Bags']");
   // By product = By.xpath("//a[normalize-space()='Overnight Duffle']");
    //By text = By.xpath("//span[@class='base']");
   // By qty = By.xpath("//input[@id='qty']");
   // By addToCart = By.xpath("//button[@id='product-addtocart-button']");
   // By text1 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
   // By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
   //By productName = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[2]/tr[1]/td[1]/div[1]/strong[1]/a[1]");
   // By productQty = By.xpath("//input[@title='Qty']");
   // By productPrice = By.xpath("//span[@class='cart-price']//span)[2]");
   // By changeQty = By.xpath("(//input[@class='input-text qty'])[1]");
   // By updateCart = By.xpath("//span[contains(text(),'Update Shopping Cart')]");
    //By newPrice = By.xpath("//span[@class='cart-price']//span)[2]");

    //userShouldAddProductSuccessFullyTo ShoppingCart

    public void setGear()
    {
        //* Mouse Hover on Gear Menu
        mouseHoverToElement(gear);
        log.info("Clicking on login link : " + gear.toString());

    }
    public void setBag()
    {
        //* Click on Bags
        clickOnElement(bag);
        log.info("Clicking on login link : " + bag.toString());

    }
    public void clickOnProduct()
    {
        //* Click on Product Name ‘Overnight Duffle
        clickOnElement(product);
        log.info("Clicking on login link : " + product.toString());
    }
    public void getText()
    {
        //* Verify the text ‘Overnight Duffle
        getTextFromElement(text);
        log.info("Clicking on login link : " + text.toString());
    }
    public void setProductQty(String qty1)
    {
        //* Change Qty 3


        sendTextToElement(qty,qty1);
        log.info("Clicking on login link : " + qty.toString());
    }
    public void clickOnAddToCart()
    {
        //* Click on ‘Add to Cart’ Button
        clickOnElement(addToCart);
        log.info("Clicking on login link : " + addToCart.toString());
    }
    public void getText1()
    {
        //* Verify the text
        getTextFromElement(text1);
        log.info("Clicking on login link : " + text1.toString());
    }
    public void clickOnShoppingCart()
    {
        //* Click on ‘shopping cart’ Link into
        clickOnElement(shoppingCart);
        log.info("Clicking on login link : " + shoppingCart.toString());

    }

    public void verifyProductQty()
    {
        //* Verify the Qty is ‘3’
        getTextFromElement(productQty);
        log.info("Clicking on login link : " + productQty.toString());
    }
    public void veirfyProductPrice()
    {
        //* Verify the product price ‘$135.00’
        getTextFromElement(productPrice);
        log.info("Clicking on login link : " + productPrice.toString());
    }
    public void changeQty(String qty2)
    {
        //Change Qty to ‘5’

        sendTextToElement(changeQty,qty2);
        log.info("Clicking on login link : " + changeQty.toString());

    }
    public void setUpdateCart()
    {
        //Click on ‘Update Shopping Cart’ button
        clickOnElement(updateCart);
        log.info("Clicking on login link : " + updateCart.toString());

    }
    public void verifyProductPrice()
    {
        //Verify the product price ‘$225.00’
        getTextFromElement(newPrice);
        log.info("Clicking on login link : " + newPrice.toString());
    }


}
