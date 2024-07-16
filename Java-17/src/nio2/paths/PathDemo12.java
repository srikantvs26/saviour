package nio2.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Iterate over the Name Elements of a Path
 * 
 * Since the Path class implements the Iterable interface, you can obtain an object that enables you to iterate over the elements in
 * the path. You can iterate either by using an explicit iterator or with a foreach loop that returns a Path object for each iteration.
 * The following is an example:
 */
public class PathDemo12 {

    public static void main(String[] args) {
        Path p1 = Paths.get("/1/2/3/4/5/6/I/am/iterable.txt");
        
        // p1.forEach(System.out::println);
        // p1.forEach(ele->System.out.println(ele));


        for (Path path : p1) {
            System.out.println(path);
        }
    }   

}
