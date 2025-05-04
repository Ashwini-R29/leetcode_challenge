class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        String binary = Integer.toBinaryString(n);
        int bitPos = 0; // Start from the rightmost bit

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                if (bitPos % 2 == 0) {
                    ans[0]++;
                } else {
                    ans[1]++;
                }
            }
            bitPos++;
        }

        return ans;
    }
}
