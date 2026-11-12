
public class Letter {

    private int letterId;
    private String content;
    private String mood;
    private String category;

    public Letter(int letterId, String content, String mood, String category) {
        this.letterId = letterId;
        this.content = content;
        this.mood = mood;
        this.category = category;
    }

    public int getLetterId() {
        return letterId;
    }

    public String getContent() {
        return content;
    }

    public String getMood() {
        return mood;
    }

    public String getCategory() {
        return category;
    }

    public void displayLetter() {
        System.out.println("Letter: " + content);
        System.out.println("Mood: " + mood);
        System.out.println("Category: " + category);
    }
}
