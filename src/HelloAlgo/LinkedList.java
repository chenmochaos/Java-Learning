package HelloAlgo;

public class LinkedList {
    public static void main(String[] args) {
        // Initial
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(4);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;


        ListNode p = new ListNode(999);

    }

    void insert(ListNode n0, ListNode p) {
        p.next = n0.next;
        n0.next = p;
    }

    void remove(ListNode n0) {
        if (n0.next == null) {
            return;
        }
        ListNode P = n0.next;
        ListNode n1 = P.next;
        n0.next = n1;
    }

    ListNode access(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if (head.next == null) return null;
            head = head.next;
        }
        return head;
    }

    int find(ListNode head, int target) {
        int index = 0;
        while (head != null) {
            if (head.val == target) {
                return index;
            }
            index++;
            head = head.next;
        }
        return -1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}