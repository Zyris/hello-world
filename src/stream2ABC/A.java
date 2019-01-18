package stream2ABC;

public class A {
    int value;

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public A(int value) {
        this.value = value;
    }
}
