import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        // Create index array
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        // Sort indices by heights descending
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        // Build result
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = names[idx[i]];
        }

        return result;
    }
}
