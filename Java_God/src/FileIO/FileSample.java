package FileIO;

import java.io.*;
import java.util.Arrays;

public class FileSample {
    public static void main(String[] args) {
        FileSample sample = new FileSample();
        String pathName = "/Users/choejeong-gyun/Documents";
        String fileName = "ttt.md";
        //sample.checkFile(pathName, fileName);
        sample.checkPath(pathName);
    }

    public void checkPath(String pathName) {
        File file = new File(pathName);
        File[] files1 = file.listFiles(new JPGFilenameFilter());
        System.out.println(Arrays.toString(files1));
        File[] files = file.listFiles();
        //System.out.println(Arrays.toString(files));
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
