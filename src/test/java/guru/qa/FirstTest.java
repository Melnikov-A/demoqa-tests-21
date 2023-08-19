package guru.qa;

import guru.qa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

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
                .setBirthDate("30", "October", "2099")
                .setSubjects("Economics")
                .setHobbies("Sports")
                .setPicture("DV.jpg")
                .setAdress("Death Star")
                .setState("Haryana")
                .setCity("Karnal")
                .setSubmit()

                .checkResultTitle("Thanks for submitting the form")
                .checkResult("Darth")
                .checkResult("Vader")
                .checkResult("papapalpatin@gmail.com")
                .checkResult("7777777777");

    }
}