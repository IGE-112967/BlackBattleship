package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory15 {
    public SelenideElement tournamentsMenu = $x("//a[contains(@href, 'tournaments') or contains(., 'Tournaments')]");
    public SelenideElement createTournamentButton = $x("//button[contains(., 'Create') or contains(., 'Tournament')]");

    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}