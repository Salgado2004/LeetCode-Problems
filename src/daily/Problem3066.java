package daily;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3066 {
  public static void main(String[] args) {
    int[] nums = {1000000000, 999999999, 1000000000, 999999999, 1000000000, 999999999};
    int k = 1000000000;

    Problem3066 solution = new Problem3066();
    System.out.println(solution.minOperations(nums, k));
  }

  public int minOperations(int[] nums, int k) {
    int count = 0;
    PriorityQueue<Long> pq = new PriorityQueue<>(Arrays.stream(nums).asLongStream().boxed().collect(Collectors.toList()));

    while (pq.size() >= 2 && pq.peek() < k) {
      long first = pq.poll();
      long second = pq.poll();
      pq.offer(first * 2 + second);
      count++;
    }

    return count;
  }
}
