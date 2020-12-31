package JDK;

public class TypeInference {
    public static void main(String[] args) {
        TypeInference type = new TypeInference();
        type.makeObjects1();
    }

    public void makeObjects1() {
        GenericClass<Integer> generic1 = new <String> GenericClass<Integer>("String");
        generic1.setValue(999);
    }
}
