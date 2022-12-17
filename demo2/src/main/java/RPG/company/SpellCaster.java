package RPG.company;
import lombok.*;

import java.security.PrivateKey;
import java.util.Arrays;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SpellCaster extends Hero{
    public static void main(String[] args) {

    }
    private int magic_point;
    private int magic_point_left;
    private Sort[] known_sort = {Sort.liste_sorts[0],Sort.liste_sorts[1],Sort.liste_sorts[2],Sort.liste_sorts[3],Sort.aucun,
    Sort.aucun,Sort.aucun,Sort.aucun,Sort.aucun,};
    private Sort[] equipped_sort = {known_sort[0], known_sort[1],known_sort[2],known_sort[3]};

    public double[] useSort(Sort sort){
        if(sort.getHeal() > 0){
            double[] value = new double[7];
            value[0] = 0;
            value[1] = 0;
            value[2] = 0;
            value[3] = 0;
            value[4] = 0;
            value[5] = 0;
            value[6] = sort.getHeal();
            return value;
        }
        else{

        double damage_Magic = 0;
        Weapon temp = getInventaire_weapon()[getWeapon_equipped()];
        Armor tempArmor = getInventaire_armor()[getWeapon_equipped()];
        double damage = (this.getAttack() + temp.getAttack()+tempArmor.getAttack())*sort.getDamageMultiplicator();

        if(temp.getMagic_attack() != 0){
            damage_Magic = (this.getMagic_attack() + temp.getMagic_attack() +tempArmor.getMagic_attack())*sort.getMagicDamageMultiplicator();


        }
        double[] value = new double[7];
        value[0] = damage;
        value[1] = damage_Magic;
        value[2] = 0;
        value[3] = 0;
        value[4] = 0;
        value[5] = 0;
        value[6] = 0;

        switch (temp.getType()) {
            case "fire" -> value[2] = temp.getType_damage()*sort.getTypeDamageMultiplicator();
            case "plant" -> value[3] = temp.getType_damage()*sort.getTypeDamageMultiplicator();
            case "dark" -> value[4] = temp.getType_damage()*sort.getTypeDamageMultiplicator();
            case "holy" -> value[5] = temp.getType_damage()*sort.getTypeDamageMultiplicator();
        }
            switch (tempArmor.getType()){
                case "fire" -> value[2] +=  tempArmor.getType_damage()*sort.getTypeDamageMultiplicator();
                case "plant" -> value[3] += tempArmor.getType_damage()*sort.getTypeDamageMultiplicator();
                case "dark" -> value[4] +=  tempArmor.getType_damage()*sort.getTypeDamageMultiplicator();
                case "holy" -> value[5] +=  tempArmor.getType_damage()*sort.getTypeDamageMultiplicator();

            }

        switch (sort.getType()){
                case "fire" -> value[2] +=  sort.getTypeDamage()*sort.getTypeDamageMultiplicator();
                case "plant" -> value[3] += sort.getTypeDamage()*sort.getTypeDamageMultiplicator();
                case "dark" -> value[4] +=  sort.getTypeDamage()*sort.getTypeDamageMultiplicator();
                case "holy" -> value[5] +=  sort.getTypeDamage()*sort.getTypeDamageMultiplicator();

        }
        setMagic_point_left(getMagic_point_left() - sort.getMagic_consomation());

        return value;
        }
    }


    public void addSort(Sort sort){
        for (int i = 0; i < this.known_sort.length; i++) {
            if(this.known_sort[i].getName() == null){
                this.known_sort[i] = sort;
                break;
            }
            if ( i == this.known_sort.length -1){
                System.out.println("plus de place pour les sorts connus");
            }
        }
    }
    public void equipSort(Sort sort){
        loop :
        for (Sort value : this.known_sort) {
            if (value == sort) {
                for (int t = 0; t < this.equipped_sort.length; t++) {
                    if (this.equipped_sort[t].getName() == null) {
                        this.equipped_sort[t] = sort;
                        break loop;
                    }
                    if (t == this.equipped_sort.length -1){
                        System.out.println("trop de sort équipé");
                    }
                }
            }
        }
    }
    public void unequipSort(Sort sort){
        for(int i = 0; i < this.equipped_sort.length; i++){
            if (this.equipped_sort[i] == sort){
                this.equipped_sort[i] = Sort.aucun;
            }
        }
    }
}
