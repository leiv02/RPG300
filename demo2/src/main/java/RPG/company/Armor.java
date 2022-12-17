package RPG.company;

public class Armor extends equipment{
    public static final Armor none = new Armor(0,0,0,0,0,"none","none");

    //armor Warrior And Hunter
    private static final Armor plateArmor = new Armor(15,0,5,0,0,"none","Plate armor");
    private static final Armor thornsArmor = new Armor(10,10,5,0,0,"aucun" , "Thorns Armor");
    private static final Armor fireArmor = new Armor(10,15,15,10,15,"fire" , "Fire armor");

    //armor SpellCaster
    private static final Armor mageCloak = new Armor(5,0,15,10,0,"aucun","Mage cloak");
    private static final Armor imperialCloak = new Armor(15,0,20,10,0,"null" , "Imperial cloak");


    //final list armor by categories
    public static final Armor[] listeArmorWarriorHunter={plateArmor, thornsArmor, fireArmor};
    public static final Armor[] listeArmorSpellCaster={mageCloak, imperialCloak};

    public Armor(int defense, int attack, int magic_def, int magic_attack, int type_damage, String type, String name ){
        setDefense(defense);
        setAttack(attack);
        setMagic_def(magic_def);
        setMagic_attack(magic_attack);
        setType_damage(type_damage);
        setType(type);
        setName(name);


    }
}
