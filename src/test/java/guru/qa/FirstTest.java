package guru.qa;

import guru.qa.pages.RegistrationPage;
import guru.qa.pages.components.TableResultComponent;
import org.junit.jupiter.api.Test;
import static guru.qa.utils.FakerName.*;

public class FirstTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TableResultComponent tableResult = new TableResultComponent();


    @Test
    void firstTest() {

        registrationPage.openPage()
                .setFirstName(userFirstName)
                .setLastName(userLastName)
                .setUserEmail(userMailAdress)
                .setGender(userGenders)
                .setUserNumber(userNumbers)
                .setBirthDate(userBirthDay,
                        userBirthdayMonth,
                        userBirthdayYear)
                .setSubjects(userSubjects)
                .setHobbies(userHobbies)
                .setPicture(userPicture)
                .setAdress(userAdress)
                .setState(userState)
                .setCity(userCity)
                .setSubmit();

        tableResult.checkResult(userFirstName + " " + userLastName)
                .checkResult(userMailAdress)
                .checkResult(userGenders)
                .checkResult(userBirthDay
                        + " " + userBirthdayMonth
                        + "," + userBirthdayYear)
                .checkResult(userNumbers)
                .checkResult(userSubjects)
                .checkResult(userHobbies)
                .checkResult(userAdress)
                .checkResult(userState + " " + userCity);
    }
}