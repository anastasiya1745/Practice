package hillel.hw8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        PokerAction pokerAction = new PokerAction();
         pokerAction.createDeck();
         pokerAction.shuffleDeck();
         pokerAction.serveDeck();

    }
}

