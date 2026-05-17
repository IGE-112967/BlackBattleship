package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    private final SelenideElement consentButton =
            $x("//button[contains(.,'Consent') or contains(.,'Accept')]");

    private final SelenideElement nicknameInput =
            $("input[type='text']");

    private final SelenideElement playVsRobot =
            $x("//button[contains(.,'Play vs robot')]");

    private final SelenideElement continueButton =
            $x("//button[contains(.,'Continue')]");

    public void openGame() {
        open("https://papergames.io/en/battleship");
    }

    public void setupGame() {

        acceptCookiesIfPresent();   // 🔥 FIX REAL

        playVsRobot
                .shouldBe(visible, Duration.ofSeconds(15))
                .click();

        nicknameInput
                .shouldBe(visible, Duration.ofSeconds(15))
                .setValue("Player");

        continueButton
                .shouldBe(enabled, Duration.ofSeconds(15))
                .click();

        sleep(3000);
    }

    private void acceptCookiesIfPresent() {
        try {
            consentButton
                    .shouldBe(visible, Duration.ofSeconds(5))
                    .click();

            consentButton.shouldBe(hidden, Duration.ofSeconds(10));

        } catch (Exception ignored) {
        }
    }

    public void waitBoard() {
        // espera o tabuleiro existir
        $(".game-board, .board, table").shouldBe(visible, Duration.ofSeconds(20));
        // espera pelo primeiro estado jogável aparecer
        $(".cell-1-1, td, .cell").should(exist);

        sleep(1000);
    }
}