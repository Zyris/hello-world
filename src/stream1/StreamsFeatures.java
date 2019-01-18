package stream1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamsFeatures {
    public static int[] biIntArrayToArray(int[][] array){
        return Arrays.stream(array).flatMapToInt(Arrays::stream).toArray();
    }
}
