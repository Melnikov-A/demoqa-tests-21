package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {
    @BeforeAll                                              //Настройка конфигурации
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void firstTest() {
        open("/automation-practice-form");       // Основная информация
        $("#firstName").setValue("Darth");
        $("#lastName").setValue("Vader");
        $("#userEmail").setValue("papapalpatin@gmail.com");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("+77777777777");

        $("#dateOfBirthInput").click();                       //Календарь
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("December");
        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("2099");
        $(".react-datepicker__navigation--previous").click();
        $(".react-datepicker__navigation--next").click();
        $("div.react-datepicker__day.react-datepicker__day--030").click();

        $("#subjectsInput").setValue("Economics").pressEnter();    //Subjects
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Commerce").pressEnter();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();


    }
}