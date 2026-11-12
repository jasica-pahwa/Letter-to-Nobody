
public class Main {

    public static void main(String[] args) {

        Letter letter1 = new Letter(
            101,
            "I hope you find happiness wherever life takes you.",
            "Hopeful",
            "Unsent Thoughts"
        );

        Bottle bottle1 = new Bottle(501, letter1);

        bottle1.displayBottle();
    }
}
