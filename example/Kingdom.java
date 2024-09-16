import java.util.ArrayList;
import java.util.List;

public class Kingdom {
    private String name;
    // Relación de agregación (1 a muchos) con Governor
    private List<Governor> governors;
    // Relación de asociación (1 a 1) con CivilizationType
    private CivilizationType type;

    public Kingdom(String name, CivilizationType type) {
        this.name = name;
        this.type = type;
        this.governors = new ArrayList<>();
    }

    // Método que implementa la relación de agregación con Governor
    public void addGovernor(Governor governor) {
        governors.add(governor);
    }

    public String getCivilizationBonus() {
        // Implementar bonificaciones específicas de la civilización
        return "Bonus for " + type.toString();
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Governor> getGovernors() {
        return new ArrayList<>(governors); // Retorna una copia para encapsulación
    }

    public CivilizationType getType() {
        return type;
    }

    public void setType(CivilizationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Kingdom{" +
               "name='" + name + '\'' +
               ", type=" + type +
               ", governors=" + governors.size() +
               '}';
    }
}