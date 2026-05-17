package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

/**
 * Page Test Class — US13: Jogar contra o Robot.
 * Verifica que é possível entrar numa sala de jogo e interagir com o tabuleiro.
 */
public class UserStory13Test {

    UserStory13 page = new UserStory13();

    @BeforeAll
    static void setUpAll() {
        Configuration.browserSize = "1152x614";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    /**
     * Verifica que o utilizador consegue iniciar um jogo contra o robot
     * e que o tabuleiro fica disponível para interação.
     */
    @Test
    @DisplayName("US13 - Iniciar jogo contra robot e interagir com tabuleiro")
    void testPlayVsRobotAndInteractWithBoard() throws InterruptedException {
        page.openSite();
        page.startGameVsRobot("123");

        // Verifica que entrou na sala de jogo (URL contém /r/)
        org.junit.jupiter.api.Assertions.assertTrue(
                com.codeborne.selenide.Selenide.webdriver().driver().url().contains("/r/"),
                "Deve estar numa sala de jogo"
        );

        // Verifica que o tabuleiro está visível
        page.targetCell.shouldBe(visible);
    }
}