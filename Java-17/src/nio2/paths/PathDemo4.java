package nio2.paths;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Define a Path from a URI
 */
public class PathDemo4 {
    public static void main(String[] args) {
        URI uri = URI.create("file:///workspaces/codespaces-blank/saviour/Java-17/Test.java");
        Path p1 = Paths.get(uri);
        System.out.println(p1);
    }
}
