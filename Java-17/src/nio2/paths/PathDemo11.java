package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Constructing a Path Between Two Locations
 * 
 * When you need to construct a path from one location to another, you can call the relativize() method, which constructs a relative
 * path between this path and a given path.
 */
public class PathDemo11 {

    public static void main(String[] args) {

        Path p1 = Paths.get("/1/2/3/README.md");
        Path p2 = Paths.get("/1/test.jpg");

        Path p1top2 = p1.relativize(p2);
        Path p2top1 = p2.relativize(p1);

        System.out.println("P1 : " + p1);
        System.out.println("P2: " + p2);
        System.out.println("P1->P2 : " + p1top2);
        System.out.println("P2->P1 : " + p2top1);

        // How it works
        /**
        *
        * README.md = ../
        * 3 = ../../
        * 2 = ../../../
        * Now we reached 1, We have to go down to test.jpg
        * p1top2 = ../../../test.jpg
        *
        *
        *
        * test.jpg = ../
        * Now we reached 1, We have to gown to README.md
        * 
        */

    }

}
