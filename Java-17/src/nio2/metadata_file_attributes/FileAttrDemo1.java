package nio2.metadata_file_attributes;

import java.nio.file.FileSystems;
import java.util.Set;

/**
 * If you have questions about a file or a directory, such as whether it is hidden, whether it is a directory, what its size is, and
 * who owns it, you can get answers to those questions (and many others) from the metadata.
 * 
 * NIO.2 associates the notion of metadata with attributes and provides access to them through the java.nio.file.attribute package.
 * 
 * NIO.2 groups the attributes into views, each of which maps to a particular file system implementation. Generally, views provide the
 * attributes in bulk through a common method, readAttributes(). In addition, you can extract and set a single attribute with the
 * getAttribute() and setAttribute() methods, respectively, which are available in the java.nio.file.Files class.
 * 
 * Supported Views in NIO.2 NIO.2 comes with a set of six views, an overview of which follows:
 * 
 * • BasicFileAttributeView: This is a view of basic attributes that must be supported by all file system implementations. The
 * attribute view name is basic.
 * 
 * • DosFileAttributeView: This view provides the standard four supported attributes on file systems that support the DOS attributes.
 * The attribute view name is dos.
 * 
 * • PosixFileAttributeView: This view extends the basic attribute view with attributes supported on file systems that support the
 * POSIX (Portable Operating System Interface for Unix) family of standards, such as Unix. The attribute view name is posix.
 * 
 * • FileOwnerAttributeView: This view is supported by any file system implementation that supports the concept of a file owner. The
 * attribute view name is owner.
 */
public class FileAttrDemo1 {

    public static void main(String[] args) {

        /**
         * Determining Views Supported by a Particular File System.
         * 
         * Before you attempt to access a view's attributes, make sure that your file system supports the corresponding view. Once you
         * obtain access to the default file system—by calling the FileSystems.getDefault() method—you can easily iterate over the
         * supported views returned by the FileSystem.supportedFileAttributeViews() method.
         */
        System.out.println("File System :: "+FileSystems.getDefault());
        Set<String> supportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
        supportedFileAttributeViews.forEach(attrView -> System.out.println(attrView));

        // ■ Note All file systems support the basic view, so you should get at least the basic name in your output.

    }

}
