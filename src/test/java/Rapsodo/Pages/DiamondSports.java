package Rapsodo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiamondSports extends BasePage{
    @FindBy(xpath = "(//div/a[@href='https://rapsodo.com/product/rapsodo-hitting-monitor/'])[1]")
    public WebElement productHıttıng;
}
