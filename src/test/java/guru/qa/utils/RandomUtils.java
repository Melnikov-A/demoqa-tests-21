package guru.qa.utils;

import com.github.javafaker.Faker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomUtils {

    Faker faker = new Faker();
    Date userBirthday = faker.date().birthday(18, 100);

    public String getRandomFirstName() {

        return faker.name().firstName();
    }

    public String getRandomLastName() {

        return faker.name().lastName();
    }

    public String getRandomUserMail() {

        return faker.internet().emailAddress();
    }

    public String getRandomGenders() {
        String[] genders = {"Male", "Female", "Other"};

        return faker.options().option(genders);
    }

    public String getNumbers() {

        return faker.number().digits(10);
    }

    public String getUserBirthDay() {

        return (new SimpleDateFormat("dd", Locale.ENGLISH)).format(userBirthday);
    }

    public String getUserBirthMonth() {

        return (new SimpleDateFormat("MMMM", Locale.ENGLISH)).format(userBirthday);
    }

    public String getUserBirthYear() {

        return (new SimpleDateFormat("y", Locale.ENGLISH)).format(userBirthday);
    }

    public String getSubjects() {
        String[] subjects = {"English", "Economics", "Math", "Arts"};

        return faker.options().option(subjects);
    }

    public String getHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};

        return faker.options().option(hobbies);
    }

    public String getPicture() {
        String pictureFilename = System.getenv("PICTURE_FILENAME");

        return pictureFilename != null ? pictureFilename : "DV.jpg";
    }

    public String getAdress() {

        return faker.address().fullAddress();
    }

    public String getState() {
        String[] state = {"NCR", "Haryana"};

        return faker.options().option(state);
    }


    public String getCity(String selectedState) {
        String[] cities;

        switch (selectedState) {
            case "NCR":
                cities = new String[]{"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(cities);
            case "Haryana":
                cities = new String[]{"Karnal", "Panipat"};
                return new Faker().options().option(cities);
            default:
                cities = new String[]{};
                return new Faker().options().option(cities);
        }
    }

}










