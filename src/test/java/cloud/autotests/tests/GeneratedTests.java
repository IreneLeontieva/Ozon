package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Check opening registration form")
    @DisplayName("Check Ozon")
    void generatedTest() {
        step("Open 'https://www.ozon.ru/'", () -> {
            open("https://www.ozon.ru/");
        });

        step("Press enter or registration", () -> {
            $("div[data-widget='loginButton']").click();
        });

        step("Verify successful opening Registration form", () -> {
            switchTo().frame("authFrame");
            $("img[alt='Логотип OzonId']");

        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.ozon.ru/'", () ->
            open("https://www.ozon.ru/"));

        step("Page title should have text '403 Forbidden'", () -> {
            String expectedTitle = "403 Forbidden";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.ozon.ru/'", () ->
            open("https://www.ozon.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}