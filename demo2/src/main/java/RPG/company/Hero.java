package RPG.company;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Hero extends Combatant{
    public static void main(String[] args) {

    }
    private Weapon[] inventaire_weapon;
    private int weapon_equipped;
    private Armor[] inventaire_armor;
    private int armor_equipped;
    private int[] inventaire_consumable = {10,10};
    private int experience;
    private int experience_needed;
    private int competence_point;

    public double[] useAttack(Attack attack){
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
        return value;
    }
@Override

public void receiveDamageAttack(double[] damage){
    double receiveDamage = 0;
    Weapon tempWeapon = getInventaire_weapon()[getWeapon_equipped()];
    Armor tempArmor = getInventaire_armor()[getArmor_equipped()];
    receiveDamage += damage[0] * (100 - getDefense()+tempArmor.getDefense()  +tempWeapon.getDefense()) / 100;
    receiveDamage += damage[1] * (100 - getMagic_def()+tempArmor.getMagic_def()+tempWeapon.getMagic_def()) / 100;

    if (getType().equals("fire")){
        receiveDamage += damage[2] * 1;
        receiveDamage += damage[3] * 0.5;
        receiveDamage += damage[4] * 1.75;
        receiveDamage += damage[5] * 1;
    }

    if(getType().equals("plant")){
        receiveDamage += damage[2] * 1.75;
        receiveDamage += damage[3] * 1;
        receiveDamage += damage[4] * 1;
        receiveDamage += damage[5] * 0.5;
    }

    if(getType().equals("dark")){
        receiveDamage += damage[2] * 0.5;
        receiveDamage += damage[3] * 1;
        receiveDamage += damage[4] * 1;
        receiveDamage += damage[5] * 1.75;
    }

    if(getType().equals("holy")){
        receiveDamage += damage[2] * 1;
        receiveDamage += damage[3] * 1.75;
        receiveDamage += damage[4] * 0.5;
        receiveDamage += damage[5] * 1;

    }
    setCurrent_health(getCurrent_health() - receiveDamage);
}

    public void actualiseDamageAttack(){}


    public void initialise_inventory(){
        this.inventaire_weapon = new Weapon[7];
        this.inventaire_armor = new Armor[7];

        Arrays.fill(this.inventaire_weapon, Weapon.none);
        Arrays.fill(this.inventaire_armor, Armor.none);


    }
    public void addWeapon(Weapon weapon){
        for (int i = 0; i < this.inventaire_weapon.length; i++) {
            if(this.inventaire_weapon[i].getName() == null){
                this.inventaire_weapon[i] = weapon;
                break;
            }
            if ( i == this.inventaire_weapon.length -1){
                System.out.println("inventaire d'arme plein");
            }
        }
    }
    public void suppWeapon(Weapon weapon){
        for (int i = 0; i < this.inventaire_weapon.length; i++){
            if (weapon.getName() == null){
                System.out.println("vous n'avez pas d arme ici");
                break;
            }
            if(Objects.equals(this.inventaire_weapon[i].getName(), weapon.getName())){
                this.inventaire_weapon[i] = Weapon.none;
            }
        }
    }

    public void addArmor(Armor armor){
        for (int i = 0; i < this.inventaire_armor.length; i++) {
            if (this.inventaire_armor[i].getName() == null) {
                this.inventaire_armor[i] = armor;
                break;
            }
            if (i == this.inventaire_armor.length - 1) {
                System.out.println("inventaire d'armure plein");
            }
        }
    }
    public void suppArmor(Armor armor) {
        for (int i = 0; i < this.inventaire_armor.length; i++) {
            if (armor.getName() == null) {
                System.out.println("vous n'avez pas d armure ici");
                break;
            }
            if (Objects.equals(this.inventaire_armor[i].getName(), armor.getName())) {
                this.inventaire_armor[i] = Armor.none;
            }
        }
    }



    public void equipWeapon(Weapon weapon){
        for(int i = 0; i < this.inventaire_weapon.length; i++){
            if(weapon.getName().equals(this.inventaire_weapon[i].getName())){
                actualiseDamageAttack();
                this.weapon_equipped=i;
                actualiseDamageAttack();

            }
        }
    }
    public void equipArmor(Armor armor){
        for(int i = 0; i < this.inventaire_armor.length; i++){
            if(armor.getName().equals(this.inventaire_armor[i].getName())){
                actualiseDamageAttack();
                this.armor_equipped=i;
                actualiseDamageAttack();
            }
        }
    }

    public Boolean levelUp(){
        if(this.experience > this.experience_needed){
            setLevel(getLevel()+1);
            this.experience -= this.experience_needed;
            this.competence_point += 10;
            return true;

        }
        return false;
    }
}

