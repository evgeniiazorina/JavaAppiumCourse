package lib.ui;

import io.appium.java_client.AppiumDriver;

public class WelcomePageObject extends MainPageObject{

    private static final String
            STEP_LEARN_MORE_LINK = "id:Свободная энциклопедия",
            STEP_NEW_WAYS_TO_EXPLORE_TEXT = "id:Новые способы изучения",
            STEP_ADD_OR_EDIT_PREFERRED_LAND_LINK = "xpath://XCUIElementTypeStaticText[@name='Добавить или изменить предпочтительные языки']",
            STEP_LEARN_MORE_ABOUT_DATE_COLLECTED_LINK = "xpath://XCUIElementTypeButton[@name='Узнать подробнее о сборе данных']",
            NEXT_LINK = "xpath://XCUIElementTypeButton[@name='Далее']",
            GET_STARTED_LINK = "xpath://XCUIElementTypeButton[@name='Начать']",
            SKIP = "xpath://XCUIElementTypeButton[@name='Пропустить']";

    public WelcomePageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void waitForLearnMoreLink()
    {
        this.waitForElementPresent(
                STEP_LEARN_MORE_LINK,
                "Cannot find 'Свободная энциклопедия'",
                10
        );
    }

    public void clickNextButton()
    {
        this.waitForElementAndClick(
                NEXT_LINK,
                "Cannot find and click Next",
                10
        );
    }

    public void waitForNewWayToExploreText()
    {
        this.waitForElementPresent(
                STEP_NEW_WAYS_TO_EXPLORE_TEXT,
                "Cannot find 'Свободная энциклопедия'",
                10
        );
    }

    public void waitAddOrEditPreferredLangText()
    {
        this.waitForElementPresent(
                STEP_ADD_OR_EDIT_PREFERRED_LAND_LINK,
                "Cannot find AddOrEditPreferredLang",
                10
        );
    }

    public void waitForLearnMoreAboutDateCollectedText()
    {
        this.waitForElementPresent(
                STEP_LEARN_MORE_ABOUT_DATE_COLLECTED_LINK,
                "Cannot find LearnMoreAboutDateCollectedText",
                10
        );
    }

    public void clickGetStartedButton()
    {
        this.waitForElementAndClick(
                GET_STARTED_LINK,
                "Cannot find and click Get started button",
                10
        );
    }

    public void clickSkip()
    {
        this.waitForElementAndClick(
                SKIP,
                "Cannot find and click skip button",
                10
        );
    }
}
