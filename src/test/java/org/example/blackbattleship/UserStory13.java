package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory13 {
    public SelenideElement playRobotButton = $x("//button[contains(., 'Play with robot') or contains(., 'robot')]");
    public SelenideElement leaveGameButton = $x("//button[contains(., 'Leave') or contains(., 'Surrender')]");

    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}