package org.example.blackbattleship.blackbattleship;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object Class — US16: Estatísticas de Perfil.
 */
public class UserStory16 {

    /** Avatar ou ícone de perfil do utilizador */
    public SelenideElement profileAvatar =
            $x("//*[contains(@class,'avatar') or contains(@class,'profile')]");

    /** Painel com as estatísticas do jogador */
    public SelenideElement statisticsPanel =
            $x("//*[contains(text(),'Statistics') or contains(text(),'Games played')]");

    /** Abre a página do jogo */
    public void openSite() {
        open("https://papergames.io/en/battleship");
    }
}