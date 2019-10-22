package model.weapons.kinetic.sidearms;

import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.green.Pride;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class SmugglersWord implements KineticWeaponInterface {
    private final String name = "Smugglers Word";
    private final String key = "smugglersword";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/69fbf3b40b8fb6760c078d422c26146c.jpg";

    public SmugglersWord() {
        this.combination = new Runes(name, new Pride(), new Wealth(), new Desire(), image);
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
