int* runningSum(int* nums, int numsSize, int* returnSize) {
    int* result = (int*)malloc(numsSize*(sizeof(int)));
    result[0] = nums[0];
    for(int i = 1 ; i < numsSize ; i++){
        result[i] = nums[i] + result[i-1];
    }
    *returnSize = numsSize;
    return result;
}