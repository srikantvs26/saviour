package nio2.paths;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Convert path to real path.
 * 
 * The toRealPath() method returns the real path of an existing file—this means
 * that the file must exist, which is not necessary if you use the
 * toAbsolutePath() method. If no argument is passed to this method and the file
 * system supports symbolic links, this method resolves any symbolic links in
 * the path. If you want to ignore symbolic links, then pass to the method the
 * LinkOption.NOFOLLOW_LINKS enum constant. Moreover, if the Path is relative,
 * it returns an absolute path, and if the Path contains any redundant elements,
 * it returns a path with those elements removed. This method throws an
 * IOException if the file does not exist or cannot be accessed.
 */
public class PathDemo9 {

    public static void main(String[] args) {

        Path path = Paths.get("README.md");// this is relative path, This file
                                           // must exist.
        try {
            Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
            System.out.println("Real Path of file : " + realPath);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Hey that file not there man.");
        }

        // ====================================================================

        // with Symbolic links
        Path p2 = Paths.get("README_sym.md");
        try {
            Path realPath = p2.toRealPath();
            Path realpath2 = p2.toRealPath(LinkOption.NOFOLLOW_LINKS);
            System.out.println("realPath with symbolic link resolved to the real path : " + realPath);
            System.out.println("realPath with symbolic link not resolved : " + realpath2);
        } catch (IOException e) {
        }

        // ======================================================================
        Path p3 = Paths.get("/workspaces/codespaces-blank/saviour/Java-17/temp/../README.md");
        try {
            Path realPath = p3.toRealPath(); // Yes it normalizes the path, by
                                             // removing redundant elements like
                                             // ..../Java-17/temp/.. normalized
                                             // to /Java-17/ i.e .. means parent
                                             // directory
            System.out.println("real path with redundant elements removed : " + realPath);
        } catch (IOException e) {
        }

    }

}
