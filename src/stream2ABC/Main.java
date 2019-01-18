package stream2ABC;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(3);

        B b1 = new B(1).add(a1).add(a2);
        B b2 = new B(2).add(a2).add(a3);
        B b3 = new B(3).add(a1).add(a3);

        C c1 = new C(1).add(b1).add(b2);
        C c2 = new C(2).add(b2);

        C c3 = new C(2).add(b3);

        //C c3 = new C(3).add(b1);


        //Map<A, Map<C,B>>

//        List<B> res = Arrays.asList(fullContain1, fullContain2).stream();

//        res1(c1);
//        res2(c1);
//        ref3(c1);
//        ref4(c2);

        Arrays.asList(c1,c2).stream()
                .flatMap(C::getBs)
                .flatMap(B::getAs)
                .forEach(System.out::println);
//        Stream.of(1, 2, 3, 4, 5)
//                .map(i -> i + 2)
//                .forEach(System.out::println);




        //List<A> res3 = c1.getBsList().stream().flatMap(s -> s.getAs())
//
//        System.out.println(b1.toString());


        //new C(new ArrayList<B>().stream().flatMap())
    }

    private static void ref4(C c2) {
        //Достаёт лист из листа по листу от с1 и от b
        List<A> res4 = c2.getBsList().stream()
                .flatMap(s -> s.getAsList().stream())
                .collect(Collectors.toList());
        System.out.println(res4);
    }

    private static void ref3(C c1) {
        //Достаёт лист из листа по стриму от с1 и от b
        List<A> res3 = c1.getBs()
                .flatMap(B::getAs)
                .collect(Collectors.toList());
        System.out.println(res3);
    }

    private static void res1(C c1) {
        //Достаёт лист по возврату стрима
        List<B> res1 = c1.getBs().collect(Collectors.toList());
        System.out.println(res1);
    }

    private static void res2(C c1) {
        //Достаёт лист по возврату стрима
        List<B> res2 = c1.getBsList();
        System.out.println(res2);
    }
}
