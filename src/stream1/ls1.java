package stream1;

import java.util.Arrays;

public class ls1 {
    //Преобразуем двумерный массив примитивов в одномерный

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(StreamsFeatures.biIntArrayToArray(arr)).forEach(System.out::println);
    }
}
