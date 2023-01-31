package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.SearchPageObject;

public class iOSSearchPageObject extends SearchPageObject
{
    static {
        SEARCH_INIT_ELEMENT = "id:Поиск по Википедии";
        SEARCH_INPUT = "xpath://XCUIElementTypeSearchField[@name='Поиск по Википедии']";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "xpath://XCUIElementTypeStaticText[@name='Язык программирования']";
        SEARCH_CANCEL_BUTTON = "id:Очистить текст";
        SEARCH_RESULT_ELEMENT = "xpath://XCUIElementTypeStaticText";
        SEARCH_EMPTY_RESULT_ELEMENT = "xpath://XCUIElementTypeStaticText[@name='Ничего не найдено']";
    }

    public iOSSearchPageObject(AppiumDriver driver)
    {
        super(driver);
    }
}
