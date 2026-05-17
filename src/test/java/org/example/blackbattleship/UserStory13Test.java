package org.example.blackbattleship;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

public class UserStory13Test {
    UserStory13 page = new UserStory13();

    @Test
    @DisplayName("US13 - Deve conseguir iniciar jogo e ter opção de sair/desistir")
    void testLeaveGameOption() throws InterruptedException {
        page.openSite();
        page.playRobotButton.shouldBe(visible).click();
        Thread.sleep(3000); // Aguarda a entrada na sala

        page.leaveGameButton.shouldBe(visible);
    }
}