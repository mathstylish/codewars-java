package org.challenges.solutions.kata6;

public final class Kata6BreakCamelCase {
    public static String solution(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90 && i != 0) {
                result += " " + input.charAt(i);
                continue;
            }
            result += input.charAt(i);
        }
        return result;
    }
}
