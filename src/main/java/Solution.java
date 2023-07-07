public class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int maxTimes = 0;
        if (k >= answerKey.length() - 1) {
            return answerKey.length();
        }

        maxTimes = Math.max(countMax(answerKey, k, 'T'), countMax(answerKey, k, 'F'));

        return maxTimes;
    }

    private int countMax(String answerKey, int k, char target) {
        int currentMax = 0;
        int globalMax = 0;

        int left = 0;
        int right = 0;

        while (right < answerKey.length()) {
            if (answerKey.charAt(right) != target) {
                k--;
            }

            while (k < 0) {
                if (answerKey.charAt(left) != target) {
                    k++;
                }
                left++;
            }

            currentMax = right - left + 1;
            globalMax = Math.max(currentMax, globalMax);

            right++;
        }

        return globalMax;
    }
}