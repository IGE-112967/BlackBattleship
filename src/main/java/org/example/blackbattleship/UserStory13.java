package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserStory13 {
    public SelenideElement battleshipImage = $(".game-item:nth-child(1) .img-fluid");
    public SelenideElement playVsRobotButton = $x("//span[contains(.,'Play vs robot')]");
    public SelenideElement nicknameInput = $(".input-xl");
    public SelenideElement targetCell = $(".target");
    public SelenideElement giftCell = $(".gift");
    public SelenideElement giftTakenCell = $(".gift-taken");

    public void openSite() {
        open("https://papergames.io/en/");
        executeJavaScript("window.scrollTo(0,0)");
    }

    public void startGameVsRobot(String nickname) throws InterruptedException {
        battleshipImage.click();
        Thread.sleep(1500);
        executeJavaScript("arguments[0].click();", playVsRobotButton.toWebElement());
        Thread.sleep(1000);
        nicknameInput.setValue(nickname).pressEnter();
        Thread.sleep(3000);
    }
}