class Solution {
    public void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // Swap arr[i] with arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 1, 5, 4, 2};

        solution.cyclicSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
