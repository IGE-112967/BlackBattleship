package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement allIdesButton = $x("//span[contains(.,'All') and contains(.,'IDEs')]");
    public SelenideElement toolsMenu = $("[aria-label='Products: Open submenu']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
}