package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/**
 * Most file systems accept the concept of file owner as an identity used to determine access rights to objects in a file system. NIO.2
 * maps this concept in an interface named UserPrincipal and allows you to get or set the owner of a file through the file owner view,
 * which is represented by the FileOwnerAttributeView interface. Actually, as you will see in the following code examples, NIO.2 has
 * multiple ways for setting and getting the file owner.
 */
public class FileAttrDemo7 {

    public static void main(String[] args) {
        

        Path p1 = Paths.get("test.jpg");
        
        UserPrincipal owner;
        
        try {
            owner = Files.getOwner(p1, LinkOption.NOFOLLOW_LINKS);
            System.out.println("Owner of file is :: "+owner);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        try {
            UserPrincipal userPrincipal = p1.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("ultraman");
            Files.setOwner(p1, userPrincipal);
        } catch (IOException e) {
            e.printStackTrace();
        }


        
    }

}
