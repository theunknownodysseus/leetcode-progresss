/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* reverse(struct ListNode* start , struct ListNode* end){
    
    struct ListNode* prev = end ; 
    struct ListNode* curr = start;
    struct ListNode* nextnode;

    while(curr!=end){
        nextnode = curr->next;
        curr->next = prev;
        prev = curr;
        curr= nextnode;
    }
    return prev;
}

struct ListNode* reverseEvenLengthGroups(struct ListNode* head) {
    if(!head){
        return head;
    }
    int k = 1;
    struct ListNode dum;
    dum.next = head;
    struct ListNode* prevgrptail = &dum;
    struct ListNode* start = head;
    
    while(start){
        struct ListNode* end = start;
        int count  = 0 ;
        for(int i = 0 ; i < k && end ; i++){
            end=end->next;
            count++;
        }
        if(count%2==0){
        struct ListNode* newhead = reverse(start,end);
        prevgrptail->next = newhead;
        prevgrptail = start;}
        else {
            prevgrptail->next = start;
            for (int i = 0; i < count; i++) {
                prevgrptail = prevgrptail->next;
            }
        }
        start = end;
        k++;
    }
    return dum.next;
}