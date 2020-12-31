package FileIO;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample sample = new NioDetailSample();
        sample.checkBuffer();
    }

    public void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int loop = 0; loop < 100; loop++) {
                buffer.put(loop);
            }
            System.out.println("Buffer capacity = " + buffer.capacity());
            System.out.println("Buffer limit = " + buffer.limit());
            System.out.println("Buffer position = " + buffer.position());
            buffer.flip();
            System.out.println("Buffer flipped !!! ");
            System.out.println("Buffer limit = " + buffer.limit());
            System.out.println("Buffer position = " + buffer.position());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
