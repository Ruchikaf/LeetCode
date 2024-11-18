class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        // Handle the case where k == 0
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                result[i] = 0;
            }
        } else if (k < 0) {
            // Handle the case where k < 0
            for (int i = 0; i < n; i++) {
                for (int j = i + k; j < i; j++) {
                    result[i] += code[(j + n) % n];  // Wrap around the array
                }
            }
        } else {
            // Handle the case where k > 0
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= i + k; j++) {
                    result[i] += code[j % n];  // Wrap around the array
                }
            }
        }
        return result;
    }
}
