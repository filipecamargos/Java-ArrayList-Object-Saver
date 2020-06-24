package ferreira;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import com.google.gson.Gson;
import java.io.IOException;

public class SaveList {
    //file path
    static final String filePath = "C:\\Users\\filip\\OneDrive\\Desktop\\BYUI Semester\\BYUI 6th Semester\\CS 246\\Week05\\Ponder\\JsonDataSaver\\src\\cards.txt";

    static List<FlashCard> myCards;

    //Write to the file
    static void savetoFile(List<FlashCard> PassedCards) {
        Gson gson = new Gson();
        String jsonCards;

        myCards = PassedCards;
        jsonCards  = gson.toJson(myCards);

        //Creat the File
        try {
            File myfile = new File(filePath);
            if (myfile.createNewFile()) {
                System.out.println("File created: " + myfile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //This will Overwrite the file and write the the new List
        try {
            FileWriter myWriter = new FileWriter(filePath, false);
            myWriter.write(jsonCards);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
