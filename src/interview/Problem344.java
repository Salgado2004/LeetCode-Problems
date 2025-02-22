package interview;

public class Problem344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        Problem344 solution = new Problem344();
        System.out.println(s);
        solution.reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--){
            char aux = s[i];
            s[i] = s[j];
            s[j] = aux;
        }
    }
}
