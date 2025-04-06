#include <iostream>;
using namespace std;
class Solution {
    public:
        vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
            unordered_set<int> set1(nums1.begin(), nums1.end());  // Store nums1 in a set
            unordered_set<int> resultSet;
    
            for (int num : nums2) {
                if (set1.count(num)) {  // Check if num exists in set1
                    resultSet.insert(num);
                }
            }
    
            return vector<int>(resultSet.begin(), resultSet.end());  // Convert set to vector
        }
    };
