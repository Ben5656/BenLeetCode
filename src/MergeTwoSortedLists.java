package src;

public class MergeTwoSortedLists {
    

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;

        // While both ListNodes aren't empty
        while(l1 != null && l2 != null){
            // Compare the first element of both sorted lists.
            if(l1.val < l2.val){
                // If l2 has a bigger value then we add l1 first.
                tail.next = l1;
                l1 = l1.next;
            } else {
                // Else we add l2 first.
                tail.next = l2;
                l2 = l2.next;
            }
            // Iterate
            tail = tail.next;
        }

        // If the list isn't empty then just add it to the end of the sorted one
        if(l1 != null) tail.next = l1;
        if(l2 != null) tail.next = l2;

        return dummyNode.next;
    }
}
