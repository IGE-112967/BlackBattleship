package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory15 {
    public SelenideElement battleshipImage = $(".game-item:nth-child(1) .img-fluid");
    public SelenideElement createTournamentButton = $(".position-relative > .front");
    public SelenideElement presentsCheckbox = $("#mat-mdc-checkbox-serverApp1-input");

    public void openSite() {
        open("https://papergames.io/en/");
    }

    public void goToBattleship() throws InterruptedException {
        battleshipImage.click();
        Thread.sleep(1500);
        executeJavaScript("window.scrollTo(0,0)");
    }
}