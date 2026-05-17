package org.example.blackbattleship.selenideSuiteUserStory12.pages;

import static com.codeborne.selenide.Selenide.$;

/**
 * Page Object para validar estado visual do jogo.
 */
public class GameStatePage {

    // tabuleiros (flexível porque o site muda classes)
    private final String playerBoard =
            ".player-board, .my-board, .board-player";

    private final String enemyBoard =
            ".enemy-board, .opponent-board, .board-opponent, table";

    // elementos de progresso do jogo
    private final String hit =
            ".hit";

    private final String miss =
            ".miss";

    private final String target =
            ".target, .cell-hit, .cell-miss";

    // ---------- VISIBILIDADE ----------

    public boolean isPlayerBoardVisible() {
        return $(playerBoard).exists();
    }

    public boolean isEnemyBoardVisible() {
        return $(enemyBoard).exists();
    }

    // ---------- PROGRESSO DO JOGO ----------

    public boolean hasGameProgress() {
        return $(hit).exists()
                || $(miss).exists()
                || $(target).exists();
    }
}