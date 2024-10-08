import java.util.ArrayList;
import java.util.List;

// La clase TechnologyTree tiene una relación de composición con Governor
// Cada Governor tiene exactamente un TechnologyTree
public class TechnologyTree {
    // Relación de agregación (1 a muchos) con Technology
    private List<Technology> technologies;

    public TechnologyTree() {
        this.technologies = new ArrayList<Technology>();
        // Inicializar con tecnologías básicas
        technologies.add(new Technology("Agriculture", null, new Effect("Food production +10%")));
        technologies.add(new Technology("Mining", null, new Effect("Stone production +10%")));
        // Añadir más tecnologías...
    }

    // Método para investigar una tecnología
    public boolean research(Technology tech) {
        if (isTechnologyAvailable(tech)) {
            tech.setResearched(true);
            return true;
        }
        return false;
    }

    // Método para verificar si una tecnología está disponible para investigar
    public boolean isTechnologyAvailable(Technology tech) {
        if (technologies.contains(tech) && !tech.isResearched()) {
            for (Technology prereq : tech.getPrerequisites()) {
                if (!prereq.isResearched()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // Getter para la lista de tecnologías
    public List<Technology> getTechnologies() {
        return new ArrayList<>(technologies);
    }

    // Setter para la lista de tecnologías
    public void setTechnologies(List<Technology> technologies) {
        this.technologies = new ArrayList<>(technologies);
    }

    // Método para añadir una nueva tecnología al árbol
    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    // Método para remover una tecnología del árbol
    public boolean removeTechnology(Technology technology) {
        return technologies.remove(technology);
    }

    @Override
    public String toString() {
        return "TechnologyTree{" +
               "technologies=" + technologies.size() +
               '}';
    }
}