package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class UserStory11 {

    /**
     * Seleciona células clicáveis do tabuleiro inimigo.
     * (PaperGames não usa .cell-x-y)
     */
    public SelenideElement cell(int index) {
        return $$(".game-board td, .game-board div, .board td, .board div")
                .get(index);
    }

    public void attack(int index) {

        SelenideElement cell = cell(index)
                .shouldBe(visible, Duration.ofSeconds(10))
                .scrollIntoView(true);

        try {
            cell.click();
        } catch (Exception e) {
            // força clique ignorando SVG/waves overlay
            executeJavaScript(
                    "arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true, cancelable:true}));",
                    cell
            );
        }
    }

    public String state(int index) {
        return cell(index).getAttribute("class");
    }

    public boolean wasHit(int index) {
        String state = state(index);
        return state != null &&
                (state.contains("hit")
                        || state.contains("target")
                        || state.contains("particle")
                        || state.contains("ship"));
    }

    public boolean isPlayableCell(int index) {
        SelenideElement c = cell(index);

        if (!c.exists()) return false;

        String state = c.getAttribute("class");
        if (state == null) return false;

        return !state.contains("hit")
                && !state.contains("miss")
                && !state.contains("particle");
    }
}