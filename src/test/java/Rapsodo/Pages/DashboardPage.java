package Rapsodo.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//a[@title='SHOP']")
    public WebElement shopMenuItem;

    @FindBy(xpath = "//a[@title='DIAMOND SPORTS']")
    public WebElement diamondSportsOption;
}
