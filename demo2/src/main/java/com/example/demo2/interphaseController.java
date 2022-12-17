package com.example.demo2;

import RPG.company.*;
import RPG.company.Hero;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

import javafx.stage.Stage;
import lombok.Data;

@Data

public class interphaseController {
    private int index = 0;
    private Game temp_game = Game.game;
    private Hero temp_class;


    //Weapon reward
    private Weapon warriorWeaponReward;
    private Weapon hunterWeaponReward;
    private Weapon healerWeaponReward;
    private Weapon mageWeaponReward;

    //Armor reward
    private Armor warriorArmorReward;
    private Armor hunterArmorReward;
    private Armor healerArmorReward;
    private Armor mageArmorReward;

    //sort reward

    private Sort healerSortReward;
    private Sort mageSortReward;

    //Pane Part
    @FXML
    private AnchorPane sortPane;
    @FXML
    private AnchorPane inventoryPane;
    @FXML
    private AnchorPane competencePane;
    @FXML
    private AnchorPane rewardPane;


    //cp part
    @FXML
    private Text warriorCP;
    @FXML
    private Text hunterCP;
    @FXML
    private Text healerCP;
    @FXML
    private Text mageCP;

    //class Part
    @FXML
    private Text warriorClass;
    @FXML
    private Text hunterClass;
    @FXML
    private Text healerClass;
    @FXML
    private Text mageClass;

    //health part
    @FXML
    private Text warriorHealth;
    @FXML
    private Button warriorHealthButton;
    @FXML
    private Text hunterHealth;
    @FXML
    private Button hunterHealthButton;
    @FXML
    private Text healerHealth;
    @FXML
    private Button healerHealthButton;
    @FXML
    private Text mageHealth;
    @FXML
    private Button mageHealthButton;


    //stamina part
    @FXML
    private Text warriorStamina;
    @FXML
    private Button warriorStaminaButton;
    @FXML
    private Text hunterStamina;
    @FXML
    private Button hunterStaminaButton;

    //magic part
    @FXML
    private Text healerMagic;
    @FXML
    private Button healerMagicButton;
    @FXML
    private Text mageMagic;
    @FXML
    private Button mageMagicButton;


    //Attack part
    @FXML
    private Text warriorAttack;
    @FXML
    private Button warriorAttackButton;
    @FXML
    private Text hunterAttack;
    @FXML
    private Button hunterAttackButton;
    @FXML
    private Text healerAttack;
    @FXML
    private Button healerAttackButton;
    @FXML
    private Text mageAttack;
    @FXML
    private Button mageAttackButton;

    //magic Attack part
    @FXML
    private Text warriorMagicAttack;
    @FXML
    private Button warriorMagicAttackButton;
    @FXML
    private Text hunterMagicAttack;
    @FXML
    private Button hunterMagicAttackButton;
    @FXML
    private Text healerMagicAttack;
    @FXML
    private Button healerMagicAttackButton;
    @FXML
    private Text mageMagicAttack;
    @FXML
    private Button mageMagicAttackButton;

    //defense Part
    @FXML
    private Text warriorDefense;
    @FXML
    private Button warriorDefenseButton;
    @FXML
    private Text hunterDefense;
    @FXML
    private Button hunterDefenseButton;
    @FXML
    private Text healerDefense;
    @FXML
    private Button healerDefenseButton;
    @FXML
    private Text mageDefense;
    @FXML
    private Button mageDefenseButton;

    //magic Defense Part
    @FXML
    private Text warriorMagicDefense;
    @FXML
    private Button warriorMagicDefenseButton;
    @FXML
    private Text hunterMagicDefense;
    @FXML
    private Button hunterMagicDefenseButton;
    @FXML
    private Text healerMagicDefense;
    @FXML
    private Button healerMagicDefenseButton;
    @FXML
    private Text mageMagicDefense;
    @FXML
    private Button mageMagicDefenseButton;

    //part index
    @FXML
    private Button warriorIndex;
    @FXML
    private Button hunterIndex;
    @FXML
    private Button healerIndex;
    @FXML
    private Button mageIndex;

    //Weapon part
    @FXML
    private Text currentWeapon;
    @FXML
    private Button equipWeapon1Button;
    @FXML
    private Button equipWeapon2Button;
    @FXML
    private Button equipWeapon3Button;
    @FXML
    private Button equipWeapon4Button;
    @FXML
    private Button equipWeapon5Button;
    @FXML
    private Button equipWeapon6Button;
    @FXML
    private Button equipWeapon7Button;
    @FXML
    private Text weapon1;
    @FXML
    private Text weapon2;
    @FXML
    private Text weapon3;
    @FXML
    private Text weapon4;
    @FXML
    private Text weapon5;
    @FXML
    private Text weapon6;
    @FXML
    private Text weapon7;

    //Armor Part
    @FXML
    private Text currentArmor;
    @FXML
    private Button equipArmor1Button;
    @FXML
    private Button equipArmor2Button;
    @FXML
    private Button equipArmor3Button;
    @FXML
    private Button equipArmor4Button;
    @FXML
    private Button equipArmor5Button;
    @FXML
    private Button equipArmor6Button;
    @FXML
    private Button equipArmor7Button;
    @FXML
    private Text armor1;
    @FXML
    private Text armor2;
    @FXML
    private Text armor3;
    @FXML
    private Text armor4;
    @FXML
    private Text armor5;
    @FXML
    private Text armor6;
    @FXML
    private Text armor7;

    //Sort part

    @FXML
    private Button unequipSort1Button;
    @FXML
    private Button unequipSort2Button;
    @FXML
    private Button unequipSort3Button;
    @FXML
    private Button unequipSort4Button;
    @FXML
    private Button equipSort1Button;
    @FXML
    private Button equipSort2Button;
    @FXML
    private Button equipSort3Button;
    @FXML
    private Button equipSort4Button;
    @FXML
    private Button equipSort5Button;
    @FXML
    private Button equipSort6Button;
    @FXML
    private Button equipSort7Button;
    @FXML
    private Button equipSort8Button;
    @FXML
    private Button equipSort9Button;
    @FXML
    private Text equipedSort1;
    @FXML
    private Text equipedSort2;
    @FXML
    private Text equipedSort3;
    @FXML
    private Text equipedSort4;
    @FXML
    private Text knownSort1;
    @FXML
    private Text knownSort2;
    @FXML
    private Text knownSort3;
    @FXML
    private Text knownSort4;
    @FXML
    private Text knownSort5;
    @FXML
    private Text knownSort6;
    @FXML
    private Text knownSort7;
    @FXML
    private Text knownSort8;
    @FXML
    private Text knownSort9;


    //part reward
    @FXML
    private Text warriorReward;
    @FXML
    private Text hunterReward;
    @FXML
    private Text healerReward;
    @FXML
    private Text mageReward;
    @FXML
    private Button receiveRewardsButton;

    //finish upgrade part
    @FXML
    private Button finishPreparationButton;


    public void actualiseStatsText() {
        //class
        warriorClass.setText("warrior");
        hunterClass.setText("hunter");
        healerClass.setText("healer");
        mageClass.setText("mage");
        //health
        warriorHealth.setText("Health : " + temp_game.getWarrior().getHealth());
        hunterHealth.setText("Health : " + temp_game.getHunter().getHealth());
        healerHealth.setText("Health : " + temp_game.getHealer().getHealth());
        mageHealth.setText("Health : " + temp_game.getMage().getHealth());
        //stamina and magic
        warriorStamina.setText("Stamina : " + temp_game.getWarrior().getStamina());
        hunterStamina.setText("Stamina : " + temp_game.getHunter().getStamina());
        healerMagic.setText("Magic : " + temp_game.getHealer().getMagic_point());
        mageMagic.setText("Magic : " + temp_game.getMage().getMagic_point());
        //CP
        warriorCP.setText("Competence point : " + temp_game.getWarrior().getCompetence_point());
        hunterCP.setText("Competence point : " + temp_game.getHunter().getCompetence_point());
        healerCP.setText("Competence point : " + temp_game.getHealer().getCompetence_point());
        mageCP.setText("Competence point : " + temp_game.getMage().getCompetence_point());

        //attack
        warriorAttack.setText(" attack : " + temp_game.getWarrior().getAttack());
        hunterAttack.setText(" attack : " + temp_game.getHunter().getAttack());
        healerAttack.setText(" attack : " + temp_game.getHealer().getAttack());
        mageAttack.setText(" attack : " + temp_game.getMage().getAttack());

        //magic Attack
        warriorMagicAttack.setText("Magic attack : " + temp_game.getWarrior().getMagic_attack());
        hunterMagicAttack.setText("Magic attack : " + temp_game.getHunter().getMagic_attack());
        healerMagicAttack.setText("Magic attack : " + temp_game.getHealer().getMagic_attack());
        mageMagicAttack.setText("Magic attack : " + temp_game.getMage().getMagic_attack());

        //defense
        warriorDefense.setText("defense : " + temp_game.getWarrior().getDefense());
        hunterDefense.setText("defense : " + temp_game.getHunter().getDefense());
        healerDefense.setText("defense : " + temp_game.getHealer().getDefense());
        mageDefense.setText("defense : " + temp_game.getMage().getDefense());

        //magic defense
        warriorMagicDefense.setText("Magic defense : " + temp_game.getWarrior().getMagic_def());
        hunterMagicDefense.setText("Magic defense : " + temp_game.getHunter().getMagic_def());
        healerMagicDefense.setText("Magic defense : " + temp_game.getHealer().getMagic_def());
        mageMagicDefense.setText("Magic defense : " + temp_game.getMage().getMagic_def());


    }

    public void actualiseInventoryText() {
        switch (getIndex()) {
            case 0 -> temp_class = temp_game.getWarrior();
            case 1 -> temp_class = temp_game.getHunter();
            case 2 -> temp_class = temp_game.getHealer();
            case 3 -> temp_class = temp_game.getMage();
        }
        Weapon[] temp_weaponInventory = temp_class.getInventaire_weapon();
        Armor[] temp_armorInventory = temp_class.getInventaire_armor();
        //weapon
        currentWeapon.setText("Current weapon : " + temp_weaponInventory[temp_class.getWeapon_equipped()].getName());
        weapon1.setText(temp_weaponInventory[0].getName() + " A : " + temp_weaponInventory[0].getAttack() + " MA : " + temp_weaponInventory[0].getMagic_attack() + " D : " + temp_weaponInventory[0].getDefense() + " MD : " + temp_weaponInventory[0].getMagic_def() + " T : " + temp_weaponInventory[0].getType() + " TD : " + temp_weaponInventory[0].getType_damage());
        weapon2.setText(temp_weaponInventory[1].getName() + " A : " + temp_weaponInventory[1].getAttack() + " MA : " + temp_weaponInventory[1].getMagic_attack() + " D : " + temp_weaponInventory[1].getDefense() + " MD : " + temp_weaponInventory[1].getMagic_def() + " T : " + temp_weaponInventory[1].getType() + " TD : " + temp_weaponInventory[1].getType_damage());
        weapon3.setText(temp_weaponInventory[2].getName() + " A : " + temp_weaponInventory[2].getAttack() + " MA : " + temp_weaponInventory[2].getMagic_attack() + " D : " + temp_weaponInventory[2].getDefense() + " MD : " + temp_weaponInventory[2].getMagic_def() + " T : " + temp_weaponInventory[2].getType() + " TD : " + temp_weaponInventory[2].getType_damage());
        weapon4.setText(temp_weaponInventory[3].getName() + " A : " + temp_weaponInventory[3].getAttack() + " MA : " + temp_weaponInventory[3].getMagic_attack() + " D : " + temp_weaponInventory[3].getDefense() + " MD : " + temp_weaponInventory[3].getMagic_def() + " T : " + temp_weaponInventory[3].getType() + " TD : " + temp_weaponInventory[3].getType_damage());
        weapon5.setText(temp_weaponInventory[4].getName() + " A : " + temp_weaponInventory[4].getAttack() + " MA : " + temp_weaponInventory[4].getMagic_attack() + " D : " + temp_weaponInventory[4].getDefense() + " MD : " + temp_weaponInventory[4].getMagic_def() + " T : " + temp_weaponInventory[4].getType() + " TD : " + temp_weaponInventory[4].getType_damage());
        weapon6.setText(temp_weaponInventory[5].getName() + " A : " + temp_weaponInventory[5].getAttack() + " MA : " + temp_weaponInventory[5].getMagic_attack() + " D : " + temp_weaponInventory[5].getDefense() + " MD : " + temp_weaponInventory[5].getMagic_def() + " T : " + temp_weaponInventory[5].getType() + " TD : " + temp_weaponInventory[5].getType_damage());
        weapon7.setText(temp_weaponInventory[6].getName() + " A : " + temp_weaponInventory[6].getAttack() + " MA : " + temp_weaponInventory[6].getMagic_attack() + " D : " + temp_weaponInventory[6].getDefense() + " MD : " + temp_weaponInventory[6].getMagic_def() + " T : " + temp_weaponInventory[6].getType() + " TD : " + temp_weaponInventory[6].getType_damage());

        //Armor
        currentArmor.setText("Current weapon : " + temp_armorInventory[temp_class.getArmor_equipped()].getName());
        armor1.setText(temp_armorInventory[0].getName() + " A : " + temp_armorInventory[0].getAttack() + " MA : " + temp_armorInventory[0].getMagic_attack() + " D : " + temp_armorInventory[0].getDefense() + " MD : " + temp_armorInventory[0].getMagic_def() + " T : " + temp_armorInventory[0].getType() + " TD : " + temp_armorInventory[0].getType_damage());
        armor2.setText(temp_armorInventory[1].getName() + " A : " + temp_armorInventory[1].getAttack() + " MA : " + temp_armorInventory[1].getMagic_attack() + " D : " + temp_armorInventory[1].getDefense() + " MD : " + temp_armorInventory[1].getMagic_def() + " T : " + temp_armorInventory[1].getType() + " TD : " + temp_armorInventory[1].getType_damage());
        armor3.setText(temp_armorInventory[2].getName() + " A : " + temp_armorInventory[2].getAttack() + " MA : " + temp_armorInventory[2].getMagic_attack() + " D : " + temp_armorInventory[2].getDefense() + " MD : " + temp_armorInventory[2].getMagic_def() + " T : " + temp_armorInventory[2].getType() + " TD : " + temp_armorInventory[2].getType_damage());
        armor4.setText(temp_armorInventory[3].getName() + " A : " + temp_armorInventory[3].getAttack() + " MA : " + temp_armorInventory[3].getMagic_attack() + " D : " + temp_armorInventory[3].getDefense() + " MD : " + temp_armorInventory[3].getMagic_def() + " T : " + temp_armorInventory[3].getType() + " TD : " + temp_armorInventory[3].getType_damage());
        armor5.setText(temp_armorInventory[4].getName() + " A : " + temp_armorInventory[4].getAttack() + " MA : " + temp_armorInventory[4].getMagic_attack() + " D : " + temp_armorInventory[4].getDefense() + " MD : " + temp_armorInventory[4].getMagic_def() + " T : " + temp_armorInventory[4].getType() + " TD : " + temp_armorInventory[4].getType_damage());
        armor6.setText(temp_armorInventory[5].getName() + " A : " + temp_armorInventory[5].getAttack() + " MA : " + temp_armorInventory[5].getMagic_attack() + " D : " + temp_armorInventory[5].getDefense() + " MD : " + temp_armorInventory[5].getMagic_def() + " T : " + temp_armorInventory[5].getType() + " TD : " + temp_armorInventory[5].getType_damage());
        armor7.setText(temp_armorInventory[6].getName() + " A : " + temp_armorInventory[6].getAttack() + " MA : " + temp_armorInventory[6].getMagic_attack() + " D : " + temp_armorInventory[6].getDefense() + " MD : " + temp_armorInventory[6].getMagic_def() + " T : " + temp_armorInventory[6].getType() + " TD : " + temp_armorInventory[6].getType_damage());

        //Sort
        if (temp_class instanceof Mage || temp_class instanceof Healer) {
            Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
            Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
            sortPane.setVisible(true);
            equipedSort1.setText(temp_equipedSort[0].getName() + " H : " + temp_equipedSort[0].getHeal() + " MC : " + temp_equipedSort[0].getMagic_consomation() + " DM : " + temp_equipedSort[0].getDamageMultiplicator() + " MDM : " + temp_equipedSort[0].getMagicDamageMultiplicator() + " TDM : " + temp_equipedSort[0].getTypeDamageMultiplicator() + " TD : " + temp_equipedSort[0].getTypeDamage() + " T : " + temp_equipedSort[0].getType());
            equipedSort2.setText(temp_equipedSort[1].getName() + " H : " + temp_equipedSort[1].getHeal() + " MC : " + temp_equipedSort[1].getMagic_consomation() + " DM : " + temp_equipedSort[1].getDamageMultiplicator() + " MDM : " + temp_equipedSort[1].getMagicDamageMultiplicator() + " TDM : " + temp_equipedSort[1].getTypeDamageMultiplicator() + " TD : " + temp_equipedSort[1].getTypeDamage() + " T : " + temp_equipedSort[1].getType());
            equipedSort3.setText(temp_equipedSort[2].getName() + " H : " + temp_equipedSort[2].getHeal() + " MC : " + temp_equipedSort[2].getMagic_consomation() + " DM : " + temp_equipedSort[2].getDamageMultiplicator() + " MDM : " + temp_equipedSort[2].getMagicDamageMultiplicator() + " TDM : " + temp_equipedSort[2].getTypeDamageMultiplicator() + " TD : " + temp_equipedSort[2].getTypeDamage() + " T : " + temp_equipedSort[2].getType());
            equipedSort4.setText(temp_equipedSort[3].getName() + " H : " + temp_equipedSort[3].getHeal() + " MC : " + temp_equipedSort[3].getMagic_consomation() + " DM : " + temp_equipedSort[3].getDamageMultiplicator() + " MDM : " + temp_equipedSort[3].getMagicDamageMultiplicator() + " TDM : " + temp_equipedSort[3].getTypeDamageMultiplicator() + " TD : " + temp_equipedSort[3].getTypeDamage() + " T : " + temp_equipedSort[3].getType());

            knownSort1.setText(temp_knownSort[0].getName() + " H : " + temp_knownSort[0].getHeal() + " MC : " + temp_knownSort[0].getMagic_consomation() + " DM : " + temp_knownSort[0].getDamageMultiplicator() + " MDM : " + temp_knownSort[0].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[0].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[0].getTypeDamage() + " T : " + temp_knownSort[0].getType());
            knownSort2.setText(temp_knownSort[1].getName() + " H : " + temp_knownSort[1].getHeal() + " MC : " + temp_knownSort[1].getMagic_consomation() + " DM : " + temp_knownSort[1].getDamageMultiplicator() + " MDM : " + temp_knownSort[1].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[1].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[1].getTypeDamage() + " T : " + temp_knownSort[1].getType());
            knownSort3.setText(temp_knownSort[2].getName() + " H : " + temp_knownSort[2].getHeal() + " MC : " + temp_knownSort[2].getMagic_consomation() + " DM : " + temp_knownSort[2].getDamageMultiplicator() + " MDM : " + temp_knownSort[2].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[2].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[2].getTypeDamage() + " T : " + temp_knownSort[2].getType());
            knownSort4.setText(temp_knownSort[3].getName() + " H : " + temp_knownSort[3].getHeal() + " MC : " + temp_knownSort[3].getMagic_consomation() + " DM : " + temp_knownSort[3].getDamageMultiplicator() + " MDM : " + temp_knownSort[3].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[3].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[3].getTypeDamage() + " T : " + temp_knownSort[3].getType());
            knownSort5.setText(temp_knownSort[4].getName() + " H : " + temp_knownSort[4].getHeal() + " MC : " + temp_knownSort[4].getMagic_consomation() + " DM : " + temp_knownSort[4].getDamageMultiplicator() + " MDM : " + temp_knownSort[4].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[4].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[4].getTypeDamage() + " T : " + temp_knownSort[4].getType());
            knownSort6.setText(temp_knownSort[5].getName() + " H : " + temp_knownSort[5].getHeal() + " MC : " + temp_knownSort[5].getMagic_consomation() + " DM : " + temp_knownSort[5].getDamageMultiplicator() + " MDM : " + temp_knownSort[5].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[5].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[5].getTypeDamage() + " T : " + temp_knownSort[5].getType());
            knownSort7.setText(temp_knownSort[6].getName() + " H : " + temp_knownSort[6].getHeal() + " MC : " + temp_knownSort[6].getMagic_consomation() + " DM : " + temp_knownSort[6].getDamageMultiplicator() + " MDM : " + temp_knownSort[6].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[6].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[6].getTypeDamage() + " T : " + temp_knownSort[6].getType());
            knownSort8.setText(temp_knownSort[7].getName() + " H : " + temp_knownSort[7].getHeal() + " MC : " + temp_knownSort[7].getMagic_consomation() + " DM : " + temp_knownSort[7].getDamageMultiplicator() + " MDM : " + temp_knownSort[7].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[7].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[7].getTypeDamage() + " T : " + temp_knownSort[7].getType());
            knownSort9.setText(temp_knownSort[8].getName() + " H : " + temp_knownSort[8].getHeal() + " MC : " + temp_knownSort[8].getMagic_consomation() + " DM : " + temp_knownSort[8].getDamageMultiplicator() + " MDM : " + temp_knownSort[8].getMagicDamageMultiplicator() + " TDM : " + temp_knownSort[8].getTypeDamageMultiplicator() + " TD : " + temp_knownSort[8].getTypeDamage() + " T : " + temp_knownSort[8].getType());


        } else {
            sortPane.setVisible(false);
        }


    }

    //stats buttons Warrior
    public void checkerButtonWarrior() {
        if (temp_game.getWarrior().getCompetence_point() <= 0) {
            warriorHealthButton.setVisible(false);
            warriorStaminaButton.setVisible(false);
            warriorAttackButton.setVisible(false);
            warriorMagicAttackButton.setVisible(false);
            warriorDefenseButton.setVisible(false);
            warriorMagicDefenseButton.setVisible(false);
        } else {
            warriorHealthButton.setVisible(true);
            warriorStaminaButton.setVisible(true);
            warriorAttackButton.setVisible(true);
            warriorMagicAttackButton.setVisible(true);
            warriorDefenseButton.setVisible(true);
            warriorMagicDefenseButton.setVisible(true);
        }
    }

    public void onWarriorHealthButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setHealth(temp_game.getWarrior().getHealth() + 5);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    public void onWarriorStaminaButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setStamina(temp_game.getWarrior().getStamina() + 5);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    public void onWarriorAttackButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setAttack(temp_game.getWarrior().getAttack() + 1);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    public void onWarriorMagicAttackButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setMagic_attack(temp_game.getWarrior().getMagic_attack() + 1);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    public void onWarriorDefenseButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setDefense(temp_game.getWarrior().getDefense() + 1);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    public void onWarriorMagicDefenseButtonClicked() {
        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() - 1);
        temp_game.getWarrior().setMagic_def(temp_game.getWarrior().getMagic_def() + 1);
        checkerButtonWarrior();
        actualiseStatsText();
    }

    //stats buttons Hunter
    public void checkerButtonHunter() {
        if (temp_game.getHunter().getCompetence_point() <= 0) {
            hunterHealthButton.setVisible(false);
            hunterStaminaButton.setVisible(false);
            hunterAttackButton.setVisible(false);
            hunterMagicAttackButton.setVisible(false);
            hunterDefenseButton.setVisible(false);
            hunterMagicDefenseButton.setVisible(false);
        } else {
            hunterHealthButton.setVisible(true);
            hunterStaminaButton.setVisible(true);
            hunterAttackButton.setVisible(true);
            hunterMagicAttackButton.setVisible(true);
            hunterDefenseButton.setVisible(true);
            hunterMagicDefenseButton.setVisible(true);
        }
    }

    public void onHunterHealthButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setHealth(temp_game.getHunter().getHealth() + 5);
        checkerButtonHunter();
        actualiseStatsText();
    }

    public void onHunterStaminaButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setStamina(temp_game.getHunter().getStamina() + 5);
        checkerButtonHunter();
        actualiseStatsText();
    }

    public void onHunterAttackButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setAttack(temp_game.getHunter().getAttack() + 1);
        checkerButtonHunter();
        actualiseStatsText();
    }

    public void onHunterMagicAttackButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setMagic_attack(temp_game.getHunter().getMagic_attack() + 1);
        checkerButtonHunter();
        actualiseStatsText();
    }

    public void onHunterDefenseButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setDefense(temp_game.getHunter().getDefense() + 1);
        checkerButtonHunter();
        actualiseStatsText();
    }

    public void onHunterMagicDefenseButtonClicked() {
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() - 1);
        temp_game.getHunter().setMagic_def(temp_game.getHunter().getMagic_def() + 1);
        checkerButtonHunter();
        actualiseStatsText();
    }

    //stats buttons Healer
    public void checkerButtonHealer() {
        if (temp_game.getHealer().getCompetence_point() <= 0) {
            healerHealthButton.setVisible(false);
            healerMagicButton.setVisible(false);
            healerAttackButton.setVisible(false);
            healerMagicAttackButton.setVisible(false);
            healerDefenseButton.setVisible(false);
            healerMagicDefenseButton.setVisible(false);
        } else {
            healerHealthButton.setVisible(true);
            healerMagicButton.setVisible(true);
            healerAttackButton.setVisible(true);
            healerMagicAttackButton.setVisible(true);
            healerDefenseButton.setVisible(true);
            healerMagicDefenseButton.setVisible(true);
        }
    }

    public void onHealerHealthButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setHealth(temp_game.getHealer().getHealth() + 5);
        checkerButtonHealer();
        actualiseStatsText();
    }

    public void onHealermagicButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setMagic_point(temp_game.getHealer().getMagic_point() + 5);
        checkerButtonHealer();
        actualiseStatsText();
    }

    public void onHealerAttackButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setAttack(temp_game.getHealer().getAttack() + 1);
        checkerButtonHealer();
        actualiseStatsText();
    }

    public void onHealerMagicAttackButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setMagic_attack(temp_game.getHealer().getMagic_attack() + 1);
        checkerButtonHealer();
        actualiseStatsText();
    }

    public void onHealerDefenseButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setDefense(temp_game.getHealer().getDefense() + 1);
        checkerButtonHealer();
        actualiseStatsText();
    }

    public void onHealerMagicDefenseButtonClicked() {
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() - 1);
        temp_game.getHealer().setMagic_def(temp_game.getHealer().getMagic_def() + 1);
        checkerButtonHealer();
        actualiseStatsText();
    }

    //stats buttons Mage
    public void checkerButtonMage() {
        if (temp_game.getMage().getCompetence_point() <= 0) {
            mageHealthButton.setVisible(false);
            mageMagicButton.setVisible(false);
            mageAttackButton.setVisible(false);
            mageMagicAttackButton.setVisible(false);
            mageDefenseButton.setVisible(false);
            mageMagicDefenseButton.setVisible(false);
        } else {
            mageHealthButton.setVisible(true);
            mageMagicButton.setVisible(true);
            mageAttackButton.setVisible(true);
            mageMagicAttackButton.setVisible(true);
            mageDefenseButton.setVisible(true);
            mageMagicDefenseButton.setVisible(true);
        }
    }

    public void onMageHealthButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setHealth(temp_game.getMage().getHealth() + 5);
        checkerButtonMage();
        actualiseStatsText();
    }

    public void onMagemagicButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setMagic_point(temp_game.getMage().getMagic_point() + 5);
        checkerButtonMage();
        actualiseStatsText();
    }

    public void onMageAttackButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setAttack(temp_game.getMage().getAttack() + 1);
        checkerButtonMage();
        actualiseStatsText();
    }

    public void onMageMagicAttackButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setMagic_attack(temp_game.getMage().getMagic_attack() + 1);
        checkerButtonMage();
        actualiseStatsText();
    }

    public void onMageDefenseButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setDefense(temp_game.getMage().getDefense() + 1);
        checkerButtonMage();
        actualiseStatsText();
    }

    public void onMageMagicDefenseButtonClicked() {
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() - 1);
        temp_game.getMage().setMagic_def(temp_game.getMage().getMagic_def() + 1);
        checkerButtonMage();
        actualiseStatsText();
    }

    //Inventory chooser Button

    public void onWarriorIndexClicked() {
        setIndex(0);
        actualiseInventoryText();
    }

    public void onHunterIndexClicked() {
        setIndex(1);
        actualiseInventoryText();
    }

    public void onHealerIndexClicked() {
        setIndex(2);
        actualiseInventoryText();
    }

    public void onMageIndexClicked() {
        setIndex(3);
        actualiseInventoryText();
    }

    //Weapon inventory Buttons

    public void onEquipWeapon1ButtonClicked() {
        temp_class.setWeapon_equipped(0);
        actualiseInventoryText();
    }

    public void onEquipWeapon2ButtonClicked() {
        temp_class.setWeapon_equipped(1);
        actualiseInventoryText();
    }

    public void onEquipWeapon3ButtonClicked() {
        temp_class.setWeapon_equipped(2);
        actualiseInventoryText();
    }

    public void onEquipWeapon4ButtonClicked() {
        temp_class.setWeapon_equipped(3);
        actualiseInventoryText();
    }

    public void onEquipWeapon5ButtonClicked() {
        temp_class.setWeapon_equipped(4);
        actualiseInventoryText();
    }

    public void onEquipWeapon6ButtonClicked() {
        temp_class.setWeapon_equipped(5);
        actualiseInventoryText();
    }

    public void onEquipWeapon7ButtonClicked() {
        temp_class.setWeapon_equipped(6);
        actualiseInventoryText();
    }

    //Armor inventory Buttons

    public void onEquipArmor1ButtonClicked() {
        temp_class.setArmor_equipped(0);
        actualiseInventoryText();
    }

    public void onEquipArmor2ButtonClicked() {
        temp_class.setArmor_equipped(1);
        actualiseInventoryText();
    }

    public void onEquipArmor3ButtonClicked() {
        temp_class.setArmor_equipped(2);
        actualiseInventoryText();
    }

    public void onEquipArmor4ButtonClicked() {
        temp_class.setArmor_equipped(3);
        actualiseInventoryText();
    }

    public void onEquipArmor5ButtonClicked() {
        temp_class.setArmor_equipped(4);
        actualiseInventoryText();
    }

    public void onEquipArmor6ButtonClicked() {
        temp_class.setArmor_equipped(5);
        actualiseInventoryText();
    }

    public void onEquipArmor7ButtonClicked() {
        temp_class.setArmor_equipped(6);
        actualiseInventoryText();
    }

    //Sort inventory
    public int findEmptyInEquippedSort() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        boolean checker = true;
        int returnVal = 0;
        for (int i = 0; i < temp_equipedSort.length; i++) {
            if (temp_equipedSort[i].getName().equals("aucun")) {
                returnVal = i;
                checker = false;
                break;
            }
        }
        if (checker) {
            returnVal = 5;
        }
        return returnVal;
    }

    public void onUnequipSort1ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        temp_equipedSort[0] = Sort.aucun;
        ((SpellCaster) temp_class).setEquipped_sort(temp_equipedSort);
        actualiseInventoryText();
    }

    public void onUnequipSort2ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        temp_equipedSort[1] = Sort.aucun;
        ((SpellCaster) temp_class).setEquipped_sort(temp_equipedSort);
        actualiseInventoryText();
    }

    public void onUnequipSort3ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        temp_equipedSort[2] = Sort.aucun;
        ((SpellCaster) temp_class).setEquipped_sort(temp_equipedSort);
        actualiseInventoryText();
    }

    public void onUnequipSort4ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        temp_equipedSort[3] = Sort.aucun;
        ((SpellCaster) temp_class).setEquipped_sort(temp_equipedSort);
        actualiseInventoryText();
    }

    public void onEquipSort1ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[0];
        }
        actualiseInventoryText();
    }

    public void onEquipSort2ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[1];
        }
        actualiseInventoryText();
    }

    public void onEquipSort3ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[2];
        }
        actualiseInventoryText();
    }

    public void onEquipSort4ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[3];
        }
        actualiseInventoryText();
    }

    public void onEquipSort5ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[4];
        }
        actualiseInventoryText();
    }

    public void onEquipSort6ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[5];
        }
        actualiseInventoryText();
    }

    public void onEquipSort7ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[6];
        }
        actualiseInventoryText();
    }

    public void onEquipSort8ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[7];
        }
        actualiseInventoryText();
    }

    public void onEquipSort9ButtonClicked() {
        Sort[] temp_equipedSort = ((SpellCaster) temp_class).getEquipped_sort();
        Sort[] temp_knownSort = ((SpellCaster) temp_class).getKnown_sort();
        int placeSort = findEmptyInEquippedSort();
        if (placeSort < 4) {
            temp_equipedSort[placeSort] = temp_knownSort[8];
        }
        actualiseInventoryText();
    }
    //receive Prize

    public void onReceiveRewardsClicked() {

        Random random = new Random();
        //Weapon Reward
        int posReward = random.nextInt(Weapon.listWeaponWarrior.length);
        warriorWeaponReward = Weapon.listWeaponWarrior[posReward];
        Weapon[] tempVariableWeapon = temp_game.getWarrior().getInventaire_weapon();
        tempVariableWeapon[temp_game.getCurrent_lvl() - 1] = warriorWeaponReward;
        temp_game.getWarrior().setInventaire_weapon(tempVariableWeapon);

        posReward = random.nextInt(Weapon.listWeaponHunter.length);
        hunterWeaponReward = Weapon.listWeaponHunter[posReward];
        tempVariableWeapon = temp_game.getHunter().getInventaire_weapon();
        tempVariableWeapon[temp_game.getCurrent_lvl() - 1] = hunterWeaponReward;
        temp_game.getHunter().setInventaire_weapon(tempVariableWeapon);

        posReward = random.nextInt(Weapon.listWeaponSpellCaster.length);
        healerWeaponReward = Weapon.listWeaponSpellCaster[posReward];
        tempVariableWeapon = temp_game.getHealer().getInventaire_weapon();
        tempVariableWeapon[temp_game.getCurrent_lvl() - 1] = healerWeaponReward;
        temp_game.getHealer().setInventaire_weapon(tempVariableWeapon);

        posReward = random.nextInt(Weapon.listWeaponSpellCaster.length);
        mageWeaponReward = Weapon.listWeaponSpellCaster[posReward];
        tempVariableWeapon = temp_game.getMage().getInventaire_weapon();
        tempVariableWeapon[temp_game.getCurrent_lvl() - 1] = mageWeaponReward;
        temp_game.getMage().setInventaire_weapon(tempVariableWeapon);


        //armor Reward
        posReward = random.nextInt(Armor.listeArmorWarriorHunter.length);
        warriorArmorReward = Armor.listeArmorWarriorHunter[posReward];
        Armor[] tempVariableArmor = temp_game.getWarrior().getInventaire_armor();
        tempVariableArmor[temp_game.getCurrent_lvl() - 1] = warriorArmorReward;
        temp_game.getWarrior().setInventaire_armor(tempVariableArmor);

        posReward = random.nextInt(Armor.listeArmorWarriorHunter.length);
        hunterArmorReward = Armor.listeArmorWarriorHunter[posReward];
        tempVariableArmor = temp_game.getHunter().getInventaire_armor();
        tempVariableArmor[temp_game.getCurrent_lvl() - 1] = hunterArmorReward;
        temp_game.getHunter().setInventaire_armor(tempVariableArmor);

        posReward = random.nextInt(Armor.listeArmorSpellCaster.length);
        healerArmorReward = Armor.listeArmorSpellCaster[posReward];
        tempVariableArmor = temp_game.getHealer().getInventaire_armor();
        tempVariableArmor[temp_game.getCurrent_lvl() - 1] = healerArmorReward;
        temp_game.getHealer().setInventaire_armor(tempVariableArmor);

        posReward = random.nextInt(Armor.listeArmorSpellCaster.length);
        mageArmorReward = Armor.listeArmorSpellCaster[posReward];
        tempVariableArmor = temp_game.getMage().getInventaire_armor();
        tempVariableArmor[temp_game.getCurrent_lvl() - 1] = mageArmorReward;
        temp_game.getMage().setInventaire_armor(tempVariableArmor);

        //sort Reward

        posReward = random.nextInt(Sort.liste_sortsHealer.length);
        healerSortReward = Sort.liste_sortsHealer[posReward];
        Sort[] tempVariableSort = temp_game.getHealer().getKnown_sort();
        tempVariableSort[temp_game.getCurrent_lvl() + 3] = healerSortReward;
        temp_game.getHealer().setKnown_sort(tempVariableSort);

        posReward = random.nextInt(Sort.liste_sorts.length);
        mageSortReward = Sort.liste_sorts[posReward];
        tempVariableSort = temp_game.getMage().getKnown_sort();
        tempVariableSort[temp_game.getCurrent_lvl() + 3] = mageSortReward;
        temp_game.getMage().setKnown_sort(tempVariableSort);

        //display rewards
        warriorReward.setText("Warrior rewards : Weapon reward : "+warriorWeaponReward.getName()+ " Armor reward : "+warriorArmorReward.getName());
        hunterReward.setText("Hunter rewards Weapon reward : "+hunterWeaponReward.getName()+ " Armor reward : "+hunterArmorReward.getName());
        healerReward.setText("Healer rewards :  Weapon reward : "+healerWeaponReward.getName()+ " Armor reward : "+healerArmorReward.getName()+" Sort reward : " + healerSortReward.getName());
        mageReward.setText("Mage rewards : Weapon reward : "+mageWeaponReward.getName()+ " Armor reward : "+mageArmorReward.getName()+" Sort reward : " + mageSortReward.getName());

        //give the competence point after the fight

        temp_game.getWarrior().setCompetence_point(temp_game.getWarrior().getCompetence_point() + 20);
        temp_game.getHunter().setCompetence_point(temp_game.getHunter().getCompetence_point() + 20);
        temp_game.getHealer().setCompetence_point(temp_game.getHealer().getCompetence_point() + 20);
        temp_game.getMage().setCompetence_point(temp_game.getMage().getCompetence_point() + 20);

        //make appear all the Pane
        sortPane.setVisible(true);
        competencePane.setVisible(true);
        rewardPane.setVisible(true);
        inventoryPane.setVisible(true);
        finishPreparationButton.setVisible(true);

        //make disappear the button
        receiveRewardsButton.setVisible(false);

        actualiseInventoryText();
        actualiseStatsText();
    }
    public void onFinishPreparationButtonClicked() throws IOException {
        temp_game.setCurrent_lvl(temp_game.getCurrent_lvl() +1);
        temp_game.actualiseEnemyList();
        Stage stage = new Stage();

        if (temp_game.getWarrior().getCurrent_health() > 0){
            temp_game.getWarrior().setCurrent_health(temp_game.getWarrior().getHealth());
            temp_game.getWarrior().setStamina_left(temp_game.getWarrior().getStamina());
        }

        if (temp_game.getHunter().getCurrent_health() > 0){
            temp_game.getHunter().setCurrent_health(temp_game.getHunter().getHealth());
            temp_game.getHunter().setStamina_left(temp_game.getHunter().getStamina());
            temp_game.getHunter().setFleche(10);
        }

        if (temp_game.getHealer().getCurrent_health() > 0){
            temp_game.getHealer().setCurrent_health(temp_game.getHealer().getHealth());
            temp_game.getHealer().setMagic_point_left(temp_game.getHealer().getMagic_point());
        }

        if(temp_game.getMage().getCurrent_health() > 0){
            temp_game.getMage().setCurrent_health(temp_game.getMage().getHealth());
            temp_game.getMage().setMagic_point_left(temp_game.getMage().getMagic_point());
        }


        Stage stage1 = (Stage) finishPreparationButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("RPG");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

}
