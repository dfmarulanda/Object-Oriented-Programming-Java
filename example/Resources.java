public class Resources {
    private int gold;
    private int wood;
    private int stone;
    private int food;

    // Constructor
    public Resources() {
        this.gold = 1000;
        this.wood = 1000;
        this.stone = 1000;
        this.food = 1000;
    }

    // Método para actualizar recursos
    public void updateResources(int gold, int wood, int stone, int food) {
        this.gold += gold;
        this.wood += wood;
        this.stone += stone;
        this.food += food;
    }

    // Método para verificar si hay suficientes recursos
    public boolean canAfford(int gold, int wood, int stone, int food) {
        return this.gold >= gold && this.wood >= wood && this.stone >= stone && this.food >= food;
    }

    // Método para gastar recursos
    public void spend(int gold, int wood, int stone, int food) {
        if (canAfford(gold, wood, stone, food)) {
            this.gold -= gold;
            this.wood -= wood;
            this.stone -= stone;
            this.food -= food;
        } else {
            throw new IllegalStateException("Not enough resources");
        }
    }

    // Método para añadir recursos producidos
    public void add(ResourceProduction production) {
        this.gold += production.getGold();
        this.wood += production.getWood();
        this.stone += production.getStone();
        this.food += production.getFood();
    }

    // Getters y setters
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Resources{" +
               "gold=" + gold +
               ", wood=" + wood +
               ", stone=" + stone +
               ", food=" + food +
               '}';
    }
}