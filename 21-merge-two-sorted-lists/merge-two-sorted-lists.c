/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode* temp = NULL;
    struct ListNode* tail = temp;
    while(list1 && list2){
        struct ListNode* dummy  = (struct ListNode*)malloc( sizeof(struct ListNode));
        if(list1->val > list2->val){
            dummy->val = list2->val;
            dummy->next = NULL;
            list2 = list2->next;
        }
        else{
            
            dummy->val = list1->val;
            dummy->next = NULL;
            list1 = list1->next;
        }

        if(!temp){
                temp = dummy;
                tail = dummy;
            }
        else{
            tail->next = dummy;
tail = dummy;

            }

    }
    while(list1){
        struct ListNode* dummy  = (struct ListNode*)malloc( sizeof(struct ListNode));
        dummy->val = list1->val;
        dummy->next = NULL;
        
        if(!temp){
                temp = dummy;
                tail = dummy;
            }
        else{
              tail->next = dummy;
tail = dummy;

            }

        list1 = list1->next;
    }
    while(list2){
        struct ListNode* dummy  = (struct ListNode*)malloc( sizeof(struct ListNode));
        dummy->val = list2->val;
        dummy->next = NULL;

        if(!temp){
                temp = dummy;
                tail = dummy;
            }
        else{tail->next = dummy;
tail = dummy;

            }

        list2 = list2->next;
    }

    return temp;
}