package model.weapons.kinetic;

import model.runes.Runes;
import model.weapons.kinetic.handcannons.Austringer;
import model.weapons.kinetic.handcannons.PribanaD;
import model.weapons.kinetic.shotguns.DustRockBlues;
import model.weapons.kinetic.shotguns.ImperialDecree;
import model.weapons.kinetic.shotguns.ParcelOfStarDust;
import model.weapons.kinetic.sidearms.SmugglersWord;
import model.weapons.kinetic.snipers.DreadedVenture;
import model.weapons.energy.snipers.FateCriesFoul;
import model.weapons.kinetic.submachineguns.HardTruths;
import model.weapons.kinetic.submachineguns.TracklessWaste;

import java.util.HashMap;

public class Kinetic {
    private HashMap<String, Runes> handCannons;
    private HashMap<String, Runes> shotGuns;
    private HashMap<String, Runes> sideArms;
    private HashMap<String, Runes> snipers;
    private HashMap<String, Runes> subMachineGuns;

    public Kinetic() {
        handCannons = new HashMap<>();
        shotGuns = new HashMap<>();
        sideArms = new HashMap<>();
        snipers = new HashMap<>();
        subMachineGuns = new HashMap<>();

        loadHandCannons();
        loadShotGuns();
        loadSnipers();
        loadSubMachineGuns();
        loadSideArms();
    }

    private void loadHandCannons() {
        Austringer austringer = new Austringer();
        PribanaD pribanaD = new PribanaD();

        handCannons.put(austringer.getKey(), austringer.getCombination());
        handCannons.put(pribanaD.getKey(), pribanaD.getCombination());
    }

    private void loadShotGuns() {
        DustRockBlues dustRockBlues = new DustRockBlues();
        ImperialDecree imperialDecree = new ImperialDecree();
        ParcelOfStarDust parcelOfStarDust = new ParcelOfStarDust();

        shotGuns.put(dustRockBlues.getKey(), dustRockBlues.getCombination());
        shotGuns.put(imperialDecree.getKey(),imperialDecree.getCombination());
        shotGuns.put(parcelOfStarDust.getKey(),parcelOfStarDust.getCombination());
    }

    private void loadSnipers() {
        DreadedVenture dreadedVenture = new DreadedVenture();
        FateCriesFoul fateCriesFoul = new FateCriesFoul();

        snipers.put(dreadedVenture.getKey(),dreadedVenture.getCombination());
        snipers.put(fateCriesFoul.getKey(), fateCriesFoul.getCombination());
    }

    private void loadSubMachineGuns() {
        HardTruths hardTruths = new HardTruths();
        TracklessWaste tracklessWaste = new TracklessWaste();

        subMachineGuns.put(hardTruths.getKey(), hardTruths.getCombination());
        subMachineGuns.put(tracklessWaste.getKey(), tracklessWaste.getCombination());
    }

    private void loadSideArms() {
        SmugglersWord smugglersWord = new SmugglersWord();

        sideArms.put(smugglersWord.getKey(), smugglersWord.getCombination());
    }

    public Runes selectHandCannon(String weapon) {
        return handCannons.get(weapon);
    }

    public Runes selectSniper(String weapon) {
        return snipers.get(weapon);
    }

    public Runes selectShotGun(String weapon) {
        return shotGuns.get(weapon);
    }

    public Runes selectSideArm(String weapon) {
        return sideArms.get(weapon);
    }

    public Runes selectSubMachineGun(String weapon) {
        return subMachineGuns.get(weapon);
    }
}
