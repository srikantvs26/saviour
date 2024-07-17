package nio2.metadata_file_attributes;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;

/**
 * Check if a particular view is supported or not.
 */
public class FileAttrDemo2 {
    public static void main(String[] args) {

        FileSystem fs = FileSystems.getDefault();
        Iterable<FileStore> fileStores = fs.getFileStores();
        // fileStores.forEach(System.out::println);

        System.out.println("File stores in my machine ");
        fileStores.forEach(store -> {
            // boolean supported = store.supportsFileAttributeView("basic");
            boolean supported = store.supportsFileAttributeView(BasicFileAttributeView.class);
            System.out.println(store + "----" + supported);

        });

        // Moreover, you can check if a file store in which a particular file resides, supports a particular view or not?

        Path p1 = Paths.get("test.jpg");
        try {
            FileStore fileStore = Files.getFileStore(p1);
            boolean supported = fileStore.supportsFileAttributeView("basic"); //owner
            System.out.println(fileStore +"-->"+fileStore.name()+"--> "+supported);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
