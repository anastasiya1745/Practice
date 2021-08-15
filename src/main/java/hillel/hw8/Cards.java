package hillel.hw8;

public class Cards {

    private String value;
    private String suite;


    public Cards(String value, String suite) {
        this.value = value;
        this.suite = suite;
    }

   public String toString() {
        return "Card " + value + " of " + suite;
   }
}
