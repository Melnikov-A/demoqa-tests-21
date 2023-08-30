package guru.qa.utils;

public class FakerName {
    RandomUtils randomUtils = new RandomUtils();


    public String userFirstName = randomUtils.getRandomFirstName(),
            userLastName = randomUtils.getRandomLastName(),
            userExpectedName = userFirstName
                    + " " + userLastName,
            userMailAdress = randomUtils.getRandomUserMail(),
            userGenders = randomUtils.getRandomGenders(),
            userBirthDay = randomUtils.getUserBirthDay(),
            userBirthdayMonth = randomUtils.getUserBirthMonth(),
            userBirthdayYear = randomUtils.getUserBirthYear(),
            userExpectedDate = userBirthDay
                    + " " + userBirthdayMonth
                    + "," + userBirthdayYear,
            userNumbers = randomUtils.getNumbers(),
            userSubjects = randomUtils.getSubjects(),
            userHobbies = randomUtils.getHobbies(),
            userPicture = randomUtils.getPicture(),
            userAdress = randomUtils.getAdress(),
            userState = randomUtils.getState(),
            userCity = randomUtils.getCity(userState),
            userExpectedStateCity = userState + " " + userCity;


}
