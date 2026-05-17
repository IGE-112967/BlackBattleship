package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.visible;

public class UserStory14Test {
    UserStory14 page = new UserStory14();

    @BeforeAll
    static void setUpAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    @DisplayName("US14 - Deve conseguir aceder e visualizar a tabela de classificações")
    void testLeaderboardVisibility() throws InterruptedException {
        page.openSite();
        Thread.sleep(1000); // Pausa visual

        page.leaderboardMenu.shouldBe(visible).click();
        Thread.sleep(2000);

        page.rankingTable.shouldBe(visible);
    }
}