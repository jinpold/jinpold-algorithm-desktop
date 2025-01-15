package bojSilver5;

import java.util.*;

public class BOJ4446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] vowels = {'a', 'i', 'y', 'e', 'o', 'u'};
        char[] consonants = {'b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g',
                'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f'};

        Map<Character, Character> vowelMap = buildShiftMap(vowels, 3);
        Map<Character, Character> consonantMap = buildShiftMap(consonants, 10);


        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringBuilder result = new StringBuilder();

            for (char ch : line.toCharArray()) {
                if (Character.isLetter(ch)) {
                    boolean isUpperCase = Character.isUpperCase(ch);
                    char lowerChar = Character.toLowerCase(ch);

                    if (vowelMap.containsKey(lowerChar)) {
                        char converted = vowelMap.get(lowerChar);
                        result.append(isUpperCase ? Character.toUpperCase(converted) : converted);
                    } else if (consonantMap.containsKey(lowerChar)) {
                        char converted = consonantMap.get(lowerChar);
                        result.append(isUpperCase ? Character.toUpperCase(converted) : converted);
                    } else {
                        result.append(ch);
                    }
                } else {
                    result.append(ch);
                }
            }


            System.out.println(result);
        }
    }

    private static Map<Character, Character> buildShiftMap(char[] chars, int shift) {
        Map<Character, Character> map = new HashMap<>();
        int len = chars.length;

        for (int i = 0; i < len; i++) {
            map.put(chars[i], chars[(i + shift) % len]);
        }

        return map;
    }
}
