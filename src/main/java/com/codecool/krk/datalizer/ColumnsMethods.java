import net.andreinc.mockneat.MockNeat;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class ColumnsMethods {

    private Map<String, Supplier<String>> functions;
    private MockNeat mock = MockNeat.threadLocal();
    private static int idUser = 1;

    public ColumnsMethods(){
        initializeMethodMap();
    }

    public Map<String, Supplier<String>> getFunctionsMap(){
        return this.functions;
    }

    private void initializeMethodMap(){
        functions = new HashMap<>();
        functions.put("hash_password", this::getRandomPassword);
        functions.put("id_account_type", this::getRandomAccountType);
        functions.put("description", this::getRandomDescription);
        functions.put("login", this::getRandomWord);
        functions.put("first_name", this::getRandomFirstName);
        functions.put("last_name", this::getRandomLastName);
        functions.put("email", this::getRandomEmail);
        functions.put("phone", this::getRandomPhoneNumber);
        functions.put("date_", this::getRandomDateTime);
        functions.put("count", this::getRandomNumber);
        functions.put("band_name", this::getRandomWord);
        functions.put("establishment_date", this::getRandomDateTime);
        functions.put("song_name", this::getRandomWord);
        functions.put("duration", this::getRandomDuration);
        functions.put("production_year", this::getRandomDateTime);
        functions.put("listens", this::getRandomNumber);
        functions.put("nick_name", this::getRandomWord);
        functions.put("birthday", this::getRandomDateTime);
        functions.put("join_date", this::getRandomDateTime);
        functions.put("album_name", this::getRandomWord);
        functions.put("id_genre", this::getRandomGenreId);
        functions.put("id_user", this::getIdUser);
    }

    private String getIdUser(){
        return String.valueOf(idUser++);
    }


    private String getRandomPassword(){
        return String.valueOf(getHash(mock.passwords().val()));
    }

    private String getRandomLogin(){
        return (mock.names().val() + mock.words().val()).replaceAll(" ", "");
    }

    private String getRandomFirstName(){
        return mock.names().first().val();
    }

    private String getRandomLastName(){
        return mock.names().last().val();
    }

    private String getRandomEmail(){
        return mock.emails().val();
    }

    private String getRandomPhoneNumber(){
        return String.valueOf(randBetween(100, 999)) + "-"
                + String.valueOf(randBetween(100, 999)) + "-"
                + String.valueOf(randBetween(100, 999));
    }

    private String getRandomDateTime(){
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1900, 2010);

        gc.set(gc.YEAR, year);


        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);

    }

    private String getRandomNumber(){
        Random rand = new Random();
        return String.valueOf(rand.nextInt(1000) + 1);
    }

    private String getRandomWord(){
        return mock.words().val();
    }

    private String getRandomDescription(){
        return mock.words().val();
    }

    private int randBetween(int start, int end){
        return start + (int)Math.round(Math.random() * (end - start));
    }

    private String getRandomDuration(){
        return String.valueOf(randBetween(0, 3600));
    }

    private String getRandomGenre(){
        return String.valueOf(randBetween(1, 10));
    }

    private String getRandomAccountType(){
        return String.valueOf(randBetween(1, 3));
    }

    private String getRandomGenreId(){
        return String.valueOf(randBetween(1, 11));
    }

    public int getHash(String key) {
        int hash = 0;

        for (char c : String.valueOf(key).toCharArray()) {
            hash *= c;
            hash += c;
        }

        if (hash < 0) {
            hash = hash * -1 / 4;
        }
        return hash;
    }


}
