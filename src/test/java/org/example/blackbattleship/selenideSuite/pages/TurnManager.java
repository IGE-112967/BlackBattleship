import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TurnManager {

    private SelenideElement cell(int row, int col) {
        return $(".cell-" + row + "-" + col + " .circle");
    }

    public void attack(int row, int col) {
        cell(row, col).click();
    }

    public String getState(int row, int col) {
        return cell(row, col).getAttribute("class");
    }

    public boolean isClickable(int row, int col) {
        return cell(row, col).isEnabled();
    }
}