package RPG.company;


public class Mage extends SpellCaster {
    public static void main(String[] args) {

    }

    public Mage() {
        setAttack(5);
        setDefense(5);
        setMagic_attack(40);
        setMagic_def(15);
        setHealth(80);
        setCurrent_health(getHealth());
        setStamina(70);
        setMagic_point(50);
        setMagic_point_left(getMagic_point());
        setStamina_left(getStamina());
        setType("fire");
        setNom("Mage");
        setLevel(1);
        setCompetence_point(0);
        setExperience_needed(100);
        setExperience(0);
        setArmor_equipped(0);
        setWeapon_equipped(0);
        initialise_inventory();
    }
}
