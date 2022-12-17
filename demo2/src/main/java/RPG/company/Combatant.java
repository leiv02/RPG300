package RPG.company;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Combatant {
    public static void main(String[] args) {
    }
    private int health;
    private double current_health;
    private int defense;
    private int attack;
    private int stamina;
    private int stamina_left;
    private int magic_def;
    private int magic_attack;
    private int level;
    private String type;
    private String nom;

public void receiveDamageAttack(double[] damage){

    double receiveDamage = 0;
    receiveDamage += damage[0] * (100 - getDefense()) / 100;
    receiveDamage += damage[1] * (100 - getMagic_def()) / 100;

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
    public void receiveDamageSort(double[] damage){
    if (damage[6]> 0 ){
        setCurrent_health(getCurrent_health() + damage[6]);
    }
    else {
        double receiveDamage = 0;
        receiveDamage += damage[0] * (100 - (getDefense())) / 100;
        receiveDamage += damage[1] * (100 - getMagic_def()) / 100;

        if (getType().equals("fire")) {
            receiveDamage += damage[2] * 1;
            receiveDamage += damage[3] * 0.5;
            receiveDamage += damage[4] * 1.75;
            receiveDamage += damage[5] * 1;
        }

        if (getType().equals("plant")) {
            receiveDamage += damage[2] * 1.75;
            receiveDamage += damage[3] * 1;
            receiveDamage += damage[4] * 1;
            receiveDamage += damage[5] * 0.5;
        }

        if (getType().equals("dark")) {
            receiveDamage += damage[2] * 0.5;
            receiveDamage += damage[3] * 1;
            receiveDamage += damage[4] * 1;
            receiveDamage += damage[5] * 1.75;
        }

        if (getType().equals("holy")) {
            receiveDamage += damage[2] * 1;
            receiveDamage += damage[3] * 1.75;
            receiveDamage += damage[4] * 0.5;
            receiveDamage += damage[5] * 1;

        }

        setCurrent_health(getCurrent_health() - receiveDamage);
        }
    }
}
