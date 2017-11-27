package business;

import java.util.stream.Stream;

public class StreamsProcessingOrder {

    public void intermAndTerminal() {
        Stream.of(1,2,3,4)
                .filter(s -> {
                    System.out.println("Filter: "+s);
                    return true;
                })
                .forEach( s -> System.out.println("ForEach: "+s));
    }

    public  void operationNumbers() {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }
/*
* if we move filter as first in pipeline we can reduce number of operations
* */
    public void operationNumbersPipeline() {
        Stream.of("d2", "a2", "b1", "b3", "c", "a3")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .sorted()
                .forEach(s -> System.out.println("forEach: " + s));
    }
}
