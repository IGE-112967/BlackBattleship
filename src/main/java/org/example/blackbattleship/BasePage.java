package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {
    private final SelenideElement consentButton = $x("//p[contains(text(),'Consent')]");// popup cookies
    private final SelenideElement nicknameInput = $("input[type='text']"); // nickname
    private final SelenideElement playVsRobot = $x("//button[contains(.,'Play vs robot')]"); // botão jogar
    private final SelenideElement continueButton = $x("//button[contains(.,'Continue')]");

    /** Abre o jogo. */
    public void openGame() {
        open("https://papergames.io/en/battleship");
    }

    /** Faz setup inicial: cookies + nickname + iniciar jogo. */
    public void setupGame() {
        // aceitar cookies
        if (consentButton.shouldBe(visible).exists()) {
            consentButton.click();
        }
        // iniciar jogo
        playVsRobot.shouldBe(visible).click();
        // inserir nickname
        nicknameInput.shouldBe(visible).setValue("Player");
        continueButton.shouldBe(visible).shouldBe(enabled).click();
        sleep(2000);
    }
}