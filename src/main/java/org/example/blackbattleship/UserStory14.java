package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory14 {
    public SelenideElement battleshipThumbnail = $(".game-item:nth-child(1) .thumbnail");
    public SelenideElement leaderboardSection = $x("//a[contains(@href,'leaderboard') or contains(.,'Leaderboard')]");
    public SelenideElement rankingContent = $x("//table | //*[contains(@class,'leaderboard')]");

    public void openSite() {
        open("https://papergames.io/en/");
        executeJavaScript("window.scrollTo(0,0)");
    }

    public void goToBattleship() throws InterruptedException {
        battleshipThumbnail.click();
        Thread.sleep(1500);
        executeJavaScript("window.scrollTo(0,0)");
    }
}