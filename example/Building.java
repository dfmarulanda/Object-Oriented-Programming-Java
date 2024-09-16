// Clase abstracta Building
public abstract class Building {
    protected String name;
    protected int level;

    public Building(String name) {
        this.name = name;
        this.level = 1;
    }

    public void upgrade() {
        level++;
    }

    public abstract ResourceProduction generateResources();

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

    @Override
    public String toString() {
        return "Building{" +
               "name='" + name + '\'' +
               ", level=" + level +
               '}';
    }
}

// ResourceBuilding hereda de Building (relación de herencia)
public class ResourceBuilding extends Building {
    // Relación de asociación con ResourceType
    private ResourceType resourceType;
    private int productionRate;

    public ResourceBuilding(String name, ResourceType resourceType) {
        super(name);
        this.resourceType = resourceType;
        this.productionRate = 10; // Tasa de producción base
    }

    @Override
    public ResourceProduction generateResources() {
        int production = productionRate * level;
        return new ResourceProduction(resourceType, production);
    }

    @Override
    public void upgrade() {
        super.upgrade();
        productionRate += 5; // Incremento de la tasa de producción con cada mejora
    }

    // Getters y setters adicionales
    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public int getProductionRate() {
        return productionRate;
    }

    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }

    @Override
    public String toString() {
        return "ResourceBuilding{" +
               "name='" + getName() + '\'' +
               ", level=" + getLevel() +
               ", resourceType=" + resourceType +
               ", productionRate=" + productionRate +
               '}';
    }
}

// MilitaryBuilding también hereda de Building (relación de herencia)
public class MilitaryBuilding extends Building {
    private int trainingSpeed;
    private int unitCapacity;

    public MilitaryBuilding(String name) {
        super(name);
        this.trainingSpeed = 1;
        this.unitCapacity = 100; // Capacidad base
    }

    // Método que implementa la relación con Troop (creación de tropas)
    public List<Troop> trainTroops(TroopType type, int quantity) {
        List<Troop> trainedTroops = new ArrayList<>();
        for (int i = 0; i < Math.min(quantity, unitCapacity); i++) {
            trainedTroops.add(new Troop(type));
        }
        return trainedTroops;
    }

    @Override
    public ResourceProduction generateResources() {
        return new ResourceProduction(); // Los edificios militares no generan recursos
    }

    @Override
    public void upgrade() {
        super.upgrade();
        trainingSpeed++;
        unitCapacity += 50; // Incremento de la capacidad con cada mejora
    }

    // Getters y setters adicionales
    public int getTrainingSpeed() {
        return trainingSpeed;
    }

    public void setTrainingSpeed(int trainingSpeed) {
        this.trainingSpeed = trainingSpeed;
    }

    public int getUnitCapacity() {
        return unitCapacity;
    }

    public void setUnitCapacity(int unitCapacity) {
        this.unitCapacity = unitCapacity;
    }

    @Override
    public String toString() {
        return "MilitaryBuilding{" +
               "name='" + getName() + '\'' +
               ", level=" + getLevel() +
               ", trainingSpeed=" + trainingSpeed +
               ", unitCapacity=" + unitCapacity +
               '}';
    }
}