package nio2.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Comparing Two Paths
 * 
 */
public class PathDemo13 {

    public static void main(String[] args) {

        /**
         * You can test whether two paths are equal by calling the Path.equals() method. This method respects the Object.equals()
         * specification. It does not access the file system, so the compared paths are not required to exist, and it does not check if
         * the paths are the same file.
         */

        Path p1 = Paths.get("/1/2/3/4/5/test.jpg");
        Path p2 = Paths.get("/1/2/3/4/5/test.jpg");

        System.out.println(p1.equals(p2));

        Path p3 = Paths.get("/1/2/4/5/test.jpg");
        System.out.println(p2.equals(p3));

        /**
         * 
         * Sometimes you’ll want to check if two paths are the same file/folder. You can easily accomplish this by calling the
         * java.nio.File.Files.isSameFile() method (as shown in the following example), which returns a boolean value. Behind the
         * scenes, this method uses the Path.equals() method. If Path.equals() returns true, the paths are equal, and therefore no
         * further comparisons are needed. If it returns false, then the isSameFile() method enters into action to double-check. Notice
         * that this method requires that the compared files exist on the file system; otherwise, it throws an IOException.
         * 
         */

        Path p4 = Paths.get(System.getProperty("user.dir"), "temp/../test.jpg");
        Path p5 = Paths.get("test.jpg");

        System.out.println(p4.equals(p5)); // even though p4 and p5 points to same file, but its false.

        try {
            System.out.println(Files.isSameFile(p4, p5)); // true, because p4 and p5 are same file and they should exist o/w
                                                          // IOException occurs
        } catch (IOException e) {
            System.out.println("Hey man file not found.");
            e.printStackTrace();
        }

        // Partial Comparisons
        System.out.println(p1.startsWith("hello"));
        System.out.println(p1.endsWith("game"));

    }

}
