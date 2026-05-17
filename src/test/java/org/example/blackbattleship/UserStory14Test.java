package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

/**
 * Page Test Class — US14: Visualizar Leaderboard.
 */
public class UserStory14Test {

    UserStory14 page = new UserStory14();

    @BeforeAll
    static void setUpAll() {
        Configuration.browserSize = "1152x614";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    /**
     * Verifica que o utilizador consegue aceder à página do Battleship
     * e que o conteúdo de classificações está visível.
     */
    @Test
    @DisplayName("US14 - Aceder ao Battleship e visualizar Leaderboard")
    void testLeaderboardVisibility() throws InterruptedException {
        page.openSite();
        page.goToBattleship();

        // Verifica que navegou para a página do Battleship
        org.junit.jupiter.api.Assertions.assertTrue(
                com.codeborne.selenide.Selenide.webdriver().driver().url().contains("battleship"),
                "Deve estar na página do Battleship"
        );

        page.leaderboardSection.shouldBe(visible);
    }
}