package RPG.company;

import lombok.Data;

@Data


public class Warrior extends Hero {
        final Attack[] listeAttack = Attack.listeAttackWarrior;

    public Warrior() {
        setAttack(20);
        setDefense(30);
        setMagic_attack(5);
        setMagic_def(15);
        setHealth(150);
        setCurrent_health(getHealth());
        setStamina(100);
        setStamina_left(getStamina());
        setType("plant");
        setNom("Warrior");
        setLevel(1);
        setCompetence_point(0);
        setExperience_needed(100);
        setExperience(0);
        setArmor_equipped(0);
        setWeapon_equipped(0);
        initialise_inventory();
        actualiseDamageAttack();
    }
}
