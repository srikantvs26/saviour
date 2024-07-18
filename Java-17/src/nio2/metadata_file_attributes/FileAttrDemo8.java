package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Get Attributes of All File Stores
 * 
 * Once you obtain access to the default file system—by calling the FileSystems.getDefault() method— you can easily iterate over the
 * file stores list provided by the FileSystem.getFileStores() method. Since each instance (name, type, total space, used space, and
 * available free space) is a FileStore object, you can call the corresponding dedicated methods such as name(), type(),
 * getTotalSpace(), and so on. The following code snippet prints information about your stores:
 */
public class FileAttrDemo8 {

    public static void main(String[] args) throws IOException {

        Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
        for (FileStore fileStore : fileStores) {
            System.out.println("file store name :: " + fileStore.name());
            System.out.println("file store type :: " + fileStore.type());
            System.out.println("get total space :: " + (double) fileStore.getTotalSpace() / (1024 * 1024 * 1024));
            System.out.println("get usable space (available):: " + (double) fileStore.getUsableSpace() / (1024 * 1024 * 1024));
            System.out.println("get unallocated space :: " + fileStore.getUnallocatedSpace());
            System.out.println("---------------------------------------------------");
        }

        // Get Attributes of the File Store in Which a File Resides
        Path p1 = Paths.get("test.jpg");
        FileStore fileStore = Files.getFileStore(p1);
        System.out.println("********************************************************");
        System.out.println("file store name :: " + fileStore.name());
        System.out.println("file store type :: " + fileStore.type());
        System.out.println("get total space :: " + (double) fileStore.getTotalSpace() / (1024 * 1024 * 1024));
        System.out.println("get usable space :: " + (double) fileStore.getUsableSpace() / (1024 * 1024 * 1024));
        System.out.println("get unallocated space :: " + fileStore.getUnallocatedSpace());
        System.out.println("get usable space :: " + (double) (long) fileStore.getAttribute("usableSpace") / (1024 * 1024 * 1024));
        System.out.println("********************************************************");

    }

}
