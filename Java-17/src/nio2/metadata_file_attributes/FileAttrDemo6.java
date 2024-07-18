package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * Setting DOS attributes
 */
public class FileAttrDemo6 {
    public static void main(String[] args) {
        // Updating DOS attributes

        Path p1 = Paths.get("tohide.txt");
        try {
            System.out.println(Files.isHidden(p1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Lets hide the p1 file.
        try {
            boolean attribute = (boolean)Files.getAttribute(p1, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            System.out.println("attribute before hiding : "+attribute);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            p1 = Files.setAttribute(p1, "dos:archive", true, LinkOption.NOFOLLOW_LINKS);
            boolean attribute = (boolean)Files.getAttribute(p1, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            System.out.println("attribute after hiding : "+attribute);
        } catch (IOException e) {
            e.printStackTrace();
        };


    }
}
