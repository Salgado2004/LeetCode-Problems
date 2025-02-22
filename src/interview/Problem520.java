package interview;

public class Problem520 {
    public static void main(String[] args) {
        String word = "USA";

        Problem520 solution = new Problem520();
        System.out.println(solution.detectCapitalUse(word));
    }

    public boolean detectCapitalUse(String word) {
        int capitals = 0;

        for (int letter : word.chars().toArray()){
            if (inRange(letter, 65, 90))
                capitals++;
        }

        return capitals == 0 || capitals == word.length() || (capitals == 1 && inRange(word.charAt(0), 65, 90));
    }

    public boolean inRange(int n, int min, int max){
        return (n >= min && n <= max);
    }
}
