package nio2.paths;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Define a Path using FileSystems.getDefault().getPath() Method
 */
public class PathDemo5 {
    public static void main(String[] args) {
        Path p1 = FileSystems.getDefault().getPath("/test/some/folder/a.txt");
        System.out.println(p1);

        Path normalize = FileSystems.getDefault().getPath("/../../a/b/./.././c.java").normalize();
        System.out.println(normalize);
    }
}
