import java.util.List;

public class Technology {
    private String name;
    private List<Technology> prerequisites;
    private Effect effect;
    private boolean researched;

    public Technology(String name, List<Technology> prerequisites, Effect effect) {
        this.name = name;
        this.prerequisites = prerequisites;
        this.effect = effect;
        this.researched = false;
    }

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