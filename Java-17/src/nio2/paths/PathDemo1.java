package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Define an Absolute Path
 */
public class PathDemo1 {
    public static void main(String[] args) {
        Path path = Paths.get(
                "/workspaces/codespaces-blank/saviour/Java-17/Python/list_comprehension/compound_interest_simulator.py");

        System.out.println(path.getFileName());
        System.out.println(path.getName(0));
        System.out.println(path.getNameCount());
        System.out.println(path.getName(path.getNameCount() - 1));
        System.out.println(path.getParent());
        System.out.println(path.getRoot());

        Path path2 = Paths.get("workspaces", "codespaces-blank", "saviour",
                "Java-17", "Python", "list_comprehension",
                "compound_interest_simulator.py");
        System.out.println(path2.getFileName());

    }
}
