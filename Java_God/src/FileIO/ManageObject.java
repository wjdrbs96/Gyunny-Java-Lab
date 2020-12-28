package FileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manage = new ManageObject();
        String fullPath = "/Users/choejeong-gyun/Documents/test.md";


        SerialDTO dto = new SerialDTO("God of Java", 1, true, 100);
        manage.saveObject(fullPath, dto);
    }

    public void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
