/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {

    if(!head || !head->next)
    {
    return head;
    }
    int length = 0;
    struct ListNode* curr = head;
    
    while(curr)
    {
        length++;
        curr = curr->next;
    }

    k%=length;
    
    struct ListNode dummy ;
    dummy.next = head;

    struct ListNode* newhead = &dummy;
    struct ListNode* prev = head;
    curr = head;
    for(int i = 0 ; i<k ; i++)
    {
        while(curr->next)
        {
            prev = curr;
            curr = curr->next;
        }
        prev->next = NULL;
        curr->next = head;
        head = curr;
        newhead->next = curr;
    }
    
    return newhead->next;

}