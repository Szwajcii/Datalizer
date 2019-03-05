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
        functions.put("last_name", this::getRandomLastName);
        functions.put("age", this::getRandomAge);
        functions.put("female_name", this::getRandomFemaleName);
        functions.put("male_name", this::getRandomMaleName);

        //Contact data
        functions.put("phone_number", this::getRandomPhoneNumber);
        functions.put("email", this::getRandomEmail);


        //Address
        functions.put("city_US", this::getRandomCityInUS);
        functions.put("city_EU", this::getRandomCityInEU);
        functions.put("capitals_world", this::getRandomCapitalWorld);
        functions.put("capitals_EU", this::getRandomCapitalEU);
        functions.put("country", this::getRandomCountry);


        //Others
        functions.put("industry", this::getRandomIndustry);
        functions.put("creditcard_name", this::getRandomCreditcardCompanyName);
        functions.put("creditcard_number_visa", this::getRandomCreditcardNumberVisa);
        functions.put("creditcard_number_american_express", this::getRandomCreditcardNumberAmericanExpress);
        functions.put("currency_code", this::getRandomCurrencyCode);
        functions.put("ipv4", this::getRandomIPv4);
        functions.put("ipv6", this::getRandomIPv6);
        functions.put("login", this::getRandomLogin);
        functions.put("password", this::getRandomPassword);
        functions.put("url", this::getRandomURL);
    }



    //Personal data methods

    private String getRandomFirstName(){
        return mock.names().first().get();
    }

    private String getRandomLastName(){
        return mock.names().last().get();
    }

    private String getRandomFemaleName(){
        return mock.names().type(FIRST_NAME_FEMALE).get();
    }

    private String getRandomMaleName(){
        return mock.names().type(FIRST_NAME_MALE).get();
    }

    private String getRandomAge(){
        return String.valueOf(mock.ints().range(10, 90).get());
    }

    private String getRandomPhoneNumber() {
        return String.valueOf(mock.ints().range(400000000, 999999999).get());
    }

    private String getRandomEmail(){
        return mock.emails().get();
    }

    private String getRandomCityInUS(){
        return mock.cities().us().get();
    }

    private String getRandomCityInEU(){
        return mock.cities().us().get();
    }

    private String getRandomCountry(){
        return mock.countries().names().get();
    }

    private String getRandomCapitalWorld(){
        return mock.cities().capitals().get();
    }

    private String getRandomCapitalEU(){
        return mock.cities().capitalsEurope().get();
    }

    private String getRandomIndustry(){
        return mock.industries().get();
    }

    private String getRandomCreditcardNumberVisa(){
        return mock.creditCards().type(VISA_16).get();
    }

    private String getRandomCreditcardNumberAmericanExpress(){
        return mock.creditCards().names().get();
    }

    private String getRandomCreditcardCompanyName(){
        return mock.creditCards().names().get();
    }

    private String getRandomCurrencyCode(){
        return mock.currencies().code().get();
    }

    private String getRandomIPv4(){
        return mock.ipv4s().get();
    }

    private String getRandomIPv6(){
        return mock.iPv6s().get();
    }

    private String getRandomLogin(){
        return mock.passwords().type(WEAK).get();
    }

    private String getRandomPassword(){
        return mock.passwords().type(MEDIUM).get();
    }

    private String getRandomURL() {
        return mock.urls().scheme(HTTP).domain(POPULAR).host(ADVERB_VERB);
    }
}
