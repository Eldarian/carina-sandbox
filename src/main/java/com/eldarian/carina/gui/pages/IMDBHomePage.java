package com.eldarian.carina.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IMDBHomePage extends AbstractPage {
    @FindBy(xpath = "//div[text()='Menu']")
    private ExtendedWebElement menuButton;

    @FindBy(xpath = "//div[@data-testid='panel']")
    private ExtendedWebElement menuPanel;

    public IMDBHomePage(WebDriver driver) {
        super(driver);
    }

    public void openMenu() {
        menuButton.click();
    }

    public void assertIsMenuVisible() {
        Assert.assertEquals(menuPanel.getAttribute("aria-hidden"), "false");
        Assert.assertTrue(menuPanel.isVisible());
    }

    public void assertIsMenuInvisible() {
        Assert.assertFalse(menuPanel.isVisible());
    }
}
