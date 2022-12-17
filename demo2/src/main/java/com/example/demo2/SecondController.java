package com.example.demo2;

import RPG.company.*;
import RPG.company.Hero;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

import javafx.stage.Stage;
import lombok.Data;

@Data


public class SecondController {

    private Attack[] listeAttackGiven = {Attack.none, Attack.none};
    private Sort[] listeSortGiven = {Sort.aucun, Sort.aucun};

    private int indexattack = 0;
    //0 : Warrior, 1 Hunter ; 2 Healer; 3 Mage
    private Combatant[] listeCible = new Combatant[8];
    private int[] cible = {4, 4, 4, 4};

    //main button
    @FXML
    private Button warriorButton;
    @FXML
    private Button hunterButton;
    @FXML
    private Button healerButton;
    @FXML
    private Button mageButton;

    //menu
    @FXML
    private Text classT;
    @FXML
    private Text healPoint;
    @FXML
    private Text currentHealPoint;
    @FXML
    private Text stamina;
    @FXML
    private Text staminaleft;
    @FXML
    private Text magicPoint;
    @FXML
    private Text currentMagicPoint;
    @FXML
    private Text attack;
    @FXML
    private Text magicAttack;
    @FXML
    private Text defense;
    @FXML
    private Text magicDefense;
    @FXML
    private Text type;
    @FXML
    private Text level;
    @FXML
    private Text competencePoint;
    @FXML
    private Text arrows;


    //attack menu Item
    @FXML
    private MenuItem action1;
    @FXML
    private MenuItem action2;
    @FXML
    private MenuItem action3;
    @FXML
    private MenuItem action4;


    //target
    @FXML
    private MenuItem target1;
    @FXML
    private MenuItem target2;
    @FXML
    private MenuItem target3;
    @FXML
    private MenuItem target4;
    @FXML
    private MenuItem target5;
    @FXML
    private MenuItem target6;
    @FXML
    private MenuItem target7;
    @FXML
    private MenuItem target8;

    //attack Status
    @FXML
    private Text attackStatusWarrior;
    @FXML
    private Text attackStatusHunter;
    @FXML
    private Text attackStatusHealer;
    @FXML
    private Text attackStatusMage;
    //launch attack button
    @FXML
    private Button launchAttack;

    //enemy HP and name

    @FXML
    private Text enemy1;
    @FXML
    private Text enemy2;
    @FXML
    private Text enemy3;
    @FXML
    private Text enemy4;

    //update
    @FXML
    private Text update1;
    @FXML
    private Text update2;
    @FXML
    private Text update3;
    @FXML
    private Text update4;
    @FXML
    private Text updateLastLap;

    //consumable
    @FXML
    private MenuItem foodButton;
    @FXML
    private MenuItem potionButton;

    //Pane

    @FXML
    private Pane menuPane;
    @FXML
    private Pane fightPane;

    //start the battle
    @FXML
    private Button startTheBattleButton;


    @FXML

    public void onMageClicked() {
        Game temp_game = Game.game;
        Mage temp_class = temp_game.getMage();
        selectAllTarget(temp_class);
        setIndexattack(3);
        action1.setText(temp_class.getEquipped_sort()[0].getName() + " -" + temp_class.getEquipped_sort()[0].getMagic_consomation() + "magic");
        action2.setText(temp_class.getEquipped_sort()[1].getName() + " -" + temp_class.getEquipped_sort()[1].getMagic_consomation() + "magic");
        action3.setText(temp_class.getEquipped_sort()[2].getName() + " -" + temp_class.getEquipped_sort()[2].getMagic_consomation() + "magic");
        action4.setText(temp_class.getEquipped_sort()[3].getName() + " -" + temp_class.getEquipped_sort()[3].getMagic_consomation() + "magic");
        actualiseEnemyText();
        //partie menu
        classT.setText("Class :  Mage");
        healPoint.setText("Max HP : " + temp_class.getHealth());
        currentHealPoint.setText("Current HP : " + temp_class.getCurrent_health());
        stamina.setText("Max stamina : " + temp_class.getStamina());
        staminaleft.setText("Stamina left : " + temp_class.getStamina_left());
        magicPoint.setText("Max magic point : " + temp_class.getMagic_point());
        currentMagicPoint.setText("Current magic point : " + temp_class.getMagic_point_left());
        attack.setText("Attack : " + temp_class.getAttack());
        magicAttack.setText("magic Attack " + temp_class.getMagic_attack());
        defense.setText("Defense : " + temp_class.getDefense());
        magicDefense.setText("Magic Defense : " + temp_class.getMagic_def());
        type.setText("Type : " + temp_class.getType());
        level.setText("Level : " + temp_class.getLevel());
        competencePoint.setText("Competence Point : " + temp_class.getCompetence_point());
        arrows.setText("arrows : None");
        foodButton.setText("food " + temp_class.getInventaire_consumable()[0]);
        potionButton.setText("potion" + temp_class.getInventaire_consumable()[1]);
    }

    public void onHealerClicked() {
        Game temp_game = Game.game;
        Healer temp_class = temp_game.getHealer();
        selectAllTarget(temp_class);
        setIndexattack(2);
        action1.setText(temp_class.getEquipped_sort()[0].getName() + " -" + temp_class.getEquipped_sort()[0].getMagic_consomation() + "magic");
        action2.setText(temp_class.getEquipped_sort()[1].getName() + " -" + temp_class.getEquipped_sort()[1].getMagic_consomation() + "magic");
        action3.setText(temp_class.getEquipped_sort()[2].getName() + " -" + temp_class.getEquipped_sort()[2].getMagic_consomation() + "magic");
        action4.setText(temp_class.getEquipped_sort()[3].getName() + " -" + temp_class.getEquipped_sort()[3].getMagic_consomation() + "magic");
        actualiseEnemyText();
        //partie menu
        classT.setText("Class :  Healer");
        healPoint.setText("Max HP : " + temp_class.getHealth());
        currentHealPoint.setText("Current HP : " + temp_class.getCurrent_health());
        stamina.setText("Max stamina : " + temp_class.getStamina());
        staminaleft.setText("Stamina left : " + temp_class.getStamina_left());
        magicPoint.setText("Max magic point : " + temp_class.getMagic_point());
        currentMagicPoint.setText("Current magic point : " + temp_class.getMagic_point_left());
        attack.setText("Attack : " + temp_class.getAttack());
        magicAttack.setText("magic Attack " + temp_class.getMagic_attack());
        defense.setText("Defense : " + temp_class.getDefense());
        magicDefense.setText("Magic Defense : " + temp_class.getMagic_def());
        type.setText("Type : " + temp_class.getType());
        level.setText("Level : " + temp_class.getLevel());
        competencePoint.setText("Competence Point : " + temp_class.getCompetence_point());
        arrows.setText("arrows : None");
        foodButton.setText("food " + temp_class.getInventaire_consumable()[0]);
        potionButton.setText("potion" + temp_class.getInventaire_consumable()[1]);

    }

    public void onWarriorClicked() {
        Game temp_game = Game.game;
        Warrior temp_class = temp_game.getWarrior();
        action1.setText(Attack.listeAttackWarrior[0].getNom() + " - " + Attack.listeAttackWarrior[0].getStaminaConsumption() + " Stamina");
        action2.setText(Attack.listeAttackWarrior[1].getNom() + " - " + Attack.listeAttackWarrior[1].getStaminaConsumption() + " Stamina");
        action3.setText(Attack.listeAttackWarrior[2].getNom() + " - " + Attack.listeAttackWarrior[2].getStaminaConsumption() + " Stamina");
        action4.setText(Attack.listeAttackWarrior[3].getNom() + " - " + Attack.listeAttackWarrior[3].getStaminaConsumption() + " Stamina");
        selectAllTarget(temp_class);
        setIndexattack(0);
        actualiseEnemyText();
        //partie menue
        classT.setText("Class :  Warrior");
        healPoint.setText("Max HP : " + temp_class.getHealth());
        currentHealPoint.setText("Current HP : " + temp_class.getCurrent_health());
        stamina.setText("Max stamina : " + temp_class.getStamina());
        staminaleft.setText("Stamina left : " + temp_class.getStamina_left());
        magicPoint.setText("Max magic point : None ");
        currentMagicPoint.setText("Current magic point : None ");
        attack.setText("Attack : " + temp_class.getAttack());
        magicAttack.setText("magic Attack " + temp_class.getMagic_attack());
        defense.setText("Defense : " + temp_class.getDefense());
        magicDefense.setText("Magic Defense : " + temp_class.getMagic_def());
        type.setText("Type : " + temp_class.getType());
        level.setText("Level : " + temp_class.getLevel());
        competencePoint.setText("Competence Point : " + temp_class.getCompetence_point());
        arrows.setText("arrows : None");
        foodButton.setText("food " + temp_class.getInventaire_consumable()[0]);
        potionButton.setText("potion" + temp_class.getInventaire_consumable()[1]);

    }

    public void onHunterClicked() {
        Game temp_game = Game.game;
        Hunter temp_class = temp_game.getHunter();
        action1.setText(Attack.listeAttackHunter[0].getNom() + " - " + Attack.listeAttackHunter[0].getStaminaConsumption() + " Stamina");
        action2.setText(Attack.listeAttackHunter[1].getNom() + " - " + Attack.listeAttackHunter[1].getStaminaConsumption() + " Stamina");
        action3.setText(Attack.listeAttackHunter[2].getNom() + " - " + Attack.listeAttackHunter[2].getStaminaConsumption() + " Stamina");
        action4.setText(Attack.listeAttackHunter[3].getNom() + " - " + Attack.listeAttackHunter[3].getStaminaConsumption() + " Stamina");
        selectAllTarget(temp_class);
        setIndexattack(1);
        actualiseEnemyText();
        //partie menu
        classT.setText("Class :  Hunter");
        healPoint.setText("Max HP : " + temp_class.getHealth());
        currentHealPoint.setText("Current HP : " + temp_class.getCurrent_health());
        stamina.setText("Max stamina : " + temp_class.getStamina());
        staminaleft.setText("Stamina left : " + temp_class.getStamina_left());
        magicPoint.setText("Max magic point : None ");
        currentMagicPoint.setText("Current magic point : None ");
        attack.setText("Attack : " + temp_class.getAttack());
        magicAttack.setText("magic Attack " + temp_class.getMagic_attack());
        defense.setText("Defense : " + temp_class.getDefense());
        magicDefense.setText("Magic Defense : " + temp_class.getMagic_def());
        type.setText("Type : " + temp_class.getType());
        level.setText("Level : " + temp_class.getLevel());
        competencePoint.setText("Competence Point : " + temp_class.getCompetence_point());
        arrows.setText("arrows : " + temp_class.getFleche());
        foodButton.setText("food " + temp_class.getInventaire_consumable()[0]);
        potionButton.setText("potion" + temp_class.getInventaire_consumable()[1]);
    }

    public void onAction1Clicked() {
        Game temp_game = Game.game;
        Attack[] temp_listAttackGiven = getListeAttackGiven();
        Sort[] temp_listSortGiven = getListeSortGiven();
        switch (this.getIndexattack()) {
            case 0 -> {
                temp_listAttackGiven[0] = Attack.listeAttackWarrior[0];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 1 -> {
                temp_listAttackGiven[1] = Attack.listeAttackHunter[0];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 2 -> {
                temp_listSortGiven[0] = temp_game.getHealer().getEquipped_sort()[0];
                setListeSortGiven(temp_listSortGiven);
            }
            case 3 -> {
                temp_listSortGiven[1] = temp_game.getMage().getEquipped_sort()[0];
                setListeSortGiven(temp_listSortGiven);
            }
        }
        actualiseAttackStatus();
    }

    public void onAction2Clicked() {
        Game temp_game = Game.game;
        Attack[] temp_listAttackGiven = getListeAttackGiven();
        Sort[] temp_listSortGiven = getListeSortGiven();
        switch (this.getIndexattack()) {
            case 0 -> {
                temp_listAttackGiven[0] = Attack.listeAttackWarrior[1];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 1 -> {
                temp_listAttackGiven[1] = Attack.listeAttackHunter[1];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 2 -> {
                temp_listSortGiven[0] = temp_game.getHealer().getEquipped_sort()[1];
                setListeSortGiven(temp_listSortGiven);
            }
            case 3 -> {
                temp_listSortGiven[1] = temp_game.getMage().getEquipped_sort()[1];
                setListeSortGiven(temp_listSortGiven);
            }
        }
        actualiseAttackStatus();
    }

    public void onAction3Clicked() {
        Game temp_game = Game.game;
        Attack[] temp_listAttackGiven = getListeAttackGiven();
        Sort[] temp_listSortGiven = getListeSortGiven();
        switch (this.getIndexattack()) {
            case 0 -> {
                temp_listAttackGiven[0] = Attack.listeAttackWarrior[2];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 1 -> {
                temp_listAttackGiven[1] = Attack.listeAttackHunter[2];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 2 -> {
                temp_listSortGiven[0] = temp_game.getHealer().getEquipped_sort()[2];
                setListeSortGiven(temp_listSortGiven);
            }
            case 3 -> {
                temp_listSortGiven[1] = temp_game.getMage().getEquipped_sort()[2];
                setListeSortGiven(temp_listSortGiven);
            }
        }
        actualiseAttackStatus();
    }

    public void onAction4Clicked() {
        Game temp_game = Game.game;
        Attack[] temp_listAttackGiven = getListeAttackGiven();
        Sort[] temp_listSortGiven = getListeSortGiven();
        switch (this.getIndexattack()) {
            case 0 -> {
                temp_listAttackGiven[0] = Attack.listeAttackWarrior[3];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 1 -> {
                temp_listAttackGiven[1] = Attack.listeAttackHunter[3];
                setListeAttackGiven(temp_listAttackGiven);
            }
            case 2 -> {
                temp_listSortGiven[0] = temp_game.getHealer().getEquipped_sort()[3];
                setListeSortGiven(temp_listSortGiven);
            }
            case 3 -> {
                temp_listSortGiven[1] = temp_game.getMage().getEquipped_sort()[3];
                setListeSortGiven(temp_listSortGiven);
            }
        }
        actualiseAttackStatus();
    }

    public void onTarget1Clicked() {
        this.cible[indexattack] = 0;
        actualiseAttackStatus();
    }

    public void onTarget2Clicked() {
        this.cible[indexattack] = 1;
        actualiseAttackStatus();
    }

    public void onTarget3Clicked() {
        this.cible[indexattack] = 2;
        actualiseAttackStatus();
    }

    public void onTarget4Clicked() {
        this.cible[indexattack] = 3;
        actualiseAttackStatus();
    }

    public void onTarget5Clicked() {
        this.cible[indexattack] = 4;
        actualiseAttackStatus();
    }

    public void onTarget6Clicked() {
        this.cible[indexattack] = 5;
        actualiseAttackStatus();
    }

    public void onTarget7Clicked() {
        this.cible[indexattack] = 6;
        actualiseAttackStatus();
    }

    public void onTarget8Clicked() {
        this.cible[indexattack] = 7;
        actualiseAttackStatus();
    }

    public void onFoodButtonClicked() {
        Combatant temp_class = listeCible[getIndexattack()];
        int[] temp_consumable = ((Hero) temp_class).getInventaire_consumable();

        temp_class.setCurrent_health(temp_class.getCurrent_health() + temp_class.getHealth() * 0.30);
        if (temp_class.getCurrent_health() > temp_class.getHealth()) {
            temp_class.setCurrent_health(temp_class.getHealth());
        }
        temp_consumable[0]--;
        ((Hero) temp_class).setInventaire_consumable(temp_consumable);
        foodButton.setText("food " + ((Hero) temp_class).getInventaire_consumable()[0]);

        switch (getIndexattack()) {
            case 0 -> onWarriorClicked();
            case 1 -> onHunterClicked();
            case 2 -> onHealerClicked();
            case 3 -> onMageClicked();
        }

    }

    public void onPotionButtonClicked() {
        Combatant temp_class = listeCible[getIndexattack()];
        int[] temp_consumable = ((Hero) temp_class).getInventaire_consumable();
        int valueReturn = 0;

        if (temp_class instanceof SpellCaster) {
            double calc = (((SpellCaster) temp_class).getMagic_point_left() + ((SpellCaster) temp_class).getMagic_point() * 0.30);
            valueReturn = (int) calc;
            ((SpellCaster) temp_class).setMagic_point_left(valueReturn);
            if (((SpellCaster) temp_class).getMagic_point_left() > ((SpellCaster) temp_class).getMagic_point()) {
                ((SpellCaster) temp_class).setMagic_point_left(((SpellCaster) temp_class).getMagic_point());
            }
        }
        if (temp_class instanceof Warrior || temp_class instanceof Hunter) {
            double calc2 = (temp_class.getStamina_left() + temp_class.getStamina() * 0.30);
            valueReturn = (int) calc2;
            temp_class.setStamina_left(valueReturn);
            if (temp_class.getStamina_left() > temp_class.getStamina()) {
                temp_class.setStamina_left(temp_class.getStamina());
            }

        }


        temp_consumable[1]--;
        ((Hero) temp_class).setInventaire_consumable(temp_consumable);
        potionButton.setText("potion" + ((Hero) temp_class).getInventaire_consumable()[0]);

        switch (getIndexattack()) {
            case 0 -> onWarriorClicked();
            case 1 -> onHunterClicked();
            case 2 -> onHealerClicked();
            case 3 -> onMageClicked();
        }
    }
    public void onStartTheBattleButtonClicked(){
        fightPane.setVisible(true);
        menuPane.setVisible(true);
        updateLastLap.setVisible(true);
        startTheBattleButton.setVisible(false);
        onWarriorClicked();
        onAction1Clicked();
    }

    public void onLaunchAttackedClicked() throws IOException {
        Game temp_game = Game.game;
        Warrior temp_Warrior = temp_game.getWarrior();
        Hunter temp_Hunter = temp_game.getHunter();
        Healer temp_Healer = temp_game.getHealer();
        Mage temp_Mage = temp_game.getMage();
        Random random = new Random();

        double[] warriorDamage;
        double[] hunterDamage;

        double[] healerDamage;
        double[] mageDamage;

        if (temp_Warrior.getStamina() >= getListeAttackGiven()[0].getStaminaConsumption()) {
            warriorDamage = temp_Warrior.useAttack(listeAttackGiven[0]);
        } else {
            warriorDamage = temp_Warrior.useAttack(Attack.none);
        }


        if (temp_Hunter.getStamina() >= getListeAttackGiven()[1].getStaminaConsumption()) {
            if (getListeAttackGiven()[1] == Attack.MachArrow || getListeAttackGiven()[1] == Attack.arrowShot) {
                hunterDamage = temp_Hunter.useArrowAttack(listeAttackGiven[1]);
            } else {
                hunterDamage = temp_Hunter.useAttack(listeAttackGiven[1]);
            }
        } else {
            hunterDamage = temp_Hunter.useAttack(Attack.none);
        }

        if (temp_Healer.getMagic_point_left() >= getListeSortGiven()[0].getMagic_consomation()) {
            healerDamage = temp_Healer.useSort(getListeSortGiven()[0]);
        } else {
            healerDamage = temp_Healer.useSort(Sort.aucun);
        }

        if (temp_Mage.getMagic_point_left() >= getListeSortGiven()[1].getMagic_consomation()) {
            mageDamage = temp_Mage.useSort(getListeSortGiven()[1]);
        } else {
            mageDamage = temp_Mage.useSort(Sort.aucun);
        }

        listeCible[cible[0]].receiveDamageAttack(warriorDamage);
        listeCible[cible[1]].receiveDamageAttack(hunterDamage);
        listeCible[cible[2]].receiveDamageSort(healerDamage);
        listeCible[cible[3]].receiveDamageSort(mageDamage);

        if (temp_game.getListeEnemies()[0].getCurrent_health() <= 0) {
            target5.setVisible(false);
        } else {
            target5.setVisible(true);
            target5.setText(temp_game.getListeEnemies()[0].getNom());
        }
        if (temp_game.getListeEnemies()[1].getCurrent_health() <= 0) {
            target6.setVisible(false);
        } else {
            target6.setVisible(true);
            target6.setText(temp_game.getListeEnemies()[1].getNom());
        }
        if (temp_game.getListeEnemies()[2].getCurrent_health() <= 0) {
            target7.setVisible(false);
        } else {
            target7.setVisible(true);
            target7.setText(temp_game.getListeEnemies()[2].getNom());
        }
        if (temp_game.getListeEnemies()[3].getCurrent_health() <= 0) {
            target8.setVisible(false);
        } else {
            target8.setVisible(true);
            target8.setText(temp_game.getListeEnemies()[3].getNom());
        }


        for (int i = 0; i < temp_game.getListeEnemies().length; i++) {
            if (temp_game.getListeEnemies()[i].getCurrent_health() >= 0) {
                int randomInt = random.nextInt(4);
                if (temp_game.getMage().getCurrent_health() <= 0 && temp_game.getHealer().getCurrent_health() <= 0 && temp_game.getHunter().getCurrent_health() <= 0 && temp_game.getWarrior().getCurrent_health() <= 0) {
                    Stage stage = new Stage();
                    Stage stage1 = (Stage) launchAttack.getScene().getWindow();
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("looseScreen.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
                    stage.setTitle("RPG");
                    stage.setScene(scene);
                    stage.show();
                    stage1.close();;
                    break;
                }
                while (listeCible[randomInt].getCurrent_health() <= 0) {
                    randomInt = random.nextInt(4);
                }
                double healthComp = listeCible[randomInt].getCurrent_health();
                listeCible[randomInt].receiveDamageAttack(temp_game.getListeEnemies()[i].enemyAttack());
                switch (i) {
                    case 0 -> {
                        update1.setVisible(true);
                        update1.setText(temp_game.getListeEnemies()[i].getNom() + " have done " + (healthComp - listeCible[randomInt].getCurrent_health()) + " damage to " + listeCible[randomInt].getNom());
                    }
                    case 1 -> {
                        update2.setVisible(true);
                        update2.setText(temp_game.getListeEnemies()[i].getNom() + " have done " + (healthComp - listeCible[randomInt].getCurrent_health()) + " damage to " + listeCible[randomInt].getNom());
                    }

                    case 2 -> {
                        update3.setVisible(true);
                        update3.setText(temp_game.getListeEnemies()[i].getNom() + " have done " + (healthComp - listeCible[randomInt].getCurrent_health()) + " damage to " + listeCible[randomInt].getNom());
                    }
                    case 3 -> {
                        update4.setVisible(true);
                        update4.setText(temp_game.getListeEnemies()[i].getNom() + " have done " + (healthComp - listeCible[randomInt].getCurrent_health()) + " damage to " + listeCible[randomInt].getNom());
                    }

                }
            }

        }
        if (temp_game.getMage().getCurrent_health() <= 0 && temp_game.getHealer().getCurrent_health() <= 0 && temp_game.getHunter().getCurrent_health() <= 0 && temp_game.getWarrior().getCurrent_health() <= 0) {
            Stage stage = new Stage();
            Stage stage1 = (Stage) launchAttack.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("looseScreen.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
            stage.setTitle("RPG");
            stage.setScene(scene);
            stage.show();
            stage1.close();
        }
        //we check if all enemies are dead or not
        boolean checker = false;
        for (int i = 0; i < temp_game.getListeEnemies().length; i++) {
            if (temp_game.getListeEnemies()[i].getCurrent_health() > 0) {
                checker = true;
                break;
            }
        }
        if (!checker) {
            if (temp_game.getCurrent_lvl() == 6){
                Stage stage = new Stage();
                Stage stage1 = (Stage) launchAttack.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("victory.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
                stage.setTitle("RPG");
                stage.setScene(scene);
                stage.show();
                stage1.close();
            }
            //on loadera la prochaine page
            Stage stage = new Stage();
            Stage stage1 = (Stage) launchAttack.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("interphase.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
            stage.setTitle("RPG");
            stage.setScene(scene);
            stage.show();
            stage1.close();
        }
        this.listeAttackGiven[0] = Attack.none;
        this.listeAttackGiven[1] = Attack.none;
        this.listeSortGiven[0] = Sort.aucun;
        this.listeSortGiven[1] = Sort.aucun;
        Arrays.fill(this.cible, 4);
        actualiseAttackStatus();
        actualiseEnemyText();

        switch (getIndexattack()) {
            case 0 -> onWarriorClicked();
            case 1 -> onHunterClicked();
            case 2 -> onHealerClicked();
            case 3 -> onMageClicked();
        }


    }


    public void selectAllTarget(Hero tempclass) {
        Game temp_game = Game.game;
        if (tempclass instanceof Healer) {
            if (temp_game.getWarrior().getCurrent_health() <= 0) {
                target1.setVisible(false);
            } else {
                target1.setVisible(true);
                target1.setText("warrior");
            }
            if (temp_game.getHunter().getCurrent_health() <= 0) {
                target2.setVisible(false);
            } else {
                target2.setVisible(true);
                target2.setText("Hunter");
            }
            if (temp_game.getHealer().getCurrent_health() <= 0) {
                target3.setVisible(false);
            } else {
                target3.setVisible(true);
                target3.setText("healer");
            }
            if (temp_game.getMage().getCurrent_health() <= 0) {
                target4.setVisible(false);
            } else {
                target4.setVisible(true);
                target4.setText("Mage");
            }
            if (temp_game.getListeEnemies()[0].getCurrent_health() <= 0) {
                target5.setVisible(false);
            } else {
                target5.setVisible(true);
                target5.setText(temp_game.getListeEnemies()[0].getNom());
            }
            if (temp_game.getListeEnemies()[1].getCurrent_health() <= 0) {
                target6.setVisible(false);
            } else {
                target6.setVisible(true);
                target6.setText(temp_game.getListeEnemies()[1].getNom());
            }
            if (temp_game.getListeEnemies()[2].getCurrent_health() <= 0) {
                target7.setVisible(false);
            } else {
                target7.setVisible(true);
                target7.setText(temp_game.getListeEnemies()[2].getNom());
            }
            if (temp_game.getListeEnemies()[3].getCurrent_health() <= 0) {
                target8.setVisible(false);
            } else {
                target8.setVisible(true);
                target8.setText(temp_game.getListeEnemies()[3].getNom());
            }
        } else {
            target1.setVisible(false);
            target2.setVisible(false);
            target3.setVisible(false);
            target4.setVisible(false);
            if (temp_game.getListeEnemies()[0].getCurrent_health() <= 0) {
                target5.setVisible(false);
            } else {
                target5.setVisible(true);
                target5.setText(temp_game.getListeEnemies()[0].getNom());
            }
            if (temp_game.getListeEnemies()[1].getCurrent_health() <= 0) {
                target6.setVisible(false);
            } else {
                target6.setVisible(true);
                target6.setText(temp_game.getListeEnemies()[1].getNom());
            }
            if (temp_game.getListeEnemies()[2].getCurrent_health() <= 0) {
                target7.setVisible(false);
            } else {
                target7.setVisible(true);
                target7.setText(temp_game.getListeEnemies()[2].getNom());
            }
            if (temp_game.getListeEnemies()[3].getCurrent_health() <= 0) {
                target8.setVisible(false);
            } else {
                target8.setVisible(true);
                target8.setText(temp_game.getListeEnemies()[3].getNom());
            }

        }
    }

    public void actualiseAttackStatus() {
        Game temp_game = Game.game;
        actualiseCible();
        attackStatusWarrior.setText("Warrior : attack = " + this.listeAttackGiven[0].getNom() + "  target = " + this.listeCible[this.cible[0]].getNom());
        attackStatusHunter.setText("Hunter  : attack = " + this.listeAttackGiven[1].getNom() + "  target = " + this.listeCible[this.cible[1]].getNom());
        attackStatusHealer.setText("Healer  : attack = " + this.listeSortGiven[0].getName() + "  target = " + this.listeCible[this.cible[2]].getNom());
        attackStatusMage.setText("Mage    : attack = " + this.listeSortGiven[1].getName() + "  target = " + this.listeCible[this.cible[3]].getNom());
        if (temp_game.getWarrior().getCurrent_health() <= 0) {
            attackStatusWarrior.setText("Warrior Dead");
            warriorButton.setVisible(false);

        }
        if (temp_game.getHunter().getCurrent_health() <= 0) {
            attackStatusHunter.setText("Hunter Dead");
            hunterButton.setVisible(false);
        }
        if (temp_game.getHealer().getCurrent_health() <= 0) {
            attackStatusHealer.setText("Healer Dead");
            healerButton.setVisible(false);
        }
        if (temp_game.getMage().getCurrent_health() <= 0) {
            attackStatusMage.setText("Mage Dead");
            mageButton.setVisible(false);
        }
    }

    public void actualiseCible() {
        Game temp_game = Game.game;
        Combatant[] temp_listeCible = new Combatant[4 + temp_game.getListeEnemies().length];
        temp_listeCible[0] = temp_game.getWarrior();
        temp_listeCible[1] = temp_game.getHunter();
        temp_listeCible[2] = temp_game.getHealer();
        temp_listeCible[3] = temp_game.getMage();
        for (int i = 0; i < temp_game.getListeEnemies().length; i++) {
            temp_listeCible[4 + i] = temp_game.getListeEnemies()[i];
        }
        setListeCible(temp_listeCible);

    }

    public void actualiseEnemyText() {
        Game temp_game = Game.game;
        Enemy[] liste_tempo = temp_game.getListeEnemies();

        if (liste_tempo.length == 4) {

            if (liste_tempo[0].getCurrent_health() > 0) {
                enemy1.setText(liste_tempo[0].getNom() + " " + liste_tempo[0].getCurrent_health() + " HP");
                enemy1.setVisible(true);
            } else {
                enemy1.setVisible(false);
            }
            if (liste_tempo[1].getCurrent_health() > 0) {
                enemy2.setText(liste_tempo[1].getNom() + " " + liste_tempo[1].getCurrent_health() + " HP");
                enemy2.setVisible(true);
            } else {
                enemy2.setVisible(false);
            }
            if (liste_tempo[2].getCurrent_health() > 0) {
                enemy3.setText(liste_tempo[2].getNom() + " " + liste_tempo[2].getCurrent_health() + " HP");
                enemy3.setVisible(true);
            } else {
                enemy3.setVisible(false);
            }
            if (liste_tempo[3].getCurrent_health() > 0) {
                enemy4.setText(liste_tempo[3].getNom() + " " + liste_tempo[3].getCurrent_health() + " HP");
                enemy4.setVisible(true);
            } else {
                enemy4.setVisible(false);
            }
        } else if (liste_tempo.length == 1) {
            if (liste_tempo[0].getCurrent_health() > 0) {
                enemy4.setVisible(false);
                enemy3.setVisible(false);
                enemy2.setVisible(false);
                enemy1.setText(liste_tempo[0].getNom() + " " + liste_tempo[0].getCurrent_health() + " HP");
                enemy1.setVisible(true);
            } else {
                enemy1.setVisible(false);
            }
        }
    }
}
