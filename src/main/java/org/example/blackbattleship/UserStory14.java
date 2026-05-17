package org.example.blackbattleship.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static jdk.internal.misc.ThreadFlock.open;

/**
 * Page Object Class — US14: Tabela de Classificações (Leaderboard).
 */
public class UserStory14 {

    /** Link de navegação para o Leaderboard */
    public SelenideElement leaderboardMenu =
            $x("//a[contains(@href,'leaderboards') or contains(.,'Leaderboard')]");

    /** Tabela de ranking dos jogadores */
    public SelenideElement rankingTable =
            $x("//table | //*[contains(@class,'leaderboard')]");

    /** Abre a página do jogo */
    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}