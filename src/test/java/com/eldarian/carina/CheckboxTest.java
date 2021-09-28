package com.eldarian.carina;

import com.eldarian.carina.gui.pages.SECheckboxPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckboxTest implements IAbstractTest {
    @BeforeClass
    public void replaceUrl() {
        R.CONFIG.put("url", "https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @Test
    public void MultipleCheckboxTest() {
        SECheckboxPage page = new SECheckboxPage(getDriver());
        page.open();
        page.checkAll();
        Assert.assertTrue(page.areAllChecked());

    }
}
