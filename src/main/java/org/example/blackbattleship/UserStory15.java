package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object Class — US15: Torneios.
 */
public class UserStory15 {

    /** Link de navegação para a secção de Torneios */
    public SelenideElement tournamentsMenu =
            $x("//a[contains(@href,'tournaments') or contains(.,'Tournaments')]");

    /** Botão para criar um novo torneio */
    public SelenideElement createTournamentButton =
            $x("//button[contains(.,'Create') or contains(.,'Tournament')]");

    /** Abre a página do jogo */
    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}