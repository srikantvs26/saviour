package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

/**
 * Specific to the DOS file system (or Samba),
 * 
 * The DosFileAttributeView view extends the interface BasicFileAttributeView with the DOS attributes (which means that you can access
 * the basic view directly from DOS view).
 * 
 * There are four attributes, which are mapped by the following methods:
 */
public class FileAttrDemo5 {
    public static void main(String[] args) {

        Path p1 = Paths.get("test.jpg");
        try {
            DosFileAttributes attributes = Files.readAttributes(p1, DosFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            System.out.println(attributes.isReadOnly());
            System.out.println(attributes.isHidden());
            System.out.println(attributes.isSystem());
            System.out.println(attributes.isArchive());
            // including other BasicFileAttributes as well.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Getting only single attribute
        try {
            Object attribute = Files.getAttribute(p1, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            boolean isHidden = (boolean) attribute;
            System.out.println(p1.getFileName() +" is hidden? "+isHidden);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
