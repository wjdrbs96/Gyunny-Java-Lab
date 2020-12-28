package Generic;

public class WildCardSample {
    public static void main(String[] args) {
        WildCardSample sample = new WildCardSample();

    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
    }
}

