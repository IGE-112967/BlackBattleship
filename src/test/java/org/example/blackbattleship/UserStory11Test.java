package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class UserStory11Test {

    private BasePage page;
    private UserStory11 user;

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";

        page = new BasePage();
        user = new UserStory11();

        page.openGame();
        page.setupGame();
        page.waitBoard();
    }

    @Test
    public void UserStoryTest11_extraTurnAfterHit() {

        boolean hitFound = false;

        for (int i = 0; i < 50 && !hitFound; i++) {

            if (!user.isPlayableCell(i)) continue;

            user.attack(i);
            sleep(2000);

            String state = user.state(i);

            if (state != null && state.contains("hit")) {

                hitFound = true;

                boolean extraMoveDone = false;

                // procurar QUALQUER jogada válida (não adjacente)
                for (int j = 0; j < 50; j++) {

                    if (j == i) continue;

                    if (!user.isPlayableCell(j)) continue;

                    String before = user.state(j);

                    user.attack(j);
                    sleep(2000);

                    String after = user.state(j);

                    if (!before.equals(after)) {
                        extraMoveDone = true;
                        break;
                    }
                }

                assertTrue(extraMoveDone);
            }
        }

        assertTrue(hitFound);
    }
}