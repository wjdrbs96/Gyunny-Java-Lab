package FileIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ManageTextFile {
    public static void main(String[] args) {
        ManageTextFile manage = new ManageTextFile();
        int numberCount = 10;

        String pathName = "/Users/choejeong-gyun/Documents/test.md";
        manage.writeFile(pathName, numberCount);
        manage.readFile(pathName);
    }

    public void writeFile(String fileName, int numberCount) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int loop = 0; loop <= numberCount; ++loop) {
                bufferedWriter.write(Integer.toString(loop));
                bufferedWriter.newLine();
            }
            System.out.println("Write success ! ! ! ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
    }

    public void readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
