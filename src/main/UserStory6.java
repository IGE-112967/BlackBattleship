package gabrielmatos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Page Object Class da User Story 6.
 *
 * <p>Representa o cenário em que o jogador tenta iniciar uma partida online
 * contra um jogador aleatório.</p>
 */
public class UserStory6 {

    private static final String URL_BATTLESHIP = "https://papergames.io/en/battleship";

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By areaBotoes = By.cssSelector(".area-buttons");
    private final By botaoJogadorAleatorio = By.cssSelector(".btn-secondary:nth-child(2)");

    /**
     * Cria a Page Object Class da User Story 6.
     *
     * @param driver instância do WebDriver usada pelo teste
     */
    public UserStory6(WebDriver driver) {
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
        driver.manage().window().setSize(new Dimension(1153, 620));
    }

    /**
     * Clica na zona dos botões principais da página.
     */
    public void clicarAreaDeBotoes() {
        WebElement area = wait.until(ExpectedConditions.elementToBeClickable(areaBotoes));
        area.click();
    }

    /**
     * Clica na opção gravada no Selenium IDE para jogo online contra jogador aleatório.
     */
    public void clicarJogarContraJogadorAleatorio() {
        WebElement botao = wait.until(ExpectedConditions.elementToBeClickable(botaoJogadorAleatorio));
        botao.click();
    }

    /**
     * Aguarda que o site reaja ao clique no modo online.
     */
    public void aguardarRespostaDoSistema() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    /**
     * Verifica se a página continua relacionada com o jogo Battleship.
     *
     * @return true se o URL ou conteúdo da página continuar associado ao jogo
     */
    public boolean fluxoOnlineIniciado() {
        return driver.getCurrentUrl().contains("battleship") || driver.getPageSource().toLowerCase().contains("battleship");
    }
}
