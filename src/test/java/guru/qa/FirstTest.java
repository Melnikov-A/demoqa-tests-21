package guru.qa;

import guru.qa.pages.RegistrationPage;
import guru.qa.pages.components.TableResultComponent;
import guru.qa.utils.FakerName;
import org.junit.jupiter.api.Test;

public class FirstTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TableResultComponent tableResult = new TableResultComponent();
    FakerName fakerName = new FakerName();


    @Test
    void firstTest() {

        registrationPage.openPage()
                .setFirstName(fakerName.userFirstName)
                .setLastName(fakerName.userLastName)
                .setUserEmail(fakerName.userMailAdress)
                .setGender(fakerName.userGenders)
                .setUserNumber(fakerName.userNumbers)
                .setBirthDate(fakerName.userBirthDay,
                        fakerName.userBirthdayMonth,
                        fakerName.userBirthdayYear)
                .setSubjects(fakerName.userSubjects)
                .setHobbies(fakerName.userHobbies)
                .setPicture(fakerName.userPicture)
                .setAdress(fakerName.userAdress)
                .setState(fakerName.userState)
                .setCity(fakerName.userCity)
                .setSubmit();

        tableResult.checkResult(fakerName.userFirstName)
                .checkResult(fakerName.userLastName)
                .checkResult(fakerName.userMailAdress)
                .checkResult(fakerName.userGenders)
                .checkResult(fakerName.userBirthDay)
                .checkResult(fakerName.userNumbers)
                .checkResult(fakerName.userSubjects)
                .checkResult(fakerName.userHobbies)
                .checkResult(fakerName.userAdress)
                .checkResult(fakerName.userState)
                .checkResult(fakerName.userCity);
    }
}