package RPG.company;

import com.example.demo2.HelloApplication;
import lombok.Data;

import java.util.Arrays;

@Data

public class Game {
    public static void main(String[] args) {

        game.gameStart();
    }
    private int Current_lvl = 1;
    private Enemy[] listeEnemies = new Enemy[4];
    private  Mage mage = new Mage();
    private Healer healer = new Healer();
    private Warrior warrior = new Warrior();
    private Hunter hunter = new Hunter();
    public static Game game = new Game();


    public void gameStart(){
        Arrays.fill(this.listeEnemies , Enemy.vide);
        actualiseEnemyList();
        HelloApplication helloApplication = new HelloApplication();
        helloApplication.launchgame();

    }
    private boolean checkHealthHero(Mage mage ,Healer healer,Warrior warrior,Hunter hunter ){
        Hero[] heroes = {mage, healer, warrior, hunter};
        boolean returnValue = false;
        for(int i = 0; i < heroes.length ; i++){
            if (heroes[1].getCurrent_health() > 0) {
                returnValue = true;
                break;
            }
        }
        return returnValue;
    }
    public void actualiseEnemyList (){
        if(this.Current_lvl != 5){
              this.listeEnemies[0] = Enemy.liste_enemie[this.Current_lvl - 1][0];
              this.listeEnemies[1] = Enemy.liste_enemie[this.Current_lvl - 1][1];
              this.listeEnemies[2] = Enemy.liste_enemie[this.Current_lvl - 1][2];
              this.listeEnemies[3] = Enemy.liste_enemie[this.Current_lvl - 1][3];
        }
        else{
            this.listeEnemies = new Enemy[1];
            listeEnemies[0] = Enemy.liste_enemie[4][0];
        }
    }
}
