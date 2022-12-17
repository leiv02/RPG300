package RPG.company;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Sort {
    public static void main(String[] args) {

    }

    private double damageMultiplicator;
    private double heal;
    private double magicDamageMultiplicator;
    private double typeDamageMultiplicator;
    private double typeDamage;
    private int tier;
    private int magic_consomation;
    private String name;
    private String type;

    public final static Sort aucun = new Sort(0,0,0,0,0,0,0,"aucun","aucun");

    //sort for all

    private static final Sort fireball = new Sort(1,0,2,1,4,1.5,10,"fireball", "fire");
    private static final Sort greenWhip = new Sort(1,0,1.5,1,1,1.2,5,"green Whip", "plant");
    private static final Sort darkBall = new Sort(0.5,0,2.5,1,7,2,10,"dark Ball" , "dark");
    private static final Sort holyArrow = new Sort(0.5,0,1,1,0,1,5,"light arrow" , "holy");
    private static final Sort natureBlast = new Sort(1.5,0,1.5,1,5,1.4,5,"nature Blast","plant");
    private static final Sort volcanoExplosion = new Sort(1,0,1.5,1,10,2,20,"volcano explosion" ,"plant");
    private static final Sort holyDesintegration = new Sort(2,0,2,2,35,2,20,"holy Desintegration",  "holy");
    private static final Sort blackHole = new Sort(3,0,1,2,25,2,15,"Black Hole","dark");
    private static final Sort judgment = new Sort(2,0,2,2,10,2,15,"judgment","holy");




    //sort for Healer

    private static final Sort lightHeal = new Sort(0,10,0,1,5,0, 0,"light heal", "holy");
    private static final Sort Heal = new Sort(0,15,0,2,10,0, 0,"heal", "holy");
    private static final Sort purification = new Sort(0,40,0,3,15,0,0,"purification" , "holy");


    //final sort list
    public static final Sort[] liste_sorts = {fireball , greenWhip , darkBall , holyArrow,natureBlast,volcanoExplosion,holyDesintegration,blackHole,judgment};
    public static final Sort[] liste_sortsHealer = {lightHeal,Heal,purification,holyDesintegration,judgment};


    public Sort(double DamageMultiplicator, double heal,double magicDamageMultiplicator, int tier, int magic_consomation ,double typeDamageMultiplicator,double typeDamage,   String name, String type ){
        setDamageMultiplicator(DamageMultiplicator);
        setHeal(heal);
        setMagicDamageMultiplicator(magicDamageMultiplicator);
        setTier(tier);
        setTypeDamageMultiplicator(typeDamageMultiplicator);
        setTypeDamage(typeDamage);
        setMagic_consomation(magic_consomation);
        setName(name);
        setType(type);


    }
}