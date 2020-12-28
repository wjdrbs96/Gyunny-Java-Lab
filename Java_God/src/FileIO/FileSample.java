package FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "/Users/choejeong-gyun/Documents";
        String fileName = "test.md";
        sample.checkFile(pathName, fileName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }

    public void checkFile(String pathName, String fileName) {
        File file = new File(pathName, fileName);
        try {
            System.out.println("Create result = " + file.createNewFile());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
    }
}
