public class Troop {
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

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
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