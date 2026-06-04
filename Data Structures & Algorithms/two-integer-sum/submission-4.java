class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> expectedNums = new HashMap<>();
        Map<Integer, Integer> idx = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            expectedNums.put(currentNum, target - currentNum);
            
            if(count.getOrDefault(currentNum, 0) < 2) {
                idx.put(currentNum, i);
                count.put(currentNum, count.getOrDefault(currentNum, 0) + 1);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(expectedNums.containsKey(num)) {
                if(idx.containsKey(expectedNums.get(num))) {
                    if(i != idx.get(expectedNums.get(num))) {
                        return new int[]{i, idx.get(expectedNums.get(num))};
                    }
                }
            }
        }
        return new int[]{};
    }
}
