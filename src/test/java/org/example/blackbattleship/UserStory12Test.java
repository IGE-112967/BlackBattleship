package org.example.blackbattleship.selenideSuiteUserStory12.tests;

import com.codeborne.selenide.Configuration;
import org.example.blackbattleship.selenideSuiteUserStory12.pages.GameStatePage;
import org.example.blackbattleship.BasePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserStory12Test {

    private BasePage base;
    private GameStatePage gameState;

    @BeforeEach
    public void setup() {

        Configuration.browserSize = "1280x800";

        base = new BasePage();
        gameState = new GameStatePage();

        base.openGame();
        base.setupGame();
        base.waitBoard();
    }

    @Test
    public void shouldShowGameStateCorrectly() {

        // 1. tabuleiro do jogador visível
        assertTrue(gameState.isPlayerBoardVisible());

        // 2. tabuleiro do adversário visível
        assertTrue(gameState.isEnemyBoardVisible());

        // 3. existe progresso na UI (hits/misses/etc)
        assertTrue(gameState.hasGameProgress());
    }
}