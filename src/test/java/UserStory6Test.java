package gabrielmatos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 6.
 *
 * <p>Valida se o jogador consegue iniciar o fluxo de jogo online contra um jogador aleatório.</p>
 */
public class UserStory6Test {

    private WebDriver driver;
    private UserStory6 userStory6;

    /**
     * Inicializa o ChromeDriver antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        userStory6 = new UserStory6(driver);
    }

    /**
     * Testa o fluxo de jogar online contra um jogador aleatório.
     */
    @Test
    public void UserStoryTest6() {
        userStory6.abrirPaginaPrincipal();
        userStory6.definirTamanhoJanela();
        userStory6.clicarAreaDeBotoes();
        userStory6.clicarJogarContraJogadorAleatorio();
        userStory6.aguardarRespostaDoSistema();

        assertTrue(userStory6.fluxoOnlineIniciado(), "O sistema deve iniciar ou manter o fluxo de jogo online.");
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
