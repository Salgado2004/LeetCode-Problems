package interview;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        ListNode aux = this;
        while (aux != null){
            str.append(aux.val).append(", ");
            aux = aux.next;
        }
        str.append("]");
        return str.toString();
    }
}

public class Problem83 {
    public static void main(String[] args) {
        ListNode input = new ListNode(1);
        input.next = new ListNode(1);
        input.next.next = new ListNode(2);
        System.out.println(input);

        Problem83 solution = new Problem83();
        System.out.println(solution.deleteDuplicates(input));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode output = new ListNode(head.val);
        ListNode currentOutput = output;
        ListNode aux = head.next;
        int last = head.val;

        while (aux != null) {
            if (aux.val != last) {
                currentOutput.next = new ListNode(aux.val);
                currentOutput = currentOutput.next;
                last = aux.val;
            }
            aux = aux.next;
        }

        return output;
    }
}
