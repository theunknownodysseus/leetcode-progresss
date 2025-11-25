/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    struct ListNode* fast = head;
    struct ListNode* slow = head;
    if(!head || !head->next){
        return NULL;
    }
    struct ListNode* temp=slow;
    while(fast&&fast->next){
        fast = fast->next->next;
        temp = slow;
        slow = slow->next;
    }
    if(slow->next!=NULL){
    slow->val = slow->next->val;
    slow->next = slow->next->next;
    }
    else{
        temp->next =NULL;
    }
    return head;
}