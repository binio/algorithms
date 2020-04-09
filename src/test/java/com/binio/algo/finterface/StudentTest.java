package com.binio.algo.finterface;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

     List<Student> listOfStudents = new ArrayList<Student>();

    @Before
    public void setUp() throws Exception {
        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
    }

    @Test
    public void testPredicate() {
        //Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        //List<Student> list = listOfStudents.stream().filter(mathematicsPredicate).collect(Collectors.toList());
        List<Student> list = listOfStudents.stream()
                .filter(s -> s.specialization.equals("Mathematics"))
                .collect(Collectors.toList());
        assertEquals(2,list.size());

    }

    @Test
    public void testConsumer() {
        String out = "";
        Consumer<Student> percentageConsumer = (Student student) -> {

            final String s = student.getName() + " : " + student.getPercentage();
            System.out.println(s);
        };
        listOfStudents.stream().forEach(percentageConsumer);
    }

    @Test
    public void testFunction() {
        List<String> studentNames = new ArrayList<String>();
        Function<Student, String> function = (Student student) ->
                student.getName().toUpperCase() + " --- ";

        listOfStudents.stream().forEach(
                s ->  studentNames.add(function.apply(s))
        );

        studentNames.stream().forEach(System.out::println);
    }
}