package JDK;

public class JDK7Numbers {
    public static void main(String[] args) {
        JDK7Numbers jdk7Numbers = new JDK7Numbers();
        //jdk7Numbers.jdk6();
        jdk7Numbers.jdk7Underscore();
    }

    public void jdk6() {
        int decVal = 1106;                  // 10진수
        int octVal = 02122;                 // 8진수
        int hexVal = 0x452;                 // 16진수
        int binaryVal = 0b10001010010;      // 2진수
        System.out.println(decVal);
        System.out.println(octVal);
        System.out.println(hexVal);
        System.out.println(binaryVal);
    }

    public void jdk7Underscore() {
        int binaryVal = 0b0100_0101_0010;
        int million = 1_000_000;
        System.out.println(binaryVal);
        System.out.println(million);
    }
}
