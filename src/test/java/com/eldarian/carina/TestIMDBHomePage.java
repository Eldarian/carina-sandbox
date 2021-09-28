package com.eldarian.carina;

import com.eldarian.carina.gui.pages.IMDBHomePage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIMDBHomePage implements IAbstractTest {
    @BeforeClass
    public void replaceURL() {
        R.CONFIG.put("url", "https://www.imdb.com/");
    }
    @Test
    public void testMenuButton() {
        IMDBHomePage IMDBHomePage = new IMDBHomePage(getDriver());
        IMDBHomePage.open();
        IMDBHomePage.assertIsMenuInvisible();
        IMDBHomePage.openMenu();
        IMDBHomePage.assertIsMenuVisible();
    }
}
