/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* reverseList(struct ListNode* start , struct ListNode* end) {
    
    struct ListNode* prev = end;
    struct ListNode* curr = start;
    struct ListNode* nextnode;


    while(curr!=end){
        nextnode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextnode;
    }
    return prev;
    
}

struct ListNode* swapPairs(struct ListNode* head) {
    if(!head)
    {
        return head;
    }

    struct ListNode dum;
    dum.next = head;
    struct ListNode* prevgrptail = &dum;
    struct ListNode* start = head;
    struct ListNode* end = head;
    struct ListNode* newhead = NULL;
    while(1)
    {
        for(int i = 0 ; i < 2 ; i++){
            if(!end){
                return dum.next;
            }
            end=end->next;
    }
        newhead = reverseList(start,end);
        prevgrptail->next = newhead;
        prevgrptail = start;
        start = end;
    }
    return dum.next;
}
