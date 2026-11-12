
public class Bottle {

    private int bottleId;
    private Letter letter;
    private boolean discovered;

    public Bottle(int bottleId, Letter letter) {
        this.bottleId = bottleId;
        this.letter = letter;
        this.discovered = false;
    }

    public int getBottleId() {
        return bottleId;
    }

    public Letter getLetter() {
        return letter;
    }

    public boolean isDiscovered() {
        return discovered;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;
    }

    public void displayBottle() {
        System.out.println("Bottle ID: " + bottleId);
        System.out.println("Discovery Status: " + discovered);
        letter.displayLetter();
    }
}
