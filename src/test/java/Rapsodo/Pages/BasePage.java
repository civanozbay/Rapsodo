package Rapsodo.Pages;

import Rapsodo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public abstract class BasePage {


    @FindBy(xpath = "//a[@title='View your shopping cart']")
    public WebElement shoppingCard;

    @FindBy(tagName = "bdi")
    public WebElement shoppingCardAmount;

    @FindBy(xpath = "//span[@class='sku']")
    public WebElement skuValue;

    @FindBy(xpath = "//div[@class='add-to-cart-btn']")
    public WebElement addToCartButton;

    @FindBy(id = "stripe_plan_id")
    public WebElement optionsDropdown;

    @FindBy(xpath = "//div[@class='woocommerce-variation-price']/span/span/bdi")
    public WebElement priceAfterPlan;

    @FindBy(xpath = "//input[@data-name='coupon_code']")
    public WebElement couponCodeInput;

    @FindBy(xpath = "(//button[@name='apply_coupon'])[1]")
    public WebElement applyCoupon;

    @FindBy(xpath = "(//a[@class='close'])[1]")
    public WebElement popUpCloseBtn;

    @FindBy(id = "cookie_action_close_header")
    public WebElement acceptCookie;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
