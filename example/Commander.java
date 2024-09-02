import java.util.ArrayList;
import java.util.List;

public class Commander {
    private String name;
    private int level;
    // Relación de agregación (1 a muchos) con Skill
    private List<Skill> skills;
    private int attack;
    private int defense;
    private int leadership;
    // Relación de agregación (1 a muchos) con Troop
    private List<Troop> troops;

    public Commander(String name) {
        this.name = name;
        this.level = 1;
        this.skills = new ArrayList<>();
        this.attack = 10;
        this.defense = 10;
        this.leadership = 10;
        this.troops = new ArrayList<>();
    }

    public void levelUp() {
        level++;
        attack += 2;
        defense += 2;
        leadership += 2;
    }

    // Método que implementa la relación de agregación con Skill
    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    // Método que implementa la relación de agregación con Troop
    public void addTroop(Troop troop) {
        troops.add(troop);
    }

    public int calculatePower() {
        int skillPower = skills.stream().mapToInt(Skill::getPower).sum();
        int troopPower = troops.stream().mapToInt(Troop::calculatePower).sum();
        return (attack + defense + leadership) * level + skillPower + troopPower;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(skills);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public List<Troop> getTroops() {
        return new ArrayList<>(troops);
    }

    @Override
    public String toString() {
        return "Commander{" +
               "name='" + name + '\'' +
               ", level=" + level +
               ", skills=" + skills.size() +
               ", troops=" + troops.size() +
               '}';
    }
}