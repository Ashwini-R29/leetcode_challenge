

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int sum = 0;
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sum(n);
        }
        return n == 1;
    }

    public int sum(int n) {
        int total = 0;
        while (n != 0) {
            int r = n % 10;
            total = total + (r * r);
            n = n / 10;
        }
        return total;
    }
}
