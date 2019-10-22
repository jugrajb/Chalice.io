package model.runes;

public class Runes {
    public String itemName;
    public Rune r1;
    public Rune r2;
    public Rune r3;
    public String image;


    public Runes(String name, Rune r1, Rune r2, Rune r3, String image) {
        this.itemName = name;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.image = image;
    }
}
