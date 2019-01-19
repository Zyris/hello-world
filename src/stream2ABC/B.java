package stream2ABC;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class B {
    private List<A> as = new ArrayList<>();
    private int value;

    @Override
    public String toString() {
        return "B{" +
                "value=" + value +
                //", as=" + as +
                '}';
    }

    public B(int value) {
        this.value = value;
    }


    public B add(A a) {
        this.as.add(a);
        return this;
    }


    public int getValue() {
        return value;
    }

    public Stream<A> getAs() {
        return as.stream();
    }

    public List<A> getAsList() {
        return as;
    }


}
