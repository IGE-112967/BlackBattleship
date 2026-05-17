package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Page Object Model da User Story 2.
 *
 * Objetivo:
 * validar o sistema de turnos do jogo.
 */
public class UserStory2 {

    /**
     * Retorna uma célula do tabuleiro inimigo.
     */
    public SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    /**
     * Ataca uma célula.
     */
    public void attack(int row, int col) {
        cell(row, col).click();
    }

    /**
     * Obtém o estado visual da célula.
     */
    public String state(int row, int col) {
        return cell(row, col).getAttribute("class");
    }

    public boolean isClickable(int row, int col) {
        return cell(row, col).isEnabled();
    }
}