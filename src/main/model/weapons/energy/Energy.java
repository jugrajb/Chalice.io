package model.weapons.energy;

import model.runes.Runes;
import model.weapons.energy.fusionrifles.ErentilFR4;
import model.weapons.energy.fusionrifles.MainIngredient;
import model.weapons.energy.fusionrifles.ProeliumFR3;
import model.weapons.energy.fusionrifles.TheEpicurean;
import model.weapons.energy.handcannons.Trust;
import model.weapons.energy.handcannons.WakingVigil;
import model.weapons.energy.shotguns.BadLander;
import model.weapons.energy.sidearms.AnonymousAutumn;
import model.weapons.energy.sidearms.Drang;
import model.weapons.energy.sidearms.LastDance;
import model.weapons.energy.snipers.Beloved;
import model.weapons.energy.snipers.FateCriesFoul;
import model.weapons.energy.snipers.TwilightOath;
import model.weapons.energy.submachineguns.BadReputation;
import model.weapons.energy.submachineguns.CalusMiniTool;

import java.util.HashMap;

public class Energy {
    private HashMap<String, Runes> fusionRifles;
    private HashMap<String, Runes> shotguns;
    private HashMap<String, Runes> sideArms;
    private HashMap<String, Runes> subMachineGuns;
    private HashMap<String, Runes> snipers;
    private HashMap<String, Runes> handCannons;

    public Energy() {
        fusionRifles = new HashMap<>();
        shotguns = new HashMap<>();
        sideArms = new HashMap<>();
        subMachineGuns = new HashMap<>();
        snipers = new HashMap<>();
        handCannons = new HashMap<>();

        loadFusionRifles();
        loadHandCannons();
        loadShotguns();
        loadSideArms();
        loadSnipers();
        loadSubMachineGuns();
    }


    private void loadFusionRifles() {
        ErentilFR4 fr4 = new ErentilFR4();
        MainIngredient mi = new MainIngredient();
        ProeliumFR3 fr3 = new ProeliumFR3();
        TheEpicurean te = new TheEpicurean();

        this.fusionRifles.put(fr4.getKey(), fr4.getCombination());
        this.fusionRifles.put(fr3.getKey(), fr3.getCombination());
        this.fusionRifles.put(mi.getKey(), mi.getCombination());
        this.fusionRifles.put(te.getKey(), te.getCombination());
    }

    private void loadHandCannons() {
        Trust trust = new Trust();
        WakingVigil wv = new WakingVigil();

        this.handCannons.put(trust.getKey(), trust.getCombination());
        this.handCannons.put(wv.getKey(), wv.getCombination());
    }

    private void loadShotguns() {
        BadLander badLander = new BadLander();

        this.shotguns.put(badLander.getKey(), badLander.getCombination());
    }

    private void loadSideArms() {
        AnonymousAutumn aa = new AnonymousAutumn();
        Drang drang = new Drang();
        LastDance ld = new LastDance();

        this.sideArms.put(aa.getKey(), aa.getCombination());
        this.sideArms.put(drang.getKey(), drang.getCombination());
        this.sideArms.put(ld.getKey(), ld.getCombination());
    }

    private void loadSnipers() {
        Beloved beloved = new Beloved();
        TwilightOath to = new TwilightOath();
        FateCriesFoul fcf = new FateCriesFoul();

        this.snipers.put(beloved.getKey(), beloved.getCombination());
        this.snipers.put(to.getKey(), to.getCombination());
        this.snipers.put(fcf.getKey(), fcf.getCombination());
    }

    private void loadSubMachineGuns() {
        BadReputation br = new BadReputation();
        CalusMiniTool cmt = new CalusMiniTool();

        this.subMachineGuns.put(br.getKey(), br.getCombination());
        this.subMachineGuns.put(cmt.getKey(), cmt.getCombination());
    }

    public Runes selectHandCannon(String weapon) {
        return this.handCannons.get(weapon);
    }

    public Runes selectSubMachineGun(String weapon) {
        return subMachineGuns.get(weapon);
    }

    public Runes selectSniper(String weapon) {
        return snipers.get(weapon);
    }

    public Runes selectShotGun(String weapon) {
        return shotguns.get(weapon);
    }

    public Runes selectFusionRifle(String weapon) {
        return fusionRifles.get(weapon);
    }

    public Runes selectSideArm(String weapon) {
        return sideArms.get(weapon);
    }
}
