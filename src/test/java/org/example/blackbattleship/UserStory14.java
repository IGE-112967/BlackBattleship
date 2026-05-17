package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory14 {
    // Localizador para o botão do Leaderboard no menu ou página
    public SelenideElement leaderboardMenu = $x("//a[contains(@href, 'leaderboards') or contains(., 'Leaderboard')]");

    // Tabela de classificações
    public SelenideElement rankingTable = $x("//table | //*[contains(@class, 'leaderboard')]");

    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}