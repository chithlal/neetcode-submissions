/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {

        var fast: ListNode? = head
        var slow: ListNode? = head
        while(slow != null && fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next
            if(slow == fast) return true
        }
        return false
    }
}
