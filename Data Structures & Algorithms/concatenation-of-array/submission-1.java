class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = 2;
        int idx = 0;
        int[] ans = new int[nums.length * x];
        for(int i = 0; i < x; i++) {
            for(int num : nums) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}