package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

/**
 * Page Test Class — US15: Criar Torneio.
 */
public class UserStory15Test {

    UserStory15 page = new UserStory15();

    @BeforeAll
    static void setUpAll() {
        Configuration.browserSize = "1152x614";
        Configuration.timeout = 10000;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    /**
     * Verifica que o utilizador consegue aceder ao formulário de criação de torneio
     * e que a opção de presentes está disponível.
     */
    @Test
    @DisplayName("US15 - Criar torneio e verificar opção de presentes")
    void testCreateTournamentWithPresents() throws InterruptedException {
        page.openSite();
        page.goToBattleship();

        page.createTournamentButton.shouldBe(visible).click();
        Thread.sleep(1500);

        // Verifica que a checkbox de "Presents" está disponível e clica nela
        page.presentsCheckbox.shouldBe(visible).click();
        Thread.sleep(500);

        // Verifica que a checkbox ficou selecionada
        org.junit.jupiter.api.Assertions.assertTrue(
                page.presentsCheckbox.isSelected(),
                "A opção de presentes deve estar selecionada"
        );
    }
}