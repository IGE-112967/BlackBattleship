package org.example.blackbattleship.selenideSuiteUserStory11.pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ShipArrangement {

    // ---------- SETUP ----------

    private final SelenideElement consentButton =
            $x("//button[contains(.,'Consent') or contains(.,'Accept')]");

    private final SelenideElement nicknameInput =
            $("input[type='text']");

    private final SelenideElement playVsRobot =
            $x("//button[contains(.,'Play vs robot')]");

    private final SelenideElement continueButton =
            $x("//button[contains(.,'Continue')]");

    // ---------- GAME ----------

    private SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    // ---------- SETUP ----------

    public void openGame() {
        open("https://papergames.io/en/battleship");
    }

    public void setupGame() {

        try {
            consentButton.shouldBe(visible, Duration.ofSeconds(5)).click();
        } catch (Exception ignored) {}

        playVsRobot.shouldBe(visible, Duration.ofSeconds(10)).click();

        nicknameInput.shouldBe(visible, Duration.ofSeconds(10))
                .setValue("Player");

        continueButton.shouldBe(visible, Duration.ofSeconds(10)).click();
    }

    // ---------- GAME ACTIONS ----------

    public void attack(int row, int col) {
        cell(row, col).click();
    }

    public String getState(int row, int col) {
        return cell(row, col).getAttribute("class");
    }
}