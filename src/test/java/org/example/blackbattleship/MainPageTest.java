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
    public void setUp() throws InterruptedException {
        open("https://www.jetbrains.com/");
        Thread.sleep(3000);

        if ($(".ch2-allow-all-btn").is(visible)) {
            $(".ch2-allow-all-btn").click();
        }

        Thread.sleep(3000);
    }

    @Test
    public void search() throws InterruptedException {
        mainPage.searchButton.click();
        Thread.sleep(1000);

        $("[data-test-id='search-input']").sendKeys("Selenium");
        $("[data-test-id='search-input']").click();

        $("input[data-test-id='search-input']").shouldHave(attribute("value", "Selenium"));

        Thread.sleep(3000);
    }

    @Test
    public void toolsMenu() throws InterruptedException {
        mainPage.toolsMenu.click();
        Thread.sleep(3000);

        $("div[data-test='main-submenu']").shouldBe(visible);
        $("body").shouldHave(text("JETBRAINS IDEs"));

        Thread.sleep(3000);
    }

    @Test
    public void navigationToAllTools() throws InterruptedException { //Teve de ser reajustada para todos os IDE's
        mainPage.toolsMenu.click();
        Thread.sleep(3000);

        mainPage.allIdesButton.click();
        Thread.sleep(3000);

        $("body").shouldHave(text("All IDEs"));
        assertTrue(Selenide.title().contains("IDEs"));

        Thread.sleep(3000);
    }
}