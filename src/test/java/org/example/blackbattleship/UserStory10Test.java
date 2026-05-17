package org.example.blackbattleship;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/** Teste caixa preta da User Story 10.
 * Como jogador, quero perceber quando é novamente a minha vez de jogar. */
public class UserStory10Test {

    private BasePage page;
    private UserStory10 user;

    @BeforeEach
    public void setup() {
        Configuration.browserSize = "1280x800";
        page = new BasePage();
        user = new UserStory10();
        page.openGame();
        page.setupGame();
    }

    @Test
    public void UserStoryTest2_turnControl() {
        // primeira jogada
        user.attack(3, 3);
        sleep(2000);

        // guardar estado antes da tentativa fora de turno
        String before = user.state(4, 4);

        boolean beforeClickable = user.isClickable(4, 4);

        user.attack(4, 4); // tentativa fora do turno
        sleep(2000);
        String after = user.state(4, 4);
        boolean afterClickable = user.isClickable(4, 4);

        // validar que não mudou
        assertEquals(before, after);
        // esperar robot jogar
        sleep(5000);

        // novo turno
        String beforeNewTurn = user.state(5, 5);

        user.attack(5, 5);

        sleep(2000);

        String afterNewTurn = user.state(5, 5);
        // validar que agora mudou
        assertEquals(beforeClickable, afterClickable);
    }
}