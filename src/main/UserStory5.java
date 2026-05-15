package gabrielmatos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class da User Story 5.
 *
 * <p>Representa o cenário em que o jogador inicia uma partida contra o robot
 * no site Battleship.</p>
 */
public class UserStory5 {

    private static final String URL_BATTLESHIP = "https://papergames.io/en/battleship";

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By botaoJogarContraRobot = By.cssSelector(".w-100:nth-child(2) > .btn .flex-grow-1");

    /**
     * Cria a Page Object Class da User Story 5.
     *
     * @param driver instância do WebDriver usada pelo teste
     */
    public UserStory5(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    /**
     * Abre a página principal do jogo Battleship.
     */
    public void abrirPaginaPrincipal() {
        driver.get(URL_BATTLESHIP);
    }

    /**
     * Define o tamanho da janela usado durante a gravação no Selenium IDE.
     */
    public void definirTamanhoJanela() {
        driver.manage().window().setSize(new Dimension(1152, 620));
    }

    /**
     * Clica no botão que inicia uma partida contra o robot.
     */
    public void clicarJogarContraRobot() {
        WebElement botao = wait.until(ExpectedConditions.elementToBeClickable(botaoJogarContraRobot));
        botao.click();
    }

    /**
     * Aguarda que a página ou partida esteja carregada após o clique.
     */
    public void aguardarCarregamentoDaPartida() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    /**
     * Verifica se o site Battleship está carregado.
     *
     * @return true se o URL atual estiver associado ao jogo Battleship
     */
    public boolean paginaBattleshipCarregada() {
        return driver.getCurrentUrl().contains("battleship") || driver.getPageSource().toLowerCase().contains("battleship");
    }
}
