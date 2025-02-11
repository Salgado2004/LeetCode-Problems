package interview;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3};

        MajorityElement solution = new MajorityElement();
        int s = solution.majorityElement(nums);
        System.out.println(s);
    }

    public int majorityElement(int[] nums) {
        int s = 0;
        if (nums.length == 0) return s;
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        for (int num : nums) {
            if (!duplicate.containsKey(num)) {
                duplicate.put(num, 0);
            }
            duplicate.compute(num, (key, v) -> v + 1);
            if (duplicate.get(num) > (nums.length / 2)) {
                s = num;
                break;
            }
        }

        return s;
    }
}
