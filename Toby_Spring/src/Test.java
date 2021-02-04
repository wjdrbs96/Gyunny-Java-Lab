public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append('b');

        sb.deleteCharAt(0);

        System.out.println(sb.toString());
    }
}
