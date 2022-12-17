package RPG.company;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.concurrent.ExecutionException;


@Data

public class Enemy extends Combatant{

    public static final Enemy vide = new Enemy(0,0,0,0,0,0,"aucun", "aucun");

    //enemy lvl 1

    private static final Enemy forestGobelin1 = new Enemy(10,5,1,2,40,1,"Forest gobelin 1","plant");
    private static final Enemy forestGobelin2 = new Enemy(10,5,1,2,40,1,"Forest gobelin 2","plant");
    private static final Enemy forestGobelinSpear1 = new Enemy(15, 0 ,0,2,20,1, "spear gobelin 1" , "plant");
    private static final Enemy forestGobelinSpear2 = new Enemy(15, 0 ,0,2,20,1, "spear gobelin 2" , "plant");

    //enemy lvl 2

    private static final Enemy fireGolem = new Enemy(20,15,15,5,250,2, "fire golem", "fire");
    private static final Enemy fireMonk = new Enemy(25,5,20,10,150,2,"fire monk" , "fire");
    private static final Enemy blackFlameMonk = new Enemy(40,5,25,5,120,2,"Blackflame monk","fire");
    private static final Enemy thornSorcerer = new Enemy(20,10,20,10,100,2,"Thorn sorcerer", "fire");


    //enemy lvl 3
    private static final Enemy omen = new Enemy(20,50,5,35,600,3,"Omen","dark");
    private static final Enemy starCaller = new Enemy(30,20, 15,10,150,3,"Star caller" ,"dark");
    private static final Enemy missbegottenWarrior = new Enemy(50,5,30,10, 150,3,"Missbegotten Warrior", "dark");
    private static final Enemy banishedWarrior = new Enemy(30,30,30,30,220,3,"Banished warrior", "holy");

    //enemy lvl 4
    private static final Enemy lichDragon = new Enemy(60,20,30,25,400,4,"Lich dragon","dark");
    private static final Enemy glinstoneDragon = new Enemy(50,30,60,45,300,4,"glinstone dragon","holy");
    private static final Enemy dragonicSoldier = new Enemy(50,40,30,40,200,4,"Dragonic soldier","holy");
    private static final Enemy dragonicSentinel = new Enemy(70,40,60,40,250,4,"Dragonic sentinel","plant" );

    //enemy lvl 5
    private static final Enemy godrickTheGrafted = new Enemy(40,25,25,20,400,5,"Godrick, the Grafted","holy");
    private static final Enemy radhanTheStarcourge = new Enemy(70,25,30,30,500,5,"Radhan the Starcourge" , "fire");
    private static final Enemy moghTheOmen = new Enemy(60,20,50,20,450,5,"Mogh, The Omen", "dark");
    //private static final Enemy ragadonOfTHeGoldenOrder;


    // boss
    private static final Enemy maleniaGoddessOfRot = new Enemy(100 , 35, 65,20,750,6,"Malenia , Goddess of Rot","plant");


    public static final Enemy[][] liste_enemie = {
            {forestGobelin1 , forestGobelin2,forestGobelinSpear1 ,forestGobelinSpear2,}, //level 1 enemies
            {fireGolem,fireMonk,blackFlameMonk,thornSorcerer}, //level 2 enemies
            {omen,starCaller,missbegottenWarrior,banishedWarrior}, //level 3 enemies
            {lichDragon,glinstoneDragon,dragonicSentinel,dragonicSoldier}, //level 4 enemies
            {}, //level 5 enemies
            {maleniaGoddessOfRot , vide, vide, vide }  // boss
    };
    public static void main(String[] args) {

    }
    public Enemy(int attack, int defense, int magic_attack, int magic_def, int health, int level, String nom,String type ){
        setAttack(attack);
        setDefense(defense);
        setMagic_attack(magic_attack);
        setMagic_def(magic_def);
        setStamina(10);
        setStamina_left(getStamina());
        setHealth(health);
        setCurrent_health(getHealth());
        setLevel(level);
        setNom(nom);
        setType(type);


    }
    public double[] enemyAttack(){
        double[] damage = new double[6];

        damage[0] = this.getAttack();
        damage[1] = this.getMagic_attack();

        switch (this.getType()) {
            case "fire" -> damage[2] =  this.getMagic_attack()+ this.getAttack() ;
            case "plant" -> damage[3] = this.getMagic_attack()+ this.getAttack() ;
            case "dark" -> damage[4] =  this.getMagic_attack()+ this.getAttack() ;
            case "holy" -> damage[5] =  this.getMagic_attack()+ this.getAttack() ;
        }

        return  damage;
    }
}
