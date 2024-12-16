class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // Priority queue to store pairs of (value, index) with a custom comparator
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            int valueComparison = Integer.compare(a[0], b[0]);
            if (valueComparison == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return valueComparison;
        });

        // Initialize the heap with values and their indices
        for (int i = 0; i < nums.length; i++) {
            heap.offer(new int[] { nums[i], i });
        }

        // Perform k iterations
        while (k-- > 0) {
            // Extract the smallest element
            int[] temp = heap.poll();
            int idx = temp[1];
            int number = temp[0];

            // Update the array and reinsert the updated value into the heap
            nums[idx] = number * multiplier;
            heap.offer(new int[] { nums[idx], idx });
        }

        return nums;
    }
}