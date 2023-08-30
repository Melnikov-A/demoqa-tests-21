package guru.qa.utils;

public class FakerName {
    RandomUtils randomUtils = new RandomUtils();


    public String userFirstName = randomUtils.getRandomFirstName(),
            userLastName = randomUtils.getRandomLastName(),
            userMailAdress = randomUtils.getRandomUserMail(),
            userGenders = randomUtils.getRandomGenders(),
            userBirthDay = randomUtils.getUserBirthDay(),
            userBirthdayMonth = randomUtils.getUserBirthMonth(),
            userBirthdayYear = randomUtils.getUserBirthYear(),
            userNumbers = randomUtils.getNumbers(),
            userSubjects = randomUtils.getSubjects(),
            userHobbies = randomUtils.getHobbies(),
            userPicture = randomUtils.getPicture(),
            userAdress = randomUtils.getAdress(),
            userState = randomUtils.getState(),
            userCity = randomUtils.getCity(userState);

}
