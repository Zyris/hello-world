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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;

        A a = (A) o;

        return value == a.value;
    }

    @Override
    public int hashCode() {
        return value*15;
    }

    public A(int value) {
        this.value = value;
    }
}
