package org.example.blackbattleship;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

public class UserStory15Test {
    UserStory15 page = new UserStory15();

    @Test
    @DisplayName("US15 - Deve conseguir aceder à página de Torneios")
    void testTournamentsPage() throws InterruptedException {
        page.openSite();
        Thread.sleep(1000);

        page.tournamentsMenu.shouldBe(visible).click();
        Thread.sleep(2000);

        page.createTournamentButton.shouldBe(visible);
    }
}