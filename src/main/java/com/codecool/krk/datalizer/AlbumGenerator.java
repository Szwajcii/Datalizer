import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class AlbumGenerator {


    public AlbumGenerator(){
        try {
            generateRandomAlbums();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void generateRandomAlbums() throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new File("albums.csv"));

        StringBuilder record = new StringBuilder();




        pw.write(record.toString());
        pw.close();
    }

}
