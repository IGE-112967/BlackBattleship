package gabrielmatos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 5.
 *
 * <p>Valida se o jogador consegue iniciar uma partida contra o robot.</p>
 */
public class UserStory5Test {

    private WebDriver driver;
    private UserStory5 userStory5;

    /**
     * Inicializa o ChromeDriver antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        userStory5 = new UserStory5(driver);
    }

    /**
     * Testa o fluxo de jogar contra o robot.
     */
    @Test
    public void UserStoryTest5() {
        userStory5.abrirPaginaPrincipal();
        userStory5.definirTamanhoJanela();
        userStory5.clicarJogarContraRobot();
        userStory5.aguardarCarregamentoDaPartida();

        assertTrue(userStory5.paginaBattleshipCarregada(), "A página Battleship deve estar carregada após iniciar o jogo contra o robot.");
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
