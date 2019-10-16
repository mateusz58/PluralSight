package StringFindFirstNonRepChar;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class String_Find_First_Non_Rep_Char
{
    boolean check(Integer index, Integer[] input_array, Integer jump)
    {
        if (input_array[index].equals(input_array[index + jump])) return true;
        else return false;
    }
    Predicate<String> p = String::isEmpty;
    public  char findFirstNonRepChar(String string)
    {
        Map<Integer,Long> characters = string.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        characters.keySet().forEach(System.out::println);
        return (char)(int)characters.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No unrepeated character"));
    }
    char firstNotRepeatingCharacter(String s)
    {
        LinkedList<Character> list=new LinkedList<>();
        Character temp=' ';
        for (int i = 0; i < s.length(); i++)
        {
            if(list.contains(s.charAt(i))){list.removeFirstOccurrence(s.charAt(i));continue;};
            if(!list.contains(s.charAt(i))){list.add(s.charAt(i));}
        }
        list.stream().forEach(System.out::println);
        if(list.isEmpty())return '_';
        else return list.getFirst();
    }
}
