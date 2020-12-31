package FileIO;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File file, String fileName) {
        if (fileName.endsWith("md")) return true;
        return false;
    }
}
