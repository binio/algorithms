package business;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamAdvanced {

    List<Person> people = new ArrayList<>();

    public StreamAdvanced(){
        people.add(new Person("Thomas",44));
        people.add(new Person("Adam",40));
        people.add(new Person("Martin",24));
        people.add(new Person("Simon",24));
        people.add(new Person("Brian",14));
        people.add(new Person("Tom",14));
    }

    public void getAllPeople() {
        List<Person> list = people.stream()
                .filter(p -> p.name.startsWith("T"))
                .sorted(comparing(Person::getAge))
                .collect(Collectors.toList());

        list.forEach(person -> System.out.println(person.name + " " + person.getAge()));
    }

    public void groupByAge(){
        Map<Integer, List<Person>> personsByAge = people.stream()
                .collect(Collectors.groupingBy(p->p.getAge()));
        personsByAge
                .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
    }

    public void averageAge() {
        Double averageAge = people.stream().collect(Collectors.averagingInt(p->p.getAge()));
        System.out.println("Average age: "+averageAge);
    }

    public void sumAge() {
        Integer sumAge = people.stream().collect(Collectors.summingInt(p->p.getAge()));
        System.out.println("Sum age: "+sumAge);
    }

    public void joiningAge() {
        String phrase = people.stream()
                .filter(p->p.age >= 18)
                .map(p->p.name)
                .collect(Collectors.joining(" and ", "People: ", " are of legal age!"));
        System.out.println(phrase);
    }

    public void toMap() {
        Map<Integer, String> map = people.stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p.name,
                        (name1, name2) -> name1 + ";" + name2)
                );
        System.out.println(map);
    }

    /*
    * We want to transform all persons of the stream into a single string consisting of all names in upper letters separated by the | pipe character.*/
    public void customCollector() {
        Collector<Person,StringJoiner,String> personNameCollector = Collector.of(
                ()-> new StringJoiner("|"), //supplier
                (j,p) -> j.add(p.name.toUpperCase()),//combiner
                (j1, j2) -> j1.merge(j2),            //accumulator
                StringJoiner::toString);             //finisher

        String names = people.stream().collect(personNameCollector);
        System.out.println(names);
    }

    public void customCollectorClassicImpl() {

    }
}
