int findDuplicate(int* nums, int numsSize) {
    int fast = nums[0] ;
    int slow = nums[0] ;
    do{
        fast = nums[nums[fast]];
        slow = nums[slow];
    }while(fast != slow);
    fast = nums[0];
    while(slow!=fast){
        fast = nums[fast];
        slow = nums[slow];
    }
    return fast;

    // int freq[numsSize];
    // for(int i = 0 ; i<numsSize ; i++){
    //     freq[i]=0;
    // }
    // for(int i = 0 ;i<numsSize ; i++){
    //     if(freq[nums[i]]==0){
    //         freq[nums[i]]++;
    //     }
    //     else{
    //         return nums[i];
    //     }
    // }
    // return -1;
}