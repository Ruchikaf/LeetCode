import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxUniqueSplit(String s) {
        // Create a set to store unique substrings
        Set<String> set = new HashSet<>();
        
        // Call a helper function to perform backtracking
        return backtrack(s, 0, set);
    }

    // Helper function for backtracking
    private int backtrack(String s, int start, Set<String> set) {
        // Base case: If we have reached the end of the string, return 0
        if (start == s.length()) {
            return 0;
        }
        
        int maxSplits = 0;
        
        // Try to split the string in different ways
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);  // Get substring from start to i
            
            // If the substring is not in the set, add it and recurse
            if (!set.contains(substring)) {
                set.add(substring);  // Add substring to the set
                // Recursively calculate splits and take the maximum
                maxSplits = Math.max(maxSplits, 1 + backtrack(s, i, set));
                set.remove(substring);  // Backtrack (remove substring from the set)
            }
        }
        
        return maxSplits;
    }
}
