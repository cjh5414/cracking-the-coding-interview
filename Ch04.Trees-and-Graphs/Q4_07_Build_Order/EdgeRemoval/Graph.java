package Q4_07_Build_Order.EdgeRemoval;

import java.util.ArrayList;
import java.util.List;

class Graph {
    private List<Project> projects = new ArrayList<>();

    Graph(String[] projects) {
        for (String project : projects) {
            this.projects.add(new Project(project));
        }
    }

    private Project getProject(String name) {
        for (Project p : projects) {
            if (p.getName().equals(name))
                return p;
        }

        return null;
    }

    private void addDependency(String src, String dst) {
        Project srcP = getProject(src);
        Project dstP = getProject(dst);

        if (srcP != null && dstP != null) {
            srcP.addDependency(dstP);
            dstP.plusDependedCount();
        }
    }

    void addDependencies(String[][] dependencies) {
        for(String[] dependency : dependencies) {
            addDependency(dependency[0], dependency[1]);
        }
    }

    String[] getBuildOrder() {
        ArrayList<String> buildOrder = new ArrayList<>();

        while (projects.size() == buildOrder.size()) {
            for (Project p : projects) {
                if (p.getDependedCount() == 0) {
                    p.removeDependencies();
                    buildOrder.add(p.getName());
                    projects.remove(p);
                }
            }
        }

        return buildOrder.toArray(new String[0]);
    }
}
