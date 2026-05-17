package org.example.blackbattleship.selenideSuiteUserStory11.tests;

import com.codeborne.selenide.Configuration;
import org.example.blackbattleship.selenideSuiteUserStory11.pages.ShipArrangement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserStory11Test {

    private ShipArrangement game;

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";

        game = new ShipArrangement();

        game.openGame();
        game.setupGame();
    }

    @Test
    public void shouldAllowExtraTurnAfterHit() {

        int row1 = 3, col1 = 3;
        int row2 = 4, col2 = 4;

        // primeira jogada
        game.attack(row1, col1);
        String firstState = game.getState(row1, col1);

        // possível jogada extra
        game.attack(row2, col2);
        String secondState = game.getState(row2, col2);

        assertNotEquals(firstState, secondState);
    }
}