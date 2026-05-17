package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.example.blackbattleship.selenideSuiteUserStory9.pages.GamePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory9Test {

    private GamePage game;

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";

        game = new GamePage();

        game.openGame();
        game.setupGame();
        game.startGame();
    }

    @Test
    public void shouldPreventRepeatedMoveOnSameCell() {

        int row = 2;
        int col = 3;

        game.attack(row, col);
        String firstState = game.getCellState(row, col);

        game.attack(row, col);
        String secondState = game.getCellState(row, col);

        assertEquals(firstState, secondState);
    }
}