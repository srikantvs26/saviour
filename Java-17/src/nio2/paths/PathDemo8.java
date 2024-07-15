package nio2.paths;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/**
 * Converting a Path
 */
public class PathDemo8 {
    public static void main(String[] args)  throws IOException{
        Path path = Paths.get("/rafaelnadal/tournaments/2009", "BNP.txt");
        

        // Path to String
        String p1 = path.toString();
        System.out.println("Path to String : "+p1);

        // Path to File
        File f1 = path.toFile();

        //File to Path
        Path p2 = f1.toPath();

        // Path to absolute path
        Path p3 = Paths.get("test.jpg");
        System.out.println(p3.toAbsolutePath());

        // Files.createSymbolicLink("test","Path", FileAttribute.class);


        System.out.println(p3.toFile().exists());

        Files.createSymbolicLink(p3,p3);
    }
}
