package org.example.blackbattleship.selenideSuiteUserStory9.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GamePage {

    // ---------- SETUP ELEMENTS ----------

    private final SelenideElement consentButton =
            $x("//button[contains(.,'Consent') or contains(.,'Accept')]");

    private final SelenideElement nicknameInput =
            $("input[type='text']");

    private final SelenideElement playVsRobotButton =
            $x("//button[contains(.,'Play vs robot')]");

    private final SelenideElement continueButton =
            $x("//button[contains(.,'Continue')]");

    // ---------- GAME ELEMENTS ----------

    private final SelenideElement startGameButton =
            $x("//button[contains(.,'Play vs robot')]");

    private SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    // ---------- SETUP ACTIONS ----------

    public void openGame() {
        open("https://papergames.io/en/battleship");
    }

    public void setupGame() {

        acceptCookiesIfPresent();

        playVsRobotButton
                .shouldBe(visible, Duration.ofSeconds(10))
                .click();

        nicknameInput
                .shouldBe(visible, Duration.ofSeconds(10))
                .setValue("Player");

        continueButton
                .shouldBe(visible, Duration.ofSeconds(10))
                .click();
    }

    private void acceptCookiesIfPresent() {
        try {
            consentButton.shouldBe(visible, Duration.ofSeconds(5)).click();
        } catch (Exception ignored) {}
    }

    // ---------- GAME ACTIONS ----------

    public void startGame() {
        startGameButton.click();
    }

    public void attack(int row, int col) {
        cell(row, col).click();
    }

    public String getCellState(int row, int col) {
        return cell(row, col).getAttribute("class");
    }
}