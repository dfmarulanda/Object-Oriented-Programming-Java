import java.util.List;

// La clase Technology tiene una relación de agregación con TechnologyTree
// Un TechnologyTree contiene múltiples Technology
public class Technology {
    private String name;
    // Relación reflexiva: una tecnología puede tener prerrequisitos que son otras tecnologías
    private List<Technology> prerequisites;
    // Asociación con la clase Effect
    private Effect effect;
    private boolean researched;

    public Technology(String name, List<Technology> prerequisites, Effect effect) {
        this.name = name;
        this.prerequisites = prerequisites;
        this.effect = effect;
        this.researched = false;
    }

    // Este método aplica el efecto de la tecnología al Governor
    // Representa una relación indirecta entre Technology y Governor
    public void applyEffect(Governor governor) {
        effect.apply(governor);
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Technology> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Technology> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public boolean isResearched() {
        return researched;
    }

    public void setResearched(boolean researched) {
        this.researched = researched;
    }

    @Override
    public String toString() {
        return "Technology{" +
               "name='" + name + '\'' +
               ", researched=" + researched +
               '}';
    }
}