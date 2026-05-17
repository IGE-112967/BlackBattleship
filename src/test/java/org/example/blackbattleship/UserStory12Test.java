package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * User Story 12:
 * visualizar estado da partida.
 */
public class UserStory12Test {

    private BasePage page;
    private UserStory12 user;

    @BeforeEach
    public void setup() {

        Configuration.browserSize = "1280x800";

        page = new BasePage();
        user = new UserStory12();

        page.openGame();
        page.setupGame();
        page.waitBoard();
    }

    @Test
    public void UserStory12_viewGameState() {

        // 1. jogador vê tabuleiro dele
        assertTrue(user.playerBoardVisible());

        // 2. jogador vê tabuleiro adversário
        assertTrue(user.enemyBoardVisible());

        // 3. após interação, existe progresso visível
        assertTrue(user.hasGameProgress());
    }
}