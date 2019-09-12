package Module1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


    Integer getYear(String input) {
        Pattern pattern = Pattern.compile(".*\\s([1-2][0-9]{3}).*");
        Matcher matcher = pattern.matcher(input);
        matcher.matches();
        return Integer.parseInt(matcher.group(1));
    }

    String generateRandomTitle() {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    Integer generateRandomMark() {
        Random r = new Random();
        return ThreadLocalRandom.current().nextInt(1, 6);
    }

    Integer generateRandomPunlishDate() {
        return ThreadLocalRandom.current().nextInt(1967, 2019);
    }

    public void Task1() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(generateRandomMark());
        }
        Collections.sort(list);
        list.remove(0);
        list.remove(list.size() - 1);
        System.out.println(list.stream().mapToInt(i -> i).sum() / list.size());
    }

    public void Task2() {
        LinkedList<Book> list = new LinkedList<>();
        int comp = 0;
        for (int i = 0; i < 15; i++) {
            list.add(new Book(generateRandomPunlishDate(), generateRandomTitle()));
        }
        for (Book temp : list) {
            if (temp.getPublishedDate() >= 2000) {
                System.out.println(temp);
            }
        }

    }

    public void Task3() {
        Student worker1 = new Student("Jennifer", "Taylor", "12345678901");
        Student worker2 = new Student("Monica", "Kowalski", "12345612345");
        Student worker3 = new Student("Robert", "Greenfield", "12345698765");
        Student worker4 = new Student("Robert", "Greenfield", "12345045678");
        StudentGrades params1 = new StudentGrades(5.0, 3.0, 2.0, 3.0);
        StudentGrades params2 = new StudentGrades(4.0, 2.0, 1.0, 6.0);
        StudentGrades params3 = new StudentGrades(4.0, 3.0, 5.0, 4.0);
        StudentGrades params4 = new StudentGrades(1.0, 2.0, 2.0, 3.0);
        HashMap<Student, StudentGrades> salariesParameters = new HashMap<Student, StudentGrades>();
        salariesParameters.put(worker1, params1);
        salariesParameters.put(worker2, params2);
        salariesParameters.put(worker3, params3);
        salariesParameters.put(worker4, params4);
        for (Map.Entry<Student, StudentGrades> entry : salariesParameters.entrySet()) {
            System.out.println("Grade of " + entry.getKey() + " equals " +
                entry.getValue().calculateAverage());
        }


    }

    class Book implements Comparable<Book> {

        Integer publishedDate;
        String title;

        public Book(int publishedDate, String title) {
            this.publishedDate = publishedDate;
            this.title = title;
        }

        public Integer getPublishedDate() {
            return publishedDate;
        }

        @Override
        public int compareTo(Book o) {
            if (getPublishedDate() == null || o.getPublishedDate() == null) {
                return 0;
            }
            return getPublishedDate().compareTo(o.getPublishedDate());
        }


    }

    class Student {

        private String firstName;
        private String lastName;
        private String peselId;

        public Student(String firstName, String lastName, String peselId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.peselId = peselId;
        }

        @Override
        public boolean equals(Object o) {
            final Student e = (Student) o;
            return this.firstName.equals(e.firstName) && this.lastName.equals(e.lastName) && this.peselId.equals(e.peselId);
        }

        @Override
        public int hashCode() {
            return Integer.parseInt(peselId.substring(0, 5));
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (" + peselId + ")";
        }
    }

    class StudentGrades {

        private Double GeographyGrade;
        private Double BiologyGrade;
        private Double ITGrade;
        private Double EnglishGrade;

        public StudentGrades(Double GeographyGrade, Double BiologyGrade, Double ITGrade, Double EnglishGrade) {
            this.GeographyGrade = GeographyGrade;
            this.BiologyGrade = BiologyGrade;
            this.ITGrade = ITGrade;
            this.EnglishGrade = EnglishGrade;
        }

        public Double calculateAverage() {
            return (GeographyGrade + BiologyGrade + ITGrade + EnglishGrade) / 4;
        }
    }
}
