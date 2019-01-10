package Q4_07_Build_Order.EdgeRemoval;

import java.util.ArrayList;
import java.util.List;

class Project {
    private String name;
    private int dependedCount = 0;
    List<Project> dependencies = new ArrayList<>();

    Project(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addDependency(Project dst) {
        this.dependencies.add(dst);
    }

    void plusDependedCount() {
        this.dependedCount++;
    }

    void minusDependedCount() {
        this.dependedCount--;
    }

    int getDependedCount() {
        return dependedCount;
    }

    void removeDependencies(){
        for (Project p : dependencies) {
            p.minusDependedCount();
        }
    }
}
