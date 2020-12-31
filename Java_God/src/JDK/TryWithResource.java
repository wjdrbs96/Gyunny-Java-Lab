package JDK;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

    public void scanFile(String fileName, String encoding) {
        try (Scanner scanner = new Scanner(new File(fileName), encoding)) {
            System.out.println(scanner.nextLine());
        } catch (IllegalArgumentException | FileNotFoundException | NullPointerException exception) {
            exception.printStackTrace();
        }
    }
}
