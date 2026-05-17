package org.example.blackbattleship;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

/**
 * User Story 12:
 * visualizar estado atual da partida.
 */
public class UserStory12 {

    /** tabuleiro adversário (onde atacas) */
    private final String enemyBoard = ".enemy-board, .opponent-board, table";

    /** tabuleiro do jogador */
    private final String playerBoard = ".player-board, .my-board";

    public boolean playerBoardVisible() {
        return $(playerBoard).exists();
    }

    public boolean enemyBoardVisible() {
        return $(enemyBoard).exists();
    }

    /** verifica se há progresso (hits ou misses aparecem na UI) */
    public boolean hasGameProgress() {
        return $(".hit").exists()
                || $(".miss").exists()
                || $(".particle").exists()
                || $(".target").exists();
    }
}