/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* curr = head;
    while( head!= NULL && head->val == val)
    {
        head = head->next;
    }
    while(curr && curr->next)
    {
        if(curr->next->val == val){
            curr->next = curr->next->next;
        }
        else{
        curr = curr->next;}
    }
    return head;
}