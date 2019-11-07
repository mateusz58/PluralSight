package ListCodes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("A");
        list.add("C");
        list.add("D");

        Iterator<String> it = list.iterator();

        System.out.println(it.next());

        list.add(1, "B");

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
    }
}
