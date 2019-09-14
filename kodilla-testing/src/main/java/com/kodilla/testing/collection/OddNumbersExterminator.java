package com.kodilla.testing.collection;

import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersExterminator {

   public List<Integer> exterminate(List<Integer> numbers)
    {
        return numbers.stream().filter(s->s%2==0).collect(Collectors.toList());
    }
}
