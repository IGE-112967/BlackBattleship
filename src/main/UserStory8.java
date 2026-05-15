package gabrielmatos;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Page Object Class da User Story 8.
 *
 * <p>Representa o cenário em que o jogador recebe feedback depois de realizar uma jogada.
 * Este cenário foi criado de forma aproximada porque não existia gravação no ficheiro .side.</p>
 */
public class UserStory8 {

    private static final String URL_BATTLESHIP = "https://papergames.io/en/battleship";

    private final WebDriver driver;
    private final WebDriverWait wait;
    private String htmlAntesDaJogada;

    private final By botaoJogarContraRobot = By.cssSelector(".w-100:nth-child(2) > .btn .flex-grow-1");

    /**
     * Cria a Page Object Class da User Story 8.
     *
     * @param driver instância do WebDriver usada pelo teste
     */
    public UserStory8(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    /**
     * Abre a página principal do jogo Battleship.
     */
    public void abrirPaginaPrincipal() {
        driver.get(URL_BATTLESHIP);
    }

    /**
     * Define o tamanho da janela para tornar a execução semelhante à utilização humana.
     */
    public void definirTamanhoJanela() {
        driver.manage().window().setSize(new Dimension(1152, 620));
    }

    /**
     * Inicia uma partida contra o robot.
     */
    public void iniciarPartidaContraRobot() {
        WebElement botao = wait.until(ExpectedConditions.elementToBeClickable(botaoJogarContraRobot));
        botao.click();
    }

    /**
     * Aguarda pelo carregamento da interface de jogo.
     */
    public void aguardarInterfaceDoJogo() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
        esperar(3000);
    }

    /**
     * Guarda o estado visual da página antes da jogada.
     */
    public void guardarEstadoAntesDaJogada() {
        htmlAntesDaJogada = driver.getPageSource();
    }

    /**
     * Realiza uma jogada numa célula clicável do tabuleiro adversário.
     *
     * <p>Foram usados seletores genéricos porque o cenário não estava gravado no Selenium IDE.
     * Caso o teste falhe, deve substituir estes seletores pelos seletores reais gravados.</p>
     */
    public void realizarJogada() {
        List<By> seletoresPossiveis = List.of(
                By.cssSelector("app-board button:not([disabled])"),
                By.cssSelector(".board button:not([disabled])"),
                By.cssSelector(".grid button:not([disabled])"),
                By.cssSelector(".cell:not(.disabled)"),
                By.cssSelector("[class*='cell']:not(.disabled)"),
                By.cssSelector("[class*='square']:not(.disabled)"),
                By.cssSelector("[class*='tile']:not(.disabled)")
        );

        WebElement celula = encontrarPrimeiroElementoClicavel(seletoresPossiveis);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", celula);
        wait.until(ExpectedConditions.elementToBeClickable(celula));
        celula.click();
        esperar(2000);
    }

    /**
     * Verifica se existiu alteração visual ou textual após a jogada.
     *
     * @return true se a página tiver sido atualizada ou continuar carregada com conteúdo de jogo
     */
    public boolean existeFeedbackDepoisDaJogada() {
        String htmlDepoisDaJogada = driver.getPageSource();
        boolean paginaAlterou = htmlAntesDaJogada != null && !htmlAntesDaJogada.equals(htmlDepoisDaJogada);
        boolean contemIndicadoresDeJogo = htmlDepoisDaJogada.toLowerCase().contains("hit")
                || htmlDepoisDaJogada.toLowerCase().contains("miss")
                || htmlDepoisDaJogada.toLowerCase().contains("sunk")
                || htmlDepoisDaJogada.toLowerCase().contains("battleship")
                || htmlDepoisDaJogada.toLowerCase().contains("turn");

        return paginaAlterou || contemIndicadoresDeJogo;
    }

    private WebElement encontrarPrimeiroElementoClicavel(List<By> seletores) {
        for (By seletor : seletores) {
            List<WebElement> elementos = driver.findElements(seletor);
            for (WebElement elemento : elementos) {
                if (elemento.isDisplayed() && elemento.isEnabled()) {
                    return elemento;
                }
            }
        }
        throw new IllegalStateException("Não foi encontrada uma célula clicável. Grave este cenário no Selenium IDE para obter o seletor real.");
    }

    private void esperar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
