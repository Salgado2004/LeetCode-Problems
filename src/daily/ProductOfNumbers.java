/* Problem 1352 */
package daily;

import java.util.List;
import java.util.ArrayList;

public class ProductOfNumbers {
    List<Integer> nums;

    public static void main(String[] args) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        System.out.println(obj.getProduct(2));
        System.out.println(obj.getProduct(3));
        System.out.println(obj.getProduct(4));
        obj.add(8);
        System.out.println(obj.getProduct(2));

    }

    public ProductOfNumbers() {
        nums = new ArrayList<>();
    }

    public void add(int num) {
        if (num == 0){
            nums.clear();
        } else {
            if (!nums.isEmpty())
                nums.add(num * nums.get(nums.size() - 1));
            else
                nums.add(num);
        }
    }

    public int getProduct(int k) {
        if (nums.isEmpty() || k > nums.size()) return 0;
        int total = nums.get(nums.size() -1);
        if (k == nums.size()) return total;
        return total / nums.get(nums.size()-1-k);
    }
}
