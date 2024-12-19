class Solution {
    public int maxChunksToSorted(int[] arr) {
        int size = arr.length;
        int count = 0;
        int maxSeen = 0;
        for (int i = 0; i < size; i++) {
            maxSeen = Math.max(maxSeen, arr[i]);
            if (maxSeen == i) {
                count++;
            }
        }
        return count;
    }
}