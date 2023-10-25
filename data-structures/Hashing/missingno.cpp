
/*
LINK: https://leetcode.com/problems/missing-number/submissions/
*/


class Solution {
public:
    int missingNumber(vector<int>& nums) {
        unordered_set<int> s(nums.begin(), nums.end());
        for (int i = 0; i <= nums.size(); ++i) {
            if (!s.count(i)) return i;
        }
        return -1;
    }
};