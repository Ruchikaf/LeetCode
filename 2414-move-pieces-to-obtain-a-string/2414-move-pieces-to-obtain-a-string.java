class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        int i = 0;
        int j = 0;

        while (i < n || j < n) {
            // skip underscore in start
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // skip underscore in target
            while (j < n && target.charAt(j) == '_') {
                j++;
            }
            if (i == n || j == n) {
                return i == n && j == n;
            }
            if (start.charAt(i) != target.charAt(j)) {
                return false;
            } // Check for invalid moves
            if (start.charAt(i) == 'L' && i < j) {
                return false; // 'L' can't move to the right
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; // 'R' can't move to the left
            }
            i++;
            j++;

        }
        return true;
    }

}