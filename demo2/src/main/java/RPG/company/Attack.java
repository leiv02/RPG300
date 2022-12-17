package RPG.company;

import lombok.Data;

@Data
public class Attack {
    private double damageMultiplicator;
    private double typeDamageMultiplicator;
    private double magicDamageMultiplicator;
    private int StaminaConsumption;
    private String nom;

    public static final Attack none = new Attack(0,0,0,0,"Aucun");

    //warrior attack
    private static final Attack lightHit = new Attack(1,1,1,5,"light hit");
    private static final Attack HeavyHit = new Attack(2, 2,1.5,15, "heavy hit");
    private static final Attack  armament = new Attack(1.5,2,2,20,"ehance armament");
    private static final Attack physicalHit = new Attack(3,0.5,0.5,10, "physical hit");

    //hunter attack
    private static final Attack sneakHit = new Attack(1,1,1,5,"sneak hit");
    public static final Attack arrowShot = new Attack(2,1,1,10,"Arrow shot");
    private static final Attack assasination = new Attack(2,0.75,2,20,"assasination");
    public static final Attack MachArrow = new Attack(3,2,1.5,30,"mach Arrow");

    //final list attacks
    public static final Attack[] listeAttackWarrior = {lightHit , HeavyHit , armament, physicalHit };
    public static final Attack[] listeAttackHunter = {sneakHit , arrowShot , assasination, MachArrow};

    public Attack(double damageMultiplicator, double typeDamageMultiplicator,double magicDamageMultiplicator, int staminaConsumption, String nom){
        setNom(nom);
        setDamageMultiplicator(damageMultiplicator);
        setTypeDamageMultiplicator(typeDamageMultiplicator);
        setStaminaConsumption(staminaConsumption);
        setMagicDamageMultiplicator(magicDamageMultiplicator);
    }
}
