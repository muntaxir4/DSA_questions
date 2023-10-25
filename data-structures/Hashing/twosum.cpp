/*link:
https://leetcode.com/problems/two-sum/submissions/
*/
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> indexMap;
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (indexMap.count(complement)) {
                return {indexMap[complement], i};
            }
            indexMap[nums[i]] = i;
        }
        return {};
    }
