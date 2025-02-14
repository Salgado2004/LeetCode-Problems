package interview;

import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Stream;

public class Problem12 {
    List<Integer> auxKeys = Stream.of(1, 5, 10, 50, 100, 500, 1000).sorted().toList();
    Map<Integer, Character> constants = Map.of(
            1, 'I',
            5, 'V',
            10, 'X',
            50, 'L',
            100, 'C',
            500, 'D',
            1000, 'M'
    );

    public static void main(String[] args) {
        int num = 10;

        Problem12 solution = new Problem12();
        System.out.println(solution.intToRoman(num));
    }

    public String intToRoman(int num) {
        int i = 0;
        StringBuilder roman = new StringBuilder();
        Stack<Integer> alg = new Stack<>();

        while (num > 0) {
            alg.push((int) ((num % 10) * Math.pow(10, i)));
            num = num / 10;
            i++;
        }

        while (!alg.empty()) {
            int value = alg.pop();
            if (value == 0) continue;

            if (constants.containsKey(value)) {
                roman.append(constants.get(value));
            } else {
                int key = 1;
                for (int k : auxKeys) {
                    if (k > value) break;
                    key = k;
                }
                int count = 1, aux = key;
                while (aux < value) {
                    aux += key;
                    count++;
                }
                if (aux == value && count <= 3) {
                    for (int x = 0; x < count; x++) {
                        roman.append(constants.get(key));
                    }
                }
                if (aux == value && count == 4) {
                    int next = auxKeys.get(auxKeys.indexOf(key) + 1);
                    roman.append(constants.get(key));
                    roman.append(constants.get(next));
                }
                if (aux > value) {
                    int diff = aux - value;
                    if (auxKeys.contains(diff)){
                        key = diff;
                        roman.append(constants.get(key));
                        roman.append(constants.get(aux));
                    } else{
                        roman.append(constants.get(key));
                        alg.push(value - key);
                    }
                }
            }
        }

        return roman.toString();
    }
}
