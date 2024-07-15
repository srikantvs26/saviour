package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Defining a path using shortcuts . and ..
 */
public class PathDemo3 {
    public static void main(String[] args) {
        // normalize() : Returns a path that is this path with redundant name
        // elements eliminated.
        // . is redundant
        // .. remove the previous folder, because we have to take parent then
        Path noNormalize = Paths
                .get("C:/rafaelnadal/tournaments/./2009/dummy/../BNP.txt");
        Path normalize = Paths
                .get("C:/rafaelnadal/tournaments/./2009/dummy/../BNP.txt")
                .normalize();
        // . is tournaments
        // .. is 2009

        System.out.println(noNormalize);
        System.out.println(normalize);

    }
}
