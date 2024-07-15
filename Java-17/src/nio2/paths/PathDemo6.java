package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Get the Path of the Home Directory
 */
public class PathDemo6 {
    public static void main(String[] args) {

        Path p1 = Paths.get(System.getProperty("user.dir"));
        System.out.println("Home directory : "+p1);

    }
}
