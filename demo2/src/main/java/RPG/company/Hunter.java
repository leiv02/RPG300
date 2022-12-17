package RPG.company;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Hunter extends Hero {
    public static void main(String[] args) {

    }

    final Attack[] listeAttack = Attack.listeAttackHunter;
    private int fleche;

    public Hunter() {
        setAttack(30);
        setDefense(10);
        setMagic_attack(5);
        setMagic_def(10);
        setHealth(100);
        setCurrent_health(getHealth());
        setStamina(100);
        setStamina_left(getStamina());
        setType("dark");
        setNom("Hunter");
        setLevel(1);
        setCompetence_point(0);
        setExperience_needed(100);
        setExperience(0);
        setArmor_equipped(0);
        setWeapon_equipped(0);
        initialise_inventory();
        setFleche(10);
    }
    public double[] useArrowAttack(Attack attack){
        double damage_Magic = 0;
        Weapon tempWeapon = getInventaire_weapon()[getWeapon_equipped()];
        Armor tempArmor = getInventaire_armor()[getArmor_equipped()];
        double damage = (this.getAttack() + tempWeapon.getAttack() + tempArmor.getAttack())*attack.getDamageMultiplicator();

        if(tempWeapon.getMagic_attack() != 0){
            damage_Magic = (this.getMagic_attack() + tempWeapon.getMagic_attack())*attack.getMagicDamageMultiplicator();


        }
        double[] value = new double[6];
        value[0] = damage;
        value[1] = damage_Magic;
        value[2] = 0;
        value[3] = 0;
        value[4] = 0;
        value[5] = 0;

        switch (tempWeapon.getType()) {
            case "fire" -> value[2] = tempWeapon.getType_damage() *attack.getTypeDamageMultiplicator();
            case "plant" -> value[3] = tempWeapon.getType_damage()*attack.getTypeDamageMultiplicator();
            case "dark" -> value[4] = tempWeapon.getType_damage() *attack.getTypeDamageMultiplicator();
            case "holy" -> value[5] = tempWeapon.getType_damage() *attack.getTypeDamageMultiplicator();
        }
        switch (tempArmor.getType()) {
            case "fire" -> value[2]  += tempArmor.getType_damage() *attack.getTypeDamageMultiplicator();
            case "plant" -> value[3] +=tempArmor.getType_damage() *attack.getTypeDamageMultiplicator();
            case "dark" -> value[4]  += tempArmor.getType_damage() *attack.getTypeDamageMultiplicator();
            case "holy" -> value[5]  += tempArmor.getType_damage() *attack.getTypeDamageMultiplicator();
        }

        setStamina_left(getStamina_left() - attack.getStaminaConsumption());
        setFleche(getFleche()-1);
        return value;
    }

}





