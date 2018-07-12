package business;

import static javax.json.Json.createArrayBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.json.JsonObjectBuilder;
import javax.json.spi.JsonProvider;

public class NestedArraysStream {


    public void joinStreams() {
        ArrayList<List<String>> wordLists = new ArrayList<>();
        wordLists.add(Arrays.asList(new String[]{"abc","klm","xyz","pqr"}));
        wordLists.add(Arrays.asList(new String[]{"hello","world","ABC","Rtz"}));


        wordLists.stream().flatMap(List::stream).map(String::toLowerCase).sorted().forEach(System.out::println);
        Stream.of("a1","a2","a3")
                .map(s->s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

    public void prepareErrorMessage() {
        ArrayList<DuplicateError> errors = new ArrayList<>();
        errors.add(new DuplicateError(UUID.randomUUID(),"shortcode REST exists for the  id."));
        errors.add(new DuplicateError(UUID.randomUUID(),"wordgroup {pen,pnl,plty} exists for the id."));
        errors.add(new DuplicateError(UUID.randomUUID(),"shortcode RESTRAOP exists for the  id."));
        errors.add(new DuplicateError(UUID.randomUUID(),"shortcode YEAR exists for the  id."));

        System.out.println(errors.stream().map(o -> o.getError()).collect(Collectors.joining(",\n")).toString());
    }
}
