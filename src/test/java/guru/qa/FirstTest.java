package guru.qa;

import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FirstTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void firstTest() {

        registrationPage.openPage()
                .setFirstName("Darth")
                .setLastName("Vader")
                .setUserEmail("papapalpatin@gmail.com")
                .setGender("Other")
                .setUserNumber("7777777777")
                .setBirthDate("30", "October", "2099");

        $("#subjectsInput").setValue("Economics").pressEnter();    //Subjects
        $("#hobbiesWrapper").$(byText("Sports")).click();

        $("#uploadPicture").uploadFromClasspath("DV.jpg");
        $("#currentAddress").setValue("Death Star");
        $("#stateCity-wrapper").$(byText("Select State")).click();
        $("#react-select-3-option-2").click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#react-select-4-option-0").click();

        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        registrationPage.checkResult("Darth")
                .checkResult("Vader")
                .checkResult("papapalpatin@gmail.com")
                .checkResult("7777777777");

    }
}