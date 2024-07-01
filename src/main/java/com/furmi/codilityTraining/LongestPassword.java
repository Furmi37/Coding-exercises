package com.furmi.codilityTraining;

public class LongestPassword {
    public int solution(String S) {
        // Implement your solution here
        String[] words = S.split(" ");
        int max = -1;
        for (String word : words) {
            int digitsCount = 0;
            int lettersCount = 0;
            boolean found = true;

            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (Character.isDigit(character)) {
                    digitsCount++;
                } else if (Character.isLetter(character)) {
                    lettersCount++;
                } else {
                    found = false;
                    break;
                }
            }
            if (found && digitsCount % 2 == 1 && lettersCount % 2 == 0) {
                max = Math.max(word.length(), max);
            }
        }
        return max;
    }
}
