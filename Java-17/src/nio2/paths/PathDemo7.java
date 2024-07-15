package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Getting Information About a Path
 */
public class PathDemo7 {

    public static void main(String[] args) {

        Path p1 = Paths.get("/workspaces/codespaces-blank/saviour/Java-17/Python/list_comprehension/compound_interest_simulator.py");
        System.out.println("Path is : "+p1);
        System.out.println("Path file/directory name : "+p1.getFileName());
        System.out.println("Path Root : "+p1.getRoot());
        System.out.println("Path Parent : "+p1.getParent());
        System.out.println("Path Name elements count: "+p1.getNameCount());
        System.out.println("Path subpath : "+p1.subpath(0, 2));

        //Path Name elements
        System.out.println("==========================");
        for (int i = 0; i < p1.getNameCount(); i++) {
            System.out.println(p1.getName(i));
        }
        System.out.println("==========================");

    }

}
