package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$;

/**
 * Page Object da User Story 9:
 * impedir repetição de jogada numa célula já atacada.
 */
public class UserStory9 {

    private final SelenideElement playVsRobotButton =
            $x("//button[contains(.,'Play vs robot')]");

    private SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    /** inicia jogo */
    public void startGame() {
        playVsRobotButton.click();
    }

    /** ataca uma célula */
    public void attack(int row, int col) {
        cell(row, col).click();
    }

    /** estado atual da célula */
    public String state(int row, int col) {
        return cell(row, col).getAttribute("class");
    }
}