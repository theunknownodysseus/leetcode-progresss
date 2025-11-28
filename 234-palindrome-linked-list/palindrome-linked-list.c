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

bool isPalindrome(struct ListNode* head) {
    
    struct ListNode* copy2 = NULL;
    struct ListNode* tail = NULL;
    struct ListNode* temp = head;
    while(temp){
        struct ListNode *dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
        dummy->val = temp->val;
        dummy->next = temp->next;

        if(!copy2){
            copy2 = dummy;
            tail = dummy;
        }
        else{
            tail->next = dummy;
            tail = tail->next;
        }
        temp = temp->next;
    }
    struct ListNode* copy = head;
    copy = reverseList(copy);
    while(copy2){
        if(copy2->val != copy->val){
            return false;
        }
        copy=copy->next;
        copy2=copy2->next;
    }
    return true;
}