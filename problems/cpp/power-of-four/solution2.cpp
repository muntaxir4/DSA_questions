class Solution {
public:
    bool isPowerOfFour(int n) 
    {
          //optimal approach using bit manipulation
         if (n > 0 && (n & (n - 1)) == 0) 
         {
            return (n & 0x55555555) != 0;// Check if the set bit is at an even index
        }
        return false;
        //solved in O(1) complexity
    }
};