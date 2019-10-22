package model.weapons.kinetic.shotguns;

import model.runes.blue.Wealth;
import model.runes.green.War;
import model.runes.red.Cunning;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class ParcelOfStarDust implements KineticWeaponInterface {
    private final String name = "Parcel Of StarDust";
    private final String key = "parcelofstardust";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/92ede747eb53ba1552761b6efde54839.jpg";

    public ParcelOfStarDust() {
        this.combination = new Runes(name, new Wealth(), new Cunning(), new War(), image);
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
