package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Sorting Paths Since the Path class implements the Comparable interface, you can compare paths by using the compareTo() method, which
 * compares two abstract paths lexicographically. This can be useful for sorting. The method returns zero if the argument is equal to
 * this path, a value less than zero if this path is lexicographically less than the argument, or a value greater than zero if this
 * path is lexicographically greater than the argument. The following is an example of using the compareTo() method:
 */
public class PathDemo14 {

    public static void main(String[] args) {

        Path p1 = Paths.get("/1/2/hello");
        Path p2 = Paths.get("/1/24/5/6/hello");
        Path p3 = Paths.get("/1/3/4/6/hello");
        Path p4 = Paths.get("/1/2/34/5/6/hello");
        Path p5 = Paths.get("/a");
        Path p6 = Paths.get("/b");

        // List<Path> paths = List.of(p1, p2, p3, p4); // paths is immutable
        // Collections.sort(paths);// Collections.sort don't work on immutable collections we get
        // java.lang.UnsupportedOperationException
        // // exception

        Path[] paths = {p1,p2,p3,p4,p5,p6};
        Arrays.sort(paths);

        System.out.println(Arrays.toString(paths));

    }

}
