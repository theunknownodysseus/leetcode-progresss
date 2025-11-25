/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode * slow = head;
    struct ListNode * fast = head;
    if(!head || !head->next){
        return false;
    }
    while(fast && fast->next){
        fast =  fast->next->next;
        slow = slow->next;
        if(fast == slow){
            return true;
        }
    }
    return false;
}