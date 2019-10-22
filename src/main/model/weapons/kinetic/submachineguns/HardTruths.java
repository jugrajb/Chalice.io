package model.weapons.kinetic.submachineguns;

import model.runes.green.Desire;
import model.runes.green.War;
import model.runes.purple.Beast;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class HardTruths implements KineticWeaponInterface {
    private final String name = "Hard Truths";
    private final String key = "hardtruths";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/2a542e897c0689b8ea9a1bcaa815f24f.jpg";

    public HardTruths() {
        this.combination = new Runes(name, new Beast(), new War(), new Desire(), image);
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
