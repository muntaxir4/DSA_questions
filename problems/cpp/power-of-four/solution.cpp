class Solution {
public:
    bool isPowerOfFour(int n) {
        //starting with 4 power 0
        long  p=1;

        //running loop till calculated 'p' <=n if it exceeds return false
        for(int i=0;p<=n;i++){
            //check if p equals n to return true
            if(p==n) return true;
            //multiply p with 4 to find value of next power
            p*=4;
        }
        return false;
    }
};