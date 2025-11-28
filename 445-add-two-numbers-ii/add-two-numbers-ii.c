/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

 struct ListNode* reverseList(struct ListNode* head) {
    
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* nextnode;


    while(curr){
        nextnode = curr->next;
        curr->next = prev;
        prev = curr;
        curr = nextnode;
    }
    return prev;
    
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
    struct ListNode* temp = NULL;
    struct ListNode* tail = NULL;
    int carry = 0;
    while(l1 || l2 || carry!=0){
        int val1 = l1?l1->val:0;
        int val2 = l2?l2->val:0;
        int sum = val1 + val2 + carry;
        int digit = sum%10;
        carry = sum/10;
        struct ListNode *dum = (struct ListNode*)malloc(sizeof(struct ListNode));
        dum->val = digit;
        dum->next= NULL;
        if(!tail){
            temp = dum;
            tail = dum;
        }
        else{
            tail->next = dum;
            tail = tail->next;
        }
        l1=l1?l1->next:l1;
        l2=l2?l2->next:l2;
    }
    return reverseList(temp);
}