package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://www.jetbrains.com/");
        if (mainPage.acceptCookiesButton.exists()) {
            mainPage.acceptCookiesButton.click();
        }
    }

    @Test
    public void search() throws InterruptedException {
        mainPage.searchButton.click();
        Thread.sleep(1000);

        mainPage.searchInput.sendKeys("Selenium");

        mainPage.searchInput.shouldHave(attribute("value", "Selenium"));

        mainPage.searchInput.pressEnter();
    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();
        mainPage.seeDeveloperToolsButton.shouldBe(visible);
    }

    @Test
    public void navigationToAllTools() throws InterruptedException {
        mainPage.toolsMenu.click();
        Thread.sleep(1000);

        mainPage.findYourToolsButton.click();
        Thread.sleep(2000);

        assertTrue(webdriver().driver().url().contains("/products/"));
        assertEquals("All Developer Tools and Products by JetBrains", title());
    }
}