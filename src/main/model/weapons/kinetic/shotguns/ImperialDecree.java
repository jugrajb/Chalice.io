package model.weapons.kinetic.shotguns;

import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.green.War;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class ImperialDecree implements KineticWeaponInterface {
    private final String name = "Imperial Decree";
    private final String key = "imperialdecree";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/b64923bae9ebf4785ec888f7c4b95213.jpg";

    public ImperialDecree() {
        this.combination = new Runes(name, new Wealth(), new Desire(), new War(), image);
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
