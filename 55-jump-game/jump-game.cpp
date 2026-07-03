class Solution {
public:
    vector<int> memo;
    int helper(vector<int>& nums, int curr_ind){
        
        if(memo[curr_ind]!=-1){
            return memo[curr_ind];
        }
        
        if(curr_ind == nums.size()-1){
            return memo[curr_ind] = 1;
        }

        if(nums[curr_ind] == 0){
            return memo[curr_ind] = 0;
        }
        if(curr_ind > nums.size()-1){
            return 0;
        }
        bool res = 0;
        for(int i = 1 ; i <= nums[curr_ind] && curr_ind + i <= nums.size()-1 ; i++){
            res = res || helper(nums,curr_ind+i);
        }

        return memo[curr_ind] = res;
    }
    bool canJump(vector<int>& nums) {
        memo= vector<int>(nums.size(),-1);
        return helper(nums , 0);
    }
};