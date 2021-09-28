package com.eldarian.carina.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SECheckboxPage extends AbstractPage {

    public SECheckboxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='checkbox' and @class='cb1-element']")
    private List<ExtendedWebElement> checkboxes;

    @FindBy(id="check1")
    private ExtendedWebElement button;

    public void checkAll() {
        for(ExtendedWebElement box : checkboxes) {
            box.click();
        }
    }

    public boolean areAllChecked() {
        return button.getAttribute("value").equals("Uncheck All");
    }
}
