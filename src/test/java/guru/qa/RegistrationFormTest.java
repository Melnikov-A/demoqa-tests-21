package guru.qa;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.pages.RegistrationPage;
import guru.qa.pages.components.TableResultComponent;
import guru.qa.utils.FakerName;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@DisplayName("Тест регистрационной формы")
@Tags({
        @Tag("web"),
        @Tag("registration")
})
public class RegistrationFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TableResultComponent tableResult = new TableResultComponent();
    FakerName fakerName = new FakerName();

    @Test
    @DisplayName("Успешная регистрация с правильным заполнением всех полей")
    void registrationPageTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу с регистрацией пользователя", () -> {
            registrationPage.openPage();
        });

        step("Заполняем данные о пользователе", () -> {
            registrationPage.setFirstName(fakerName.userFirstName)
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
                    .setCity(fakerName.userCity);
        });

        step("Кликаем на таб выгрузки данных о пользователе", () -> {
            registrationPage.setSubmit();
        });

        step("Проверяем правильность введенных данных", () -> {
            tableResult.checkResult(fakerName.userFirstName
                            + " " + fakerName.userLastName)
                    .checkResult(fakerName.userMailAdress)
                    .checkResult(fakerName.userGenders)
                    .checkResult(fakerName.userBirthDay
                            + " " + fakerName.userBirthdayMonth
                            + "," + fakerName.userBirthdayYear)
                    .checkResult(fakerName.userNumbers)
                    .checkResult(fakerName.userSubjects)
                    .checkResult(fakerName.userHobbies)
                    .checkResult(fakerName.userAdress)
                    .checkResult(fakerName.userState
                            + " " + fakerName.userCity);
        });
    }
}