package model.weapons.kinetic.shotguns;

import model.runes.blue.Excess;
import model.runes.blue.Wealth;
import model.runes.green.Desire;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class DustRockBlues implements KineticWeaponInterface {

    private final String name = "Dust Rock Blues";
    private final String key = "dustrockblues";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/4b068eddf020f2f272d83998f210e33b.jpg";

    public DustRockBlues() {
        this.combination = new Runes(name, new Wealth(), new Excess(), new Desire(), image);
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
