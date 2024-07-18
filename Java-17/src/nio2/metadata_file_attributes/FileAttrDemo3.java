package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;

/**
 * Basic View
 * 
 * Most file system implementations support a set of common attributes (size, creation time, last accessed time, last modified time,
 * etc.). These attributes are grouped into a view named BasicFileAttributeView
 * 
 * Get Bulk Attributes with readAttributes() (the varargs argument currently supports the LinkOption.NOFOLLOW_LINKS enum—do not follow
 * symbolic links):
 */
public class FileAttrDemo3 {
    public static void main(String[] args) {

        Path p1 = Paths.get("test.jpg");
        try {

            /**
             * These are basic file attributes of p1 path in bulk by readAttributes() method.
             */

            BasicFileAttributes attributes = Files.readAttributes(p1, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            System.out.println("file size is :: " + (double) attributes.size() / 1024 + "KB");
            System.out.println(attributes.lastModifiedTime().toInstant().atZone(ZoneId.of("Asia/Kolkata")).toLocalDate());
            System.out.println(attributes.creationTime());
            System.out.println(attributes.isDirectory());
            System.out.println(attributes.isRegularFile());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.isSymbolicLink());
            System.out.println(attributes.fileKey()); // Returns an object that uniquely identifies the given file
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * Get only one attribute of a file
         */

        try {
            Object attribute = Files.getAttribute(p1, "basic:lastAccessTime", LinkOption.NOFOLLOW_LINKS);
            // It has returned Object, we don't know what attribute user wants, in this case its lastAccess time
            FileTime ft = (FileTime) attribute;
            System.out.println("last access time :: " + ft.toInstant().atZone(ZoneId.of("Asia/Kolkata")).toLocalTime());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
