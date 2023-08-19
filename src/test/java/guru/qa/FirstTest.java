package guru.qa;

import guru.qa.pages.RegistrationPage;
import guru.qa.pages.components.TableResultComponent;
import org.junit.jupiter.api.Test;

public class FirstTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TableResultComponent tableResult = new TableResultComponent();


    @Test
    void firstTest() {

        registrationPage.openPage()
                .setFirstName("Darth")
                .setLastName("Vader")
                .setUserEmail("papapalpatin@gmail.com")
                .setGender("Other")
                .setUserNumber("7777777777")
                .setBirthDate("13", "October", "2099")
                .setSubjects("Economics")
                .setHobbies("Sports")
                .setPicture("DV.jpg")
                .setAdress("Death Star")
                .setState("Haryana")
                .setCity("Karnal")
                .setSubmit();

        tableResult.checkResult("Darth")
                .checkResult("Vader")
                .checkResult("papapalpatin@gmail.com")
                .checkResult("7777777777")
                .checkResult("Economics")
                .checkResult("Sports")
                .checkResult("Death Star")
                .checkResult("Haryana")
                .checkResult("Karnal");
    }
}