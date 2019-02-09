import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class App {


    public static void main(String[] args) throws FileNotFoundException {


        List<String> users= Arrays.asList("id_account_type", "login", "first_name", "last_name", "email", "phone");
        List<String> credential = Arrays.asList("id_user", "hash_password");
        List<String> albums = Arrays.asList("album_name", "description", "production_year");
        List<String> artists = Arrays.asList("nick_name", "first_name", "last_name", "birthday");
        List<String> band = Arrays.asList("band_name", "establishment_date");
//        List<String> songs = Arrays.asList("id_genre", "song_name", "duration", "production_year", "listens");
//        List<String> registration = Arrays.asList("date_", "count");


//        generateData("user.csv", users, 100000);
        generateData("credential.csv", credential, 1000);
//        generateData("albums.csv", albums, 10000);
//        generateData("artists.csv", artists, 1000);
//        generateData("band.csv", band, 1000);
//        generateData("songs.csv", songs, 400000);
//        generateData("registration.csv", registration, 10);

    }


    private static void generateData(String csvName, List<String> columns, int recordNumber) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File(csvName));
        pw.write(CSVDataGenerator.getData(columns, recordNumber));
        pw.close();
    }

}
