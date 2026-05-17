package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory16 {
    public SelenideElement profileAvatar = $x("//*[contains(@class, 'avatar') or contains(@class, 'profile')]");
    public SelenideElement statisticsPanel = $x("//*[contains(text(), 'Statistics') or contains(text(), 'Games played')]");

    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}