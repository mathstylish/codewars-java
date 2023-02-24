package org.challenges.solutions.kata6;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public final class Kata6WhichAreIn {
    public static String[] solution(String[] array1, String[] array2) {
        Set<String> set = Arrays.stream(array1)
                .filter(a -> Arrays.stream(array2).anyMatch(b -> b.contains(a)))
                .collect(Collectors.toSet());

        return set.stream().sorted(String::compareTo).toArray(String[]::new);
    }
}
