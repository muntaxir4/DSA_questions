
/*
LINK: https://leetcode.com/problems/set-matrix-zeroes/
*/


class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        unordered_set<int> zeroRows, zeroCols;

        // Traverse the matrix and mark rows and columns with zeros
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    zeroRows.insert(i);
                    zeroCols.insert(j);
                }
            }
        }

        // Set rows to zero
        for (int i : zeroRows) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = 0;
            }
        }

        // Set columns to zero
        for (int j : zeroCols) {
            for (int i = 0; i < m; ++i) {
                matrix[i][j] = 0;
            }
        }
    }
};