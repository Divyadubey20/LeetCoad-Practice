import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        int start = 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = start; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    count++;
                    start = j + 1; 
                    break;
                }
            }
        }

        return count;
    }
}