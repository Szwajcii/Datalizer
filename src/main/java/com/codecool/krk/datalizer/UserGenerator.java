import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UserGenerator {


    public UserGenerator(){

        try {
            generateRandomUsers();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void generateRandomUsers() throws FileNotFoundException {

        PrintWriter pw = new PrintWriter(new File("users.csv"));

        StringBuilder record = new StringBuilder();


        for(int i = 0; i < 10000; i++){


            record.append(i  + " user" + "\n");

        }

        pw.write(record.toString());
        pw.close();
        System.out.println(record);
        System.out.println("Users generated!");
    }

}
