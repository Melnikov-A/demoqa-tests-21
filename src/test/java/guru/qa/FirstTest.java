package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    @BeforeAll                                              //Conf
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

    }
    @Test
    void firstTest() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Darth");
        $("#lastName").setValue("Vader");
        $("#userEmail").setValue("papapalpatin@gmail.com");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("7777777777");

        $("#dateOfBirthInput").click();                                         //date
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("October");
        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("2099");
        $("div.react-datepicker__day.react-datepicker__day--017").click();

        $("#subjectsInput").setValue("Economics").pressEnter();    //Subjects
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Commerce").pressEnter();

        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("DV.jpg");
        $("#currentAddress").setValue("Death Star");
        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#react-select-3-option-2").click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $x("//tr[1]//td[2]").shouldHave(exactText("Darth Vader"));             //forms
        $x("//tr[2]//td[2]").shouldHave(exactText("papapalpatin@gmail.com"));
        $x("//tr[3]//td[2]").shouldHave(exactText("Other"));
        $x("//tr[4]//td[2]").shouldHave(exactText("7777777777"));
        $x("//tr[5]//td[2]").shouldHave(exactText("17 October,2099"));
        $x("//tr[6]//td[2]").shouldHave(exactText("Economics, English, Commerce"));
        $x("//tr[7]//td[2]").shouldHave(exactText("Sports, Reading, Music"));
        $x("//tr[8]//td[2]").shouldHave(exactText("DV.jpg"));
        $x("//tr[9]//td[2]").shouldHave(exactText("Death Star"));
        $x("//tr[10]//td[2]").shouldHave(exactText("Haryana Karnal"));

    }
}