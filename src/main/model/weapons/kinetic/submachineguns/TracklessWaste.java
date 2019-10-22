package model.weapons.kinetic.submachineguns;

import model.runes.green.Desire;
import model.runes.purple.Beast;
import model.runes.red.Cunning;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class TracklessWaste implements KineticWeaponInterface {
    public final String name = "Trackless Waste";
    private final String key = "tracklesswaste";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/79fe455dd172f8e56b93e971adbf3132.jpg";

    public TracklessWaste() {
        this.combination = new Runes(name, new Beast(), new Cunning(), new Desire(), image);
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public Runes getCombination() {
        return combination;
    }
}
