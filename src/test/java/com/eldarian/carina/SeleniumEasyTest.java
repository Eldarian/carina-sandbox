package com.eldarian.carina;

import com.eldarian.carina.gui.pages.SeleniumEasyFormPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumEasyTest implements IAbstractTest {
    @BeforeClass
    public void replaceURL() {
        R.CONFIG.put("url", "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @Test
    public void assertMessageText() {
        SeleniumEasyFormPage page = new SeleniumEasyFormPage(getDriver());
        page.open();
        page.closePopup();
        String input = "Nabuho";
        page.inputToSimple(input);
        Assert.assertEquals(page.getMessage(), input);
    }

    @Test
    public void assertSum() {
        SeleniumEasyFormPage page = new SeleniumEasyFormPage(getDriver());
        page.open();
        page.closePopup();
        page.inputValues(2,4);
        page.getResult();
    }
}
