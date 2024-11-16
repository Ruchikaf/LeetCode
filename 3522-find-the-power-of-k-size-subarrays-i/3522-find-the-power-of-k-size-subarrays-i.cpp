class Solution {
public:
    vector<int> resultsArray(vector<int>& nums, int k) {
        int n = nums.size();

        deque<int> deq; //Monotonic deque
        vector<int> result;

        for(int j = 0; j < n; j++) {

            if(deq.size() == k) {
                deq.pop_front(); //deq ka size ab k-1, ab jth element ko hum insert karne ka soch sakte hain deque me
            }

            if(!deq.empty() && deq.back() != nums[j]-1) { //nums[j] is not consecutive to deq.back() element
                deq.clear();
            }

            deq.push_back(nums[j]);

            if(j >= k-1) {
                if(deq.size() == k) {
                    result.push_back(deq.back()); //max element hoga becau monotonic hai
                } else {
                    result.push_back(-1); //else -1
                }
            }
        }

        return result;
    }
};