package com.makers.makersbnb;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LandingPageTest {
    static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void launchBrowser() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
    }

    @AfterAll
    static void closeBrowser() {
        playwright.close();
    }

    @BeforeEach
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void closeContext() {
        context.close();
    }

    @Test
    public void usersWelcomedToApp() {
        page.navigate("http://localhost:8080");
        Locator pageBody = page.locator("body");
        assertThat(pageBody).containsText("Welcome to MakersBnB!");
        assertThat(pageBody).containsText("spaces are waiting to be discovered...");
        assertThat(pageBody).containsText("123 bookings were made last week.");
    }

    @Test
    public void emailProvidedAtContactUs() {
        page.navigate("http://localhost:8080/contact-us");
        Locator pageBody = page.locator("body");
        assertThat(pageBody).containsText("Contact us at contact@makersbnb.co.uk");
    }
}
