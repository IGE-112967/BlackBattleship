package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory16 {
    public SelenideElement battleshipImage = $(".game-item:nth-child(1) .img-fluid");
    public SelenideElement myTournamentsLink = $x("//span[contains(.,'My tournaments')]");

    public void openSite() {
        open("https://papergames.io/en/");
    }

    public void goToBattleship() throws InterruptedException {
        battleshipImage.click();
        Thread.sleep(1500);
        executeJavaScript("window.scrollTo(0,0)");
    }
}