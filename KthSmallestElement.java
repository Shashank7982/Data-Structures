class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Simple selection sort to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Return the kth smallest element
        return arr[k - 1];
    }
}
