package ferreira;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        //This Functions will perform the behavior test on my classes

        //COMMENT THEM IN OUT AS YOU TEST!!!

        //Instatiate a list of Obectes that will save the objects
        List<FlashCard> myCards = new ArrayList<FlashCard>();

        //Lets get 5 Different Flash Card in the list
        myCards.add(new FlashCard("Fruit", "Bananas", "Yellllow"));
        myCards.add(new FlashCard("Fruit", "Apple", "green"));
        myCards.add(new FlashCard("Fruit", "Pinaple", "Pink"));

        //TEST 1 CREAT AND ADD THREE FLASH CARD ON THE FILE
        SaveList.savetoFile(myCards);

        //TEST 2 CLEAR THE LIST AND SAVE TO THE FILE
        myCards.clear();
        SaveList.savetoFile(myCards);

        //TEST 3 ADD TWO FLASH CARDS
        //Lets get 5 Different Flash Card in the list
        myCards.add(new FlashCard("Fruit", "Bananas", "Yellllow"));
        myCards.add(new FlashCard("Fruit", "Apple", "green"));
        SaveList.savetoFile(myCards);

        //TEST 4 READ FROM THE FILE INTO A NEW ARRAYLIST
        List<FlashCard> updated = ReadList.getUpDatedList();
        Gson gson = new Gson();
        String updatedlist = gson.toJson(updated);
        System.out.println("Final LIST " + updatedlist);

    }
}
