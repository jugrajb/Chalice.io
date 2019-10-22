package model.weapons.heavy;

import model.runes.Runes;
import model.weapons.heavy.lightmachineguns.FixedOdds;
import model.weapons.heavy.rocketlauncher.BadOmens;
import model.weapons.heavy.rocketlauncher.SleepLess;
import model.weapons.heavy.rocketlauncher.ZenobiaD;

import java.util.HashMap;

public class Heavy {
    private HashMap<String, Runes> machineGuns;
    private HashMap<String, Runes> rockets;

    public Heavy() {
        machineGuns = new HashMap<>();
        rockets = new HashMap<>();

        loadMachineGuns();
        loadRockets();
    }

    private void loadMachineGuns() {
        HeavyWeaponInterface fixedOdds = new FixedOdds();

        machineGuns.put(fixedOdds.getKey(), fixedOdds.getRuneCombination());
    }

    private void loadRockets() {
        HeavyWeaponInterface badOmens = new BadOmens();
        HeavyWeaponInterface sleepLess = new SleepLess();
        HeavyWeaponInterface zenobiaD = new ZenobiaD();

        rockets.put(badOmens.getKey(), badOmens.getRuneCombination());
        rockets.put(sleepLess.getKey(), sleepLess.getRuneCombination());
        rockets.put(zenobiaD.getKey(), zenobiaD.getRuneCombination());
    }

    public Runes selectMachineGun(String weapon) {
        return machineGuns.get(weapon);
    }

    public Runes selectRocket(String weapon) {
        return rockets.get(weapon);
    }
}
