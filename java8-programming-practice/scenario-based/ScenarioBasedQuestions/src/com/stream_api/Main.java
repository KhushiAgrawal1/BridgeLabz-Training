package com.stream_api;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;


public class Main {
public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student(1, "Amit", 23, "Male", "Mumbai", "Mechanical", 45, Arrays.asList("1111")),
            new Student(2, "Sneha", 26, "Female", "Delhi", "Computer", 12, Arrays.asList("2222","3333")),
            new Student(3, "Ravi", 28, "Male", "Mumbai", "Civil", 78, Arrays.asList("4444")),
            new Student(4, "Simran", 22, "Female", "Bangalore", "Biotech", 5, Arrays.asList("5555","6666")),
            new Student(5, "Karan", 30, "Male", "Pune", "Electronics", 90, Arrays.asList("7777")),
            new Student(6, "Suresh", 21, "Male", "Mumbai", "Mechanical", 15, Arrays.asList("8888","9999"))
        );

        // ---------------- BASIC FILTERING ----------------
        System.out.println("Rank < 50:");
        students.stream()
                .filter(s -> s.getRank() < 50)
                .forEach(s -> System.out.println(s));

        System.out.println("\nAge > 25:");
        students.stream()
                .filter(s -> s.getAge() > 25)
                .forEach(s -> System.out.println(s));

        System.out.println("\nNames only:");
        students.stream()
                .map(s -> s.getName())
                .forEach(name -> System.out.println(name));

        System.out.println("\nMechanical students:");
        students.stream()
                .filter(s -> s.getDepartment().equals("Mechanical"))
                .forEach(s -> System.out.println(s));

        System.out.println("\nNot from Mumbai:");
        students.stream()
                .filter(s -> !s.getCity().equals("Mumbai"))
                .forEach(s -> System.out.println(s));

        // ---------------- SORTING ----------------
        System.out.println("\nSorted by rank:");
        students.stream()
                .sorted((s1, s2) -> s1.getRank() - s2.getRank())
                .forEach(s -> System.out.println(s));

        System.out.println("\nSorted by age desc:");
        students.stream()
                .sorted((s1, s2) -> s2.getAge() - s1.getAge())
                .forEach(s -> System.out.println(s));

        System.out.println("\nTop 5 by rank:");
        students.stream()
                .sorted((s1, s2) -> s1.getRank() - s2.getRank())
                .limit(5)
                .forEach(s -> System.out.println(s));

        System.out.println("\nLast 3 by rank:");
        students.stream()
                .sorted((s1, s2) -> s2.getRank() - s1.getRank())
                .limit(3)
                .forEach(s -> System.out.println(s));

        System.out.println("\nSorted by name then rank:");
        students.stream()
                .sorted((s1, s2) -> {
                    int nameCompare = s1.getName().compareTo(s2.getName());
                    if (nameCompare != 0) return nameCompare;
                    return s1.getRank() - s2.getRank();
                })
                .forEach(s -> System.out.println(s));

        // ---------------- GROUPING ----------------
        System.out.println("\nStudents per department:");
        Map<String, Long> deptCount =
                students.stream()
                        .collect(groupingBy(s -> s.getDepartment(), counting()));
        System.out.println(deptCount);

        System.out.println("\nStudents per city:");
        Map<String, Long> cityCount =
                students.stream()
                        .collect(groupingBy(s -> s.getCity(), counting()));
        System.out.println(cityCount);

        System.out.println("\nAverage age per department:");
        Map<String, Double> avgAgeDept =
                students.stream()
                        .collect(groupingBy(s -> s.getDepartment(),
                                averagingInt(s -> s.getAge())));
        System.out.println(avgAgeDept);

        System.out.println("\nAverage rank by gender:");
        Map<String, Double> avgRankGender =
                students.stream()
                        .collect(groupingBy(s -> s.getGender(),
                                averagingInt(s -> s.getRank())));
        System.out.println(avgRankGender);

        // ---------------- MIN / MAX ----------------
        System.out.println("\nBest rank:");
        students.stream()
                .min((s1, s2) -> s1.getRank() - s2.getRank())
                .ifPresent(s -> System.out.println(s));

        System.out.println("\nWorst rank:");
        students.stream()
                .max((s1, s2) -> s1.getRank() - s2.getRank())
                .ifPresent(s -> System.out.println(s));

        System.out.println("\nYoungest:");
        students.stream()
                .min((s1, s2) -> s1.getAge() - s2.getAge())
                .ifPresent(s -> System.out.println(s));

        // ---------------- FLATMAP ----------------
        System.out.println("\nAll contacts:");
        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(c -> System.out.println(c));

        // ---------------- MATCHING ----------------
        System.out.println("\nAny Biotech?");
        boolean anyBiotech =
                students.stream()
                        .anyMatch(s -> s.getDepartment().equals("Biotech"));
        System.out.println(anyBiotech);

        // ---------------- ADVANCED ----------------
        System.out.println("\nMap<Id, Name>:");
        Map<Integer, String> idNameMap =
                students.stream()
                        .collect(toMap(s -> s.getId(), s -> s.getName()));
        System.out.println(idNameMap);

        System.out.println("\nNames starting with S:");
        students.stream()
                .filter(s -> s.getName().startsWith("S"))
                .forEach(s -> System.out.println(s));

        System.out.println("\nRank even:");
        students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .forEach(s -> System.out.println(s));
    }
}
