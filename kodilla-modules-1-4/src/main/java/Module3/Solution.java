package Module3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {


    public String generateRandomA() {
        int size = ThreadLocalRandom.current().nextInt(1, 50);
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < 10; i++) { // For each letter in the word
            sb.append('a');
        }
        return sb.toString();
    }

    public String generateRandomWord() {
        int size = ThreadLocalRandom.current().nextInt(1, 50);
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < 10; i++) { // For each letter in the word
            sb.append('a');
        }
        return sb.toString();
    }

    Integer generateRandomYear() {
        Random r = new Random();
        return ThreadLocalRandom.current().nextInt(1976, 2019);
    }

    Integer generateRandomNumber9() {
        Random r = new Random();
        return r.nextInt(9);
    }

    Integer generateRandomNumber49() {
        Random r = new Random();
        return r.nextInt(49);
    }

    Book generateRandomBook() {
        return new Book(generateRandomWord(), generateRandomWord(), generateRandomYear());
    }

    public void task1() {
        Set<Book> set = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            set.add(generateRandomBook());

        }
        for (Book book : set) {
            if (book.publishedDate < 2010) {
                System.out.println(book.toString());
            }
        }

    }

    public void task2() {
        Stack<Book> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(generateRandomBook());

        }
        Book last = new Book();
        System.out.println(stack.size());
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                last = stack.peek();
            }
            stack.pop();
        }
        System.out.println(stack.size());
        System.out.println(last.toString());

    }

    public void task3() {
        int sumA = 1000;
        int sumB = 0;
        int i = 0;
        while (true) {
            System.out.println("Iteration i");
            i++;
            sumA = sumA + generateRandomNumber9();
            sumB = sumB + generateRandomNumber49();
            System.out.println(sumA);
            System.out.println(sumB);
            if (sumB > sumA) {
                break;
            }
        }
    }

    public void task4() {
        ArrayDeque<String> array = new ArrayDeque<>();
        for (int i = 0; i < 50; i++) {
            array.add(generateRandomA());

        }
        Custom a = new Custom();
        a.methoddivide(array);
    }

    public void task5() {
    }

    class Custom {

        void methoddivide(ArrayDeque<String> input) {
            ArrayList<String> even = new ArrayList<>();
            ArrayList<String> uneven;
            Iterator<String> iterator = input.iterator();
            while (iterator.hasNext()) {
                String a = iterator.next();
                if (a.length() % 2 == 0) {
                    even.add(a);
                } else {
                    even.add(a);
                }

            }
        }
    }

    class Book {

        Integer publishedDate;
        String title;
        String author;

        public Book() {
        }

        public Book(String title, String author, int publishedDate) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.author = author;
        }


        public Integer getPublishedDate() {
            return publishedDate;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Book book = (Book) o;
            return publishedDate.equals(book.publishedDate) &&
                title.equals(book.title) &&
                author.equals(book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(publishedDate, title, author);
        }

        @Override
        public String toString() {
            return "Book{" +
                "publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
        }

    }

    public void measureTime() {

        Book toSearch;
        long begin;

        long end;

        LinkedList<Book> books=new LinkedList<>();
        Map<Integer,Book> mapbook=new HashMap<>();

        Book searchBookFirst=generateRandomBook();
        books.add(searchBookFirst);

        mapbook.put(searchBookFirst.hashCode(),searchBookFirst);
        for (int i = 0; i <300000 ; i++) {
            Book bookToAdd=generateRandomBook();
            books.add(bookToAdd);
            mapbook.put(bookToAdd.hashCode(),bookToAdd);
        }
        Book searchBookLast=generateRandomBook();
        books.add(searchBookLast);
        mapbook.put(searchBookLast.hashCode(),searchBookLast);


        //First element find and delete from List
        begin = System.nanoTime();
        toSearch=books.stream().filter(book->searchBookFirst.equals(book)).findFirst().orElse(null);
        books.remove(searchBookFirst);
        end = System.nanoTime();
        System.out.println(end-begin);

        //First element find and delete from map
        begin = System.nanoTime();
        toSearch=mapbook.entrySet().stream().filter(x->x.getKey()==searchBookFirst.hashCode()).map(s->s.getValue()).findFirst().orElse(null);
        mapbook.remove(toSearch.hashCode());
        end = System.nanoTime();
        System.out.println(end-begin);


        //Last element find and delete from list
        begin = System.nanoTime();
        toSearch=books.stream().filter(book->searchBookFirst.equals(book)).findFirst().orElse(null);
        end = System.nanoTime();
        System.out.println(end-begin);


        //Last element find and delete from map
        begin = System.nanoTime();
        toSearch=books.stream().filter(book->searchBookLast.equals(book)).findFirst().orElse(null);
        books.remove(toSearch);
        end = System.nanoTime();

        System.out.println(end-begin);

    }

}


