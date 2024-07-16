package nio2.paths;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Combining Two Paths
 * 
 * Combining two paths is a technique that allows you to define a fixed root path and append to it a partial path. This is very useful
 * for defining paths based on a common part. NIO.2 provides this operation through the resolve() and resolveSibling() methods.
 */
public class PathDemo10 {
    public static void main(String[] args) throws IOException {
        Path basePath = Paths.get(System.getProperty("user.dir"));
        System.out.println("base path : "+basePath);

        Path p1 = basePath.resolve("test/README.md");
        System.out.println("base path combined with p1 : "+p1.toString());

        Path p2 = basePath.resolve("temp/Thoughts.txt");
        System.out.println("base path combined with p2 : "+p2.toString());

        Path withSibling = basePath.resolveSibling("testme.md"); // Java-17 got removed from basePath.
        System.out.println(withSibling);

        // from book example
        Path base = Paths.get("C:/rafaelnadal/tournaments/2009/BNP.txt");
        // resolve sibling AEGON.txt file
        Path path = base.resolveSibling("AEGON.txt");// BNP.txt will be removed from base
        // output: C:\rafaelnadal\tournaments\2009\AEGON.txt
        System.out.println(path.toString());

    }
}
