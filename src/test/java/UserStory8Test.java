package gabrielmatos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Page Test Class da User Story 8.
 *
 * <p>Valida se o jogador recebe feedback visual ou textual depois de realizar uma jogada.</p>
 */
public class UserStory8Test {

    private WebDriver driver;
    private UserStory8 userStory8;

    /**
     * Inicializa o ChromeDriver antes de cada teste.
     */
    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        userStory8 = new UserStory8(driver);
    }

    /**
     * Testa a existência de feedback depois de uma jogada.
     */
    @Test
    public void UserStoryTest8() {
        userStory8.abrirPaginaPrincipal();
        userStory8.definirTamanhoJanela();
        userStory8.iniciarPartidaContraRobot();
        userStory8.aguardarInterfaceDoJogo();
        userStory8.guardarEstadoAntesDaJogada();
        userStory8.realizarJogada();

        assertTrue(userStory8.existeFeedbackDepoisDaJogada(), "A interface deve apresentar feedback ou atualização depois da jogada.");
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
