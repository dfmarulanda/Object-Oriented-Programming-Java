// La clase Troop tiene una relación de agregación con Commander
// Un Commander puede liderar múltiples Troops
public class Troop {
    // Asociación con la enumeración TroopType
    private TroopType type;
    private int quantity;
    private int attack;
    private int defense;
    private int speed;

    public Troop(TroopType type) {
        this.type = type;
        this.quantity = 100; // Cantidad inicial
        setStats();
    }

    private void setStats() {
        switch (type) {
            case INFANTRY:
                attack = 10;
                defense = 15;
                speed = 5;
                break;
            case CAVALRY:
                attack = 15;
                defense = 10;
                speed = 15;
                break;
            case ARCHER:
                attack = 20;
                defense = 5;
                speed = 10;
                break;
            case SIEGE:
                attack = 25;
                defense = 20;
                speed = 3;
                break;
        }
    }

    public int calculatePower() {
        return (attack + defense + speed) * quantity;
    }

    // Getters y setters
    public TroopType getType() {
        return type;
    }

    public void setType(TroopType type) {
        this.type = type;
        setStats();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Troop{" +
               "type=" + type +
               ", quantity=" + quantity +
               ", power=" + calculatePower() +
               '}';
    }
}