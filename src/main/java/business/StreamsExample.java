package business;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {

    }

    public void filterStream() {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }

    public void createStream() {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
    }

    public void primitiveStreams() {
        IntStream.range(1,5).forEach(System.out::println);
        LongStream.range(100000,100005).forEach(System.out::println);

    }

    public void primitiveAverage() {
        Arrays.stream(new int[]{1, 2, 3})
                .map(n -> n * 2 + 1)
                .average()
                .ifPresent(System.out::println);
    }

    public void maxPrimitive() {
        Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

    public void mapToObject() {
        IntStream.range(1,3)
                .mapToObj(s->"a"+s)
                .forEach(System.out::println);
    }

    public void mapPrimitiveToObject() {
        Stream.of(1.0,2.0,3.0)
                .mapToInt(Double::intValue)
                .mapToObj(s->s+"a")
                .forEach(System.out::println);
    }
}
