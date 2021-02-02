/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){     //if null return null
            return null;
    }
        ListNode dummyNode=new ListNode(0);//produce a dummy pointer firstNode
        dummyNode.next = head;
        
        ListNode seekNode=dummyNode;//finally Node
        ListNode deleteNode=dummyNode;//Will delete Node
        ListNode preDeleteNode=dummyNode;//previous delete Node use to pointer next             node after del node
        
        int index = 0;
        while(seekNode.next != null){
            index+=1;
            seekNode = seekNode.next;//do until final Node
            
            if(index >= n)
                deleteNode=deleteNode.next;//count delete position
            if(index >= n+1)
                preDeleteNode=preDeleteNode.next;//count pre delete position
        }
        preDeleteNode.next=deleteNode.next;
        return dummyNode.next;
        
}
}
