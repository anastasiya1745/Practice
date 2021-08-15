package hillel.hw8;


import java.util.Random;

public class PokerAction {
    private static int numOfCards = 52;
    private static int numOfPlayer = 4;

    private Cards[] deck = new Cards[numOfCards];


    public   void createDeck() {

        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suites = {"Hearts", " Cubs", "Diamonds", "Spades"};
        int count=0;
         for (String suite: suites) {
             for (String value: values) {
            deck[count++] = new Cards(value, suite);
             }
         }
       }
    public void shuffleDeck() {
        Random random = new Random();
        for (int i=0; i<100;i++){
            int in=random.nextInt(numOfCards);
            int out= random.nextInt(numOfCards);
            Cards card = deck[in];
            deck[in] = deck[out];
            deck[out] = card;
        }
    }
    public void serveDeck() {


        int k =0;
        for (int round=1; round<=5; round++) {
            for (int playerOfGame = 1; playerOfGame <= numOfPlayer; playerOfGame++){
            Cards card = deck[k++];



            System.out.printf("Player %d gets %s%n",playerOfGame , card);
        }

        System.out.println("\n");
    }
}}