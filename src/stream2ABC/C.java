package stream2ABC;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class C {
    List<B> bs = new ArrayList<>();
    int value;

    public C(int value) {
        this.value = value;
    }

    public Stream<B> getBs() {
        return bs.stream();
    }

    public List<B> getBsList() {
        return bs;
    }

    @Override
    public String toString() {
        return "C{" +
                "value=" + value +
                ", bs=" + bs +
                '}';
    }

    public C add(B partContains){
        this.bs.add(partContains);
        return this;
    }

    public int getValue() {
        return value;
    }
}
