package Thread;

public class MusicBox {
    public synchronized void playMusicA( ) {
        for (int i = 0; i < 10; ++i) {
            System.out.println("형일 !!");
            //playMusicC();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicB() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("정균 !!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("앙 앙 !!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
