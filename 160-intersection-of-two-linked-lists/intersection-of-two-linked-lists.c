/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    struct ListNode* headA1 =headA;
    struct ListNode* headB1 =headB;

    int lenA = 0;
    while(headA1){
        headA1=headA1->next;
        lenA++;
    }

    int lenB = 0;
    while(headB1){
        headB1=headB1->next;
        lenB++;
    }
    headB1=headB;
    headA1=headA;

    if((lenA - lenB) <0){
        while(lenB!=lenA){
            headB1= headB1->next;
            lenB--;
        }
    }
    else
    {
        while(lenB!=lenA){
            headA1 = headA1 -> next;
            lenA--;
        }
    }

    while(headA1 && headB1){
        if(headA1 == headB1){
            return headA1;
        }
        headA1= headA1->next;
        headB1= headB1->next;
    }
    return NULL;
}