class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort children by greed
        Arrays.sort(s); // sort cookies by size
        int i = 0; // pointer for children
        int j = 0; // pointer for cookies
        
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // cookie can satisfy child
                i++; // move to next child
            }
            j++; // move to next cookie
        }
        return i; // number of content children 
    }
}