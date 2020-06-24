package ferreira;

import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;

public class ReadList {
    //file Path
    final static String filePath = "C:\\Users\\filip\\OneDrive\\Desktop\\BYUI Semester\\BYUI 6th Semester\\CS 246\\Week05\\Ponder\\JsonDataSaver\\src\\cards.txt";

    //This Static funcion will return our list
    static List<FlashCard> getUpDatedList() {
        Gson gson = new Gson();

        //String that will store the file data
        String fileData = "";

        //Read from the file
        try {
            File myFile = new File(filePath);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                fileData = myReader.nextLine();
                System.out.println(fileData);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Convert the String Back into a list
        Type type = new TypeToken<ArrayList<FlashCard>>(){}.getType(); //get the type
        ArrayList<FlashCard> myFlashCards = gson.fromJson(fileData, type);


        return  myFlashCards;

    }
}
