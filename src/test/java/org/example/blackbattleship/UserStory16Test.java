package org.example.blackbattleship;

import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

public class UserStory16Test {
    UserStory16 page = new UserStory16();

    @Test
    @DisplayName("US16 - Deve conseguir aceder ao perfil e ver estatísticas")
    void testProfileStatistics() throws InterruptedException {
        page.openSite();
        Thread.sleep(2000);

        page.profileAvatar.shouldBe(visible).click();
        Thread.sleep(1500);

        page.statisticsPanel.shouldBe(visible);
    }
}