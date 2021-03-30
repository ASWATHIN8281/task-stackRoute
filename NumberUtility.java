package com.stackroute.streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Utility class for analyzing numbers in a List
 */
public class NumberUtility {

    /**
     * Returns count of even numbers in the given list of integers
     * Returns 0 if there are no even numbers or if the passed list is null
     */
    public long getEvenNumberCount(List<Integer> numbers) {
        Optional<List<Integer>>optional=Optional.ofNullable(numbers);
        if (!optional.isPresent()) return 0;
       return numbers.stream().filter(x->x%2==0).count();
    }

    /**
     * Returns a list of even multiples of three from the given list of integers
     * Returns empty List, is the given list is null or empty
     */
    public List<Integer> getEvenMultiplesOfThree(List<Integer> numbers) {
        Optional<List<Integer>>optional=Optional.ofNullable(numbers);
        if (!optional.isPresent()||optional.isEmpty()) return Collections.emptyList();
        List<Integer>list=numbers.stream().filter(x->x%3==0).filter(x->x%2==0).collect(Collectors.toList());
        return list;
    }

    /**
     * Returns maximum of odd numbers
     * Returns 0 if there are no odd numbers or if the passed list is null
     */
    public Integer getMaximumOfOddNumbers(List<Integer> numbers) {
        Optional<List<Integer>>optional=Optional.ofNullable(numbers);
        if (!optional.isPresent() ||optional.isEmpty()) return 0;
        if (!numbers.stream().anyMatch(element->element%2!=0)) return 0;
        else return (int)(long)numbers.stream().filter(x->x%2!=0).
                max(Comparator.comparing(Integer::valueOf)).get();
    }
}