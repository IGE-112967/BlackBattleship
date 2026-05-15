package gabrielmatos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 7.
 *
 * <p>Valida se o jogador consegue realizar um ataque no tabuleiro adversário.</p>
 */
public class UserStory7Test {

    private WebDriver driver;
    private UserStory7 userStory7;

    /**
     * Inicializa o ChromeDriver antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        userStory7 = new UserStory7(driver);
    }

    /**
     * Testa a realização de uma jogada ofensiva no tabuleiro adversário.
     */
    @Test
    public void UserStoryTest7() {
        userStory7.abrirPaginaPrincipal();
        userStory7.definirTamanhoJanela();
        userStory7.iniciarPartidaContraRobot();
        userStory7.aguardarInterfaceDoJogo();
        userStory7.atacarPrimeiraCelulaDisponivel();

        assertTrue(userStory7.jogadaRegistada(), "A jogada deve ser registada ou refletida na interface do jogo.");
    }

    /**
     * Fecha o browser depois do teste.
     */
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
