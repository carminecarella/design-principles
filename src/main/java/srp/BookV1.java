package srp;

public class BookV1 {

    private String name;
    private String author;
    private String text;

    public BookV1(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    void printTextToConsole() {
        // our code for formatting and printing the text
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

}
