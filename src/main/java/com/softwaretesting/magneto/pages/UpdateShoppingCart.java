package com.softwaretesting.magneto.pages;

import com.softwaretesting.magneto.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateShoppingCart extends Utility
{
    private static final Logger log = LogManager.getLogger(UpdateShoppingCart.class.getName());

    public UpdateShoppingCart() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productQty;


    // @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement totalPrice ;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;


    public WebElement getProductName() {
        log.info("Clicking on login link : " + productName.toString());
        return productName;

    }

    public WebElement getTotalPrice() {
        log.info("Clicking on login link : " + totalPrice.toString());
        return totalPrice;
    }

    public WebElement getProductQty() {
        log.info("Clicking on login link : " + productQty.toString());
        return productQty;
    }

    public void clickOnProductName(){

        clickOnElement(productName);
        log.info("Clicking on login link : " + productName.toString());


    }

}
