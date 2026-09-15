/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(0).apply{next=head}
        var left: ListNode? = dummy
        var right: ListNode? = head

        //move the right node n time so the left node will       // be at the n th position if right reached the end
        var c = n
        while(c > 0){
            right = right?.next
            c--
        }

        while(right != null){
            left = left?.next
            right = right?.next
        }
        left?.next = left?.next?.next

        return dummy.next
    }
}
