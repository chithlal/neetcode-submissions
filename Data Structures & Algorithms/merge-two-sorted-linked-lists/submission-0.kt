/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null) return list2
        if(list2 == null) return list1

        var c1: ListNode? = list1
        var c2: ListNode? = list2
        var head: ListNode? = null
        var tail: ListNode? = null

        while(c1 != null && c2 != null){

            if(c1!!.`val` <= c2!!.`val`){
                if(head == null){
                    head = c1
                    tail = c1
                }
                else {
                    tail?.next = c1
                    tail = tail?.next
                }
                c1 = c1.next
            }
            else {
                if(head == null){
                    head = c2
                    tail = c2
                }
                else {
                    tail?.next = c2
                    tail = tail?.next
                }
                c2 = c2.next
            }
        }
        if(c1 != null){
            tail?.next = c1
        }
        if(c2 != null){
             tail?.next = c2
        }

        return head
    }
}
