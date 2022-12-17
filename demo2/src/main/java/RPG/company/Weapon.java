package RPG.company;


import java.nio.file.AtomicMoveNotSupportedException;

public class Weapon extends equipment {
    public static void main(String[] args) {
    }
    public static final Weapon none = new Weapon(0,0,0,0,0,"none","none");
    //arme warrior

    private static final Weapon blade = new Weapon(0,5,0,0,0,"aucun","blade");
    private static final Weapon enchantedBlade= new Weapon(0,10,0,10,10,"holy" , "enchanted Blade");
    private static final Weapon heavySword = new Weapon(5,25,0,0,0,"aucun","Espadon lourd");
    private static final Weapon cursedSword = new Weapon(0,15,0,25,15,"dark","Cursed Sword");
    private static final Weapon eclipseKatana = new Weapon(0,20,0,15,20,"fire","Eclispe Katana");
    private static final Weapon moonveilKatana = new Weapon(0,15,0,20,20,"dark","Moonveil Katana");



    //arme hunter

    private static final Weapon basicBow = new Weapon(0,4,0,0,0,"aucun","Basic box");
    private static final Weapon fullMoonCrossBow = new Weapon(0,15,0,25,10,"Holy", "Full moon crossbow");
    private static final Weapon blackBow = new Weapon(0,10,0,5,5,"dark","Black bow");
    private static final Weapon reduvia = new Weapon(0,20,0,20,20,"fire","reduvia");
    private static final Weapon rootDagger = new Weapon(0,15,0,10,15,"plant","Root dagger");


    //arme healer et Mage

    private static final Weapon sceptre = new Weapon(0,5,5,15,7,"holy","sceptre");
    private static final Weapon meteoriteStaff = new Weapon(5,10,15,20,10,"dark","Meteorite Staff");
    private static final Weapon glinstoneStaff = new Weapon(-10,20,-10,25,30,"plant","Glinstone staff");
    private static final Weapon albinauracStaff = new Weapon(0,20,0,20,20,"plant", "Albinaurac staff");
    private static final Weapon frenziedFlameSeal = new Weapon(-15,40,-20,35,25,"fire","Frenzied flame seal");


    //liste final arme par classe
    public static final Weapon[] listWeaponWarrior = {none, blade,enchantedBlade,heavySword,cursedSword,eclipseKatana,moonveilKatana};
    public static final Weapon[] listWeaponHunter = {none , basicBow,fullMoonCrossBow,blackBow,reduvia,rootDagger};
    public static final Weapon[] listWeaponSpellCaster = {none ,sceptre,meteoriteStaff,glinstoneStaff,albinauracStaff,frenziedFlameSeal};



    public Weapon(int defense, int attack, int magic_def, int magic_attack, int type_damage, String type, String name ) {
    setDefense(defense);
    setAttack(attack);
    setMagic_def(magic_def);
    setMagic_attack(magic_attack);
    setType_damage(type_damage);
    setType(type);
    setName(name);
    }
}
