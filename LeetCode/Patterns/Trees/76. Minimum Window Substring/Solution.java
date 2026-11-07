class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] need = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int missing = t.length();

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            if (need[rightChar] > 0) {
                missing--;
            }

            need[rightChar]--;

            while (missing == 0) {

                int windowLen = right - left + 1;

                if (windowLen < minLen) {
                    minLen = windowLen;
                    start = left;
                }

                char leftChar = s.charAt(left);

                need[leftChar]++;

                if (need[leftChar] > 0) {
                    missing++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}