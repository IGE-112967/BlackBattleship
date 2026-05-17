package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.*;
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
        $(".ch2-allow-all-btn").shouldBe(visible).click();
    }

    @Test
    public void search() {
        mainPage.searchButton.click();

        $("[data-test-id='search-input']").sendKeys("Selenium");
        $("[data-test-id='search-input']").click();

        $("input[data-test-id='search-input']").shouldHave(attribute("value", "Selenium"));
    }

    @Test
    public void toolsMenu() {
        mainPage.toolsMenu.click();
        $("div[data-test='main-submenu']").shouldBe(visible);
        $("body").shouldHave(text("JETBRAINS IDEs"));
    }

    @Test
    public void navigationToAllTools() { //Teve de ser reajustada para todos os IDE's
        mainPage.toolsMenu.click();
        mainPage.allIdesButton.click();
        $("body").shouldHave(text("All IDEs"));
        assertTrue(Selenide.title().contains("IDEs"));
    }
}