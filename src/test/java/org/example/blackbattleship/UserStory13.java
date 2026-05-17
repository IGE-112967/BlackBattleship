package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object Class — US13: Jogar contra o Robot e interagir com presentes no tabuleiro.
 */
public class UserStory13 {

    /** Imagem/thumbnail do jogo Battleship na página principal */
    public SelenideElement battleshipImage =
        $("css=.game-item:nth-child(1) .img-fluid");

    /** Botão "Play vs robot" */
    public SelenideElement playVsRobotButton =
        $x("//span[contains(.,'Play vs robot')]");

    /** Campo de input do nickname */
    public SelenideElement nicknameInput = $(".input-xl");

    /** Célula com presente no tabuleiro do adversário */
    public SelenideElement giftCell = $(".gift");

    /** Célula com presente já apanhado */
    public SelenideElement giftTakenCell = $(".gift-taken");

    /** Célula alvo no tabuleiro */
    public SelenideElement targetCell = $(".target");

    /** Abre a página principal do papergames */
    public void openSite() {
        open("https://papergames.io/en/");
        executeJavaScript("window.scrollTo(0,0)");
    }

    /** Navega para o Battleship e inicia jogo contra o robot */
    public void startGameVsRobot(String nickname) throws InterruptedException {
        $(".game-item:nth-child(1) .img-fluid").click();
        Thread.sleep(1500);
        executeJavaScript("window.scrollTo(0,0)");

        // Clica em "Play vs robot"
        executeJavaScript("arguments[0].click();",
            $x("//span[contains(.,'Play vs robot')]").toWebElement());
        Thread.sleep(1000);

        // Introduz o nickname e confirma com Enter
        nicknameInput.setValue(nickname).pressEnter();
        Thread.sleep(3000);
    }
}
