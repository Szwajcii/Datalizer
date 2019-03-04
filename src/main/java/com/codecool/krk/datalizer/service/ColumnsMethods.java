package com.codecool.krk.datalizer.service;

import net.andreinc.mockneat.MockNeat;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class ColumnsMethods {

    private Map<String, Supplier<String>> functions;
    private MockNeat mock = MockNeat.threadLocal();
    private static int idUser = 1;

    public ColumnsMethods() {
        initializeMethodsMap();
    }

    public Map<String, Supplier<String>> getFunctions(){
        return this.functions;
    }


    private void initializeMethodsMap() {
        functions = new HashMap<>();

        //Personal data
        functions.put("first_name", this::getRandomFirstName);
        functions.put("last_name", this::getRandomSecondName);
        functions.put("nick_name", this::getRandomNickName);

        functions.put("full_name", this::getRandomFullName);

        functions.put("male_name", this::getRandomMaleName);
        functions.put("female_name", this::getRandomFemaleName);

        functions.put("age", this::getRandomAge);

        functions.put("job_title", this::getRandomJobTitle);
        functions.put("language", this::getRandomLanguage);

        //Contact data
        functions.put("phone_number", this::getRandomPhoneNumber);
        functions.put("email", this::getRandomEmail);


        //Address
        functions.put("street_name", this::getRandomStreetName);
        functions.put("street_number", this::getRandomStreetNumber);
        functions.put("city", this::getRandomCity);
        functions.put("country", this::getRandomCountry);


        //Cars
        functions.put("car_make", this::getRandomCarMake);
        functions.put("car_model", this::getRandomCarModel);
        functions.put("car_model_year", this::getRandomCarModelYear);


        //Movies
        functions.put("movie_genre", this::getRandomMovieGenre);
        functions.put("movie_title", this::getRandomMovieTitle);

        //Products
        functions.put("price", this::getRandomProductPrice);

        functions.put("credit_card_number", this::getRandomCreditCardNumber);


    }



    //Personal data methods


}
