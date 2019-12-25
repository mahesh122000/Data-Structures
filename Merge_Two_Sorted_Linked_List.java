static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
if (headA == null && headB == null) return null;
    else if (headA == null) return headB;
    else if (headB == null) return headA;
    
    if(headA.data <= headB.data)
        headA.next = mergeLists(headA.next, headB);
    else {
        SinglyLinkedListNode temp = headB;
        headB = headB.next;
        temp.next = headA;
        headA = temp;
        headA.next = mergeLists(headA.next, headB);
    }
    return headA;
}

