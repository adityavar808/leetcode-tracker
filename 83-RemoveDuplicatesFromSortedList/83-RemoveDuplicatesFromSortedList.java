// Last updated: 8/4/2025, 12:59:11 AM
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode curr = head;

    while (curr != null) {
      while (curr.next != null && curr.val == curr.next.val)
        curr.next = curr.next.next;
      curr = curr.next;
    }

    return head;
  }
}