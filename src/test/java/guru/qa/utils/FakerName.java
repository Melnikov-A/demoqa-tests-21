package guru.qa.utils;
import static guru.qa.utils.RandomUtils.*;


public class FakerName {

    public static String userFirstName = getRandomFirstName(),
            userLastName = getRandomLastName(),
            userMailAdress = getRandomUserMail(),
            userGenders = getRandomGenders(),
            userBirthDay = getUserBirthDay(),
            userBirthdayMonth = getUserBirthMonth(),
            userBirthdayYear = getUserBirthYear(),
            userNumbers = getNumbers(),
            userSubjects = getSubjects(),
            userHobbies = getHobbies(),
            userPicture = getPicture(),
            userAdress = getAdress(),
            userState = getState(),
            userCity = getCity(userState);

}
