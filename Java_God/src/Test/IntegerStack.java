package Test;

import java.util.Stack;

public class IntegerStack extends Stack<Object> {

    public Integer push(Object value) {
        return push((Integer) value);
    }

    public Integer push(Integer value) {
        super.push(value);
        return value;
    }

}
