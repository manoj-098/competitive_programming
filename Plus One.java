class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        int carry = 1, sum = 0;
        // int arr[];
        if (digits[digits.length - 1] <= 9)
            return digits;
        else {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0 && digits.length>=2; i--) {
                digits[i] += carry;
                if (digits[i] <= 9)
                    return digits;
                else 
                {
                    digits[i] = 0;
                    carry = 1;
                }
            }
        }
        int arr[] = new int[digits.length + 1];
        if (carry == 1) {
            // arr=new int[digits.length+1];
            arr[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                arr[i+1] = (digits[i]);
            }
        }
        return arr;
    }
}
