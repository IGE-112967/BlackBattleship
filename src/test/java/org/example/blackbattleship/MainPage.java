package org.example.blackbattleship;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    public SelenideElement acceptCookiesButton = $("button.ch2-btn.ch2-btn-primary");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");
    public SelenideElement searchInput = $("[data-test-id='search-input']");
    public SelenideElement toolsMenu = $x("//button[@data-test='main-menu-item-action' and @aria-label='Products: Open submenu']");
    public SelenideElement seeDeveloperToolsButton = $x("//a[@href='/ides/' and @data-test='main-submenu-item-link']");
    public SelenideElement findYourToolsButton = $x("//a[@data-test='suggestion-link' and @href='/products/']");
}