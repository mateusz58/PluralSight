package Module4;

import static java.util.Comparator.comparingLong;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {


    private String generateRandomWord() {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    Long generateRandomNumber() {
        Random r = new Random();
        return ThreadLocalRandom.current().nextLong(1, 5);
    }

    public void task4() {
        Module4.Solution task = new Module4.Solution();
        LinkedList<Cannon> cannons = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            cannons.add(new Module4.Solution.Cannon());
        }
        for (int i = 0; i < 8; i++) {
            cannons.get(i).fire();
        }

    }

    public void task2() {
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            orders.add(new Order(generateRandomNumber(), generateRandomWord()));
            System.out.println(orders.get(i).toString());
        }
        List<Order> unique = orders.stream()
            .collect(collectingAndThen(toCollection(() -> new TreeSet<>(comparingLong(Order::getOrderNumber))),
                ArrayList::new));
        System.out.println("After set");
        unique.stream().forEach(s -> System.out.println(s.toString()));
    }

    public void task3()
        {
            Map<Integer, String> myFavoriteColors = new HashMap<Integer, String>();
            Map<Integer, String> myFriendsFavoriteColors = new HashMap<Integer, String>();
            myFavoriteColors.put(1, "Red");
            myFavoriteColors.put(2, "Green");
            myFavoriteColors.put(3, "Black");
            System.out.println("Values in first map: " + myFavoriteColors);
            myFriendsFavoriteColors.put(4, "White");
            myFriendsFavoriteColors.put(5, "Blue");
            myFriendsFavoriteColors.put(6, "Orange");
            System.out.println("Values in second map: " + myFriendsFavoriteColors);
            Map<Integer, String> ourFavoriteColors = new HashMap<>();
            Iterator itrMyFavouriteColors = myFavoriteColors.entrySet().iterator();
            Iterator itrMyFriendsFavoriteColors = myFriendsFavoriteColors.entrySet().iterator();
            while(itrMyFavouriteColors.hasNext()) {
                    Map.Entry pair= (Map.Entry) itrMyFavouriteColors.next();
                    ourFavoriteColors.put((Integer) pair.getKey(), pair.getValue().toString());
                }
            while(itrMyFriendsFavoriteColors.hasNext()) {
                Map.Entry pair= (Map.Entry) itrMyFriendsFavoriteColors.next();
                ourFavoriteColors.put((Integer) pair.getKey(), pair.getValue().toString());
            }
                int key = myFavoriteColors.entrySet().iterator().next().getKey();
                String value = myFavoriteColors.entrySet().iterator().next().getValue();
                ourFavoriteColors.put(key, value);
            System.out.println("Values in  map: " + ourFavoriteColors);
            }



    public void task5() {
        LinkedList<Clock> cannons = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            cannons.add(new Clock());
        }
        for (int i = 0; i < 8; i++) {
            cannons.get(i).setTime(cannons.get(i).getTime().plusMinutes(1));
            System.out.println(cannons.get(i).getTime());
        }
    }

    private int NWD(int a, int b) {
        int rest = a % b;
        if (rest == 0) {
            return b;
        }
        a = b;
        b = rest;
        return NWD(a, b);
    }

    public void task7(int a, int b) {
        System.out.println(NWD(a, b));
    }

    class Clock {

        LocalDateTime time = LocalDateTime.now();

        public LocalDateTime getTime() {
            return time;
        }

        public void setTime(LocalDateTime time) {
            this.time = time;
        }
    }

    class Order {

        private final Long orderNumber;
        private final String product;

        public Order(Long orderNumber, String product) {
            this.orderNumber = orderNumber;
            this.product = product;
        }

        @Override
        public String toString() {
            return "Order{" +
                "orderNumber=" + orderNumber +
                ", product='" + product + '\'' +
                '}';
        }

        @Override
        public int hashCode() {
            return Objects.hash(orderNumber, product);
        }


        public Long getOrderNumber() {
            return orderNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Order order = (Order) o;
            return orderNumber.equals(order.orderNumber) &&
                product.equals(order.product);
        }
    }

    public class Cannon {

        public boolean loaded;

        public Cannon() {
        }

        public void fire() {
            if (!loaded) {
                System.out.println("Not Loaded");
                this.loaded = true;
            }
            System.out.println("Fire");
        }
    }
}





