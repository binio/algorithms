package business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamAdvanced {

    List<Person> people = new ArrayList<>();

    public StreamAdvanced(){
        people.add(new Person("Thomas",44));
        people.add(new Person("Adam",40));
        people.add(new Person("Martin",34));
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
}
