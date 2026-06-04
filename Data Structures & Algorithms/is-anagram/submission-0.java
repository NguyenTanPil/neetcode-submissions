class Solution {
    public boolean isAnagram(String s, String t) {
        // complexity: O(n), Space: O(n)
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(count.containsKey(c)) {
                int currentValue = count.get(c);
                if(currentValue == 1) {
                    count.remove(c);
                } else {
                    count.put(c, count.get(c) - 1);
                }
            } else {
                return false;
            }
        }

        return count.isEmpty();
    }
}
