package model.runes;

public class Rune {
    private String name;
    private String image;

    public Rune(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
