package model.weapons.kinetic.snipers;

import model.runes.blue.Excess;
import model.runes.blue.Wealth;
import model.runes.purple.Jubilation;
import model.runes.Runes;
import model.weapons.kinetic.KineticWeaponInterface;

public class DreadedVenture implements KineticWeaponInterface {
    private final String name = "Dreaded Venture";
    private final String key = "dreadedventure";
    private Runes combination;
    private String image = "https://www.bungie.net/common/destiny2_content/icons/08bedfe45785cf071f22f128a3b10ed6.jpg";

    public DreadedVenture() {
        this.combination = new Runes(name, new Jubilation(), new Excess(), new Wealth(), image);
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
