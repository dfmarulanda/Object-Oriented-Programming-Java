// La clase Skill tiene una relación de agregación con Commander
// Un Commander puede tener múltiples Skills
public class Skill {
    private String name;
    private String effect;
    private int level;
    private int power;

    public Skill(String name, String effect) {
        this.name = name;
        this.effect = effect;
        this.level = 1;
        this.power = 10; // Valor base de poder
    }

    public void activateSkill() {
        // Implementar la lógica de activación de la habilidad
        System.out.println("Activating skill: " + name);
    }

    public void upgrade() {
        level++;
        power += 5; // Incremento de poder por nivel
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Skill{" +
               "name='" + name + '\'' +
               ", level=" + level +
               ", power=" + power +
               '}';
    }
}