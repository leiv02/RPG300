package RPG.company;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@EqualsAndHashCode
@ToString

public class equipment extends Item{
    public static void main(String[] args) {}
    private int defense;
    private int attack;
    private int magic_def;
    private int magic_attack;
    private int type_damage;
    private String type;
    private String name;
}
