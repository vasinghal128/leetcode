class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        if(digits[n]==9){
            int j = digits.length+1;
            digits = new int[j];
            digits[n] = 1;
            digits[n+1] = 0;
            return digits;
        }
        digits[n] = digits[n] + 1;
        return digits;
    }
}