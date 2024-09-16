import java.util.ArrayList;
import java.util.List;

public class Governor {
    private String name;
    private int level;
    // Relación de agregación (1 a muchos) con Commander
    private List<Commander> commanders;
    // Relación de agregación (1 a muchos) con Building
    private List<Building> buildings;
    // Relación de composición (1 a 1) con Resources
    private Resources resources;
    // Relación de composición (1 a 1) con TechnologyTree
    private TechnologyTree techTree;
    private int power;

    public Governor(String name) {
        this.name = name;
        this.level = 1;
        this.commanders = new ArrayList<>();
        this.buildings = new ArrayList<>();
        this.resources = new Resources();
        this.techTree = new TechnologyTree();
        this.power = 0;
    }

    // Método que implementa la relación de agregación con Commander
    public void addCommander(Commander commander) {
        commanders.add(commander);
        calculatePower();
    }

    // Método que implementa la relación de agregación con Building
    public void addBuilding(Building building) {
        buildings.add(building);
        calculatePower();
    }

    // Método que utiliza la relación de composición con Resources
    public void updateResources() {
        for (Building building : buildings) {
            if (building instanceof ResourceBuilding) {
                ResourceBuilding resourceBuilding = (ResourceBuilding) building;
                resources.add(resourceBuilding.generateResources());
            }
        }
    }

    // Método que utiliza la relación de composición con TechnologyTree
    public boolean research(Technology technology) {
        if (techTree.research(technology)) {
            technology.applyEffect(this);
            calculatePower();
            return true;
        }
        return false;
    }

    public void calculatePower() {
        int totalPower = 0;
        for (Commander commander : commanders) {
            totalPower += commander.calculatePower();
        }
        for (Building building : buildings) {
            totalPower += building.getLevel() * 100; // Cálculo simplificado de poder
        }
        this.power = totalPower;
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

    public List<Commander> getCommanders() {
        return new ArrayList<>(commanders);
    }

    public List<Building> getBuildings() {
        return new ArrayList<>(buildings);
    }

    public Resources getResources() {
        return resources;
    }

    public TechnologyTree getTechTree() {
        return techTree;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Governor{" +
               "name='" + name + '\'' +
               ", level=" + level +
               ", commanders=" + commanders.size() +
               ", buildings=" + buildings.size() +
               ", power=" + power +
               '}';
    }
}