package Exception;

public class CustomException {
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        sample.throwMyException(13);
    }

    public void throwMyException(int number) {
        try {
            if (number > 12) {
                throw new MyException("Number is over than 12");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
