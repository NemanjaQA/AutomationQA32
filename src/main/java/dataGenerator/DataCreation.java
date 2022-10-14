package dataGenerator;

import com.github.javafaker.Faker;

public class DataCreation {
    public static String generateEmail(){
        return new Faker().internet().emailAddress();
    }
    public static String generateFirstName(){
        return new Faker().name().firstName();
    }
    public static String generateLastName(){
        return new Faker().name().lastName();
    }
    public static String generatePassword(){
        return new Faker().internet().password(5,10,true,true,true);
    }
    public static String generateAddress(){
        return new Faker().address().fullAddress();
    }
    public static String generateCity(){
        return new Faker().address().city();
    }
    public static String generatePostalCode(){
        return new Faker().number().digits(5);
    }
    public static String generateMobile(){
        return new Faker().phoneNumber().cellPhone();
    }
}
