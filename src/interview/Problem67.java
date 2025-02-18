package interview;

public class Problem67 {
    public static void main(String[] args) {
        String a = "1";
        String b = "111";

        Problem67 solution = new Problem67();
        System.out.println(solution.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        char aux = '0';
        StringBuilder result = new StringBuilder();

        if (a.length() != b.length()){
            int max = Math.max(a.length(), b.length());
            StringBuilder aBuilder = new StringBuilder(a);
            while (aBuilder.length() < max){
                aBuilder.insert(0, "0");
            }
            a = aBuilder.toString();
            StringBuilder bBuilder = new StringBuilder(b);
            while (bBuilder.length() < max){
                bBuilder.insert(0, "0");
            }
            b = bBuilder.toString();
        }

        for (int i = a.length()-1; i >= 0; i--){
            String sum = nand(a.charAt(i), b.charAt(i), aux);

            if (sum.length() == 1){
                result.insert(0, sum);
                aux = '0';
            } else{
                result.insert(0, sum.charAt(1));
                aux = sum.charAt(0);
            }
        }

        if(aux == '1'){
            result.insert(0, aux);
        }

        return result.toString();
    }

    public String nand(char a, char b, char aux){
        int sum = (a - '0') + (b-'0') + (aux-'0');
        return switch (sum) {
            case 1 -> "1";
            case 2 -> "10";
            case 3 -> "11";
            default -> "0";
        };
    }
}
