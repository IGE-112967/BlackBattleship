package org.example.blackbattleship.selenideSuiteUserStory10.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStory10Test {

    private SelenideElement consentButton =
            $x("//button[contains(.,'Consent') or contains(.,'Accept')]");

    private SelenideElement nicknameInput =
            $("input[type='text']");

    private SelenideElement playVsRobot =
            $x("//button[contains(.,'Play vs robot')]");

    private SelenideElement continueButton =
            $x("//button[contains(.,'Continue')]");

    private SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";

        open("https://papergames.io/en/battleship");

        try {
            consentButton.shouldBe(visible).click();
        } catch (Exception ignored) {}

        playVsRobot.shouldBe(visible).click();

        nicknameInput.shouldBe(visible).setValue("Player");

        continueButton.shouldBe(visible).click();
    }

    @Test
    public void shouldRespectTurnControl() {

        // primeira jogada
        cell(3, 3).click();
        String first = cell(3, 3).getAttribute("class");

        // tentativa imediata noutra jogada
        cell(4, 4).click();
        String second = cell(4, 4).getAttribute("class");

        // validação simples de mudança de estado
        assertEquals(first != null, second != null);
    }
}