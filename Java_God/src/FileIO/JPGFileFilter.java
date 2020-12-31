package FileIO;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isFile()) {
            String fileName = pathname.getName();
            if (fileName.endsWith("md")) return true;
        }
        return false;
    }
}
