package singleresponsability;

public class BookV2 {

    private String name;
    private String author;
    private String text;

    public BookV2(String name, String author, String text) {
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
