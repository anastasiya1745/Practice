package hillel.hw8;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        PokerAction pokerAction = new PokerAction();
        pokerAction.setNumOfPlayer(3);
        pokerAction.setNumOfCards(53);
         pokerAction.createDeck();
         pokerAction.shuffleDeck();
         pokerAction.serveDeck();

    }
}

