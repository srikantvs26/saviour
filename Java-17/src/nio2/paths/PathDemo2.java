package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Define a Path Relative to the Working Folder, Working directory
 */
public class PathDemo2 {
    public static void main(String[] args) {
        Path p1 = Paths.get("src/nio2/paths/test.txt");
        if(p1.toFile().exists()){
            System.out.println("p1 exists");
        }
        else{
            System.out.println("p1 doesn't exist");
        }
    }
}
