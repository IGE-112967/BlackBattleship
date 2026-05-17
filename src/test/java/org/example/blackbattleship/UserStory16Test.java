package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

/**
 * Page Test Class — US16: Aceder a "My Tournaments".
 */
public class UserStory16Test {

    UserStory16 page = new UserStory16();

    @BeforeAll
    static void setUpAll() {
        Configuration.browserSize = "1152x614";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    /**
     * Verifica que o utilizador consegue aceder à secção "My Tournaments"
     * a partir da página do Battleship.
     */
    @Test
    @DisplayName("US16 - Aceder à secção My Tournaments")
    void testMyTournamentsAccess() throws InterruptedException {
        page.openSite();
        page.goToBattleship();

        page.myTournamentsLink.shouldBe(visible).click();
        Thread.sleep(1500);

        // Verifica que o URL mudou para a área de torneios
        org.junit.jupiter.api.Assertions.assertTrue(
                com.codeborne.selenide.Selenide.webdriver().driver().url().contains("tournament"),
                "Deve estar na página de torneios"
        );
    }
}