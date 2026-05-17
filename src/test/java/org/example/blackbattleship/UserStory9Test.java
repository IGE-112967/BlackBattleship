package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Teste caixa preta:
 * impede repetição de jogada numa célula já atacada.
 */
public class UserStory9Test {

    private BasePage page;
    private UserStory9 user;

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";
        user = new UserStory9();
        page = new BasePage();
        page.openGame();
        page.setupGame();
    }

    @Test
    public void UserStoryTest1_preventRepeatedMove() {

        // primeira jogada
        user.attack(3, 3);
        String firstState = user.state(3, 3);
        sleep(2000);
        // tentativa de repetir jogada
        user.attack(3, 3);
        String secondState = user.state(3, 3);
        sleep(2000);
        assertEquals(firstState, secondState);
    }
}