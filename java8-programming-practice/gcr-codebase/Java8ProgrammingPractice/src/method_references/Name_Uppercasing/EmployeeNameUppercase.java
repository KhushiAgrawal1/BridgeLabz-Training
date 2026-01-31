package method_references.Name_Uppercasing;

import java.util.*;

public class EmployeeNameUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("khushi", "rahul", "neha");

        names.stream()
             .map(String::toUpperCase)   // Method Reference
             .forEach(System.out::println);
    }
}
